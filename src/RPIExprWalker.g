tree grammar RPIExprWalker;
options {
tokenVocab=RPIExprAST;
ASTLabelType=CommonTree;
backtrack=true;
memoize=true;
}

@header {
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.math.BigDecimal;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
}

@members {
    private boolean is_sql = false;
    private String userName;
    private String password;
    private String hostName;
    private String sid;
    Map sqlMemory;
    Map valueMemory;
    Map<String, String> connectionMemory;
    Map<String, List<String>> limits; 
    public void setSQLMemory(Map memory) {
       this.sqlMemory = memory;
    }     
    public void setValueMemory(Map memory) {
       this.valueMemory = memory;
    }    
    public void setLimits(Map<String, List<String>> limits) {
       this.limits = limits;
    } 
    public void setConnectionMemory(Map<String, String> memory) {
       this.connectionMemory = memory;
    }
    public String getUsername() {
       return connectionMemory.get("username");
    }
    public String getPassword() {
       return connectionMemory.get("password");
    }
    public String getHostname() {
       return connectionMemory.get("hostname");
    }
    public String getSid() {
       return connectionMemory.get("sid");
    }
}


stat [boolean checkSelfReference, String calcPeriod, String aggRule] returns [List<String> inputDims, boolean calculatePeriodByPeriod]
    : ^(ASSIGN id1=ID v1=varlist  expr[$v1.inputDims, $id1.text.trim(), checkSelfReference, calcPeriod, aggRule]) 
    {  
       if (!$checkSelfReference) {
          if($calcPeriod == null) {
             valueMemory.put($id1.text, $expr.value); 
          } else {
             Tuples tuples = (Tuples) valueMemory.get($id1.text);
             Tuple matchTuple = new Tuple();
             matchTuple.map.put("PERIOD", calcPeriod);
             tuples.updateOnMatch($expr.value, matchTuple);
          }         
       } else {
          $calculatePeriodByPeriod = $expr.calculatePeriodByPeriod;
          $inputDims = $v1.inputDims;
       }
    }
    | ^(DIM id2=ID q1=quotedstringlist)
      { 
        if(!$checkSelfReference) {       
      	   String dim = $id2.text;
      	   limits.put(dim, $q1.limits);
           /*
      	   System.out.print("Setting limits for dimension " + dim + "=");
      	   for(String limit : $q1.limits) {
      	      System.out.print(limit + " ");
      	   }
      	   System.out.println();
      	   System.out.flush();
           */
      	}
      }
    | ^(PRINT id3=ID)
      {  
         if (!$checkSelfReference) {
            Tuples v = (Tuples)valueMemory.get($ID.text);
            System.out.println("Print results for " + $ID.text + ":");
            System.out.println(v);
            System.out.flush();
         }
      } 
    | ^(SETBASEPERIOD quoted_string) 
      {
         if (!$checkSelfReference) {
            String basePeriod = $quoted_string.value.toString().trim().replaceAll("'", "");
            valueMemory.put("_BASE_PERIOD", basePeriod);
            //System.out.println("Base Period is set to " + basePeriod);
         }
      }
    | ^(DBCONNECT uname=quoted_string passwd=quoted_string hname=quoted_string SID=quoted_string)
      {
        String username = $uname.text.trim().replaceAll("'", "");
        connectionMemory.put("username", username);
        String password = $passwd.text.trim().replaceAll("'", "");
        connectionMemory.put("password", password);
        String hostname = $hname.text.trim().replaceAll("'", "");
        connectionMemory.put("hostname", hostname);
        String sid = $SID.text.trim().replaceAll("'", "");
        connectionMemory.put("sid", sid);
      }  
    | ^(SETLEVEL ID ID q2=quotedstringlist)
      {
         
      }
    ;
stats
    : (stat[false, null, null])+;


quotedstringlist returns [List<String> limits]
    :   ^((QUOTEDSTRINGLIST
        {
           $limits = new ArrayList<String>();
        }) (q1=quoted_string 
        {
           $limits.add($q1.text.trim().replaceAll("'", "").replaceAll(",", ""));           
        })+)    
    ;

varlist returns [List<String> inputDims]
    : ^((VARLIST 
      {
         $inputDims = new ArrayList<String>();
      }) (id=ID {$inputDims.add($id.text.trim());})+) 
    ;

expr[List<String> inputDims, String lhsName, boolean checkSelfReference, String calcPeriod, String aggRule] 
returns [Tuples value, boolean calculatePeriodByPeriod]
    : e=atom[inputDims, lhsName, checkSelfReference, calcPeriod, aggRule] 
    {
       $value = $e.value;
       $calculatePeriodByPeriod = $e.calculatePeriodByPeriod;
    }
    | ^(PLUS a=expr[inputDims, lhsName, checkSelfReference, calcPeriod, aggRule] b=expr[inputDims, lhsName, checkSelfReference, calcPeriod, aggRule]) 
      {
         if (!$checkSelfReference) {
            $value = $a.value.add($b.value, inputDims, limits, calcPeriod, aggRule);
         } else {
            $calculatePeriodByPeriod = $a.calculatePeriodByPeriod || $b.calculatePeriodByPeriod;
         }
      }
    | ^(MINUS a=expr[inputDims, lhsName, checkSelfReference, calcPeriod, aggRule] b=expr[inputDims, lhsName, checkSelfReference, calcPeriod, aggRule]) 
    {
       if (!$checkSelfReference) {
          $value = $a.value.subtract($b.value, inputDims, limits, calcPeriod, aggRule);
       } else {
          $calculatePeriodByPeriod = $a.calculatePeriodByPeriod || $b.calculatePeriodByPeriod;
       }   
    }
    | ^(ASTERISK a=expr[inputDims, lhsName, checkSelfReference, calcPeriod, aggRule] b=expr[inputDims, lhsName, checkSelfReference, calcPeriod, aggRule]) 
    {
       if (!$checkSelfReference) {
          $value = $a.value.multiply($b.value, inputDims, limits, calcPeriod, aggRule);
       } else {
          $calculatePeriodByPeriod = $a.calculatePeriodByPeriod || $b.calculatePeriodByPeriod;
       }
    }
    | ^(DIV a=expr[inputDims, lhsName, checkSelfReference, calcPeriod, aggRule] b=expr[inputDims, lhsName, checkSelfReference, calcPeriod, aggRule]) 
    {
       if (!$checkSelfReference) {
          $value = $a.value.divide($b.value, inputDims, limits, calcPeriod, aggRule);
       } else {
          $calculatePeriodByPeriod = $a.calculatePeriodByPeriod || $b.calculatePeriodByPeriod;
       }
    }
    ;
    
atom [List<String> inputDims, String lhsName, boolean checkSelfReference, String calcPeriod, String aggRule] 
returns [Tuples value, boolean calculatePeriodByPeriod]
    : NUMBER 
      {
         $value = Tuples.number(new BigDecimal($NUMBER.text).setScale(10, BigDecimal.ROUND_HALF_UP), inputDims, limits, calcPeriod, aggRule);
         $value.dimensions = $inputDims;
         $calculatePeriodByPeriod = true;
      }
    | ^(REF ID c=COMPMODIFIER?) {
           if ($checkSelfReference && lhsName.equals($ID.text.trim())) {
              $calculatePeriodByPeriod = true;
           } else {
              Tuples v = (Tuples)valueMemory.get($ID.text);
              int periodOffset = 0;           
              if ($c != null) {
                 String t = $c.text.trim();
                 periodOffset = -1 * Integer.parseInt(t.substring(3, t.length()));
              }
              if ( v!=null ) {
                 $value = v.identity(inputDims, limits, periodOffset, aggRule);
              } else {
                 System.err.println("undefined variable "+$ID.text);
                 System.exit(0);
              }
              $calculatePeriodByPeriod = true;
           }
        }
    | ^(CREATEPREDICATE sql varlist?) 
      {
         if(!$checkSelfReference) {
            $value = Tuples.getValueBySQL($sql.value.toString(), $sql.dimensions, inputDims, limits, aggRule, getUsername(), getPassword(), getHostname(), getSid());
            $calculatePeriodByPeriod = false;
         }
      }
    | function[inputDims, lhsName, checkSelfReference, calcPeriod, aggRule] 
    {
       if (!$checkSelfReference) {
          $value = $function.value;
       } else {
          $calculatePeriodByPeriod = $function.calculatePeriodByPeriod;
       }
    }
    ;
    
sql returns [StringBuffer value, List<String> dimensions]
    :   ^(SQL select_expression) 
        {
           $value = $select_expression.value;
           $dimensions = $select_expression.dimensions;
        }
    ;
    
boolExpr [List<String> inputDims, String lhsName, boolean checkSelfReference, String calcPeriod, String aggRule] 
returns [Tuples value, boolean calculatePeriodByPeriod]
    :   b1=boolAtom[inputDims, lhsName, checkSelfReference, calcPeriod, aggRule] 
    {
       if (!$checkSelfReference) {
          $value = $b1.value;
       } else {
          $calculatePeriodByPeriod = $b1.calculatePeriodByPeriod;
       }
    }
    |   ^(AND b2=boolAtom[inputDims, lhsName, checkSelfReference, calcPeriod, aggRule] b3=boolAtom[inputDims, lhsName, checkSelfReference, calcPeriod, aggRule]) 
    {
       if (!$checkSelfReference) {
          $value = $b2.value.and($b3.value, inputDims, limits, calcPeriod, aggRule);
       } else {
          $calculatePeriodByPeriod = $b2.calculatePeriodByPeriod || $b3.calculatePeriodByPeriod;
       }
    }
    |   ^(OR b4=boolAtom[inputDims, lhsName, checkSelfReference, calcPeriod, aggRule] b5=boolAtom[inputDims, lhsName, checkSelfReference, calcPeriod, aggRule]) 
    {
       if(!$checkSelfReference) {
          $value = $b4.value.or( $b5.value, inputDims, limits, calcPeriod, aggRule);
       } else {
          $calculatePeriodByPeriod = $b4.calculatePeriodByPeriod || $b5.calculatePeriodByPeriod;
       }
    }
    |   ^(NOT b6=boolAtom[inputDims, lhsName, checkSelfReference, calcPeriod, aggRule]) 
    {
       if (!$checkSelfReference) {
          $value = $b6.value.not(inputDims, limits, calcPeriod, aggRule);
       } else {
          $calculatePeriodByPeriod = $b6.calculatePeriodByPeriod;
       }
    }
    ;
    
boolOp [List<String> inputDims, String lhsName, boolean checkSelfReference, String calcPeriod, String aggRule] 
returns [Tuples value, boolean calculatePeriodByPeriod]
    :   ^(BOOLOP_EQ e1=expr[inputDims, lhsName, checkSelfReference, calcPeriod, aggRule] e2=expr[inputDims, lhsName, checkSelfReference, calcPeriod, aggRule]) 
    {
       if (!$checkSelfReference) {
          $value = $e1.value.eq($e2.value, inputDims, limits, calcPeriod, aggRule);
       } else {
          $calculatePeriodByPeriod = $e1.calculatePeriodByPeriod || $e2.calculatePeriodByPeriod;
       }
    }
    |   ^(BOOLOP_LT e3=expr[inputDims, lhsName, checkSelfReference, calcPeriod, aggRule] e4=expr[inputDims, lhsName, checkSelfReference, calcPeriod, aggRule]) 
    {
       if (!$checkSelfReference) {
          $value = $e3.value.lt($e4.value, inputDims, limits, calcPeriod, aggRule);
       } else {
          $calculatePeriodByPeriod = $e3.calculatePeriodByPeriod || $e4.calculatePeriodByPeriod;
       }
       
    }
    |   ^(BOOLOP_GT e5=expr[inputDims, lhsName, checkSelfReference, calcPeriod, aggRule] e6=expr[inputDims, lhsName, checkSelfReference, calcPeriod, aggRule]) 
    {
       if (!$checkSelfReference) {       
          $value = $e5.value.gt($e6.value, inputDims, limits, calcPeriod, aggRule);
       } else {
          $calculatePeriodByPeriod = $e5.calculatePeriodByPeriod || $e6.calculatePeriodByPeriod;
       }
    }
    |   ^(BOOLOP_GE e7=expr[inputDims, lhsName, checkSelfReference, calcPeriod, aggRule] e8=expr[inputDims, lhsName, checkSelfReference, calcPeriod, aggRule]) 
    {
       if (!$checkSelfReference) {
          $value = $e7.value.ge($e8.value, inputDims, limits, calcPeriod, aggRule);
       } else {
          $calculatePeriodByPeriod = $e7.calculatePeriodByPeriod || $e8.calculatePeriodByPeriod;
       }
    }
    |   ^(BOOLOP_LE e9=expr[inputDims, lhsName, checkSelfReference, calcPeriod, aggRule] e10=expr[inputDims, lhsName, checkSelfReference, calcPeriod, aggRule]) 
    {
       if (!$checkSelfReference) {
          $value = $e9.value.le($e10.value, inputDims, limits, calcPeriod, aggRule);
       } else {
          $calculatePeriodByPeriod = $e9.calculatePeriodByPeriod || $e10.calculatePeriodByPeriod;
       }
    }
    ;

boolAtom [List<String> inputDims, String lhsName, boolean checkSelfReference, String calcPeriod, String aggRule] 
returns [Tuples value, boolean calculatePeriodByPeriod]
    :	boolOp[inputDims, lhsName, checkSelfReference, calcPeriod, aggRule] 
    {
       if (!$checkSelfReference) {
          $value = $boolOp.value.identity(inputDims, limits, aggRule); 
       } else {
          $calculatePeriodByPeriod = $boolOp.calculatePeriodByPeriod;
       }     
    }
    ;     
    
    
    
function [List<String> inputDims, String lhsName, boolean checkSelfReference, String calcPeriod, String aggRule] 
returns [Tuples value, boolean calculatePeriodByPeriod]
    :	^(IFTHEN boolExpr[inputDims, lhsName, checkSelfReference, calcPeriod, aggRule] 
    e1=expr[inputDims, lhsName, checkSelfReference, calcPeriod, aggRule] e2=expr[inputDims, lhsName, checkSelfReference, calcPeriod, aggRule]) 
    {
       if ($checkSelfReference) {
          $calculatePeriodByPeriod = $e1.calculatePeriodByPeriod || $e2.calculatePeriodByPeriod;
       } else {
          $value = $boolExpr.value.ifThen($e1.value, $e2.value, inputDims, limits, calcPeriod, aggRule);
          $value.dimensions = inputDims;
       }
    }
    |   GETBASEPERIOD 
    {
        $value = Tuples.number(new BigDecimal((String)valueMemory.get("_BASE_PERIOD")).setScale(10, BigDecimal.ROUND_HALF_UP), inputDims, limits, null, aggRule);
    }
    |   GETCURRPERIOD
    {
        $value = Tuples.getCurrPeriod(inputDims, limits, aggRule);
    }
    |   ^(AGG  a=AGGRULE e1=expr[inputDims, lhsName, checkSelfReference, calcPeriod, $a.text.trim()])
    {
	$value = $e1.value;
    }
    ;

start_rule
    :   (create_package)* EOF
    ;

create_package
    :   'CREATE' ( 'OR' keyREPLACE )?
        ( package_spec | package_body )
    ;
    
package_spec
    :   keyPACKAGE package_name ( 'IS' | 'AS' ) 
        ( package_obj_spec )*
        'END' (package_name)? SEMICOLON
    ;
    
package_body
    :   keyPACKAGE ( keyBODY ) package_name ( 'IS' | 'AS' )
        ( package_obj_body )*
        ( 'BEGIN' seq_of_statements )?  
        'END' ( package_name )? SEMICOLON
    ;

package_name
    :   ( schema_name DOT )? identifier 
    ;

package_obj_spec
    :   variable_declaration 
    |   type_declaration
    |   subtype_declaration 
    |   record_declaration 
    |   plsql_table_declaration 
    |   varray_declaration
    |   cursor_declaration 
    |   cursor_spec 
    |   procedure_spec 
    |   function_spec 
    |   exception_declaration 
    |   pragma_declaration
    ;

variable_declaration
    :   variable_name ('CONSTANT')?
        type_spec ('NOT' 'NULL')? 
        ( ( SQL_ASSIGN | 'DEFAULT' ) plsql_expression)? SEMICOLON
    ;   

type_declaration 
    :   keyTYPE type_spec 'IS' ( keyNEW )? ( type_spec ( 'NOT' 'NULL' )? | LPAREN plsql_expressions RPAREN ) SEMICOLON
    ;   

subtype_declaration 
    :   keySUBTYPE type_spec 'IS' type_spec ( 'NOT' 'NULL' | keyRANGE literal DOUBLEDOT literal )? SEMICOLON
    ;   
    
cursor_declaration
    :   keyCURSOR cursor_name
        ( LPAREN parameter_specs RPAREN )?
        'IS' select_command SEMICOLON
    ;
package_obj_body
    :   variable_declaration 
    |   subtype_declaration 
    |   cursor_declaration 
    |   exception_declaration 
    |   record_declaration 
    |   plsql_table_declaration 
    |   varray_declaration
    |   procedure_body 
    |   function_body 
    |   pragma_declaration
    ;

seq_of_statements
    :   statement SEMICOLON ( statement SEMICOLON )*
    ;
    
statement
    :   assignment_statement
    |   exit_statement
    |   goto_statement
    |   case_statement
    |   if_statement 
    |   loop_statement 
    |   null_statement
    |   raise_statement
    |   return_statement
    |   sql_statement
    |   plsql_block
//  |   begin_block
    |   function_call
    ;
        
plsql_block
    :   ( LLABEL label_name RLABEL )?
        ( ( 'DECLARE' )? (declare_spec)+ )? 
        ( 'BEGIN' )
        seq_of_statements
        ( 'EXCEPTION' ( exception_handler )+ )? 
        ( 'END' ( label_name )? )
    ;

declare_spec
    :   variable_declaration 
    |   subtype_declaration 
    |   cursor_declaration 
    |   exception_declaration 
    |   record_declaration 
    |   plsql_table_declaration 
    |   varray_declaration
    |   procedure_declaration 
    |   function_declaration
    |   type_declaration 
    |   pragma_declaration
    ;

pragma_declaration
    :   keyPRAGMA 
        (   keyRESTRICT_REFERENCES LPAREN ( 'DEFAULT' | function_name ) ( COMMA pragma_param )+ RPAREN 
        |   keyEXCEPTION_INIT LPAREN exception_name COMMA literal RPAREN
        |   keyAUTONOMOUS_TRANSACTION
        |   keySERIALLY_REUSABLE
        |   keyBUILTIN LPAREN pragma_params RPAREN
        |   keyFIPSFLAG LPAREN pragma_params RPAREN

        |   keyINTERFACE LPAREN pragma_params RPAREN
        |   keyNEW_NAMES LPAREN pragma_params RPAREN
        |   keyTIMESTAMP LPAREN pragma_params RPAREN
        )
        SEMICOLON
    ;

pragma_params
    :   pragma_param ( COMMA pragma_param )*
    ;

pragma_param
    :   ( PLUS | MINUS )? NUMBER
    |   QUOTED_STRING
    |   identifier
    ;

assignment_statement
    :   //(lvalue SQL_ASSIGN function_call) => (lvalue SQL_ASSIGN function_call)
//  |   (lvalue SQL_ASSIGN plsql_expression)  => 
        (lvalue SQL_ASSIGN plsql_expression)
//  |   function_call
    ;
lvalues
    :   lvalue ( COMMA lvalue )*
    ;
lvalue
    :   variable_name
    |   record_name DOT field_name
    |   plsql_table_name LPAREN subscript RPAREN ( DOT field_name )*
    |   COLON host_variable ( COLON host_variable )?
    ;

field_name
    :   identifier
    ;
    
subscript
    :   plsql_expression 
    ;
    
host_variable
    :   identifier
    ;
    
goto_statement
    :   'GOTO' label_name
    ;
    
label_name
    :   identifier
    ;   

exit_statement
    :   keyEXIT ( label_name )? ( 'WHEN' plsql_condition )?
    ;
    
datatype
    :   'BINARY_INTEGER' 
    |   'BINARY_FLOAT'
    |   'BINARY_DOUBLE'
    |   'NATURAL' 
    |   'POSITIVE' 
    |   ( 'NUMBER' | 'NUMERIC' | 'DECIMAL' | 'DEC' ) ( LPAREN NUMBER ( COMMA NUMBER )? RPAREN )?
    |   'LONG' ( 'RAW')? ( LPAREN NUMBER RPAREN )?
    |   'RAW' ( LPAREN NUMBER RPAREN )?
    |   'BOOLEAN'
    |   'DATE'
    |   keyINTERVAL keyDAY ( LPAREN NUMBER RPAREN )? 'TO' keySECOND ( LPAREN NUMBER RPAREN )?
    |   keyINTERVAL keyYEAR ( LPAREN NUMBER RPAREN )? 'TO' keyMONTH
    |   ( keyTIME | keyTIMESTAMP ) ( LPAREN NUMBER RPAREN )? ( 'WITH' ( keyLOCAL )? keyTIME keyZONE)?
    |   'INTEGER'
    |   'INT'
    |   'SMALLINT'
    |   'FLOAT' ( LPAREN NUMBER RPAREN )?
    |   'REAL'
    |   'DOUBLE' keyPRECISION
    |   'CHAR'      ( keyVARYING )? ( LPAREN NUMBER ( keyBYTE | 'CHAR' )? RPAREN )? ( 'CHARACTER' 'SET' ( identifier | column_spec CHARSET_ATTR ) )?
    |   'VARCHAR'                   ( LPAREN NUMBER ( keyBYTE | 'CHAR' )? RPAREN )? ( 'CHARACTER' 'SET' ( identifier | column_spec CHARSET_ATTR ) )?
    |   'VARCHAR2'                  ( LPAREN NUMBER ( keyBYTE | 'CHAR' )? RPAREN )? ( 'CHARACTER' 'SET' ( identifier | column_spec CHARSET_ATTR ) )?
    |   'CHARACTER' ( keyVARYING )? ( LPAREN NUMBER RPAREN )?
    |   'NCHAR'     ( keyVARYING )? ( LPAREN NUMBER RPAREN )?
    |   'NVARCHAR'  ( LPAREN NUMBER RPAREN )?
    |   'NVARCHAR2' ( LPAREN NUMBER RPAREN )?
    |   'NATIONAL'  ( 'CHARACTER' | 'CHAR' ) ( keyVARYING )? ( LPAREN NUMBER RPAREN )?
    |   'MLSLABEL'
    |   'PLS_INTEGER'
    |   'BLOB'
    |   'CLOB' ( 'CHARACTER' 'SET' ( identifier | column_spec CHARSET_ATTR ) )?
    |   'NCLOB'
    |   'BFILE'
    |   'ROWID' 
    |   'UROWID' ( LPAREN NUMBER RPAREN )?
    ;

type_spec
    :   datatype 
//  |   variable_name TYPE_ATTR
    |   column_spec TYPE_ATTR
//  |   package_name DOT variable_name
    |   table_spec ROWTYPE_ATTR
//  |   keyREF ( keyCURSOR | type_name )
    |   type_name ( LPAREN NUMBER RPAREN )?
    ;

type_name
    :   identifier ( DOT identifier )*
    ;

parameter_specs
    :   parameter_spec ( COMMA parameter_spec )*
    ;

parameter_spec
    :   parameter_name ( 'IN' )? ( type_spec )?
    ;   

parameter_name
    :   identifier
    ;

cursor_spec
    :   keyCURSOR cursor_name 
        ( LPAREN parameter_specs RPAREN )?
        keyRETURN return_type SEMICOLON! 
    ;

procedure_spec: 
    'PROCEDURE' procedure_name 
    ( LPAREN arguments RPAREN )? SEMICOLON
    ;

function_spec
    :   'FUNCTION' function_name 
        ( LPAREN arguments RPAREN )?
        keyRETURN return_type SEMICOLON
    ;

exception_declaration
    :   exception_name 'EXCEPTION' SEMICOLON
    ;

exception_names
    :   exception_name ( 'OR' exception_name )*
    ;

exception_name
    :   ( exception_package_name DOT )? identifier
    ;

exception_package_name
    :   identifier
    ;

    
//oracle_err_number
//  :   ( PLUS | MINUS )? NUMBER
//  |   QUOTED_STRING
//  ;
    
record_declaration
    :   record_type_dec 
//  |   record_var_dec
    ;

record_type_dec
    :   keyTYPE type_name 'IS' keyRECORD 
        LPAREN field_specs RPAREN SEMICOLON
    ;

//record_var_dec
//  :   record_name type_name ROWTYPE_ATTR SEMI
//  ;

field_specs
    :   field_spec ( COMMA field_spec )*
    ;
field_spec
    :   column_name type_spec
        ('NOT' 'NULL')? 
        ( ( SQL_ASSIGN | 'DEFAULT' ) plsql_expression)?
    ;

plsql_table_declaration
    :   table_type_dec
//  |   table_var_dec
    ;

table_type_dec
    :   keyTYPE type_name 'IS' 'TABLE' 
        'OF' type_spec ( 'NOT' 'NULL' )?
        (   'INDEX' 'BY' 
            (   'BINARY_INTEGER'
            |   'PLS_INTEGER'
            |   'VARCHAR2' LPAREN integer RPAREN
            )
        )?
        SEMICOLON
    ;

table_var_dec
    :   plsql_table_name type_name SEMICOLON
    ;

plsql_table_name
    :   identifier ( DOT identifier )*
    ;

varray_declaration
    :   keyTYPE type_name 'IS' 
        ( keyVARRAY | keyVARYING keyARRAY ) LPAREN integer RPAREN
        'OF' type_spec ( 'NOT' 'NULL' )?
    ;

procedure_declaration
    :   procedure_body
    ;

procedure_body
    :   ( proc_fun_start )? 'PROCEDURE'^ procedure_name 
        ( LPAREN argument ( COMMA argument )* RPAREN )? 
        ( 'IS' | 'AS' )
        //( keyPRAGMA keyAUTONOMOUS_TRANSACTION )?
        ( ( declare_spec ) => ( declare_spec )* )
        ( 'BEGIN' )
        ( seq_of_statements )
        ( 'EXCEPTION' ( exception_handler )* )?
        'END' ( procedure_name )? SEMICOLON
    ;

begin_block
    :   'BEGIN'
        ( seq_of_statements )
        ( 'EXCEPTION' ( exception_handler )+ )?
        'END'
    ;

//Exception handler needs to be defined
exception_handler
    :   'WHEN' exception_names 'THEN'
        seq_of_statements
    ;

proc_fun_start
    :   'CREATE' ( 'OR' keyREPLACE )?
    ;

function_body
    :   ( proc_fun_start )? 'FUNCTION'^ function_name 
        ( LPAREN arguments RPAREN )? 
        keyRETURN return_type ( 'IS' | 'AS' )
        //( keyPRAGMA keyAUTONOMOUS_TRANSACTION )?
        ( ( declare_spec ) => ( declare_spec )* )
        ( 'BEGIN' )
        ( seq_of_statements )
        ( 'EXCEPTION' ( exception_handler )+ )?
        'END' ( function_name )? SEMICOLON
    ;

function_name
    :   identifier | QUOTED_STRING //( schema_name DOT )? identifier
    ;

procedure_name
    :   identifier | QUOTED_STRING //( schema_name DOT )? identifier
    ;

arguments
    :   argument ( COMMA argument )*
    ;

argument
    :   argument_name ( keyOUT | 'IN' keyOUT | 'IN' )? (argument_type )?
        ( ( SQL_ASSIGN | 'DEFAULT' ) plsql_expression )?
    ;

argument_name
    :   identifier
    ;

argument_type
    :   type_spec
    ;

value
    :   ( PLUS | MINUS )? NUMBER
    |   quoted_string
    |   'TRUE' | 'FALSE'
    |   'NULL'
    ;

return_type
    :   type_spec
    ;

function_declaration
    :   function_body
    ;

function_call returns [StringBuffer value]
    :   user_defined_function {$value = new StringBuffer(" " + $user_defined_function.value.toString().trim());} 
        ( { input.LA(1) != LPAREN || input.LA(2) != PLUS || input.LA(3) != RPAREN }? 
        LPAREN {$value.append(" (");} ( call_parameters {$value.append(" " + $call_parameters.text);})? 
        RPAREN {$value.append(" )");})?
//  |   //{ input.LA(1) == ID && input.LA(2) == LPAREN && input.LA(3) == ASTERISK && input.LA(4) == RPAREN }? 
//      { is_sql }?
//      keyCOUNT LPAREN ( ASTERISK | sql_expression ) RPAREN
//  |   { is_sql }?
//      'DISTINCT' LPAREN call_parameters RPAREN
    ;

collection_function_call
    :   plsql_table_name
    ;

variable_names
    :   variable_name ( COMMA variable_name )*
    ;
variable_name
    :   identifier
    ;

null_statement
    :   'NULL' 
    ;

raise_statement
    :   keyRAISE ( exception_name )?
    ;
    
return_statement
    :   keyRETURN ( plsql_expression )?
    ;

loop_statement
    :   ( LLABEL label_name RLABEL )?
        (   keyWHILE^ plsql_condition
        |   (   'FOR'^
                (   ( numeric_loop_param ) => numeric_loop_param
                |   ( cursor_loop_param ) => cursor_loop_param 
                )
            )
        )?
        keyLOOP
        seq_of_statements
        'END' keyLOOP 
        ( label_name )?
    ;

numeric_loop_param
    :   index_name 'IN' ( keyREVERSE )? integer_expr DOUBLEDOT integer_expr
    ;

index_name
    :   identifier
    ;

//Added typespec to handle packagename.variablename for loop statement
integer_expr returns [StringBuffer value]
    :   sql_expression {$value = new StringBuffer($sql_expression.value.toString().trim());}
    ;

cursor_name
    :   identifier
    ;

cursor_loop_param
    :   record_name 'IN'
        (   cursor_name ( LPAREN plsql_expressions RPAREN )?
        |   LPAREN select_statement RPAREN
        )
    ;

record_name
    :   identifier
    ;

commit_statement
    :   'COMMIT'
    ;

if_statement
    :   'IF'^ plsql_condition 'THEN' seq_of_statements
        (   //{ input.LA(1) != ELSE }?
            keyELSIF plsql_condition 'THEN' seq_of_statements
        )*
        ( 'ELSE' seq_of_statements )?
        'END' 'IF'
    ;

sql_statement
    :   sql_command
    ;

sql_command
    :   to_modify_data
    |   to_control_data
    ;

to_modify_data
    :   select_command
    |   insert_command
    |   update_command
    |   delete_command
    |   set_transaction_command
    ;

to_control_data
    :   close_statement
    |   commit_statement
    |   fetch_statement
    |   lock_table_statement
    |   open_statement
    |   rollback_statement
    |   savepoint_statement
    ;

select_command returns [StringBuffer value]
    :   select_statement {$value = $select_statement.value;}// ( 'UNION' select_statement )*
    ;

select_statement returns [StringBuffer value]
    :   //( LPAREN select_command RPAREN ) => LPAREN select_command RPAREN |
        select_expression {$value = $select_expression.value;}
    ;

select_expression returns [StringBuffer value, List<String> dimensions]
    :   
        'SELECT' {$value = new StringBuffer(" SELECT");} /*( hint )?*/ 
        ( 'DISTINCT' {$value.append(" DISTINCT");} | 'UNIQUE' {$value.append(" UNIQUE");}| 'ALL' {$value.append(" ALL");} )? 
        select_list 
        {
           $value.append(" " + $select_list.value.toString().trim());
           $dimensions = $select_list.dimensions;
        }
        ( keyBULK keyCOLLECT {$value.append(" " + $keyBULK.text + " " + $keyCOLLECT.text);})?
        ( 'INTO' lvalues {$value.append(" " + "INTO " + $lvalues.text);})?
        'FROM' {$value.append(" FROM");} ( table_reference_list {$value.append(" " + $table_reference_list.value.toString().trim());}| j1 = join_clause {$value.append(" " + $j1.text);}| LPAREN j2 = join_clause RPAREN {$value.append(" (" + $j2.text + ")");})
        ( where_clause {$value.append(" " + $where_clause.value.toString().trim());})? ( hierarchical_query_clause {$value.append(" " + $hierarchical_query_clause.text);})? ( group_by_clause {$value.append(" " + $group_by_clause.text);})?
        ( 'HAVING' sql_condition {$value.append(" HAVING" + $sql_condition.text);})? ( model_clause {$value.append(" " + $model_clause.text);})?
        (   (   'UNION' {$value.append(" UNION");} ( 'ALL' {$value.append(" ALL");})?
            |   'INTERSECT' {$value.append(" INTERSECT");}
            |   'MINUS' {$value.append(" MINUS");}
            )
            (   s1 = select_expression {$value.append(" " + $s1.value);} //LPAREN subquery RPAREN
            |   subquery {$value.append(" " + $subquery.value);}
            )
        )?
        ( order_by_clause {$value.append(" " + $order_by_clause.text);})?
    ;

select_list returns [StringBuffer value, List<String> dimensions]
    :   ASTERISK {$value = new StringBuffer(" *");}
    |   d1=displayed_column 
        {
           String dim = $d1.value.toString().trim();
           $value = new StringBuffer(" " + $d1.value.toString().trim());
           $dimensions = new ArrayList<String>();
           if (!$d1.dimension.equals("VALUE")) {
              $dimensions.add($d1.dimension);
           }   
        }
        ( COMMA d2=displayed_column 
        {
           $value.append(" , " + $d2.value.toString().trim());
           if (!$d2.dimension.equals("VALUE")) {
              $dimensions.add($d2.dimension);
           }
        })*
    ;

table_reference_list_from
    :   'FROM' table_reference_list
    ;

table_reference_list returns [StringBuffer value]
    :   {$value = new StringBuffer();} s1=selected_table 
        {$value.append(" " + $s1.value.toString().trim());} 
        ( COMMA s2=selected_table {$value.append(" " + $s2.value.toString().trim());})*
    ;

join_clause
    :   table_name ( inner_cross_join_clause | outer_join_clause )+
    ;
inner_cross_join_clause
    :   ( keyINNER )? keyJOIN table_name ( 'ON' sql_condition | keyUSING LPAREN column_specs RPAREN )
    |   ( keyCROSS | keyNATURAL ( keyINNER ) ) keyJOIN table_name
    ;
outer_join_clause
    :   ( query_partition_clause )?
        (   outer_join_type keyJOIN
        |   keyNATURAL ( outer_join_type )? keyJOIN
        )
        table_name ( query_partition_clause )?
        ( 'ON' sql_condition | keyUSING LPAREN column_specs RPAREN )?
    ;
query_partition_clause
    :   keyPARTITION 'BY' expression_list
    ;
outer_join_type
    :   ( keyFULL | keyLEFT | keyRIGHT ) ( keyOUTER )?
    ;
outer_join_sign returns [StringBuffer value]
    :   LPAREN PLUS RPAREN {$value = new StringBuffer(" (+)");}
    ;
where_clause returns [StringBuffer value]
    :   'WHERE' sql_condition {$value = new StringBuffer(" WHERE " + $sql_condition.value.toString().trim());}
    ;
hierarchical_query_clause
    :   ( 'START' 'WITH' sql_condition )? 'CONNECT' 'BY' ( keyNOCYCLE )? sql_condition
    ;
group_by_clause
    :   'GROUP' 'BY' group_by_exprs
    ;
group_by_exprs
    :   group_by_expr ( COMMA group_by_expr )*
    ;
group_by_expr
    :   rollup_cube_clause
    |   grouping_sets_clause
    |   grouping_expression_list
    ;
rollup_cube_clause
    :   ( keyROLLUP | keyCUBE ) LPAREN grouping_expression_list RPAREN
    ;
grouping_sets_clause
    :   keyGROUPING keySETS LPAREN grouping_expression_list RPAREN
    ;
grouping_sets_exprs
    :   grouping_sets_expr ( COMMA grouping_sets_expr )*
    ;
grouping_sets_expr
    :   rollup_cube_clause | grouping_expression_list
    ;
model_clause
    :   keyMODEL ( cell_reference_options )
        ( return_rows_clause )?
        ( reference_model )+ main_model
    ;
cell_reference_options
    :   ( ( keyIGNORE | keyKEEP ) keyNAV )?
        ( 'UNIQUE' ( keyDIMENSION | keySINGLE keyREFERENCE ) )?
    ;
return_rows_clause
    :   keyRETURN ( keyUPDATED | 'ALL' ) 'ROWS'
    ;
reference_model
    :   keyREFERENCE reference_model_name 'ON' LPAREN subquery RPAREN
        model_column_clauses ( cell_reference_options )
    ;
reference_model_name
    :   identifier
    ;
main_model
    :   ( keyMAIN main_model_name )? model_column_clauses
        ( cell_reference_options ) model_rules_clause
    ;
main_model_name
    :   identifier
    ;
model_column_clauses
    :   ( query_partition_clause ( column_spec )? )?
        keyDIMENSION 'BY' LPAREN model_columns RPAREN
        keyMEASURES LPAREN model_columns RPAREN
    ;
model_columns
    :   model_column ( COMMA model_column )*
    ;
model_column
    :   sql_expression ( ( 'AS' )? column_spec )?
    ;
model_rules_clause
    :   ( keyRULES ( 'UPDATE' | keyUPSERT ( 'ALL' )? )? ( ( keyAUTOMATIC | keySEQUENTIAL ) 'ORDER' )? )?
        ( keyITERATE LPAREN NUMBER RPAREN ( keyUNTIL LPAREN sql_condition RPAREN )? )?
        LPAREN model_rules_exprs RPAREN
    ;
model_rules_exprs
    :   model_rules_expr ( COMMA model_rules_expr )*
    ;
model_rules_expr
    :   ( 'UPDATE' | keyUPSERT ( 'ALL' )? )? cell_assignment ( order_by_clause )? EQ sql_expression
    ;
cell_assignment
    :   measure_column LBRACK ( multi_column_for_loop | cell_assignment_exprs ) RBRACK
    ;
cell_assignment_exprs
    :   cell_assignment_expr ( COMMA cell_assignment_expr )*
    ;
cell_assignment_expr
    :   sql_condition | sql_expression | single_column_for_loop
    ;
measure_column
    :   column_name
    ;
single_column_for_loop
    :   'FOR' column_name
        (   'IN' LPAREN ( literals | subquery ) RPAREN
        |   ( 'LIKE' pattern )? 'FROM' literal 'TO' literal ( keyINCREMENT | keyDECREMENT ) literal
        )
    ;
literal
    :   ( PLUS | MINUS )? NUMBER
    |   QUOTED_STRING
    ;
literals
    :   literal ( COMMA literal )*
    ;
bracket_literals
    :   LPAREN literals RPAREN
    ;
bracket_literals_list
    :   bracket_literals ( COMMA bracket_literals )*
    ;
pattern
    :   QUOTED_STRING
    ;
multi_column_for_loop
    :   'FOR' LPAREN column_specs RPAREN 'IN' LPAREN ( bracket_literals_list | subquery ) RPAREN
    ;
order_by_clause
    :   'ORDER' ( keySIBLINGS )? 'BY' order_by_exprs
    ;
order_by_exprs
    :   order_by_expr ( COMMA order_by_expr )*
    ;
order_by_expr
    :   (   sql_expression
//      |   position
//      |   column_alias
        )
        ( 'ASC' | 'DESC' )? ( keyNULLS keyFIRST | keyNULLS keyLAST )?
    ;
for_update_clause
    :   'FOR' 'UPDATE' ( 'OF' column_specs )? ( keyWAIT integer | 'NOWAIT' )?
    ;

where_condition_whole
    :   'WHERE' sql_condition
    ;

where_condition
    :   sql_condition
    ;

displayed_column returns [StringBuffer value, String dimension]
    :   (   column_spec DOT ASTERISK {$value = new StringBuffer(" " + $column_spec.value.toString().trim() + " .*");}
//      |   keyCOUNT LPAREN ( ASTERISK | 'DISTINCT' LPAREN sql_expression RPAREN ) RPAREN
//      |   
        |   sql_expression {$value = new StringBuffer(" " + $sql_expression.value.toString().trim());}
        )
        ( alias 
        {
           $value.append(" " + $alias.value.toString().trim());
           $dimension = $alias.dimension;
        })?
    ;

schema_name returns [StringBuffer value]
    :   sql_identifier {$value = new StringBuffer(" " + $sql_identifier.value.toString().trim());}
    ;

table_name returns [StringBuffer value]
    :   sql_identifier {$value = new StringBuffer(" " + $sql_identifier.value.toString().trim());}
    ;

nested_expressions
    :   nested_expression ( COMMA nested_expression )*
    ;

nested_expression returns [StringBuffer value]
    :   {  is_sql }? sql_expression {$value = new StringBuffer(" " + $sql_expression.value.toString().trim());}
    |   { !is_sql }? plsql_expression {$value = new StringBuffer(" " + $plsql_expression.text);}
    ;
plsql_condition
        @init { is_sql = false; }
    :   expr_bool
    ;

plsql_expressions
    :   plsql_expression ( COMMA plsql_expression )*
    ;

plsql_expression
        @init { is_sql = false; }
    :   expr_bool
    ;


expr_bool
    :   expr_or ( 'OR' expr_or )*
    ;
expr_or
    :   expr_and ( 'AND' expr_and )*
    ;
expr_and
    :   ( 'NOT' )? expr_not
    ;
expr_not
    :   expr_add 
        (   relational_op expr_add
        |   FOUND_ATTR | NOTFOUND_ATTR | ISOPEN_ATTR | ROWCOUNT_ATTR | BULK_ROWCOUNT_ATTR
        |   'IS' ( 'NOT' )? 'NULL'
        |   ( 'NOT' )? 'LIKE' expr_add
        |   ( 'NOT' )? 'BETWEEN' expr_add 'AND' expr_add
        |   ( 'NOT' )? 'IN' LPAREN nested_expressions RPAREN
        )*
    ;

boolean_literal returns [StringBuffer value]
    :   'TRUE' {$value = new StringBuffer(" TRUE");} | 'FALSE' {$value = new StringBuffer(" FALSE");}
    ;

sql_expressions returns [StringBuffer value]
    :   s1=sql_expression  {$value = new StringBuffer(" " + $s1.value.toString().trim());} 
    ( COMMA s2=sql_expression {$value.append(" ," + $s2.value.toString().trim());})*
    ;
sql_expression returns [StringBuffer value]
        @init { is_sql = true; }
    :   expr_add {$value = new StringBuffer(" " + $expr_add.value.toString().trim());}
    ;
expr_add returns [StringBuffer value]
    :   e1 = expr_mul {$value = new StringBuffer(" " + $e1.value.toString().trim());}
        ( ( PLUS {$value.append(" +");}| MINUS {$value.append(" -");}| DOUBLEVERTBAR {$value.append(" ||");}) 
        e2=expr_mul {$value.append(" " +$e2.value.toString().trim());})*
    ;
expr_mul returns [StringBuffer value]
    :   e1=expr_sign {$value = new StringBuffer(" " + $e1.value.toString().trim());} 
        ( ( ASTERISK {$value.append(" *");}| DIV {$value.append(" /");}) e2=expr_sign {$value.append(" " + $e2.value.toString().trim());})*
    ;
expr_sign returns [StringBuffer value]
    :   {$value = new StringBuffer();} ( PLUS {$value.append(" +");}| MINUS {$value.append(" -");})? 
        expr_pow {$value.append(" " + $expr_pow.value.toString().trim());}
    ;
expr_pow returns [StringBuffer value]
    :   {$value = new StringBuffer();} e1=expr_expr {$value.append(" " + $e1.value.toString().trim());}
        ( EXPONENT e2=expr_expr {$value.append(" **" + $e2.value.toString().trim());} )*
    ;
expr_expr returns [StringBuffer value]
    :   ( expr_paren) => expr_paren {$value = new StringBuffer(" " + $expr_paren.value.toString().trim());}
    |   ( function_expression) => function_expression {$value = new StringBuffer(" " + $function_expression.value.toString().trim());}
//  |   ( compound_expression ) => compound_expression
    |   ( case_expression ) => case_expression 
    |   ( cursor_expression ) => cursor_expression 
    |   ( simple_expression ) => simple_expression {$value = new StringBuffer(" " + $simple_expression.value.toString().trim());}
    |   ( select_expression ) => select_expression {$value = new StringBuffer(" " + $select_expression.value.toString().trim());}
//  |   ( special_expression ) => special_expression
//  |   datetime_expression
//  |   interval_expression
//  |   object_access_expression
//  |   scalar_subquery_expression
//  |   model_expression
//  |   type_constructor_expression
//  |   variable_expression
//  :   'NULL' | NUMBER | QUOTED_STRING | IDENTIFIER
    ;
simple_expression returns [StringBuffer value]
    :   boolean_literal {$value = new StringBuffer(" " + $boolean_literal.value.toString().trim());}
    |   'SQL' {$value = new StringBuffer(" SQL");} 
        ( FOUND_ATTR {$value.append(" " + $FOUND_ATTR.text);}| 
        NOTFOUND_ATTR {$value.append(" " + $NOTFOUND_ATTR.text);} | 
        ISOPEN_ATTR {$value.append(" " + $ISOPEN_ATTR.text);}| 
        ROWCOUNT_ATTR {$value.append(" " + $ROWCOUNT_ATTR.text);}| 
        BULK_ROWCOUNT_ATTR {$value.append(" " + $BULK_ROWCOUNT_ATTR.text);})
    |   ( column_spec) => column_spec {$value = new StringBuffer(" " + $column_spec.value.toString().trim());}
    |   QUOTED_STRING {$value = new StringBuffer(" " + $QUOTED_STRING.text);}
    |   NUMBER {$value = new StringBuffer(" " + $NUMBER.text);}
//  |   sequence_name DOT ( 'CURRVAL' | 'NEXTVAL' )
//  |   'ROWID'
//  |   'ROWNUM'
    |   'NULL' {$value = new StringBuffer(" NULL");}
    ;
compound_expression
//  :   expr_paren
//  |   expr_sign
    :   expr_prior
//  |   expr_add
//  |   expr_cat
    ;
expr_paren returns [StringBuffer value]
    :   LPAREN {$value = new StringBuffer(" (");} 
        nested_expression {$value.append(" " + $nested_expression.value.toString().trim());} 
        RPAREN {$value.append(" )");}
    ;
expr_prior
    :   'PRIOR' expr_add
    ;
case_expression
    :   'CASE' ( simple_case_expression | searched_case_expression ) ( else_case_expression )? 'END'
    ;
simple_case_expression
    :   nested_expression ( 'WHEN' nested_expression 'THEN' nested_expression )+
    ;
searched_case_expression
    :   ( 'WHEN' nested_condition 'THEN' nested_expression )+
    ;
else_case_expression
    :   'ELSE' nested_expression
    ;
case_statement
    :   ( label_name )? 'CASE'^ ( simple_case_statement | searched_case_statement ) ( else_case_statement )? 'END' 'CASE' ( label_name )?
    ;
simple_case_statement
    :   plsql_expression ( 'WHEN' plsql_expression 'THEN' seq_of_statements )+
    ;
searched_case_statement
    :   ( 'WHEN' plsql_expression 'THEN' seq_of_statements )+
    ;
else_case_statement
    :   'ELSE' seq_of_statements
    ;
cursor_expression
    :   keyCURSOR LPAREN subquery RPAREN
    ;
datetime_expression
    :   sql_expression 'AT'
        (   keyLOCAL
        |   keyTIME keyZONE ( keyDBTIMEZONE | keySESSIONTIMEZONE | sql_expression )
        )
    ;
function_expression returns [StringBuffer value]
    :      { is_sql }?
        (   keyCOUNT LPAREN {$value = new StringBuffer(" COUNT (");} 
        ( ASTERISK {$value.append(" *");}| 
        n1=nested_expression {$value.append(" " + n1.value.toString().trim());}) RPAREN {$value.append(" )");}
        |
            ^(TO_CHAR {$value = new StringBuffer(" TO_CHAR (");}         
        n2=nested_expression {$value.append(" " + n2.value.toString().trim());}
        (quoted_string {$value.append(" ," + $quoted_string.value.toString().trim());})? {$value.append(" )");})
        |  
            ^(SUBSTR {$value = new StringBuffer(" SUBSTR (");}
            n3=nested_expression {$value.append(" " + n3.value.toString().trim());}
            int1=integer_expr {$value.append("," + int1.value.toString().trim());} (int2=integer_expr {$value.append("," + int2.value.toString().trim());})?
            {$value.append(" )");})
        |
            ^(TRIM  {$value = new StringBuffer(" TRIM (");} 
        n4=nested_expression {$value.append(" " + n4.value.toString().trim());}  {$value.append(" )");})
        |
        function_call {$value = new StringBuffer(" " + $function_call.value.toString().trim());} 
        ( DOT {$value.append(" .");} n5=nested_expression {$value.append(" " + $n5.value.toString().trim());})?
        |   'DISTINCT' {$value.append(" DISTINCT");} 
        ( LPAREN n6=nested_expression RPAREN 
        {$value.append(" (" + $n6.value.toString().trim() + " )");}| 
        n7=nested_expression {$value.append(" " + $n7.value.toString().trim());} )
        )
    ;
special_expression
    :   { is_sql }?
        (   keyCOUNT LPAREN ( ASTERISK | nested_expression ) RPAREN
        |   'DISTINCT' LPAREN nested_expression RPAREN
        )
    ;
interval_expression
    :   sql_expression
        (   keyDAY ( LPAREN leading_field_precision RPAREN )? 'TO' keySECOND ( LPAREN fractional_second_precision RPAREN )?
        |   keyYEAR ( LPAREN leading_field_precision RPAREN )? 'TO' keyMONTH
        )
    ;
leading_field_precision
    :   integer // TODO validate digit from 0 to 9
    ;
fractional_second_precision
    :   integer // TODO validate digit from 0 to 9
    ;
object_access_expression
    :
    ;
scalar_subquery_expression
    :
    ;
model_expression
    :
    ;
type_constructor_expression
    :
    ;
variable_expression
    :
    ;
sequence_name
    :   identifier
    ;
integer
    :   NUMBER
    ;

alias returns [StringBuffer value, String dimension]
    :   {$value = new StringBuffer();} ( 'AS' {$value.append(" AS");})? 
        sql_identifier 
        {
           $value.append(" " + $sql_identifier.value.toString().trim());
           $dimension = $sql_identifier.value.toString().trim().toString().replaceAll("\"", "");
        }
    ;

column_specs
    :   column_spec ( COMMA column_spec )*
    ;

column_spec returns [StringBuffer value]
    :   s1=sql_identifier {$value = new StringBuffer($s1.text);} 
        (DOT s2=sql_identifier {$value.append("." + $s2.text);} 
        (DOT s3=sql_identifier {$value.append("." + $s3.text);})?)?  
//  |   { is_sql }?
//      (   ASTERISK
//      |   sql_identifier ( DOT sql_identifier )* ( DOT ASTERISK )
//      )
//      ( ( schema_name DOT )? table_name DOT )? column_name
    ;

column_name
    :   sql_identifier
    ;
nested_table
    :   sql_identifier
    ;
nested_table_column_name
    :   ( schema_name DOT )? table_name DOT nested_table DOT column_name
    ;

user_defined_function returns [StringBuffer value]
    :   s1=sql_identifier {$value = new StringBuffer(" " + $s1.value.toString().trim());} 
        ( DOT s2=sql_identifier {$value.append(" ." + $s2.value.toString().trim());} )* 
        ( DOT {$value.append(" .");} 
        ( 'EXISTS' {$value.append(" EXISTS");}| 'PRIOR' {$value.append(" PRIOR");}| 'DELETE' {$value.append(" DELETE");}) )? //( ( schema_name DOT )? package_name DOT )? identifier // sql_identifier ( DOT sql_identifier )*
    ;

//function
//  :   user_defined_function
//      number_function
//  |   char_function
//  |   group_function
//  |   conversion_function
//  |   other_function
//  ;

selected_table returns [StringBuffer value]
    :  {$value = new StringBuffer();} 
       ( table_spec {$value.append(" " + $table_spec.value.toString().trim());} | 
       ( 'TABLE' {$value.append(" TABLE");}| keyTHE {$value.append(" " + $keyTHE.text);})? 
       subquery {$value.append(" " + $subquery.value.toString().trim());}) ( alias {$value.append(" " + $alias.value.toString().trim());})?
    ;

table_spec returns [StringBuffer value]
    :  {$value = new StringBuffer();} 
       ( schema_name DOT {$value.append(" " + $schema_name.value.toString().trim() + " .");})? 
       table_name {$value.append(" " + $table_name.value.toString().trim());} 
       ( AT_SIGN link_name {$value.append(" @" + $link_name.value.toString().trim());})?
    ;

table_alias
    :   ( schema_name DOT )? table_name ( AT_SIGN link_name )? ( alias )?
    ;

link_name returns [StringBuffer value]
    :   sql_identifier {$value = new StringBuffer(" " + $sql_identifier.value.toString().trim());}
    ;
nested_condition
    :   {  is_sql }? condition_or
    |   { !is_sql }? expr_bool
    ;
sql_condition returns [StringBuffer value]
        @init { is_sql = true; }
    :   condition_or {$value = $condition_or.value;}
//  |   column 'IS' 'NOT' 'NULL' // TODO must be any boolean expression with table columns
    ;
condition_paren
    :   LPAREN sql_condition RPAREN
    ;
condition_or returns [StringBuffer value]
    :   c1=condition_and {$value = new StringBuffer(" " + $c1.value.toString().trim());} 
        ( 'OR' c2=condition_and {$value.append(" OR " + $c2.value.toString().trim());} )*
    ;
condition_and returns [StringBuffer value]
    :   c1=condition_not {$value = new StringBuffer(" " + $c1.value.toString().trim());}  
        ( 'AND' c2=condition_not {$value.append(" AND " + $c2.value.toString().trim());} )*
    ;
condition_not returns [StringBuffer value]
    :   'NOT' c1=condition_expr {$value = new StringBuffer(" NOT " + $c1.value.toString().trim());}
    |   c2=condition_expr {$value = new StringBuffer(" " + $c2.value.toString().trim());}
    ;
condition_expr returns [StringBuffer value]
    :   condition_exists
    |   condition_is
    |   condition_comparison {$value = $condition_comparison.value;}
    |   condition_group_comparison
    |   condition_in {$value = $condition_in.value;}
    |   condition_is_a_set
    |   condition_is_any
    |   condition_is_empty
    |   condition_is_of_type
    |   condition_is_present
    |   condition_like
    |   condition_memeber
    |   condition_between
    |   condition_regexp_like
    |   condition_submultiset
    |   condition_equals_path
    |   condition_under_path
    |   condition_paren
    ;
condition_exists returns [StringBuffer value]
    :   'EXISTS' LPAREN select_command RPAREN 
        {$value = new StringBuffer(" EXISTS (" + $select_command.value.toString().trim() + " )");} 
    ;
condition_is returns [StringBuffer value]
    :   sql_expression 'IS' 
        {$value = new StringBuffer(" " + $sql_expression.value.toString().trim() + " IS");} 
        ( 'NOT' {$value.append(" NOT");})? 
        ( keyNAN {$value.append(" " + $keyNAN.value.toString().trim());} | 
        keyINFINITE {$value.append(" " + $keyINFINITE.value.toString().trim());}| 
        'NULL' {$value.append(" NULL");})
    ;
condition_comparison returns [StringBuffer value]
    :   LPAREN sql_expressions RPAREN {$value = new StringBuffer(" (" + $sql_expressions.value.toString().trim() + " )");}
        ( o1=outer_join_sign {$value.append(" " + $o1.value.toString().trim());})? 
        ( EQ {$value.append(" =");}| n1=NOT_EQ {$value.append(" " + $n1.text);}) 
        LPAREN s1=select_command RPAREN {$value.append(" (" + $s1.value.toString().trim() + " )");}
        ( o2=outer_join_sign {$value.append(" " + $o2.value.toString().trim());})?
    |   {$value = new StringBuffer();} 
        ( 'PRIOR' {$value.append(" PRIOR");})? 
        sql1=sql_expression {$value.append(" " + $sql1.value.toString().trim());} 
        ( o3=outer_join_sign {$value.append(" " + $o3.value.toString().trim());})? 
        ( EQ {$value.append(" =");} | 
        n2=NOT_EQ {$value.append(" " + $n2.text);}| 
        BOOLOP_GT {$value.append(" " + $BOOLOP_GT.text);}| 
        BOOLOP_GE {$value.append(" " + $BOOLOP_GE.text);}| 
        BOOLOP_LT {$value.append(" " + $BOOLOP_LT.text);}| 
        BOOLOP_LE {$value.append(" " + $BOOLOP_LE.text);}) 
        ( 'PRIOR' {$value.append(" PRIOR");})? 
        ( sql2=sql_expression {$value.append(" " + $sql2.value.toString().trim());}| 
        LPAREN s2=select_command RPAREN {$value.append(" (" + $s2.value.toString().trim() + " )");}) 
        ( o4=outer_join_sign {$value.append(" " + $o4.value.toString().trim());})?
    ;
condition_group_comparison
    :   LPAREN sql_expressions RPAREN ( EQ | NOT_EQ ) ( 'ANY' | keySOME | 'ALL' ) LPAREN ( grouping_expression_list | select_command ) RPAREN
    |   sql_expression ( EQ | NOT_EQ | BOOLOP_GT | BOOLOP_GE | BOOLOP_LT | BOOLOP_LE ) ( 'ANY' | keySOME | 'ALL' ) LPAREN ( sql_expressions | select_command ) RPAREN
    ;
condition_in returns [StringBuffer value]
    :   LPAREN sql_expressions RPAREN {$value = new StringBuffer(" (" + $sql_expressions.value.toString().trim() + " )");}
        ( 'NOT' {$value.append(" NOT");})? 'IN' LPAREN {$value.append(" IN ( ");} 
        ( grouping_expression_list {$value.append(" " + $grouping_expression_list.value.toString().trim());} | 
        select_command {$value.append(" " + $select_command.value.toString().trim());}) RPAREN {$value.append(" )");}
    |   sql_expression {$value = new StringBuffer(" " + $sql_expression.value.toString().trim());} 
        ( 'NOT' {$value.append(" NOT");})? 'IN'  LPAREN {$value.append(" IN ( ");} 
        ( expression_list {$value.append(" " + $expression_list.value.toString().trim());} | 
        select_command {$value.append(" " + $select_command.value.toString().trim());}) RPAREN {$value.append(" )");}
    ;
condition_is_a_set
    :   nested_table_column_name 'IS' ( 'NOT' )? keyA 'SET'
    ;
condition_is_any
    :   ( column_name 'IS' )? 'ANY'
    ;
condition_is_empty
    :   nested_table_column_name 'IS' ( 'NOT' )? keyEMPTY
    ;
condition_is_of_type
    :   sql_expression 'IS' ( 'NOT' )? 'OF' ( keyTYPE )? LPAREN type_name RPAREN
    ;
condition_is_of_type_names
    :   condition_is_of_type_name ( COMMA condition_is_of_type_name )*
    ;
condition_is_of_type_name
    :   ( keyONLY )? type_name
    ;
condition_is_present
    :   cell_reference 'IS' keyPRESENT
    ;
condition_like
    :   sql_expression ( 'NOT' )? ( 'LIKE' | keyLIKEC | keyLIKE2 | keyLIKE4 ) sql_expression ( keyESCAPE sql_expression )?
    ;
condition_memeber
    :   sql_expression ( 'NOT' )? keyMEMBER ( 'OF' )? nested_table_column_name
    ;
condition_between
    :   sql_expression ( 'NOT' )? 'BETWEEN' sql_expression 'AND' sql_expression
    ;
condition_regexp_like
    :   keyREGEXP_LIKE LPAREN call_parameters RPAREN
    ;
condition_submultiset
    :   nested_table_column_name ( 'NOT' )? keySUBMULTISET ( 'OF' )? nested_table_column_name
    ;
condition_equals_path
    :   keyEQUALS_PATH LPAREN column_name COMMA path_string ( COMMA correlation_integer )? RPAREN
    ;
condition_under_path
    :   keyUNDER_PATH LPAREN column_name ( COMMA levels )? COMMA path_string ( COMMA correlation_integer )? RPAREN
    ;
levels
    :   integer
    ;
correlation_integer
    :   integer
    ;
path_string
    :   QUOTED_STRING
    ;
grouping_expression_list returns [StringBuffer value]
    :   e1=expression_list {$value = new StringBuffer(" " + $e1.value.toString().trim());} 
        ( COMMA e2=expression_list {$value.append(", " + $e2.value.toString().trim());})*
    ;
expression_list returns [StringBuffer value]
    :   LPAREN s1=sql_expressions RPAREN {$value = new StringBuffer(" (" + $s1.value.toString().trim() + " )");}
    |   s2=sql_expressions {$value = new StringBuffer(" " + $s2.value.toString().trim() + " ");}
    ;
cell_reference
    :   sql_identifier
    ;
call_parameters
    :   call_parameter ( COMMA call_parameter )*
    ;
call_parameter
    :   ( parameter_name ARROW )? nested_expression
    ;

relational_op
    :   EQ | BOOLOP_LT | BOOLOP_GT | NOT_EQ | BOOLOP_LE | BOOLOP_GE
    ;

exp_set
    :   ( sql_expression ) => sql_expression
    |   subquery
    ;

subquery returns [StringBuffer value]
    :   LPAREN select_command RPAREN {$value = new StringBuffer(" (" + $select_command.text + ")");}
    ;

connect_clause
    :   ( 'START' 'WITH' sql_condition )?
        'CONNECT' 'BY' 
        (   'PRIOR' sql_expression relational_op sql_expression
        |   sql_expression relational_op sql_expression 'PRIOR'
        )
        (   ( ( 'PRIOR' )? sql_condition ) => ('PRIOR')? sql_condition
        |   sql_expression relational_op ( 'PRIOR' )? sql_expression ( 'AND' sql_condition )?
        )
        ( 'START' 'WITH' sql_condition )?
    ;

group_clause
    :   'GROUP' 'BY' sql_expression ( COMMA sql_expression )* ( 'HAVING' sql_condition )?
    ;

set_clause
    :   ( ( 'UNION' 'ALL' ) | 'INTERSECT' | 'MINUS' ) select_command 
    ;

order_clause
    :   'ORDER' 'BY' sorted_def ( COMMA sorted_def )*
    ;

sorted_def
    :   ( ( sql_expression ) => sql_expression | ( NUMBER ) => NUMBER ) ( 'ASC' | 'DESC' )?
    ;

update_clause
    :   'FOR' 'UPDATE' ( 'OF' column_name ( COMMA column_name )* )? ( 'NOWAIT' )?
    ;

insert_command
    :   'INSERT' 'INTO' table_reference_list
        ( LPAREN column_specs RPAREN )?
        (   'VALUES' LPAREN plsql_expressions RPAREN
        |   select_statement
        )
        ( returning_clause )?
    ;

update_command
    :   'UPDATE' selected_table
        'SET' 
        (   update_nested_column_specs
        |   update_column_specs
        )
        (   'WHERE'
            (   keyCURRENT_OF cursor_name
            |   sql_condition
            )
        )?
        ( returning_clause )?
    ;

update_column_specs
    :   update_column_spec ( COMMA update_column_spec )*
    ;

update_column_spec
    :   column_spec EQ sql_expression
    ;

update_nested_column_specs
    :   update_nested_column_spec ( COMMA update_nested_column_spec )*
    ;

update_nested_column_spec
    :   LPAREN column_specs RPAREN EQ subquery
    ;

delete_command
    :   'DELETE' ( 'FROM' )? selected_table

        (   'WHERE'
            (   keyCURRENT_OF cursor_name
            |   sql_condition
            )
        )?
        ( returning_clause )?
    ;

returning_clause
    :   ( keyRETURN | keyRETURNING ) select_list ( keyBULK keyCOLLECT )? 'INTO' lvalues
    ;

set_transaction_command
    :   'SET' keyTRANSACTION keyREAD keyONLY
    ;

close_statement
    :   keyCLOSE cursor_name
    ;

fetch_statement
    :   'FETCH' cursor_name 'INTO' 
        (   variable_names
        |   record_name
        )
    ;

lock_table_statement
    :   'LOCK' 'TABLE' table_reference_list
        'IN' lock_mode 'MODE' ( 'NOWAIT' )?
    ;

lock_mode
    :   'ROW' 'SHARE'
    |   'ROW' 'EXCLUSIVE'
    |   'SHARE' 'UPDATE'
    |   'SHARE'
    |   'SHARE' 'ROW' 'EXCLUSIVE'
    |   'EXCLUSIVE'
    ;

open_statement
    :   keyOPEN cursor_name ( LPAREN plsql_expressions RPAREN )?
    ;

rollback_statement
    :   keyROLLBACK ( keyWORK )?
        ( 'TO' ( 'SAVEPOINT' )? savepoint_name )?
        ( 'COMMENT' quoted_string )?
    ;

savepoint_statement
    :   'SAVEPOINT' savepoint_name
    ;

savepoint_name
    :   identifier
    ;

identifier returns [StringBuffer value]
    :   ID {$value = new StringBuffer(" " + $ID.text);}
    |   DOUBLEQUOTED_STRING {$value = new StringBuffer(" " + $DOUBLEQUOTED_STRING.text);}
//  |   keyword
    ;

quoted_string returns [StringBuffer value]
    :   QUOTED_STRING {$value = new StringBuffer(" " + $QUOTED_STRING.text);}
    ;

match_string
    :   QUOTED_STRING
    ;
keyA                             : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "A")}? ID;
keyAUTOMATIC                     : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "AUTOMATIC")}? ID;
keyCOUNT                         : {((CommonTree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "COUNT")}? ID;
keyTRIM                          : {((CommonTree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "TRIM")}? ID;
keyCROSS                         : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "CROSS")}? ID;
keyCUBE                          : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "CUBE")}? ID;
keyCURRENT_OF                    : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "CURRENT_OF")}? ID;
keyDAY                           : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "DAY")}? ID;
keyDBTIMEZONE                    : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "DBTIMEZONE")}? ID;
keyDECREMENT                     : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "DECREMENT")}? ID;
keyDIMENSION                     : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "DIMENSION")}? ID;
keyEMPTY                         : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "EMPTY")}? ID;
keyEQUALS_PATH                   : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "EQUALS_PATH")}? ID;
keyESCAPE                        : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "ESCAPE")}? ID;
keyFIRST                         : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "FIRST")}? ID;
keyFULL                          : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "FULL")}? ID;
keyGROUPING                      : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "GROUPING")}? ID;
keyIGNORE                        : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "IGNORE")}? ID;
keyINCREMENT                     : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "INCREMENT")}? ID;
keyINFINITE returns [StringBuffer value]
                                 : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "INFINITE")}? ID
                                   {$value = new StringBuffer(" INFINITE");};
keyINNER                         : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "INNER")}? ID;
keyINTERVAL                      : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "INTERVAL")}? ID;
keyITERATE                       : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "ITERATE")}? ID;
keyJOIN                          : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "JOIN")}? ID;
keyKEEP                          : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "KEEP")}? ID;
keyLAST                          : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "LAST")}? ID;
keyLEFT                          : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "LEFT")}? ID;
keyLIKE2                         : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "LIKE2")}? ID;
keyLIKE4                         : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "LIKE4")}? ID;
keyLIKEC                         : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "LIKEC")}? ID;
keyLOCAL                         : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "LOCAL")}? ID;
keyMAIN                          : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "MAIN")}? ID;
keyMEASURES                      : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "MEASURES")}? ID;
keyMEMBER                        : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "MEMBER")}? ID;
keyMODEL                         : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "MODEL")}? ID;
keyMONTH                         : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "MONTH")}? ID;
keyNAN returns [StringBuffer value]
                                 : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "NAN")}? ID
                                   {$value = new StringBuffer(" NAN");};
keyNATURAL                       : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "NATURAL")}? ID;
keyNAV                           : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "NAV")}? ID;
keyNOCYCLE                       : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "NOCYCLE")}? ID;
keyNULLS                         : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "NULLS")}? ID;
keyONLY                          : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "ONLY")}? ID;
keyOUTER                         : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "OUTER")}? ID;
keyPARTITION                     : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "PARTITION")}? ID;
keyPRECISION                     : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "PRECISION")}? ID;
keyPRESENT                       : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "PRESENT")}? ID;
keyREFERENCE                     : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "REFERENCE")}? ID;
keyREGEXP_LIKE                   : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "REGEXP_LIKE")}? ID;
//keyRETURN                        : {((Tree)RPIExprEmitter.this.input.LT(1)).getText().toUpperCase().equals( "RETURN")}? ID;
keyRIGHT                         : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "RIGHT")}? ID;
keyROLLUP                        : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "ROLLUP")}? ID;
keyRULES                         : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "RULES")}? ID;
keySECOND                        : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "SECOND")}? ID;
keySECONDS                       : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "SECONDS")}? ID;
keySEQUENTIAL                    : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "SEQUENTIAL")}? ID;
keySESSIONTIMEZONE               : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "SESSIONTIMEZONE")}? ID;
keySETS                          : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "SETS")}? ID;
keySIBLINGS                      : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "SIBLINGS")}? ID;
keySINGLE                        : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "SINGLE")}? ID;
keySOME                          : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "SOME")}? ID;
keySUBMULTISET                   : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "SUBMULTISET")}? ID;
keyTIME                          : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "TIME")}? ID;
keyTIMESTAMP                     : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "TIMESTAMP")}? ID;
keyTHE returns [StringBuffer value] : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "THE")}? ID 
                                      {$value = new StringBuffer(" THE");};
keyUNDER_PATH                    : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "UNDER_PATH")}? ID;
keyUNTIL                         : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "UNTIL")}? ID;
keyUPDATED                       : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "UPDATED")}? ID;
keyUPSERT                        : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "UPSERT")}? ID;
keyWAIT                          : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "WAIT")}? ID;
keyYEAR                          : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "YEAR")}? ID;
keyZONE                          : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "ZONE")}? ID;

keyARRAY                         : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "ARRAY")}? ID;
keyAUTONOMOUS_TRANSACTION        : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "AUTONOMOUS_TRANSACTION")}? ID;
keyBODY                          : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "BODY")}? ID;
keyBUILTIN                       : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "BUILTIN")}? ID;
keyBULK                          : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "BULK")}? ID;
keyBYTE                          : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "BYTE")}? ID;
keyCLOSE                         : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "CLOSE")}? ID;
keyCOLLECT                       : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "COLLECT")}? ID;
keyCURSOR                        : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "CURSOR")}? ID;
keyELSIF                         : 'ELSIF'; //{((Tree)RPIExprEmitter.this.input.LT(1)).getText().toUpperCase().equals( "ELSIF")}? ID;
keyEXCEPTION_INIT                : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "EXCEPTION_INIT")}? ID;
keyEXIT                          : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "EXIT")}? ID;
keyFIPSFLAG                      : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "FIPSFLAG")}? ID;
keyFUNCTION                      : 'FUNCTION'; //{((Tree)RPIExprEmitter.this.input.LT(1)).getText().toUpperCase().equals( "FUNCTION")}? ID;
keyINTERFACE                     : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "INTERFACE")}? ID;
keyLOOP                          : 'LOOP'; //{((Tree)RPIExprEmitter.this.input.LT(1)).getText().toUpperCase().equals( "LOOP")}? ID;
keyNEW                           : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "NEW")}? ID;
keyNEW_NAMES                     : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "NEW_NAMES")}? ID;
keyOPEN                          : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "OPEN")}? ID;
keyOUT                           : 'OUT'; //{((Tree)RPIExprEmitter.this.input.LT(1)).getText().toUpperCase().equals( "OUT")}? ID;
keyPACKAGE                       : 'PACKAGE'; //{((Tree)RPIExprEmitter.this.input.LT(1)).getText().toUpperCase().equals( "PACKAGE")}? ID;
keyPRAGMA                        : 'PRAGMA'; //{((Tree)RPIExprEmitter.this.input.LT(1)).getText().toUpperCase().equals( "PRAGMA")}? ID;
keyRAISE                         : 'RAISE'; //{((Tree)RPIExprEmitter.this.input.LT(1)).getText().toUpperCase().equals( "RAISE")}? ID;
keyRANGE                         : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "RANGE")}? ID;
keyREAD                          : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "READ")}? ID;
keyRECORD                        : 'RECORD'; //{((Tree)RPIExprEmitter.this.input.LT(1)).getText().toUpperCase().equals( "RECORD")}? ID;
keyREF                           : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "REF")}? ID;
keyREPLACE                       : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "REPLACE")}? ID;
keyRESTRICT_REFERENCES           : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "RESTRICT_REFERENCES")}? ID;
keyRETURN                        : 'RETURN'; //{((Tree)RPIExprEmitter.this.input.LT(1)).getText().toUpperCase().equals( "RETURN")}? ID;
keyRETURNING                     : 'RETURNING'; //{((Tree)RPIExprEmitter.this.input.LT(1)).getText().toUpperCase().equals( "RETURNING")}? ID;
keyREVERSE                       : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "REVERSE")}? ID;
keyROLLBACK                      : 'ROLLBACK'; //{((Tree)RPIExprEmitter.this.input.LT(1)).getText().toUpperCase().equals( "ROLLBACK")}? ID;
keySERIALLY_REUSABLE             : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "SERIALLY_REUSABLE")}? ID;
keySUBTYPE                       : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "SUBTYPE")}? ID;
keyTRANSACTION                   : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "TRANSACTION")}? ID;
keyTYPE                          : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "TYPE")}? ID;
keyUSING                         : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "USING")}? ID;
keyVARRAY                        : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "VARRAY")}? ID;
keyVARYING                      : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "VARYING")}? ID;
keyWHILE                         : 'WHILE'; //{((Tree)RPIExprEmitter.this.input.LT(1)).getText().toUpperCase().equals( "WHILE")}? ID;
keyWORK                          : {((Tree)RPIExprWalker.this.input.LT(1)).getText().toUpperCase().equals( "WORK")}? ID;

sql_identifier returns [StringBuffer value]
    :   identifier {$value=new StringBuffer(" " + $identifier.value.toString().trim());}
    |   'ROWID' {$value=new StringBuffer(" ROWID");}
//  |   'ROWNUM'
    ;    
    
    
    
