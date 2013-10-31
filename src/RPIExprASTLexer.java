// $ANTLR 3.1.2 RPIExprAST.g 2011-03-09 16:14:07

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class RPIExprASTLexer extends Lexer {
    public static final int BULK_ROWCOUNT_ATTR=80;
    public static final int T__159=159;
    public static final int T__158=158;
    public static final int NONZEROAVG=41;
    public static final int T__160=160;
    public static final int NOT=60;
    public static final int ACCRUEFROM=46;
    public static final int T__167=167;
    public static final int T__168=168;
    public static final int EOF=-1;
    public static final int T__165=165;
    public static final int T__166=166;
    public static final int T__163=163;
    public static final int T__164=164;
    public static final int T__161=161;
    public static final int T__162=162;
    public static final int RPAREN=23;
    public static final int T__148=148;
    public static final int T__147=147;
    public static final int T__149=149;
    public static final int CREATEGROUP=87;
    public static final int BOOLOP_EQ=61;
    public static final int EQ=24;
    public static final int SETUSERINPUTUICLASS=91;
    public static final int T__154=154;
    public static final int SETPOSTPROCESSCLASS=89;
    public static final int T__155=155;
    public static final int T__156=156;
    public static final int T__157=157;
    public static final int T__150=150;
    public static final int T__151=151;
    public static final int T__152=152;
    public static final int T__153=153;
    public static final int T__139=139;
    public static final int RBRACK=57;
    public static final int T__138=138;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int BOOLOP_GE=64;
    public static final int N=105;
    public static final int NUMBER=32;
    public static final int AT_SIGN=83;
    public static final int SEMICOLON=25;
    public static final int AGGRULE=54;
    public static final int T__141=141;
    public static final int T__142=142;
    public static final int T__140=140;
    public static final int T__145=145;
    public static final int PERCENTAGE=103;
    public static final int T__146=146;
    public static final int T__143=143;
    public static final int T__144=144;
    public static final int ABS=37;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int SQL_ASSIGN=67;
    public static final int T__127=127;
    public static final int ACCRUE=44;
    public static final int WS=99;
    public static final int T__129=129;
    public static final int SETMODELPROCCLASS=93;
    public static final int DBLQUOTE=20;
    public static final int SL_COMMENT=101;
    public static final int TRIM=18;
    public static final int BOOLOP_GT=63;
    public static final int GETBASEPERIOD=56;
    public static final int T__130=130;
    public static final int DBCONNECT=17;
    public static final int T__131=131;
    public static final int T__132=132;
    public static final int T__133=133;
    public static final int T__134=134;
    public static final int ROWTYPE_ATTR=75;
    public static final int T__135=135;
    public static final int T__215=215;
    public static final int T__216=216;
    public static final int T__213=213;
    public static final int T__214=214;
    public static final int LBRACK=34;
    public static final int T__219=219;
    public static final int PRODUCTSELECTOR=95;
    public static final int T__217=217;
    public static final int T__218=218;
    public static final int POINT=102;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int SERIESAVERAGE=47;
    public static final int T__123=123;
    public static final int LLABEL=69;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int T__223=223;
    public static final int T__222=222;
    public static final int CREATEPREDICATE=11;
    public static final int LPAREN=22;
    public static final int ASTERISK=30;
    public static final int TYPE_ATTR=74;
    public static final int T__221=221;
    public static final int T__220=220;
    public static final int RLABEL=70;
    public static final int T__202=202;
    public static final int T__203=203;
    public static final int T__204=204;
    public static final int T__205=205;
    public static final int T__206=206;
    public static final int T__207=207;
    public static final int T__208=208;
    public static final int T__209=209;
    public static final int T__108=108;
    public static final int SUBSTR=15;
    public static final int T__109=109;
    public static final int AVG=42;
    public static final int LEASTOF=36;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int SETSCENARIOUICLASS=90;
    public static final int T__112=112;
    public static final int QUOTEDSTRINGLIST=12;
    public static final int PLUS=28;
    public static final int T__210=210;
    public static final int CREATE_MODEL=19;
    public static final int T__212=212;
    public static final int NONZEROCOUNT=40;
    public static final int NOTFOUND_ATTR=77;
    public static final int T__211=211;
    public static final int FORECASTABLETYPE=96;
    public static final int MINUS=29;
    public static final int AGG=53;
    public static final int GETCURRPERIOD=55;
    public static final int PRINT=10;
    public static final int NOT_EQ=84;
    public static final int VERTBAR=104;
    public static final int COLON=72;
    public static final int BOOLOP_LT=62;
    public static final int DIM=9;
    public static final int IFTHEN=38;
    public static final int ARROW=85;
    public static final int BOOLOP_LE=65;
    public static final int DIV=31;
    public static final int SQLSL_COMMENT=107;
    public static final int IFZERO=43;
    public static final int SETPRODUCTUICLASS=92;
    public static final int EXPONENT=82;
    public static final int DOUBLEDOT=68;
    public static final int FOUND_ATTR=76;
    public static final int XFCNARG=52;
    public static final int QUOTE=106;
    public static final int SQL=27;
    public static final int COMPMODIFIER=33;
    public static final int QTR=39;
    public static final int SETREPORTUICLASS=94;
    public static final int ROWCOUNT_ATTR=79;
    public static final int DOUBLEVERTBAR=81;
    public static final int T__200=200;
    public static final int T__201=201;
    public static final int OR=59;
    public static final int VARLIST=7;
    public static final int ADDPRODUCTSELECTOR=88;
    public static final int AVGBASIS=48;
    public static final int XFCN=51;
    public static final int ID=21;
    public static final int AND=58;
    public static final int ACCRUEFROMBASE=45;
    public static final int DATEFORMAT=50;
    public static final int ML_COMMENT=100;
    public static final int T__199=199;
    public static final int T__198=198;
    public static final int T__197=197;
    public static final int T__196=196;
    public static final int T__195=195;
    public static final int T__194=194;
    public static final int T__193=193;
    public static final int T__192=192;
    public static final int COMMA=26;
    public static final int T__191=191;
    public static final int T__190=190;
    public static final int QUOTED_STRING=71;
    public static final int DOT=66;
    public static final int ISOPEN_ATTR=78;
    public static final int T__184=184;
    public static final int T__183=183;
    public static final int T__186=186;
    public static final int SETBASEPERIOD=13;
    public static final int T__185=185;
    public static final int T__188=188;
    public static final int T__187=187;
    public static final int T__189=189;
    public static final int DOUBLEQUOTED_STRING=86;
    public static final int EXPRLIST=4;
    public static final int T__180=180;
    public static final int BOOLOP=5;
    public static final int T__182=182;
    public static final int T__181=181;
    public static final int SETLEVEL=14;
    public static final int REF=6;
    public static final int T__175=175;
    public static final int T__174=174;
    public static final int T__173=173;
    public static final int T__172=172;
    public static final int TO_CHAR=16;
    public static final int T__179=179;
    public static final int T__178=178;
    public static final int T__177=177;
    public static final int NEWLINE=98;
    public static final int T__176=176;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int ASSIGN=8;
    public static final int MAXOF=35;
    public static final int DATE=49;
    public static final int T__169=169;
    public static final int CHARSET_ATTR=73;
    public static final int PERIODICITY=97;

    // delegates
    // delegators

    public RPIExprASTLexer() {;} 
    public RPIExprASTLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public RPIExprASTLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "RPIExprAST.g"; }

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:3:8: ( '{' )
            // RPIExprAST.g:3:10: '{'
            {
            match('{'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:4:8: ( '}' )
            // RPIExprAST.g:4:10: '}'
            {
            match('}'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:5:8: ( 'CREATE' )
            // RPIExprAST.g:5:10: 'CREATE'
            {
            match("CREATE"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:6:8: ( 'IS' )
            // RPIExprAST.g:6:10: 'IS'
            {
            match("IS"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:7:8: ( 'AS' )
            // RPIExprAST.g:7:10: 'AS'
            {
            match("AS"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:8:8: ( 'END' )
            // RPIExprAST.g:8:10: 'END'
            {
            match("END"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:9:8: ( 'BEGIN' )
            // RPIExprAST.g:9:10: 'BEGIN'
            {
            match("BEGIN"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:10:8: ( 'CONSTANT' )
            // RPIExprAST.g:10:10: 'CONSTANT'
            {
            match("CONSTANT"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:11:8: ( 'NULL' )
            // RPIExprAST.g:11:10: 'NULL'
            {
            match("NULL"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:12:8: ( 'DEFAULT' )
            // RPIExprAST.g:12:10: 'DEFAULT'
            {
            match("DEFAULT"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:13:8: ( 'DECLARE' )
            // RPIExprAST.g:13:10: 'DECLARE'
            {
            match("DECLARE"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:14:8: ( 'EXCEPTION' )
            // RPIExprAST.g:14:10: 'EXCEPTION'
            {
            match("EXCEPTION"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:15:8: ( 'GOTO' )
            // RPIExprAST.g:15:10: 'GOTO'
            {
            match("GOTO"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:16:8: ( 'WHEN' )
            // RPIExprAST.g:16:10: 'WHEN'
            {
            match("WHEN"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:17:8: ( 'BINARY_INTEGER' )
            // RPIExprAST.g:17:10: 'BINARY_INTEGER'
            {
            match("BINARY_INTEGER"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:18:8: ( 'BINARY_FLOAT' )
            // RPIExprAST.g:18:10: 'BINARY_FLOAT'
            {
            match("BINARY_FLOAT"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__123"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:19:8: ( 'BINARY_DOUBLE' )
            // RPIExprAST.g:19:10: 'BINARY_DOUBLE'
            {
            match("BINARY_DOUBLE"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:20:8: ( 'NATURAL' )
            // RPIExprAST.g:20:10: 'NATURAL'
            {
            match("NATURAL"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "T__126"
    public final void mT__126() throws RecognitionException {
        try {
            int _type = T__126;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:21:8: ( 'POSITIVE' )
            // RPIExprAST.g:21:10: 'POSITIVE'
            {
            match("POSITIVE"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__126"

    // $ANTLR start "T__127"
    public final void mT__127() throws RecognitionException {
        try {
            int _type = T__127;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:22:8: ( 'NUMBER' )
            // RPIExprAST.g:22:10: 'NUMBER'
            {
            match("NUMBER"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__127"

    // $ANTLR start "T__128"
    public final void mT__128() throws RecognitionException {
        try {
            int _type = T__128;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:23:8: ( 'NUMERIC' )
            // RPIExprAST.g:23:10: 'NUMERIC'
            {
            match("NUMERIC"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__128"

    // $ANTLR start "T__129"
    public final void mT__129() throws RecognitionException {
        try {
            int _type = T__129;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:24:8: ( 'DECIMAL' )
            // RPIExprAST.g:24:10: 'DECIMAL'
            {
            match("DECIMAL"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__129"

    // $ANTLR start "T__130"
    public final void mT__130() throws RecognitionException {
        try {
            int _type = T__130;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:25:8: ( 'DEC' )
            // RPIExprAST.g:25:10: 'DEC'
            {
            match("DEC"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__130"

    // $ANTLR start "T__131"
    public final void mT__131() throws RecognitionException {
        try {
            int _type = T__131;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:26:8: ( 'LONG' )
            // RPIExprAST.g:26:10: 'LONG'
            {
            match("LONG"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__131"

    // $ANTLR start "T__132"
    public final void mT__132() throws RecognitionException {
        try {
            int _type = T__132;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:27:8: ( 'RAW' )
            // RPIExprAST.g:27:10: 'RAW'
            {
            match("RAW"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__132"

    // $ANTLR start "T__133"
    public final void mT__133() throws RecognitionException {
        try {
            int _type = T__133;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:28:8: ( 'BOOLEAN' )
            // RPIExprAST.g:28:10: 'BOOLEAN'
            {
            match("BOOLEAN"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__133"

    // $ANTLR start "T__134"
    public final void mT__134() throws RecognitionException {
        try {
            int _type = T__134;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:29:8: ( 'DATE' )
            // RPIExprAST.g:29:10: 'DATE'
            {
            match("DATE"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__134"

    // $ANTLR start "T__135"
    public final void mT__135() throws RecognitionException {
        try {
            int _type = T__135;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:30:8: ( 'TO' )
            // RPIExprAST.g:30:10: 'TO'
            {
            match("TO"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__135"

    // $ANTLR start "T__136"
    public final void mT__136() throws RecognitionException {
        try {
            int _type = T__136;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:31:8: ( 'WITH' )
            // RPIExprAST.g:31:10: 'WITH'
            {
            match("WITH"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__136"

    // $ANTLR start "T__137"
    public final void mT__137() throws RecognitionException {
        try {
            int _type = T__137;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:32:8: ( 'INTEGER' )
            // RPIExprAST.g:32:10: 'INTEGER'
            {
            match("INTEGER"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__137"

    // $ANTLR start "T__138"
    public final void mT__138() throws RecognitionException {
        try {
            int _type = T__138;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:33:8: ( 'INT' )
            // RPIExprAST.g:33:10: 'INT'
            {
            match("INT"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__138"

    // $ANTLR start "T__139"
    public final void mT__139() throws RecognitionException {
        try {
            int _type = T__139;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:34:8: ( 'SMALLINT' )
            // RPIExprAST.g:34:10: 'SMALLINT'
            {
            match("SMALLINT"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__139"

    // $ANTLR start "T__140"
    public final void mT__140() throws RecognitionException {
        try {
            int _type = T__140;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:35:8: ( 'FLOAT' )
            // RPIExprAST.g:35:10: 'FLOAT'
            {
            match("FLOAT"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__140"

    // $ANTLR start "T__141"
    public final void mT__141() throws RecognitionException {
        try {
            int _type = T__141;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:36:8: ( 'REAL' )
            // RPIExprAST.g:36:10: 'REAL'
            {
            match("REAL"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__141"

    // $ANTLR start "T__142"
    public final void mT__142() throws RecognitionException {
        try {
            int _type = T__142;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:37:8: ( 'DOUBLE' )
            // RPIExprAST.g:37:10: 'DOUBLE'
            {
            match("DOUBLE"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__142"

    // $ANTLR start "T__143"
    public final void mT__143() throws RecognitionException {
        try {
            int _type = T__143;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:38:8: ( 'CHAR' )
            // RPIExprAST.g:38:10: 'CHAR'
            {
            match("CHAR"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__143"

    // $ANTLR start "T__144"
    public final void mT__144() throws RecognitionException {
        try {
            int _type = T__144;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:39:8: ( 'CHARACTER' )
            // RPIExprAST.g:39:10: 'CHARACTER'
            {
            match("CHARACTER"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__144"

    // $ANTLR start "T__145"
    public final void mT__145() throws RecognitionException {
        try {
            int _type = T__145;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:40:8: ( 'SET' )
            // RPIExprAST.g:40:10: 'SET'
            {
            match("SET"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__145"

    // $ANTLR start "T__146"
    public final void mT__146() throws RecognitionException {
        try {
            int _type = T__146;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:41:8: ( 'VARCHAR' )
            // RPIExprAST.g:41:10: 'VARCHAR'
            {
            match("VARCHAR"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__146"

    // $ANTLR start "T__147"
    public final void mT__147() throws RecognitionException {
        try {
            int _type = T__147;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:42:8: ( 'VARCHAR2' )
            // RPIExprAST.g:42:10: 'VARCHAR2'
            {
            match("VARCHAR2"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__147"

    // $ANTLR start "T__148"
    public final void mT__148() throws RecognitionException {
        try {
            int _type = T__148;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:43:8: ( 'NCHAR' )
            // RPIExprAST.g:43:10: 'NCHAR'
            {
            match("NCHAR"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__148"

    // $ANTLR start "T__149"
    public final void mT__149() throws RecognitionException {
        try {
            int _type = T__149;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:44:8: ( 'NVARCHAR' )
            // RPIExprAST.g:44:10: 'NVARCHAR'
            {
            match("NVARCHAR"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__149"

    // $ANTLR start "T__150"
    public final void mT__150() throws RecognitionException {
        try {
            int _type = T__150;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:45:8: ( 'NVARCHAR2' )
            // RPIExprAST.g:45:10: 'NVARCHAR2'
            {
            match("NVARCHAR2"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__150"

    // $ANTLR start "T__151"
    public final void mT__151() throws RecognitionException {
        try {
            int _type = T__151;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:46:8: ( 'NATIONAL' )
            // RPIExprAST.g:46:10: 'NATIONAL'
            {
            match("NATIONAL"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__151"

    // $ANTLR start "T__152"
    public final void mT__152() throws RecognitionException {
        try {
            int _type = T__152;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:47:8: ( 'MLSLABEL' )
            // RPIExprAST.g:47:10: 'MLSLABEL'
            {
            match("MLSLABEL"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__152"

    // $ANTLR start "T__153"
    public final void mT__153() throws RecognitionException {
        try {
            int _type = T__153;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:48:8: ( 'PLS_INTEGER' )
            // RPIExprAST.g:48:10: 'PLS_INTEGER'
            {
            match("PLS_INTEGER"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__153"

    // $ANTLR start "T__154"
    public final void mT__154() throws RecognitionException {
        try {
            int _type = T__154;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:49:8: ( 'BLOB' )
            // RPIExprAST.g:49:10: 'BLOB'
            {
            match("BLOB"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__154"

    // $ANTLR start "T__155"
    public final void mT__155() throws RecognitionException {
        try {
            int _type = T__155;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:50:8: ( 'CLOB' )
            // RPIExprAST.g:50:10: 'CLOB'
            {
            match("CLOB"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__155"

    // $ANTLR start "T__156"
    public final void mT__156() throws RecognitionException {
        try {
            int _type = T__156;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:51:8: ( 'NCLOB' )
            // RPIExprAST.g:51:10: 'NCLOB'
            {
            match("NCLOB"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__156"

    // $ANTLR start "T__157"
    public final void mT__157() throws RecognitionException {
        try {
            int _type = T__157;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:52:8: ( 'BFILE' )
            // RPIExprAST.g:52:10: 'BFILE'
            {
            match("BFILE"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__157"

    // $ANTLR start "T__158"
    public final void mT__158() throws RecognitionException {
        try {
            int _type = T__158;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:53:8: ( 'ROWID' )
            // RPIExprAST.g:53:10: 'ROWID'
            {
            match("ROWID"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__158"

    // $ANTLR start "T__159"
    public final void mT__159() throws RecognitionException {
        try {
            int _type = T__159;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:54:8: ( 'UROWID' )
            // RPIExprAST.g:54:10: 'UROWID'
            {
            match("UROWID"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__159"

    // $ANTLR start "T__160"
    public final void mT__160() throws RecognitionException {
        try {
            int _type = T__160;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:55:8: ( 'IN' )
            // RPIExprAST.g:55:10: 'IN'
            {
            match("IN"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__160"

    // $ANTLR start "T__161"
    public final void mT__161() throws RecognitionException {
        try {
            int _type = T__161;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:56:8: ( 'PROCEDURE' )
            // RPIExprAST.g:56:10: 'PROCEDURE'
            {
            match("PROCEDURE"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__161"

    // $ANTLR start "T__162"
    public final void mT__162() throws RecognitionException {
        try {
            int _type = T__162;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:57:8: ( 'FUNCTION' )
            // RPIExprAST.g:57:10: 'FUNCTION'
            {
            match("FUNCTION"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__162"

    // $ANTLR start "T__163"
    public final void mT__163() throws RecognitionException {
        try {
            int _type = T__163;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:58:8: ( 'TABLE' )
            // RPIExprAST.g:58:10: 'TABLE'
            {
            match("TABLE"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__163"

    // $ANTLR start "T__164"
    public final void mT__164() throws RecognitionException {
        try {
            int _type = T__164;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:59:8: ( 'OF' )
            // RPIExprAST.g:59:10: 'OF'
            {
            match("OF"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__164"

    // $ANTLR start "T__165"
    public final void mT__165() throws RecognitionException {
        try {
            int _type = T__165;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:60:8: ( 'INDEX' )
            // RPIExprAST.g:60:10: 'INDEX'
            {
            match("INDEX"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__165"

    // $ANTLR start "T__166"
    public final void mT__166() throws RecognitionException {
        try {
            int _type = T__166;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:61:8: ( 'BY' )
            // RPIExprAST.g:61:10: 'BY'
            {
            match("BY"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__166"

    // $ANTLR start "T__167"
    public final void mT__167() throws RecognitionException {
        try {
            int _type = T__167;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:62:8: ( 'THEN' )
            // RPIExprAST.g:62:10: 'THEN'
            {
            match("THEN"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__167"

    // $ANTLR start "T__168"
    public final void mT__168() throws RecognitionException {
        try {
            int _type = T__168;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:63:8: ( 'TRUE' )
            // RPIExprAST.g:63:10: 'TRUE'
            {
            match("TRUE"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__168"

    // $ANTLR start "T__169"
    public final void mT__169() throws RecognitionException {
        try {
            int _type = T__169;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:64:8: ( 'FALSE' )
            // RPIExprAST.g:64:10: 'FALSE'
            {
            match("FALSE"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__169"

    // $ANTLR start "T__170"
    public final void mT__170() throws RecognitionException {
        try {
            int _type = T__170;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:65:8: ( 'FOR' )
            // RPIExprAST.g:65:10: 'FOR'
            {
            match("FOR"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__170"

    // $ANTLR start "T__171"
    public final void mT__171() throws RecognitionException {
        try {
            int _type = T__171;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:66:8: ( 'COMMIT' )
            // RPIExprAST.g:66:10: 'COMMIT'
            {
            match("COMMIT"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__171"

    // $ANTLR start "T__172"
    public final void mT__172() throws RecognitionException {
        try {
            int _type = T__172;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:67:8: ( 'IF' )
            // RPIExprAST.g:67:10: 'IF'
            {
            match("IF"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__172"

    // $ANTLR start "T__173"
    public final void mT__173() throws RecognitionException {
        try {
            int _type = T__173;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:68:8: ( 'ELSE' )
            // RPIExprAST.g:68:10: 'ELSE'
            {
            match("ELSE"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__173"

    // $ANTLR start "T__174"
    public final void mT__174() throws RecognitionException {
        try {
            int _type = T__174;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:69:8: ( 'SELECT' )
            // RPIExprAST.g:69:10: 'SELECT'
            {
            match("SELECT"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__174"

    // $ANTLR start "T__175"
    public final void mT__175() throws RecognitionException {
        try {
            int _type = T__175;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:70:8: ( 'DISTINCT' )
            // RPIExprAST.g:70:10: 'DISTINCT'
            {
            match("DISTINCT"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__175"

    // $ANTLR start "T__176"
    public final void mT__176() throws RecognitionException {
        try {
            int _type = T__176;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:71:8: ( 'UNIQUE' )
            // RPIExprAST.g:71:10: 'UNIQUE'
            {
            match("UNIQUE"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__176"

    // $ANTLR start "T__177"
    public final void mT__177() throws RecognitionException {
        try {
            int _type = T__177;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:72:8: ( 'ALL' )
            // RPIExprAST.g:72:10: 'ALL'
            {
            match("ALL"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__177"

    // $ANTLR start "T__178"
    public final void mT__178() throws RecognitionException {
        try {
            int _type = T__178;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:73:8: ( 'INTO' )
            // RPIExprAST.g:73:10: 'INTO'
            {
            match("INTO"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__178"

    // $ANTLR start "T__179"
    public final void mT__179() throws RecognitionException {
        try {
            int _type = T__179;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:74:8: ( 'FROM' )
            // RPIExprAST.g:74:10: 'FROM'
            {
            match("FROM"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__179"

    // $ANTLR start "T__180"
    public final void mT__180() throws RecognitionException {
        try {
            int _type = T__180;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:75:8: ( 'HAVING' )
            // RPIExprAST.g:75:10: 'HAVING'
            {
            match("HAVING"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__180"

    // $ANTLR start "T__181"
    public final void mT__181() throws RecognitionException {
        try {
            int _type = T__181;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:76:8: ( 'UNION' )
            // RPIExprAST.g:76:10: 'UNION'
            {
            match("UNION"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__181"

    // $ANTLR start "T__182"
    public final void mT__182() throws RecognitionException {
        try {
            int _type = T__182;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:77:8: ( 'INTERSECT' )
            // RPIExprAST.g:77:10: 'INTERSECT'
            {
            match("INTERSECT"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__182"

    // $ANTLR start "T__183"
    public final void mT__183() throws RecognitionException {
        try {
            int _type = T__183;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:78:8: ( 'MINUS' )
            // RPIExprAST.g:78:10: 'MINUS'
            {
            match("MINUS"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__183"

    // $ANTLR start "T__184"
    public final void mT__184() throws RecognitionException {
        try {
            int _type = T__184;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:79:8: ( 'ON' )
            // RPIExprAST.g:79:10: 'ON'
            {
            match("ON"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__184"

    // $ANTLR start "T__185"
    public final void mT__185() throws RecognitionException {
        try {
            int _type = T__185;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:80:8: ( 'WHERE' )
            // RPIExprAST.g:80:10: 'WHERE'
            {
            match("WHERE"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__185"

    // $ANTLR start "T__186"
    public final void mT__186() throws RecognitionException {
        try {
            int _type = T__186;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:81:8: ( 'START' )
            // RPIExprAST.g:81:10: 'START'
            {
            match("START"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__186"

    // $ANTLR start "T__187"
    public final void mT__187() throws RecognitionException {
        try {
            int _type = T__187;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:82:8: ( 'CONNECT' )
            // RPIExprAST.g:82:10: 'CONNECT'
            {
            match("CONNECT"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__187"

    // $ANTLR start "T__188"
    public final void mT__188() throws RecognitionException {
        try {
            int _type = T__188;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:83:8: ( 'GROUP' )
            // RPIExprAST.g:83:10: 'GROUP'
            {
            match("GROUP"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__188"

    // $ANTLR start "T__189"
    public final void mT__189() throws RecognitionException {
        try {
            int _type = T__189;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:84:8: ( 'ROWS' )
            // RPIExprAST.g:84:10: 'ROWS'
            {
            match("ROWS"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__189"

    // $ANTLR start "T__190"
    public final void mT__190() throws RecognitionException {
        try {
            int _type = T__190;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:85:8: ( 'UPDATE' )
            // RPIExprAST.g:85:10: 'UPDATE'
            {
            match("UPDATE"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__190"

    // $ANTLR start "T__191"
    public final void mT__191() throws RecognitionException {
        try {
            int _type = T__191;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:86:8: ( 'ORDER' )
            // RPIExprAST.g:86:10: 'ORDER'
            {
            match("ORDER"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__191"

    // $ANTLR start "T__192"
    public final void mT__192() throws RecognitionException {
        try {
            int _type = T__192;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:87:8: ( 'LIKE' )
            // RPIExprAST.g:87:10: 'LIKE'
            {
            match("LIKE"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__192"

    // $ANTLR start "T__193"
    public final void mT__193() throws RecognitionException {
        try {
            int _type = T__193;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:88:8: ( 'ASC' )
            // RPIExprAST.g:88:10: 'ASC'
            {
            match("ASC"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__193"

    // $ANTLR start "T__194"
    public final void mT__194() throws RecognitionException {
        try {
            int _type = T__194;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:89:8: ( 'DESC' )
            // RPIExprAST.g:89:10: 'DESC'
            {
            match("DESC"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__194"

    // $ANTLR start "T__195"
    public final void mT__195() throws RecognitionException {
        try {
            int _type = T__195;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:90:8: ( 'NOWAIT' )
            // RPIExprAST.g:90:10: 'NOWAIT'
            {
            match("NOWAIT"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__195"

    // $ANTLR start "T__196"
    public final void mT__196() throws RecognitionException {
        try {
            int _type = T__196;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:91:8: ( 'BETWEEN' )
            // RPIExprAST.g:91:10: 'BETWEEN'
            {
            match("BETWEEN"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__196"

    // $ANTLR start "T__197"
    public final void mT__197() throws RecognitionException {
        try {
            int _type = T__197;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:92:8: ( 'PRIOR' )
            // RPIExprAST.g:92:10: 'PRIOR'
            {
            match("PRIOR"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__197"

    // $ANTLR start "T__198"
    public final void mT__198() throws RecognitionException {
        try {
            int _type = T__198;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:93:8: ( 'CASE' )
            // RPIExprAST.g:93:10: 'CASE'
            {
            match("CASE"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__198"

    // $ANTLR start "T__199"
    public final void mT__199() throws RecognitionException {
        try {
            int _type = T__199;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:94:8: ( 'AT' )
            // RPIExprAST.g:94:10: 'AT'
            {
            match("AT"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__199"

    // $ANTLR start "T__200"
    public final void mT__200() throws RecognitionException {
        try {
            int _type = T__200;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:95:8: ( 'EXISTS' )
            // RPIExprAST.g:95:10: 'EXISTS'
            {
            match("EXISTS"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__200"

    // $ANTLR start "T__201"
    public final void mT__201() throws RecognitionException {
        try {
            int _type = T__201;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:96:8: ( 'DELETE' )
            // RPIExprAST.g:96:10: 'DELETE'
            {
            match("DELETE"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__201"

    // $ANTLR start "T__202"
    public final void mT__202() throws RecognitionException {
        try {
            int _type = T__202;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:97:8: ( 'ANY' )
            // RPIExprAST.g:97:10: 'ANY'
            {
            match("ANY"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__202"

    // $ANTLR start "T__203"
    public final void mT__203() throws RecognitionException {
        try {
            int _type = T__203;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:98:8: ( 'INSERT' )
            // RPIExprAST.g:98:10: 'INSERT'
            {
            match("INSERT"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__203"

    // $ANTLR start "T__204"
    public final void mT__204() throws RecognitionException {
        try {
            int _type = T__204;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:99:8: ( 'VALUES' )
            // RPIExprAST.g:99:10: 'VALUES'
            {
            match("VALUES"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__204"

    // $ANTLR start "T__205"
    public final void mT__205() throws RecognitionException {
        try {
            int _type = T__205;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:100:8: ( 'FETCH' )
            // RPIExprAST.g:100:10: 'FETCH'
            {
            match("FETCH"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__205"

    // $ANTLR start "T__206"
    public final void mT__206() throws RecognitionException {
        try {
            int _type = T__206;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:101:8: ( 'LOCK' )
            // RPIExprAST.g:101:10: 'LOCK'
            {
            match("LOCK"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__206"

    // $ANTLR start "T__207"
    public final void mT__207() throws RecognitionException {
        try {
            int _type = T__207;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:102:8: ( 'MODE' )
            // RPIExprAST.g:102:10: 'MODE'
            {
            match("MODE"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__207"

    // $ANTLR start "T__208"
    public final void mT__208() throws RecognitionException {
        try {
            int _type = T__208;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:103:8: ( 'ROW' )
            // RPIExprAST.g:103:10: 'ROW'
            {
            match("ROW"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__208"

    // $ANTLR start "T__209"
    public final void mT__209() throws RecognitionException {
        try {
            int _type = T__209;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:104:8: ( 'SHARE' )
            // RPIExprAST.g:104:10: 'SHARE'
            {
            match("SHARE"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__209"

    // $ANTLR start "T__210"
    public final void mT__210() throws RecognitionException {
        try {
            int _type = T__210;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:105:8: ( 'EXCLUSIVE' )
            // RPIExprAST.g:105:10: 'EXCLUSIVE'
            {
            match("EXCLUSIVE"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__210"

    // $ANTLR start "T__211"
    public final void mT__211() throws RecognitionException {
        try {
            int _type = T__211;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:106:8: ( 'SAVEPOINT' )
            // RPIExprAST.g:106:10: 'SAVEPOINT'
            {
            match("SAVEPOINT"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__211"

    // $ANTLR start "T__212"
    public final void mT__212() throws RecognitionException {
        try {
            int _type = T__212;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:107:8: ( 'COMMENT' )
            // RPIExprAST.g:107:10: 'COMMENT'
            {
            match("COMMENT"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__212"

    // $ANTLR start "T__213"
    public final void mT__213() throws RecognitionException {
        try {
            int _type = T__213;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:108:8: ( 'ELSIF' )
            // RPIExprAST.g:108:10: 'ELSIF'
            {
            match("ELSIF"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__213"

    // $ANTLR start "T__214"
    public final void mT__214() throws RecognitionException {
        try {
            int _type = T__214;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:109:8: ( 'LOOP' )
            // RPIExprAST.g:109:10: 'LOOP'
            {
            match("LOOP"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__214"

    // $ANTLR start "T__215"
    public final void mT__215() throws RecognitionException {
        try {
            int _type = T__215;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:110:8: ( 'OUT' )
            // RPIExprAST.g:110:10: 'OUT'
            {
            match("OUT"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__215"

    // $ANTLR start "T__216"
    public final void mT__216() throws RecognitionException {
        try {
            int _type = T__216;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:111:8: ( 'PACKAGE' )
            // RPIExprAST.g:111:10: 'PACKAGE'
            {
            match("PACKAGE"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__216"

    // $ANTLR start "T__217"
    public final void mT__217() throws RecognitionException {
        try {
            int _type = T__217;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:112:8: ( 'PRAGMA' )
            // RPIExprAST.g:112:10: 'PRAGMA'
            {
            match("PRAGMA"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__217"

    // $ANTLR start "T__218"
    public final void mT__218() throws RecognitionException {
        try {
            int _type = T__218;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:113:8: ( 'RAISE' )
            // RPIExprAST.g:113:10: 'RAISE'
            {
            match("RAISE"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__218"

    // $ANTLR start "T__219"
    public final void mT__219() throws RecognitionException {
        try {
            int _type = T__219;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:114:8: ( 'RECORD' )
            // RPIExprAST.g:114:10: 'RECORD'
            {
            match("RECORD"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__219"

    // $ANTLR start "T__220"
    public final void mT__220() throws RecognitionException {
        try {
            int _type = T__220;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:115:8: ( 'RETURN' )
            // RPIExprAST.g:115:10: 'RETURN'
            {
            match("RETURN"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__220"

    // $ANTLR start "T__221"
    public final void mT__221() throws RecognitionException {
        try {
            int _type = T__221;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:116:8: ( 'RETURNING' )
            // RPIExprAST.g:116:10: 'RETURNING'
            {
            match("RETURNING"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__221"

    // $ANTLR start "T__222"
    public final void mT__222() throws RecognitionException {
        try {
            int _type = T__222;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:117:8: ( 'ROLLBACK' )
            // RPIExprAST.g:117:10: 'ROLLBACK'
            {
            match("ROLLBACK"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__222"

    // $ANTLR start "T__223"
    public final void mT__223() throws RecognitionException {
        try {
            int _type = T__223;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:118:8: ( 'WHILE' )
            // RPIExprAST.g:118:10: 'WHILE'
            {
            match("WHILE"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__223"

    // $ANTLR start "MAXOF"
    public final void mMAXOF() throws RecognitionException {
        try {
            int _type = MAXOF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1564:5: ( 'maxOf' )
            // RPIExprAST.g:1564:9: 'maxOf'
            {
            match("maxOf"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MAXOF"

    // $ANTLR start "LEASTOF"
    public final void mLEASTOF() throws RecognitionException {
        try {
            int _type = LEASTOF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1567:5: ( 'leastOf' )
            // RPIExprAST.g:1567:9: 'leastOf'
            {
            match("leastOf"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEASTOF"

    // $ANTLR start "ABS"
    public final void mABS() throws RecognitionException {
        try {
            int _type = ABS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1569:5: ( 'abs' )
            // RPIExprAST.g:1569:9: 'abs'
            {
            match("abs"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ABS"

    // $ANTLR start "IFTHEN"
    public final void mIFTHEN() throws RecognitionException {
        try {
            int _type = IFTHEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1572:5: ( 'IF_THEN' )
            // RPIExprAST.g:1572:7: 'IF_THEN'
            {
            match("IF_THEN"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IFTHEN"

    // $ANTLR start "GETCURRPERIOD"
    public final void mGETCURRPERIOD() throws RecognitionException {
        try {
            int _type = GETCURRPERIOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1575:5: ( 'GET_CURR_PERIOD' )
            // RPIExprAST.g:1575:7: 'GET_CURR_PERIOD'
            {
            match("GET_CURR_PERIOD"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GETCURRPERIOD"

    // $ANTLR start "GETBASEPERIOD"
    public final void mGETBASEPERIOD() throws RecognitionException {
        try {
            int _type = GETBASEPERIOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1578:5: ( 'GET_BASE_PERIOD' )
            // RPIExprAST.g:1578:9: 'GET_BASE_PERIOD'
            {
            match("GET_BASE_PERIOD"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GETBASEPERIOD"

    // $ANTLR start "QTR"
    public final void mQTR() throws RecognitionException {
        try {
            int _type = QTR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1580:5: ( 'qtr' )
            // RPIExprAST.g:1580:9: 'qtr'
            {
            match("qtr"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QTR"

    // $ANTLR start "NONZEROCOUNT"
    public final void mNONZEROCOUNT() throws RecognitionException {
        try {
            int _type = NONZEROCOUNT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1583:5: ( 'nonZeroCount' )
            // RPIExprAST.g:1583:7: 'nonZeroCount'
            {
            match("nonZeroCount"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NONZEROCOUNT"

    // $ANTLR start "NONZEROAVG"
    public final void mNONZEROAVG() throws RecognitionException {
        try {
            int _type = NONZEROAVG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1586:5: ( 'nonZeroAvg' )
            // RPIExprAST.g:1586:7: 'nonZeroAvg'
            {
            match("nonZeroAvg"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NONZEROAVG"

    // $ANTLR start "AVG"
    public final void mAVG() throws RecognitionException {
        try {
            int _type = AVG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1588:5: ( 'avg' )
            // RPIExprAST.g:1588:7: 'avg'
            {
            match("avg"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AVG"

    // $ANTLR start "IFZERO"
    public final void mIFZERO() throws RecognitionException {
        try {
            int _type = IFZERO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1591:5: ( 'ifZero' )
            // RPIExprAST.g:1591:9: 'ifZero'
            {
            match("ifZero"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IFZERO"

    // $ANTLR start "ACCRUE"
    public final void mACCRUE() throws RecognitionException {
        try {
            int _type = ACCRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1594:5: ( 'accrue' )
            // RPIExprAST.g:1594:7: 'accrue'
            {
            match("accrue"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ACCRUE"

    // $ANTLR start "ACCRUEFROMBASE"
    public final void mACCRUEFROMBASE() throws RecognitionException {
        try {
            int _type = ACCRUEFROMBASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1597:5: ( 'accrueFromBase' )
            // RPIExprAST.g:1597:7: 'accrueFromBase'
            {
            match("accrueFromBase"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ACCRUEFROMBASE"

    // $ANTLR start "ACCRUEFROM"
    public final void mACCRUEFROM() throws RecognitionException {
        try {
            int _type = ACCRUEFROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1600:5: ( 'accrueFrom' )
            // RPIExprAST.g:1600:9: 'accrueFrom'
            {
            match("accrueFrom"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ACCRUEFROM"

    // $ANTLR start "SERIESAVERAGE"
    public final void mSERIESAVERAGE() throws RecognitionException {
        try {
            int _type = SERIESAVERAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1603:5: ( 'SeriesAverage' )
            // RPIExprAST.g:1603:9: 'SeriesAverage'
            {
            match("SeriesAverage"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SERIESAVERAGE"

    // $ANTLR start "DATE"
    public final void mDATE() throws RecognitionException {
        try {
            int _type = DATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1606:5: ( 'date' )
            // RPIExprAST.g:1606:7: 'date'
            {
            match("date"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DATE"

    // $ANTLR start "XFCN"
    public final void mXFCN() throws RecognitionException {
        try {
            int _type = XFCN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1609:5: ( 'XFCN' )
            // RPIExprAST.g:1609:7: 'XFCN'
            {
            match("XFCN"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "XFCN"

    // $ANTLR start "AGG"
    public final void mAGG() throws RecognitionException {
        try {
            int _type = AGG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1611:5: ( 'AGG' )
            // RPIExprAST.g:1611:7: 'AGG'
            {
            match("AGG"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AGG"

    // $ANTLR start "CREATEGROUP"
    public final void mCREATEGROUP() throws RecognitionException {
        try {
            int _type = CREATEGROUP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1614:5: ( 'create_group' )
            // RPIExprAST.g:1614:9: 'create_group'
            {
            match("create_group"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CREATEGROUP"

    // $ANTLR start "ADDPRODUCTSELECTOR"
    public final void mADDPRODUCTSELECTOR() throws RecognitionException {
        try {
            int _type = ADDPRODUCTSELECTOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1617:5: ( 'add_product_selector' )
            // RPIExprAST.g:1617:9: 'add_product_selector'
            {
            match("add_product_selector"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ADDPRODUCTSELECTOR"

    // $ANTLR start "SETPOSTPROCESSCLASS"
    public final void mSETPOSTPROCESSCLASS() throws RecognitionException {
        try {
            int _type = SETPOSTPROCESSCLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1620:5: ( 'set_post_process_class' )
            // RPIExprAST.g:1620:9: 'set_post_process_class'
            {
            match("set_post_process_class"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SETPOSTPROCESSCLASS"

    // $ANTLR start "SETSCENARIOUICLASS"
    public final void mSETSCENARIOUICLASS() throws RecognitionException {
        try {
            int _type = SETSCENARIOUICLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1623:5: ( 'set_scenario_ui_class' )
            // RPIExprAST.g:1623:9: 'set_scenario_ui_class'
            {
            match("set_scenario_ui_class"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SETSCENARIOUICLASS"

    // $ANTLR start "SETUSERINPUTUICLASS"
    public final void mSETUSERINPUTUICLASS() throws RecognitionException {
        try {
            int _type = SETUSERINPUTUICLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1626:5: ( 'set_user_input_ui_class' )
            // RPIExprAST.g:1626:9: 'set_user_input_ui_class'
            {
            match("set_user_input_ui_class"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SETUSERINPUTUICLASS"

    // $ANTLR start "SETPRODUCTUICLASS"
    public final void mSETPRODUCTUICLASS() throws RecognitionException {
        try {
            int _type = SETPRODUCTUICLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1629:5: ( 'set_product_ui_class' )
            // RPIExprAST.g:1629:7: 'set_product_ui_class'
            {
            match("set_product_ui_class"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SETPRODUCTUICLASS"

    // $ANTLR start "SETMODELPROCCLASS"
    public final void mSETMODELPROCCLASS() throws RecognitionException {
        try {
            int _type = SETMODELPROCCLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1632:5: ( 'set_model_processor_class' )
            // RPIExprAST.g:1632:7: 'set_model_processor_class'
            {
            match("set_model_processor_class"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SETMODELPROCCLASS"

    // $ANTLR start "SETREPORTUICLASS"
    public final void mSETREPORTUICLASS() throws RecognitionException {
        try {
            int _type = SETREPORTUICLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1635:5: ( 'set_report_ui_class' )
            // RPIExprAST.g:1635:9: 'set_report_ui_class'
            {
            match("set_report_ui_class"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SETREPORTUICLASS"

    // $ANTLR start "PRODUCTSELECTOR"
    public final void mPRODUCTSELECTOR() throws RecognitionException {
        try {
            int _type = PRODUCTSELECTOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1638:5: ( 'NDC-9' | 'HCPCS Code' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='N') ) {
                alt1=1;
            }
            else if ( (LA1_0=='H') ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // RPIExprAST.g:1638:7: 'NDC-9'
                    {
                    match("NDC-9"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // RPIExprAST.g:1638:17: 'HCPCS Code'
                    {
                    match("HCPCS Code"); if (state.failed) return ;


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRODUCTSELECTOR"

    // $ANTLR start "FORECASTABLETYPE"
    public final void mFORECASTABLETYPE() throws RecognitionException {
        try {
            int _type = FORECASTABLETYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1641:5: ( ( 'PRODUCT' | 'SCENARIO' ) )
            // RPIExprAST.g:1641:7: ( 'PRODUCT' | 'SCENARIO' )
            {
            // RPIExprAST.g:1641:7: ( 'PRODUCT' | 'SCENARIO' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='P') ) {
                alt2=1;
            }
            else if ( (LA2_0=='S') ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // RPIExprAST.g:1641:8: 'PRODUCT'
                    {
                    match("PRODUCT"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // RPIExprAST.g:1641:20: 'SCENARIO'
                    {
                    match("SCENARIO"); if (state.failed) return ;


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FORECASTABLETYPE"

    // $ANTLR start "PERIODICITY"
    public final void mPERIODICITY() throws RecognitionException {
        try {
            int _type = PERIODICITY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1644:5: ( ( 'QUARTER' | 'YEAR' | 'MONTH' ) )
            // RPIExprAST.g:1644:7: ( 'QUARTER' | 'YEAR' | 'MONTH' )
            {
            // RPIExprAST.g:1644:7: ( 'QUARTER' | 'YEAR' | 'MONTH' )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 'Q':
                {
                alt3=1;
                }
                break;
            case 'Y':
                {
                alt3=2;
                }
                break;
            case 'M':
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // RPIExprAST.g:1644:8: 'QUARTER'
                    {
                    match("QUARTER"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // RPIExprAST.g:1644:20: 'YEAR'
                    {
                    match("YEAR"); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // RPIExprAST.g:1644:29: 'MONTH'
                    {
                    match("MONTH"); if (state.failed) return ;


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PERIODICITY"

    // $ANTLR start "SQL"
    public final void mSQL() throws RecognitionException {
        try {
            int _type = SQL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1645:5: ( 'SQL' )
            // RPIExprAST.g:1645:7: 'SQL'
            {
            match("SQL"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SQL"

    // $ANTLR start "BOOLOP_EQ"
    public final void mBOOLOP_EQ() throws RecognitionException {
        try {
            int _type = BOOLOP_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1647:5: ( '==' )
            // RPIExprAST.g:1647:7: '=='
            {
            match("=="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOOLOP_EQ"

    // $ANTLR start "BOOLOP_LT"
    public final void mBOOLOP_LT() throws RecognitionException {
        try {
            int _type = BOOLOP_LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1649:5: ( '<' )
            // RPIExprAST.g:1649:7: '<'
            {
            match('<'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOOLOP_LT"

    // $ANTLR start "BOOLOP_GT"
    public final void mBOOLOP_GT() throws RecognitionException {
        try {
            int _type = BOOLOP_GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1651:5: ( '>' )
            // RPIExprAST.g:1651:7: '>'
            {
            match('>'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOOLOP_GT"

    // $ANTLR start "BOOLOP_LE"
    public final void mBOOLOP_LE() throws RecognitionException {
        try {
            int _type = BOOLOP_LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1653:5: ( '<=' )
            // RPIExprAST.g:1653:7: '<='
            {
            match("<="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOOLOP_LE"

    // $ANTLR start "BOOLOP_GE"
    public final void mBOOLOP_GE() throws RecognitionException {
        try {
            int _type = BOOLOP_GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1655:5: ( '>=' )
            // RPIExprAST.g:1655:7: '>='
            {
            match(">="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOOLOP_GE"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1656:5: ( 'AND' )
            // RPIExprAST.g:1656:7: 'AND'
            {
            match("AND"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1657:5: ( 'OR' )
            // RPIExprAST.g:1657:7: 'OR'
            {
            match("OR"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1658:5: ( 'NOT' )
            // RPIExprAST.g:1658:7: 'NOT'
            {
            match("NOT"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "AVGBASIS"
    public final void mAVGBASIS() throws RecognitionException {
        try {
            int _type = AVGBASIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1661:5: ( 'all' | 'historical' | 'future' )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 'a':
                {
                alt4=1;
                }
                break;
            case 'h':
                {
                alt4=2;
                }
                break;
            case 'f':
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // RPIExprAST.g:1661:7: 'all'
                    {
                    match("all"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // RPIExprAST.g:1661:15: 'historical'
                    {
                    match("historical"); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // RPIExprAST.g:1661:30: 'future'
                    {
                    match("future"); if (state.failed) return ;


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AVGBASIS"

    // $ANTLR start "CREATE_MODEL"
    public final void mCREATE_MODEL() throws RecognitionException {
        try {
            int _type = CREATE_MODEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1664:5: ( 'create_model ' )
            // RPIExprAST.g:1664:7: 'create_model '
            {
            match("create_model "); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CREATE_MODEL"

    // $ANTLR start "DATEFORMAT"
    public final void mDATEFORMAT() throws RecognitionException {
        try {
            int _type = DATEFORMAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1667:5: ( ( '0' .. '1' '0' .. '9' '/' '0' .. '3' '0' .. '9' '/' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' ) | 'today' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>='0' && LA5_0<='1')) ) {
                alt5=1;
            }
            else if ( (LA5_0=='t') ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // RPIExprAST.g:1667:7: ( '0' .. '1' '0' .. '9' '/' '0' .. '3' '0' .. '9' '/' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' )
                    {
                    // RPIExprAST.g:1667:7: ( '0' .. '1' '0' .. '9' '/' '0' .. '3' '0' .. '9' '/' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' )
                    // RPIExprAST.g:1667:8: '0' .. '1' '0' .. '9' '/' '0' .. '3' '0' .. '9' '/' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9'
                    {
                    matchRange('0','1'); if (state.failed) return ;
                    matchRange('0','9'); if (state.failed) return ;
                    match('/'); if (state.failed) return ;
                    matchRange('0','3'); if (state.failed) return ;
                    matchRange('0','9'); if (state.failed) return ;
                    match('/'); if (state.failed) return ;
                    matchRange('0','9'); if (state.failed) return ;
                    matchRange('0','9'); if (state.failed) return ;
                    matchRange('0','9'); if (state.failed) return ;
                    matchRange('0','9'); if (state.failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // RPIExprAST.g:1667:91: 'today'
                    {
                    match("today"); if (state.failed) return ;


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DATEFORMAT"

    // $ANTLR start "XFCNARG"
    public final void mXFCNARG() throws RecognitionException {
        try {
            int _type = XFCNARG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1670:5: ( 'product' | 'current' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='p') ) {
                alt6=1;
            }
            else if ( (LA6_0=='c') ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // RPIExprAST.g:1670:7: 'product'
                    {
                    match("product"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // RPIExprAST.g:1670:19: 'current'
                    {
                    match("current"); if (state.failed) return ;


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "XFCNARG"

    // $ANTLR start "AGGRULE"
    public final void mAGGRULE() throws RecognitionException {
        try {
            int _type = AGGRULE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1673:5: ( 'SUM' | 'MIN' | 'MAX' | 'AVG' | 'CNT' )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 'S':
                {
                alt7=1;
                }
                break;
            case 'M':
                {
                int LA7_2 = input.LA(2);

                if ( (LA7_2=='I') ) {
                    alt7=2;
                }
                else if ( (LA7_2=='A') ) {
                    alt7=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
                }
                break;
            case 'A':
                {
                alt7=4;
                }
                break;
            case 'C':
                {
                alt7=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // RPIExprAST.g:1673:7: 'SUM'
                    {
                    match("SUM"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // RPIExprAST.g:1673:15: 'MIN'
                    {
                    match("MIN"); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // RPIExprAST.g:1673:23: 'MAX'
                    {
                    match("MAX"); if (state.failed) return ;


                    }
                    break;
                case 4 :
                    // RPIExprAST.g:1673:31: 'AVG'
                    {
                    match("AVG"); if (state.failed) return ;


                    }
                    break;
                case 5 :
                    // RPIExprAST.g:1673:39: 'CNT'
                    {
                    match("CNT"); if (state.failed) return ;


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AGGRULE"

    // $ANTLR start "COMPMODIFIER"
    public final void mCOMPMODIFIER() throws RecognitionException {
        try {
            int _type = COMPMODIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1675:13: ( ':' ( ( 'PM' | 'PP' | 'BM' ) ( '0' .. '9' ) | 'BASE' )+ )
            // RPIExprAST.g:1675:15: ':' ( ( 'PM' | 'PP' | 'BM' ) ( '0' .. '9' ) | 'BASE' )+
            {
            match(':'); if (state.failed) return ;
            // RPIExprAST.g:1675:19: ( ( 'PM' | 'PP' | 'BM' ) ( '0' .. '9' ) | 'BASE' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='P') ) {
                    alt9=1;
                }
                else if ( (LA9_0=='B') ) {
                    int LA9_3 = input.LA(2);

                    if ( (LA9_3=='M') ) {
                        alt9=1;
                    }
                    else if ( (LA9_3=='A') ) {
                        alt9=2;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // RPIExprAST.g:1675:20: ( 'PM' | 'PP' | 'BM' ) ( '0' .. '9' )
            	    {
            	    // RPIExprAST.g:1675:20: ( 'PM' | 'PP' | 'BM' )
            	    int alt8=3;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0=='P') ) {
            	        int LA8_1 = input.LA(2);

            	        if ( (LA8_1=='M') ) {
            	            alt8=1;
            	        }
            	        else if ( (LA8_1=='P') ) {
            	            alt8=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return ;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 8, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( (LA8_0=='B') ) {
            	        alt8=3;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 8, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // RPIExprAST.g:1675:21: 'PM'
            	            {
            	            match("PM"); if (state.failed) return ;


            	            }
            	            break;
            	        case 2 :
            	            // RPIExprAST.g:1675:28: 'PP'
            	            {
            	            match("PP"); if (state.failed) return ;


            	            }
            	            break;
            	        case 3 :
            	            // RPIExprAST.g:1675:35: 'BM'
            	            {
            	            match("BM"); if (state.failed) return ;


            	            }
            	            break;

            	    }

            	    // RPIExprAST.g:1675:41: ( '0' .. '9' )
            	    // RPIExprAST.g:1675:42: '0' .. '9'
            	    {
            	    matchRange('0','9'); if (state.failed) return ;

            	    }


            	    }
            	    break;
            	case 2 :
            	    // RPIExprAST.g:1675:54: 'BASE'
            	    {
            	    match("BASE"); if (state.failed) return ;


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMPMODIFIER"

    // $ANTLR start "DBLQUOTE"
    public final void mDBLQUOTE() throws RecognitionException {
        try {
            int _type = DBLQUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1678:5: ( '\"' )
            // RPIExprAST.g:1678:7: '\"'
            {
            match('\"'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DBLQUOTE"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1680:5: ( '=' )
            // RPIExprAST.g:1680:9: '='
            {
            match('='); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1682:5: ( '/' )
            // RPIExprAST.g:1682:9: '/'
            {
            match('/'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1685:5: ( ';' )
            // RPIExprAST.g:1685:7: ';'
            {
            match(';'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1687:5: ( ',' )
            // RPIExprAST.g:1687:9: ','
            {
            match(','); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1688:8: ( ( '\\r' )? '\\n' )
            // RPIExprAST.g:1688:9: ( '\\r' )? '\\n'
            {
            // RPIExprAST.g:1688:9: ( '\\r' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // RPIExprAST.g:1688:9: '\\r'
                    {
                    match('\r'); if (state.failed) return ;

                    }
                    break;

            }

            match('\n'); if (state.failed) return ;
            if ( state.backtracking==0 ) {
              skip();
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1689:5: ( ( NEWLINE | ' ' | '\\t' )+ )
            // RPIExprAST.g:1689:9: ( NEWLINE | ' ' | '\\t' )+
            {
            // RPIExprAST.g:1689:9: ( NEWLINE | ' ' | '\\t' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=4;
                switch ( input.LA(1) ) {
                case '\n':
                case '\r':
                    {
                    alt11=1;
                    }
                    break;
                case ' ':
                    {
                    alt11=2;
                    }
                    break;
                case '\t':
                    {
                    alt11=3;
                    }
                    break;

                }

                switch (alt11) {
            	case 1 :
            	    // RPIExprAST.g:1689:10: NEWLINE
            	    {
            	    mNEWLINE(); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // RPIExprAST.g:1689:20: ' '
            	    {
            	    match(' '); if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // RPIExprAST.g:1689:26: '\\t'
            	    {
            	    match('\t'); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            if ( state.backtracking==0 ) {
              skip();
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "ML_COMMENT"
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1691:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // RPIExprAST.g:1691:7: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); if (state.failed) return ;

            // RPIExprAST.g:1691:12: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='*') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='/') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='.')||(LA12_1>='0' && LA12_1<='\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // RPIExprAST.g:1691:37: .
            	    {
            	    matchAny(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match("*/"); if (state.failed) return ;

            if ( state.backtracking==0 ) {
              skip();
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ML_COMMENT"

    // $ANTLR start "SL_COMMENT"
    public final void mSL_COMMENT() throws RecognitionException {
        try {
            int _type = SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1693:5: ( '//' ( . )* '\\n' )
            // RPIExprAST.g:1693:7: '//' ( . )* '\\n'
            {
            match("//"); if (state.failed) return ;

            // RPIExprAST.g:1693:12: ( . )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='\n') ) {
                    alt13=2;
                }
                else if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // RPIExprAST.g:1693:12: .
            	    {
            	    matchAny(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            match('\n'); if (state.failed) return ;
            if ( state.backtracking==0 ) {
              skip();
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SL_COMMENT"

    // $ANTLR start "QUOTED_STRING"
    public final void mQUOTED_STRING() throws RecognitionException {
        try {
            int _type = QUOTED_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1695:5: ( ( 'n' )? '\\'' ( '\\'\\'' | ~ ( '\\'' ) )* '\\'' )
            // RPIExprAST.g:1695:9: ( 'n' )? '\\'' ( '\\'\\'' | ~ ( '\\'' ) )* '\\''
            {
            // RPIExprAST.g:1695:9: ( 'n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='n') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // RPIExprAST.g:1695:11: 'n'
                    {
                    match('n'); if (state.failed) return ;

                    }
                    break;

            }

            match('\''); if (state.failed) return ;
            // RPIExprAST.g:1695:23: ( '\\'\\'' | ~ ( '\\'' ) )*
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='\'') ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1=='\'') ) {
                        alt15=1;
                    }


                }
                else if ( ((LA15_0>='\u0000' && LA15_0<='&')||(LA15_0>='(' && LA15_0<='\uFFFF')) ) {
                    alt15=2;
                }


                switch (alt15) {
            	case 1 :
            	    // RPIExprAST.g:1695:25: '\\'\\''
            	    {
            	    match("''"); if (state.failed) return ;


            	    }
            	    break;
            	case 2 :
            	    // RPIExprAST.g:1695:34: ~ ( '\\'' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            match('\''); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUOTED_STRING"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1698:5: ( 'A' .. 'Z' ( 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' )* | DOUBLEQUOTED_STRING )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>='A' && LA17_0<='Z')) ) {
                alt17=1;
            }
            else if ( (LA17_0=='\"') ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // RPIExprAST.g:1698:9: 'A' .. 'Z' ( 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' )*
                    {
                    matchRange('A','Z'); if (state.failed) return ;
                    // RPIExprAST.g:1698:20: ( 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0>='#' && LA16_0<='$')||(LA16_0>='0' && LA16_0<='9')||(LA16_0>='A' && LA16_0<='Z')||LA16_0=='_') ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // RPIExprAST.g:
                    	    {
                    	    if ( (input.LA(1)>='#' && input.LA(1)<='$')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_' ) {
                    	        input.consume();
                    	    state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // RPIExprAST.g:1699:9: DOUBLEQUOTED_STRING
                    {
                    mDOUBLEQUOTED_STRING(); if (state.failed) return ;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1702:5: ( ':' )
            // RPIExprAST.g:1702:9: ':'
            {
            match(':'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "DOUBLEDOT"
    public final void mDOUBLEDOT() throws RecognitionException {
        try {
            int _type = DOUBLEDOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1705:5: ( POINT POINT )
            // RPIExprAST.g:1705:9: POINT POINT
            {
            mPOINT(); if (state.failed) return ;
            mPOINT(); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLEDOT"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1708:5: ( POINT )
            // RPIExprAST.g:1708:9: POINT
            {
            mPOINT(); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "POINT"
    public final void mPOINT() throws RecognitionException {
        try {
            // RPIExprAST.g:1712:5: ( '.' )
            // RPIExprAST.g:1712:9: '.'
            {
            match('.'); if (state.failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end "POINT"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            int _type = EXPONENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1715:5: ( '**' )
            // RPIExprAST.g:1715:9: '**'
            {
            match("**"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "ASTERISK"
    public final void mASTERISK() throws RecognitionException {
        try {
            int _type = ASTERISK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1718:5: ( '*' )
            // RPIExprAST.g:1718:9: '*'
            {
            match('*'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASTERISK"

    // $ANTLR start "AT_SIGN"
    public final void mAT_SIGN() throws RecognitionException {
        try {
            int _type = AT_SIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1721:5: ( '@' )
            // RPIExprAST.g:1721:9: '@'
            {
            match('@'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AT_SIGN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1724:5: ( ')' )
            // RPIExprAST.g:1724:9: ')'
            {
            match(')'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1727:5: ( '(' )
            // RPIExprAST.g:1727:9: '('
            {
            match('('); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RBRACK"
    public final void mRBRACK() throws RecognitionException {
        try {
            int _type = RBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1730:5: ( ']' )
            // RPIExprAST.g:1730:9: ']'
            {
            match(']'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RBRACK"

    // $ANTLR start "LBRACK"
    public final void mLBRACK() throws RecognitionException {
        try {
            int _type = LBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1733:5: ( '[' )
            // RPIExprAST.g:1733:9: '['
            {
            match('['); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LBRACK"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1736:5: ( '+' )
            // RPIExprAST.g:1736:9: '+'
            {
            match('+'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1739:5: ( '-' )
            // RPIExprAST.g:1739:9: '-'
            {
            match('-'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "PERCENTAGE"
    public final void mPERCENTAGE() throws RecognitionException {
        try {
            int _type = PERCENTAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1742:5: ( '%' )
            // RPIExprAST.g:1742:9: '%'
            {
            match('%'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PERCENTAGE"

    // $ANTLR start "LLABEL"
    public final void mLLABEL() throws RecognitionException {
        try {
            int _type = LLABEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1745:5: ( '<<' )
            // RPIExprAST.g:1745:9: '<<'
            {
            match("<<"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LLABEL"

    // $ANTLR start "RLABEL"
    public final void mRLABEL() throws RecognitionException {
        try {
            int _type = RLABEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1748:5: ( '>>' )
            // RPIExprAST.g:1748:9: '>>'
            {
            match(">>"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RLABEL"

    // $ANTLR start "SQL_ASSIGN"
    public final void mSQL_ASSIGN() throws RecognitionException {
        try {
            int _type = SQL_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1751:5: ( ':=' )
            // RPIExprAST.g:1751:9: ':='
            {
            match(":="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SQL_ASSIGN"

    // $ANTLR start "ARROW"
    public final void mARROW() throws RecognitionException {
        try {
            int _type = ARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1754:5: ( '=>' )
            // RPIExprAST.g:1754:9: '=>'
            {
            match("=>"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ARROW"

    // $ANTLR start "VERTBAR"
    public final void mVERTBAR() throws RecognitionException {
        try {
            int _type = VERTBAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1757:5: ( '|' )
            // RPIExprAST.g:1757:9: '|'
            {
            match('|'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VERTBAR"

    // $ANTLR start "DOUBLEVERTBAR"
    public final void mDOUBLEVERTBAR() throws RecognitionException {
        try {
            int _type = DOUBLEVERTBAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1760:5: ( '||' )
            // RPIExprAST.g:1760:9: '||'
            {
            match("||"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLEVERTBAR"

    // $ANTLR start "NOT_EQ"
    public final void mNOT_EQ() throws RecognitionException {
        try {
            int _type = NOT_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1763:5: ( '<>' | '!=' | '^=' )
            int alt18=3;
            switch ( input.LA(1) ) {
            case '<':
                {
                alt18=1;
                }
                break;
            case '!':
                {
                alt18=2;
                }
                break;
            case '^':
                {
                alt18=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // RPIExprAST.g:1763:9: '<>'
                    {
                    match("<>"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // RPIExprAST.g:1763:16: '!='
                    {
                    match("!="); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // RPIExprAST.g:1763:23: '^='
                    {
                    match("^="); if (state.failed) return ;


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT_EQ"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1766:5: ( ( ( N POINT N )=> N POINT N | POINT N | N ) ( 'E' ( PLUS | MINUS )? N )? )
            // RPIExprAST.g:1767:9: ( ( N POINT N )=> N POINT N | POINT N | N ) ( 'E' ( PLUS | MINUS )? N )?
            {
            // RPIExprAST.g:1767:9: ( ( N POINT N )=> N POINT N | POINT N | N )
            int alt19=3;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // RPIExprAST.g:1767:13: ( N POINT N )=> N POINT N
                    {
                    mN(); if (state.failed) return ;
                    mPOINT(); if (state.failed) return ;
                    mN(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // RPIExprAST.g:1768:13: POINT N
                    {
                    mPOINT(); if (state.failed) return ;
                    mN(); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // RPIExprAST.g:1769:13: N
                    {
                    mN(); if (state.failed) return ;

                    }
                    break;

            }

            // RPIExprAST.g:1771:9: ( 'E' ( PLUS | MINUS )? N )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='E') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // RPIExprAST.g:1771:11: 'E' ( PLUS | MINUS )? N
                    {
                    match('E'); if (state.failed) return ;
                    // RPIExprAST.g:1771:15: ( PLUS | MINUS )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='+'||LA20_0=='-') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // RPIExprAST.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();
                            state.failed=false;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mN(); if (state.failed) return ;

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "N"
    public final void mN() throws RecognitionException {
        try {
            // RPIExprAST.g:1775:5: ( '0' .. '9' ( '0' .. '9' )* )
            // RPIExprAST.g:1775:7: '0' .. '9' ( '0' .. '9' )*
            {
            matchRange('0','9'); if (state.failed) return ;
            // RPIExprAST.g:1775:18: ( '0' .. '9' )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='0' && LA22_0<='9')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // RPIExprAST.g:1775:20: '0' .. '9'
            	    {
            	    matchRange('0','9'); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "N"

    // $ANTLR start "QUOTE"
    public final void mQUOTE() throws RecognitionException {
        try {
            int _type = QUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1778:5: ( '\\'' )
            // RPIExprAST.g:1778:9: '\\''
            {
            match('\''); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUOTE"

    // $ANTLR start "DOUBLEQUOTED_STRING"
    public final void mDOUBLEQUOTED_STRING() throws RecognitionException {
        try {
            // RPIExprAST.g:1782:5: ( '\"' (~ ( '\"' ) )* '\"' )
            // RPIExprAST.g:1782:9: '\"' (~ ( '\"' ) )* '\"'
            {
            match('\"'); if (state.failed) return ;
            // RPIExprAST.g:1782:13: (~ ( '\"' ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='\u0000' && LA23_0<='!')||(LA23_0>='#' && LA23_0<='\uFFFF')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // RPIExprAST.g:1782:15: ~ ( '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            match('\"'); if (state.failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end "DOUBLEQUOTED_STRING"

    // $ANTLR start "SQLSL_COMMENT"
    public final void mSQLSL_COMMENT() throws RecognitionException {
        try {
            int _type = SQLSL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1785:5: ( '--' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // RPIExprAST.g:1785:9: '--' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("--"); if (state.failed) return ;

            // RPIExprAST.g:1785:14: (~ ( '\\n' | '\\r' ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>='\u0000' && LA24_0<='\t')||(LA24_0>='\u000B' && LA24_0<='\f')||(LA24_0>='\u000E' && LA24_0<='\uFFFF')) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // RPIExprAST.g:1785:14: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // RPIExprAST.g:1785:28: ( '\\r' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='\r') ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // RPIExprAST.g:1785:28: '\\r'
                    {
                    match('\r'); if (state.failed) return ;

                    }
                    break;

            }

            match('\n'); if (state.failed) return ;
            if ( state.backtracking==0 ) {
              _channel=HIDDEN;
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SQLSL_COMMENT"

    // $ANTLR start "TYPE_ATTR"
    public final void mTYPE_ATTR() throws RecognitionException {
        try {
            int _type = TYPE_ATTR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1788:5: ( '%TYPE' )
            // RPIExprAST.g:1788:9: '%TYPE'
            {
            match("%TYPE"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TYPE_ATTR"

    // $ANTLR start "ROWTYPE_ATTR"
    public final void mROWTYPE_ATTR() throws RecognitionException {
        try {
            int _type = ROWTYPE_ATTR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1791:5: ( '%ROWTYPE' )
            // RPIExprAST.g:1791:9: '%ROWTYPE'
            {
            match("%ROWTYPE"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ROWTYPE_ATTR"

    // $ANTLR start "NOTFOUND_ATTR"
    public final void mNOTFOUND_ATTR() throws RecognitionException {
        try {
            int _type = NOTFOUND_ATTR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1794:5: ( '%NOTFOUND' )
            // RPIExprAST.g:1794:9: '%NOTFOUND'
            {
            match("%NOTFOUND"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOTFOUND_ATTR"

    // $ANTLR start "FOUND_ATTR"
    public final void mFOUND_ATTR() throws RecognitionException {
        try {
            int _type = FOUND_ATTR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1797:5: ( '%FOUND' )
            // RPIExprAST.g:1797:9: '%FOUND'
            {
            match("%FOUND"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOUND_ATTR"

    // $ANTLR start "ISOPEN_ATTR"
    public final void mISOPEN_ATTR() throws RecognitionException {
        try {
            int _type = ISOPEN_ATTR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1800:5: ( '%ISOPEN' )
            // RPIExprAST.g:1800:9: '%ISOPEN'
            {
            match("%ISOPEN"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ISOPEN_ATTR"

    // $ANTLR start "ROWCOUNT_ATTR"
    public final void mROWCOUNT_ATTR() throws RecognitionException {
        try {
            int _type = ROWCOUNT_ATTR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1803:5: ( '%ROWCOUNT' )
            // RPIExprAST.g:1803:9: '%ROWCOUNT'
            {
            match("%ROWCOUNT"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ROWCOUNT_ATTR"

    // $ANTLR start "BULK_ROWCOUNT_ATTR"
    public final void mBULK_ROWCOUNT_ATTR() throws RecognitionException {
        try {
            int _type = BULK_ROWCOUNT_ATTR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1806:5: ( '%BULK_ROWCOUNT' )
            // RPIExprAST.g:1806:9: '%BULK_ROWCOUNT'
            {
            match("%BULK_ROWCOUNT"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BULK_ROWCOUNT_ATTR"

    // $ANTLR start "CHARSET_ATTR"
    public final void mCHARSET_ATTR() throws RecognitionException {
        try {
            int _type = CHARSET_ATTR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // RPIExprAST.g:1809:5: ( '%CHARSET' )
            // RPIExprAST.g:1809:9: '%CHARSET'
            {
            match("%CHARSET"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHARSET_ATTR"

    public void mTokens() throws RecognitionException {
        // RPIExprAST.g:1:8: ( T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | T__168 | T__169 | T__170 | T__171 | T__172 | T__173 | T__174 | T__175 | T__176 | T__177 | T__178 | T__179 | T__180 | T__181 | T__182 | T__183 | T__184 | T__185 | T__186 | T__187 | T__188 | T__189 | T__190 | T__191 | T__192 | T__193 | T__194 | T__195 | T__196 | T__197 | T__198 | T__199 | T__200 | T__201 | T__202 | T__203 | T__204 | T__205 | T__206 | T__207 | T__208 | T__209 | T__210 | T__211 | T__212 | T__213 | T__214 | T__215 | T__216 | T__217 | T__218 | T__219 | T__220 | T__221 | T__222 | T__223 | MAXOF | LEASTOF | ABS | IFTHEN | GETCURRPERIOD | GETBASEPERIOD | QTR | NONZEROCOUNT | NONZEROAVG | AVG | IFZERO | ACCRUE | ACCRUEFROMBASE | ACCRUEFROM | SERIESAVERAGE | DATE | XFCN | AGG | CREATEGROUP | ADDPRODUCTSELECTOR | SETPOSTPROCESSCLASS | SETSCENARIOUICLASS | SETUSERINPUTUICLASS | SETPRODUCTUICLASS | SETMODELPROCCLASS | SETREPORTUICLASS | PRODUCTSELECTOR | FORECASTABLETYPE | PERIODICITY | SQL | BOOLOP_EQ | BOOLOP_LT | BOOLOP_GT | BOOLOP_LE | BOOLOP_GE | AND | OR | NOT | AVGBASIS | CREATE_MODEL | DATEFORMAT | XFCNARG | AGGRULE | COMPMODIFIER | DBLQUOTE | EQ | DIV | SEMICOLON | COMMA | NEWLINE | WS | ML_COMMENT | SL_COMMENT | QUOTED_STRING | ID | COLON | DOUBLEDOT | DOT | EXPONENT | ASTERISK | AT_SIGN | RPAREN | LPAREN | RBRACK | LBRACK | PLUS | MINUS | PERCENTAGE | LLABEL | RLABEL | SQL_ASSIGN | ARROW | VERTBAR | DOUBLEVERTBAR | NOT_EQ | NUMBER | QUOTE | SQLSL_COMMENT | TYPE_ATTR | ROWTYPE_ATTR | NOTFOUND_ATTR | FOUND_ATTR | ISOPEN_ATTR | ROWCOUNT_ATTR | BULK_ROWCOUNT_ATTR | CHARSET_ATTR )
        int alt26=202;
        alt26 = dfa26.predict(input);
        switch (alt26) {
            case 1 :
                // RPIExprAST.g:1:10: T__108
                {
                mT__108(); if (state.failed) return ;

                }
                break;
            case 2 :
                // RPIExprAST.g:1:17: T__109
                {
                mT__109(); if (state.failed) return ;

                }
                break;
            case 3 :
                // RPIExprAST.g:1:24: T__110
                {
                mT__110(); if (state.failed) return ;

                }
                break;
            case 4 :
                // RPIExprAST.g:1:31: T__111
                {
                mT__111(); if (state.failed) return ;

                }
                break;
            case 5 :
                // RPIExprAST.g:1:38: T__112
                {
                mT__112(); if (state.failed) return ;

                }
                break;
            case 6 :
                // RPIExprAST.g:1:45: T__113
                {
                mT__113(); if (state.failed) return ;

                }
                break;
            case 7 :
                // RPIExprAST.g:1:52: T__114
                {
                mT__114(); if (state.failed) return ;

                }
                break;
            case 8 :
                // RPIExprAST.g:1:59: T__115
                {
                mT__115(); if (state.failed) return ;

                }
                break;
            case 9 :
                // RPIExprAST.g:1:66: T__116
                {
                mT__116(); if (state.failed) return ;

                }
                break;
            case 10 :
                // RPIExprAST.g:1:73: T__117
                {
                mT__117(); if (state.failed) return ;

                }
                break;
            case 11 :
                // RPIExprAST.g:1:80: T__118
                {
                mT__118(); if (state.failed) return ;

                }
                break;
            case 12 :
                // RPIExprAST.g:1:87: T__119
                {
                mT__119(); if (state.failed) return ;

                }
                break;
            case 13 :
                // RPIExprAST.g:1:94: T__120
                {
                mT__120(); if (state.failed) return ;

                }
                break;
            case 14 :
                // RPIExprAST.g:1:101: T__121
                {
                mT__121(); if (state.failed) return ;

                }
                break;
            case 15 :
                // RPIExprAST.g:1:108: T__122
                {
                mT__122(); if (state.failed) return ;

                }
                break;
            case 16 :
                // RPIExprAST.g:1:115: T__123
                {
                mT__123(); if (state.failed) return ;

                }
                break;
            case 17 :
                // RPIExprAST.g:1:122: T__124
                {
                mT__124(); if (state.failed) return ;

                }
                break;
            case 18 :
                // RPIExprAST.g:1:129: T__125
                {
                mT__125(); if (state.failed) return ;

                }
                break;
            case 19 :
                // RPIExprAST.g:1:136: T__126
                {
                mT__126(); if (state.failed) return ;

                }
                break;
            case 20 :
                // RPIExprAST.g:1:143: T__127
                {
                mT__127(); if (state.failed) return ;

                }
                break;
            case 21 :
                // RPIExprAST.g:1:150: T__128
                {
                mT__128(); if (state.failed) return ;

                }
                break;
            case 22 :
                // RPIExprAST.g:1:157: T__129
                {
                mT__129(); if (state.failed) return ;

                }
                break;
            case 23 :
                // RPIExprAST.g:1:164: T__130
                {
                mT__130(); if (state.failed) return ;

                }
                break;
            case 24 :
                // RPIExprAST.g:1:171: T__131
                {
                mT__131(); if (state.failed) return ;

                }
                break;
            case 25 :
                // RPIExprAST.g:1:178: T__132
                {
                mT__132(); if (state.failed) return ;

                }
                break;
            case 26 :
                // RPIExprAST.g:1:185: T__133
                {
                mT__133(); if (state.failed) return ;

                }
                break;
            case 27 :
                // RPIExprAST.g:1:192: T__134
                {
                mT__134(); if (state.failed) return ;

                }
                break;
            case 28 :
                // RPIExprAST.g:1:199: T__135
                {
                mT__135(); if (state.failed) return ;

                }
                break;
            case 29 :
                // RPIExprAST.g:1:206: T__136
                {
                mT__136(); if (state.failed) return ;

                }
                break;
            case 30 :
                // RPIExprAST.g:1:213: T__137
                {
                mT__137(); if (state.failed) return ;

                }
                break;
            case 31 :
                // RPIExprAST.g:1:220: T__138
                {
                mT__138(); if (state.failed) return ;

                }
                break;
            case 32 :
                // RPIExprAST.g:1:227: T__139
                {
                mT__139(); if (state.failed) return ;

                }
                break;
            case 33 :
                // RPIExprAST.g:1:234: T__140
                {
                mT__140(); if (state.failed) return ;

                }
                break;
            case 34 :
                // RPIExprAST.g:1:241: T__141
                {
                mT__141(); if (state.failed) return ;

                }
                break;
            case 35 :
                // RPIExprAST.g:1:248: T__142
                {
                mT__142(); if (state.failed) return ;

                }
                break;
            case 36 :
                // RPIExprAST.g:1:255: T__143
                {
                mT__143(); if (state.failed) return ;

                }
                break;
            case 37 :
                // RPIExprAST.g:1:262: T__144
                {
                mT__144(); if (state.failed) return ;

                }
                break;
            case 38 :
                // RPIExprAST.g:1:269: T__145
                {
                mT__145(); if (state.failed) return ;

                }
                break;
            case 39 :
                // RPIExprAST.g:1:276: T__146
                {
                mT__146(); if (state.failed) return ;

                }
                break;
            case 40 :
                // RPIExprAST.g:1:283: T__147
                {
                mT__147(); if (state.failed) return ;

                }
                break;
            case 41 :
                // RPIExprAST.g:1:290: T__148
                {
                mT__148(); if (state.failed) return ;

                }
                break;
            case 42 :
                // RPIExprAST.g:1:297: T__149
                {
                mT__149(); if (state.failed) return ;

                }
                break;
            case 43 :
                // RPIExprAST.g:1:304: T__150
                {
                mT__150(); if (state.failed) return ;

                }
                break;
            case 44 :
                // RPIExprAST.g:1:311: T__151
                {
                mT__151(); if (state.failed) return ;

                }
                break;
            case 45 :
                // RPIExprAST.g:1:318: T__152
                {
                mT__152(); if (state.failed) return ;

                }
                break;
            case 46 :
                // RPIExprAST.g:1:325: T__153
                {
                mT__153(); if (state.failed) return ;

                }
                break;
            case 47 :
                // RPIExprAST.g:1:332: T__154
                {
                mT__154(); if (state.failed) return ;

                }
                break;
            case 48 :
                // RPIExprAST.g:1:339: T__155
                {
                mT__155(); if (state.failed) return ;

                }
                break;
            case 49 :
                // RPIExprAST.g:1:346: T__156
                {
                mT__156(); if (state.failed) return ;

                }
                break;
            case 50 :
                // RPIExprAST.g:1:353: T__157
                {
                mT__157(); if (state.failed) return ;

                }
                break;
            case 51 :
                // RPIExprAST.g:1:360: T__158
                {
                mT__158(); if (state.failed) return ;

                }
                break;
            case 52 :
                // RPIExprAST.g:1:367: T__159
                {
                mT__159(); if (state.failed) return ;

                }
                break;
            case 53 :
                // RPIExprAST.g:1:374: T__160
                {
                mT__160(); if (state.failed) return ;

                }
                break;
            case 54 :
                // RPIExprAST.g:1:381: T__161
                {
                mT__161(); if (state.failed) return ;

                }
                break;
            case 55 :
                // RPIExprAST.g:1:388: T__162
                {
                mT__162(); if (state.failed) return ;

                }
                break;
            case 56 :
                // RPIExprAST.g:1:395: T__163
                {
                mT__163(); if (state.failed) return ;

                }
                break;
            case 57 :
                // RPIExprAST.g:1:402: T__164
                {
                mT__164(); if (state.failed) return ;

                }
                break;
            case 58 :
                // RPIExprAST.g:1:409: T__165
                {
                mT__165(); if (state.failed) return ;

                }
                break;
            case 59 :
                // RPIExprAST.g:1:416: T__166
                {
                mT__166(); if (state.failed) return ;

                }
                break;
            case 60 :
                // RPIExprAST.g:1:423: T__167
                {
                mT__167(); if (state.failed) return ;

                }
                break;
            case 61 :
                // RPIExprAST.g:1:430: T__168
                {
                mT__168(); if (state.failed) return ;

                }
                break;
            case 62 :
                // RPIExprAST.g:1:437: T__169
                {
                mT__169(); if (state.failed) return ;

                }
                break;
            case 63 :
                // RPIExprAST.g:1:444: T__170
                {
                mT__170(); if (state.failed) return ;

                }
                break;
            case 64 :
                // RPIExprAST.g:1:451: T__171
                {
                mT__171(); if (state.failed) return ;

                }
                break;
            case 65 :
                // RPIExprAST.g:1:458: T__172
                {
                mT__172(); if (state.failed) return ;

                }
                break;
            case 66 :
                // RPIExprAST.g:1:465: T__173
                {
                mT__173(); if (state.failed) return ;

                }
                break;
            case 67 :
                // RPIExprAST.g:1:472: T__174
                {
                mT__174(); if (state.failed) return ;

                }
                break;
            case 68 :
                // RPIExprAST.g:1:479: T__175
                {
                mT__175(); if (state.failed) return ;

                }
                break;
            case 69 :
                // RPIExprAST.g:1:486: T__176
                {
                mT__176(); if (state.failed) return ;

                }
                break;
            case 70 :
                // RPIExprAST.g:1:493: T__177
                {
                mT__177(); if (state.failed) return ;

                }
                break;
            case 71 :
                // RPIExprAST.g:1:500: T__178
                {
                mT__178(); if (state.failed) return ;

                }
                break;
            case 72 :
                // RPIExprAST.g:1:507: T__179
                {
                mT__179(); if (state.failed) return ;

                }
                break;
            case 73 :
                // RPIExprAST.g:1:514: T__180
                {
                mT__180(); if (state.failed) return ;

                }
                break;
            case 74 :
                // RPIExprAST.g:1:521: T__181
                {
                mT__181(); if (state.failed) return ;

                }
                break;
            case 75 :
                // RPIExprAST.g:1:528: T__182
                {
                mT__182(); if (state.failed) return ;

                }
                break;
            case 76 :
                // RPIExprAST.g:1:535: T__183
                {
                mT__183(); if (state.failed) return ;

                }
                break;
            case 77 :
                // RPIExprAST.g:1:542: T__184
                {
                mT__184(); if (state.failed) return ;

                }
                break;
            case 78 :
                // RPIExprAST.g:1:549: T__185
                {
                mT__185(); if (state.failed) return ;

                }
                break;
            case 79 :
                // RPIExprAST.g:1:556: T__186
                {
                mT__186(); if (state.failed) return ;

                }
                break;
            case 80 :
                // RPIExprAST.g:1:563: T__187
                {
                mT__187(); if (state.failed) return ;

                }
                break;
            case 81 :
                // RPIExprAST.g:1:570: T__188
                {
                mT__188(); if (state.failed) return ;

                }
                break;
            case 82 :
                // RPIExprAST.g:1:577: T__189
                {
                mT__189(); if (state.failed) return ;

                }
                break;
            case 83 :
                // RPIExprAST.g:1:584: T__190
                {
                mT__190(); if (state.failed) return ;

                }
                break;
            case 84 :
                // RPIExprAST.g:1:591: T__191
                {
                mT__191(); if (state.failed) return ;

                }
                break;
            case 85 :
                // RPIExprAST.g:1:598: T__192
                {
                mT__192(); if (state.failed) return ;

                }
                break;
            case 86 :
                // RPIExprAST.g:1:605: T__193
                {
                mT__193(); if (state.failed) return ;

                }
                break;
            case 87 :
                // RPIExprAST.g:1:612: T__194
                {
                mT__194(); if (state.failed) return ;

                }
                break;
            case 88 :
                // RPIExprAST.g:1:619: T__195
                {
                mT__195(); if (state.failed) return ;

                }
                break;
            case 89 :
                // RPIExprAST.g:1:626: T__196
                {
                mT__196(); if (state.failed) return ;

                }
                break;
            case 90 :
                // RPIExprAST.g:1:633: T__197
                {
                mT__197(); if (state.failed) return ;

                }
                break;
            case 91 :
                // RPIExprAST.g:1:640: T__198
                {
                mT__198(); if (state.failed) return ;

                }
                break;
            case 92 :
                // RPIExprAST.g:1:647: T__199
                {
                mT__199(); if (state.failed) return ;

                }
                break;
            case 93 :
                // RPIExprAST.g:1:654: T__200
                {
                mT__200(); if (state.failed) return ;

                }
                break;
            case 94 :
                // RPIExprAST.g:1:661: T__201
                {
                mT__201(); if (state.failed) return ;

                }
                break;
            case 95 :
                // RPIExprAST.g:1:668: T__202
                {
                mT__202(); if (state.failed) return ;

                }
                break;
            case 96 :
                // RPIExprAST.g:1:675: T__203
                {
                mT__203(); if (state.failed) return ;

                }
                break;
            case 97 :
                // RPIExprAST.g:1:682: T__204
                {
                mT__204(); if (state.failed) return ;

                }
                break;
            case 98 :
                // RPIExprAST.g:1:689: T__205
                {
                mT__205(); if (state.failed) return ;

                }
                break;
            case 99 :
                // RPIExprAST.g:1:696: T__206
                {
                mT__206(); if (state.failed) return ;

                }
                break;
            case 100 :
                // RPIExprAST.g:1:703: T__207
                {
                mT__207(); if (state.failed) return ;

                }
                break;
            case 101 :
                // RPIExprAST.g:1:710: T__208
                {
                mT__208(); if (state.failed) return ;

                }
                break;
            case 102 :
                // RPIExprAST.g:1:717: T__209
                {
                mT__209(); if (state.failed) return ;

                }
                break;
            case 103 :
                // RPIExprAST.g:1:724: T__210
                {
                mT__210(); if (state.failed) return ;

                }
                break;
            case 104 :
                // RPIExprAST.g:1:731: T__211
                {
                mT__211(); if (state.failed) return ;

                }
                break;
            case 105 :
                // RPIExprAST.g:1:738: T__212
                {
                mT__212(); if (state.failed) return ;

                }
                break;
            case 106 :
                // RPIExprAST.g:1:745: T__213
                {
                mT__213(); if (state.failed) return ;

                }
                break;
            case 107 :
                // RPIExprAST.g:1:752: T__214
                {
                mT__214(); if (state.failed) return ;

                }
                break;
            case 108 :
                // RPIExprAST.g:1:759: T__215
                {
                mT__215(); if (state.failed) return ;

                }
                break;
            case 109 :
                // RPIExprAST.g:1:766: T__216
                {
                mT__216(); if (state.failed) return ;

                }
                break;
            case 110 :
                // RPIExprAST.g:1:773: T__217
                {
                mT__217(); if (state.failed) return ;

                }
                break;
            case 111 :
                // RPIExprAST.g:1:780: T__218
                {
                mT__218(); if (state.failed) return ;

                }
                break;
            case 112 :
                // RPIExprAST.g:1:787: T__219
                {
                mT__219(); if (state.failed) return ;

                }
                break;
            case 113 :
                // RPIExprAST.g:1:794: T__220
                {
                mT__220(); if (state.failed) return ;

                }
                break;
            case 114 :
                // RPIExprAST.g:1:801: T__221
                {
                mT__221(); if (state.failed) return ;

                }
                break;
            case 115 :
                // RPIExprAST.g:1:808: T__222
                {
                mT__222(); if (state.failed) return ;

                }
                break;
            case 116 :
                // RPIExprAST.g:1:815: T__223
                {
                mT__223(); if (state.failed) return ;

                }
                break;
            case 117 :
                // RPIExprAST.g:1:822: MAXOF
                {
                mMAXOF(); if (state.failed) return ;

                }
                break;
            case 118 :
                // RPIExprAST.g:1:828: LEASTOF
                {
                mLEASTOF(); if (state.failed) return ;

                }
                break;
            case 119 :
                // RPIExprAST.g:1:836: ABS
                {
                mABS(); if (state.failed) return ;

                }
                break;
            case 120 :
                // RPIExprAST.g:1:840: IFTHEN
                {
                mIFTHEN(); if (state.failed) return ;

                }
                break;
            case 121 :
                // RPIExprAST.g:1:847: GETCURRPERIOD
                {
                mGETCURRPERIOD(); if (state.failed) return ;

                }
                break;
            case 122 :
                // RPIExprAST.g:1:861: GETBASEPERIOD
                {
                mGETBASEPERIOD(); if (state.failed) return ;

                }
                break;
            case 123 :
                // RPIExprAST.g:1:875: QTR
                {
                mQTR(); if (state.failed) return ;

                }
                break;
            case 124 :
                // RPIExprAST.g:1:879: NONZEROCOUNT
                {
                mNONZEROCOUNT(); if (state.failed) return ;

                }
                break;
            case 125 :
                // RPIExprAST.g:1:892: NONZEROAVG
                {
                mNONZEROAVG(); if (state.failed) return ;

                }
                break;
            case 126 :
                // RPIExprAST.g:1:903: AVG
                {
                mAVG(); if (state.failed) return ;

                }
                break;
            case 127 :
                // RPIExprAST.g:1:907: IFZERO
                {
                mIFZERO(); if (state.failed) return ;

                }
                break;
            case 128 :
                // RPIExprAST.g:1:914: ACCRUE
                {
                mACCRUE(); if (state.failed) return ;

                }
                break;
            case 129 :
                // RPIExprAST.g:1:921: ACCRUEFROMBASE
                {
                mACCRUEFROMBASE(); if (state.failed) return ;

                }
                break;
            case 130 :
                // RPIExprAST.g:1:936: ACCRUEFROM
                {
                mACCRUEFROM(); if (state.failed) return ;

                }
                break;
            case 131 :
                // RPIExprAST.g:1:947: SERIESAVERAGE
                {
                mSERIESAVERAGE(); if (state.failed) return ;

                }
                break;
            case 132 :
                // RPIExprAST.g:1:961: DATE
                {
                mDATE(); if (state.failed) return ;

                }
                break;
            case 133 :
                // RPIExprAST.g:1:966: XFCN
                {
                mXFCN(); if (state.failed) return ;

                }
                break;
            case 134 :
                // RPIExprAST.g:1:971: AGG
                {
                mAGG(); if (state.failed) return ;

                }
                break;
            case 135 :
                // RPIExprAST.g:1:975: CREATEGROUP
                {
                mCREATEGROUP(); if (state.failed) return ;

                }
                break;
            case 136 :
                // RPIExprAST.g:1:987: ADDPRODUCTSELECTOR
                {
                mADDPRODUCTSELECTOR(); if (state.failed) return ;

                }
                break;
            case 137 :
                // RPIExprAST.g:1:1006: SETPOSTPROCESSCLASS
                {
                mSETPOSTPROCESSCLASS(); if (state.failed) return ;

                }
                break;
            case 138 :
                // RPIExprAST.g:1:1026: SETSCENARIOUICLASS
                {
                mSETSCENARIOUICLASS(); if (state.failed) return ;

                }
                break;
            case 139 :
                // RPIExprAST.g:1:1045: SETUSERINPUTUICLASS
                {
                mSETUSERINPUTUICLASS(); if (state.failed) return ;

                }
                break;
            case 140 :
                // RPIExprAST.g:1:1065: SETPRODUCTUICLASS
                {
                mSETPRODUCTUICLASS(); if (state.failed) return ;

                }
                break;
            case 141 :
                // RPIExprAST.g:1:1083: SETMODELPROCCLASS
                {
                mSETMODELPROCCLASS(); if (state.failed) return ;

                }
                break;
            case 142 :
                // RPIExprAST.g:1:1101: SETREPORTUICLASS
                {
                mSETREPORTUICLASS(); if (state.failed) return ;

                }
                break;
            case 143 :
                // RPIExprAST.g:1:1118: PRODUCTSELECTOR
                {
                mPRODUCTSELECTOR(); if (state.failed) return ;

                }
                break;
            case 144 :
                // RPIExprAST.g:1:1134: FORECASTABLETYPE
                {
                mFORECASTABLETYPE(); if (state.failed) return ;

                }
                break;
            case 145 :
                // RPIExprAST.g:1:1151: PERIODICITY
                {
                mPERIODICITY(); if (state.failed) return ;

                }
                break;
            case 146 :
                // RPIExprAST.g:1:1163: SQL
                {
                mSQL(); if (state.failed) return ;

                }
                break;
            case 147 :
                // RPIExprAST.g:1:1167: BOOLOP_EQ
                {
                mBOOLOP_EQ(); if (state.failed) return ;

                }
                break;
            case 148 :
                // RPIExprAST.g:1:1177: BOOLOP_LT
                {
                mBOOLOP_LT(); if (state.failed) return ;

                }
                break;
            case 149 :
                // RPIExprAST.g:1:1187: BOOLOP_GT
                {
                mBOOLOP_GT(); if (state.failed) return ;

                }
                break;
            case 150 :
                // RPIExprAST.g:1:1197: BOOLOP_LE
                {
                mBOOLOP_LE(); if (state.failed) return ;

                }
                break;
            case 151 :
                // RPIExprAST.g:1:1207: BOOLOP_GE
                {
                mBOOLOP_GE(); if (state.failed) return ;

                }
                break;
            case 152 :
                // RPIExprAST.g:1:1217: AND
                {
                mAND(); if (state.failed) return ;

                }
                break;
            case 153 :
                // RPIExprAST.g:1:1221: OR
                {
                mOR(); if (state.failed) return ;

                }
                break;
            case 154 :
                // RPIExprAST.g:1:1224: NOT
                {
                mNOT(); if (state.failed) return ;

                }
                break;
            case 155 :
                // RPIExprAST.g:1:1228: AVGBASIS
                {
                mAVGBASIS(); if (state.failed) return ;

                }
                break;
            case 156 :
                // RPIExprAST.g:1:1237: CREATE_MODEL
                {
                mCREATE_MODEL(); if (state.failed) return ;

                }
                break;
            case 157 :
                // RPIExprAST.g:1:1250: DATEFORMAT
                {
                mDATEFORMAT(); if (state.failed) return ;

                }
                break;
            case 158 :
                // RPIExprAST.g:1:1261: XFCNARG
                {
                mXFCNARG(); if (state.failed) return ;

                }
                break;
            case 159 :
                // RPIExprAST.g:1:1269: AGGRULE
                {
                mAGGRULE(); if (state.failed) return ;

                }
                break;
            case 160 :
                // RPIExprAST.g:1:1277: COMPMODIFIER
                {
                mCOMPMODIFIER(); if (state.failed) return ;

                }
                break;
            case 161 :
                // RPIExprAST.g:1:1290: DBLQUOTE
                {
                mDBLQUOTE(); if (state.failed) return ;

                }
                break;
            case 162 :
                // RPIExprAST.g:1:1299: EQ
                {
                mEQ(); if (state.failed) return ;

                }
                break;
            case 163 :
                // RPIExprAST.g:1:1302: DIV
                {
                mDIV(); if (state.failed) return ;

                }
                break;
            case 164 :
                // RPIExprAST.g:1:1306: SEMICOLON
                {
                mSEMICOLON(); if (state.failed) return ;

                }
                break;
            case 165 :
                // RPIExprAST.g:1:1316: COMMA
                {
                mCOMMA(); if (state.failed) return ;

                }
                break;
            case 166 :
                // RPIExprAST.g:1:1322: NEWLINE
                {
                mNEWLINE(); if (state.failed) return ;

                }
                break;
            case 167 :
                // RPIExprAST.g:1:1330: WS
                {
                mWS(); if (state.failed) return ;

                }
                break;
            case 168 :
                // RPIExprAST.g:1:1333: ML_COMMENT
                {
                mML_COMMENT(); if (state.failed) return ;

                }
                break;
            case 169 :
                // RPIExprAST.g:1:1344: SL_COMMENT
                {
                mSL_COMMENT(); if (state.failed) return ;

                }
                break;
            case 170 :
                // RPIExprAST.g:1:1355: QUOTED_STRING
                {
                mQUOTED_STRING(); if (state.failed) return ;

                }
                break;
            case 171 :
                // RPIExprAST.g:1:1369: ID
                {
                mID(); if (state.failed) return ;

                }
                break;
            case 172 :
                // RPIExprAST.g:1:1372: COLON
                {
                mCOLON(); if (state.failed) return ;

                }
                break;
            case 173 :
                // RPIExprAST.g:1:1378: DOUBLEDOT
                {
                mDOUBLEDOT(); if (state.failed) return ;

                }
                break;
            case 174 :
                // RPIExprAST.g:1:1388: DOT
                {
                mDOT(); if (state.failed) return ;

                }
                break;
            case 175 :
                // RPIExprAST.g:1:1392: EXPONENT
                {
                mEXPONENT(); if (state.failed) return ;

                }
                break;
            case 176 :
                // RPIExprAST.g:1:1401: ASTERISK
                {
                mASTERISK(); if (state.failed) return ;

                }
                break;
            case 177 :
                // RPIExprAST.g:1:1410: AT_SIGN
                {
                mAT_SIGN(); if (state.failed) return ;

                }
                break;
            case 178 :
                // RPIExprAST.g:1:1418: RPAREN
                {
                mRPAREN(); if (state.failed) return ;

                }
                break;
            case 179 :
                // RPIExprAST.g:1:1425: LPAREN
                {
                mLPAREN(); if (state.failed) return ;

                }
                break;
            case 180 :
                // RPIExprAST.g:1:1432: RBRACK
                {
                mRBRACK(); if (state.failed) return ;

                }
                break;
            case 181 :
                // RPIExprAST.g:1:1439: LBRACK
                {
                mLBRACK(); if (state.failed) return ;

                }
                break;
            case 182 :
                // RPIExprAST.g:1:1446: PLUS
                {
                mPLUS(); if (state.failed) return ;

                }
                break;
            case 183 :
                // RPIExprAST.g:1:1451: MINUS
                {
                mMINUS(); if (state.failed) return ;

                }
                break;
            case 184 :
                // RPIExprAST.g:1:1457: PERCENTAGE
                {
                mPERCENTAGE(); if (state.failed) return ;

                }
                break;
            case 185 :
                // RPIExprAST.g:1:1468: LLABEL
                {
                mLLABEL(); if (state.failed) return ;

                }
                break;
            case 186 :
                // RPIExprAST.g:1:1475: RLABEL
                {
                mRLABEL(); if (state.failed) return ;

                }
                break;
            case 187 :
                // RPIExprAST.g:1:1482: SQL_ASSIGN
                {
                mSQL_ASSIGN(); if (state.failed) return ;

                }
                break;
            case 188 :
                // RPIExprAST.g:1:1493: ARROW
                {
                mARROW(); if (state.failed) return ;

                }
                break;
            case 189 :
                // RPIExprAST.g:1:1499: VERTBAR
                {
                mVERTBAR(); if (state.failed) return ;

                }
                break;
            case 190 :
                // RPIExprAST.g:1:1507: DOUBLEVERTBAR
                {
                mDOUBLEVERTBAR(); if (state.failed) return ;

                }
                break;
            case 191 :
                // RPIExprAST.g:1:1521: NOT_EQ
                {
                mNOT_EQ(); if (state.failed) return ;

                }
                break;
            case 192 :
                // RPIExprAST.g:1:1528: NUMBER
                {
                mNUMBER(); if (state.failed) return ;

                }
                break;
            case 193 :
                // RPIExprAST.g:1:1535: QUOTE
                {
                mQUOTE(); if (state.failed) return ;

                }
                break;
            case 194 :
                // RPIExprAST.g:1:1541: SQLSL_COMMENT
                {
                mSQLSL_COMMENT(); if (state.failed) return ;

                }
                break;
            case 195 :
                // RPIExprAST.g:1:1555: TYPE_ATTR
                {
                mTYPE_ATTR(); if (state.failed) return ;

                }
                break;
            case 196 :
                // RPIExprAST.g:1:1565: ROWTYPE_ATTR
                {
                mROWTYPE_ATTR(); if (state.failed) return ;

                }
                break;
            case 197 :
                // RPIExprAST.g:1:1578: NOTFOUND_ATTR
                {
                mNOTFOUND_ATTR(); if (state.failed) return ;

                }
                break;
            case 198 :
                // RPIExprAST.g:1:1592: FOUND_ATTR
                {
                mFOUND_ATTR(); if (state.failed) return ;

                }
                break;
            case 199 :
                // RPIExprAST.g:1:1603: ISOPEN_ATTR
                {
                mISOPEN_ATTR(); if (state.failed) return ;

                }
                break;
            case 200 :
                // RPIExprAST.g:1:1615: ROWCOUNT_ATTR
                {
                mROWCOUNT_ATTR(); if (state.failed) return ;

                }
                break;
            case 201 :
                // RPIExprAST.g:1:1629: BULK_ROWCOUNT_ATTR
                {
                mBULK_ROWCOUNT_ATTR(); if (state.failed) return ;

                }
                break;
            case 202 :
                // RPIExprAST.g:1:1648: CHARSET_ATTR
                {
                mCHARSET_ATTR(); if (state.failed) return ;

                }
                break;

        }

    }

    // $ANTLR start synpred1_RPIExprAST
    public final void synpred1_RPIExprAST_fragment() throws RecognitionException {   
        // RPIExprAST.g:1767:13: ( N POINT N )
        // RPIExprAST.g:1767:15: N POINT N
        {
        mN(); if (state.failed) return ;
        mPOINT(); if (state.failed) return ;
        mN(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_RPIExprAST

    public final boolean synpred1_RPIExprAST() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_RPIExprAST_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA19 dfa19 = new DFA19(this);
    protected DFA26 dfa26 = new DFA26(this);
    static final String DFA19_eotS =
        "\1\uffff\1\4\1\uffff\1\4\2\uffff";
    static final String DFA19_eofS =
        "\6\uffff";
    static final String DFA19_minS =
        "\2\56\1\uffff\1\56\2\uffff";
    static final String DFA19_maxS =
        "\2\71\1\uffff\1\71\2\uffff";
    static final String DFA19_acceptS =
        "\2\uffff\1\2\1\uffff\1\3\1\1";
    static final String DFA19_specialS =
        "\1\uffff\1\1\1\uffff\1\0\2\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\5\1\uffff\12\3",
            "",
            "\1\5\1\uffff\12\3",
            "",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1767:9: ( ( N POINT N )=> N POINT N | POINT N | N )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_3 = input.LA(1);

                         
                        int index19_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA19_3>='0' && LA19_3<='9')) ) {s = 3;}

                        else if ( (LA19_3=='.') && (synpred1_RPIExprAST())) {s = 5;}

                        else s = 4;

                         
                        input.seek(index19_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_1 = input.LA(1);

                         
                        int index19_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA19_1>='0' && LA19_1<='9')) ) {s = 3;}

                        else if ( (LA19_1=='.') && (synpred1_RPIExprAST())) {s = 5;}

                        else s = 4;

                         
                        input.seek(index19_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA26_eotS =
        "\3\uffff\24\63\7\uffff\1\63\2\uffff\2\63\1\u009f\1\u00a2\1\u00a5"+
        "\1\uffff\1\100\2\uffff\1\u00a9\1\u00aa\1\u00ad\3\uffff\1\u00ae\1"+
        "\uffff\1\u00af\1\uffff\1\u00b0\1\u00b3\6\uffff\1\u00b5\1\u00bd\1"+
        "\u00bf\2\uffff\6\63\1\u00c7\1\u00cb\1\u00cd\1\u00cf\1\63\1\u00d1"+
        "\13\63\1\u00e0\30\63\1\u0108\10\63\1\uffff\21\63\1\u0125\1\u0126"+
        "\1\u0128\3\63\6\uffff\1\63\2\uffff\2\63\11\uffff\1\100\31\uffff"+
        "\6\63\1\u013b\1\uffff\1\u013e\2\63\1\uffff\1\63\1\uffff\1\u0142"+
        "\1\uffff\1\u0143\1\uffff\1\u0144\1\u0145\1\u0146\1\u013b\1\u0147"+
        "\11\63\1\uffff\7\63\1\u015c\2\63\1\u0161\25\63\1\u0179\4\63\1\u0180"+
        "\1\63\1\uffff\4\63\1\u0186\5\63\1\u018c\1\u013b\3\63\1\u0190\5\63"+
        "\1\u013b\2\63\1\u013b\3\63\2\uffff\1\63\1\uffff\1\u019e\2\63\2\uffff"+
        "\1\63\2\uffff\2\63\1\uffff\4\63\1\u01af\1\u01b0\1\u01b1\1\uffff"+
        "\1\63\1\u01b4\1\uffff\3\63\6\uffff\3\63\1\u01bb\5\63\1\u01c1\1\63"+
        "\1\u01c3\10\63\2\uffff\3\63\1\uffff\1\u01cf\1\63\1\u01d1\2\63\1"+
        "\u01d4\2\63\1\u01d8\2\63\1\u01db\7\63\1\u01e3\1\u01e4\1\u01e5\1"+
        "\u01e6\1\uffff\1\63\1\u01e8\3\63\1\u01ec\1\uffff\2\63\1\u01ef\1"+
        "\u01f0\1\63\1\uffff\5\63\1\uffff\3\63\1\uffff\1\u01fa\5\63\1\u0200"+
        "\6\63\1\uffff\2\63\2\uffff\1\u020b\2\uffff\1\63\1\u0213\1\uffff"+
        "\6\63\3\uffff\2\63\1\uffff\1\u021e\5\63\1\uffff\1\u0224\1\u0225"+
        "\3\63\1\uffff\1\u0229\1\uffff\4\63\1\u022e\1\u022f\5\63\1\uffff"+
        "\1\63\1\uffff\2\63\1\uffff\1\u0238\2\63\1\uffff\1\u023b\1\u023c"+
        "\1\uffff\4\63\1\u0241\2\63\4\uffff\1\u0244\1\uffff\2\63\1\u0247"+
        "\1\uffff\1\63\1\u0249\2\uffff\2\63\1\u024c\1\u024d\2\63\1\u0250"+
        "\1\63\1\u0252\1\uffff\1\u0253\3\63\1\u0257\1\uffff\1\u0213\2\63"+
        "\1\u025a\1\63\1\u025c\2\63\11\uffff\1\63\3\uffff\1\u0264\2\63\1"+
        "\u0267\4\63\1\uffff\1\u026c\3\63\1\u0270\2\uffff\3\63\1\uffff\1"+
        "\u0274\3\63\2\uffff\1\63\1\u0279\3\63\1\u027d\1\u027e\1\63\1\uffff"+
        "\2\63\2\uffff\4\63\1\uffff\1\u0286\1\63\1\uffff\1\u0288\1\u028a"+
        "\1\uffff\1\63\1\uffff\1\63\1\u028d\2\uffff\2\63\1\uffff\1\63\2\uffff"+
        "\1\63\1\u0292\1\63\1\uffff\1\u0294\1\u0295\1\uffff\1\u0296\1\uffff"+
        "\1\u0297\1\u0299\4\uffff\1\63\1\uffff\1\63\1\u029e\1\uffff\1\u029f"+
        "\1\63\1\u02a1\1\63\1\uffff\1\u02a3\2\63\1\uffff\1\u02a6\1\63\1\u02aa"+
        "\1\uffff\1\u02ab\1\u02ac\2\63\1\uffff\1\u02af\1\u02b0\1\u02b1\2"+
        "\uffff\6\63\1\u02b8\1\uffff\1\u02b9\1\uffff\1\63\1\uffff\2\63\1"+
        "\uffff\3\63\1\u02c1\1\uffff\1\63\10\uffff\1\u0213\1\u02c8\2\uffff"+
        "\1\63\1\uffff\1\63\1\uffff\2\63\1\uffff\3\63\3\uffff\1\u02d0\1\u02d2"+
        "\3\uffff\1\u02d3\2\63\1\u02d6\2\63\2\uffff\1\63\1\u02da\1\u02db"+
        "\1\63\1\u02b8\1\u02dd\1\u02de\1\uffff\1\u02df\6\uffff\1\u02e1\1"+
        "\u02e2\1\u02e3\1\u02e4\3\63\1\uffff\1\u02e8\2\uffff\2\63\1\uffff"+
        "\1\63\1\u02ec\1\u02ed\2\uffff\1\u02ee\10\uffff\3\63\1\uffff\3\63"+
        "\3\uffff\1\u02f7\5\63\1\u02fd\2\uffff\1\63\1\u02ff\3\63\1\uffff"+
        "\1\63\1\uffff\1\u0304\2\63\1\u0307\1\uffff\2\63\1\uffff\1\u030a"+
        "\1\u030b\2\uffff";
    static final String DFA26_eofS =
        "\u030c\uffff";
    static final String DFA26_minS =
        "\1\11\2\uffff\1\101\1\106\1\107\1\114\1\105\2\101\1\105\1\110\1"+
        "\101\1\111\6\101\1\116\1\106\1\101\2\uffff\1\142\1\uffff\1\47\2"+
        "\uffff\1\106\1\162\1\145\1\125\1\105\1\75\1\74\1\75\1\uffff\1\60"+
        "\2\uffff\1\75\1\0\1\52\2\uffff\1\12\1\11\1\uffff\1\0\1\uffff\1\56"+
        "\1\52\6\uffff\1\55\1\102\1\174\2\uffff\1\105\1\115\1\101\1\117\1"+
        "\123\1\124\4\43\1\114\1\43\1\104\2\107\1\104\1\103\1\123\1\107\1"+
        "\116\2\117\1\111\1\43\1\114\1\124\1\110\1\101\1\124\2\103\1\124"+
        "\1\125\1\123\1\124\1\117\1\124\1\105\1\124\2\123\1\101\2\103\1\113"+
        "\1\111\1\101\1\114\1\43\1\102\1\105\1\125\1\101\1\114\2\101\1\126"+
        "\1\uffff\1\105\1\114\1\115\1\117\1\116\1\114\1\122\1\117\1\124\1"+
        "\114\1\123\1\116\1\104\1\130\1\117\1\111\1\104\3\43\1\124\1\126"+
        "\1\120\2\uffff\1\143\1\uffff\1\156\1\uffff\1\103\1\145\1\164\2\101"+
        "\11\uffff\1\57\20\uffff\1\117\10\uffff\1\101\1\116\1\115\1\122\1"+
        "\102\1\105\1\43\1\uffff\1\43\2\105\1\uffff\1\124\1\uffff\1\43\1"+
        "\uffff\1\43\1\uffff\5\43\1\105\1\123\1\105\1\111\1\127\1\101\1\114"+
        "\1\102\1\114\1\uffff\1\114\1\102\1\111\1\101\1\117\1\122\1\101\1"+
        "\43\1\55\1\101\1\43\1\103\2\105\1\102\1\124\1\117\1\125\1\137\1"+
        "\116\1\114\1\110\1\111\1\137\1\103\1\117\1\107\1\113\1\107\1\113"+
        "\1\120\1\105\1\43\1\123\1\114\1\117\1\125\1\43\1\114\1\uffff\1\114"+
        "\1\116\1\105\1\114\1\43\1\105\2\122\1\105\1\116\2\43\1\101\1\103"+
        "\1\123\1\43\1\115\2\103\1\125\1\114\1\43\1\105\1\124\1\43\1\127"+
        "\1\117\1\101\2\uffff\1\105\1\uffff\1\43\1\111\1\103\1\162\1\132"+
        "\1\116\1\141\1\137\2\122\1\127\2\124\2\105\3\43\1\uffff\1\107\1"+
        "\43\1\uffff\1\130\1\122\1\110\6\uffff\1\120\1\125\1\124\1\43\1\106"+
        "\1\116\1\105\1\122\1\105\1\43\1\105\1\43\1\105\2\122\1\117\1\122"+
        "\1\102\1\103\1\111\2\uffff\1\125\1\101\1\115\1\uffff\1\43\1\124"+
        "\1\43\1\114\1\111\1\43\1\120\1\102\1\43\2\105\1\43\1\124\1\111\1"+
        "\105\1\125\1\122\1\115\1\101\4\43\1\uffff\1\105\1\43\2\122\1\104"+
        "\1\43\1\uffff\1\102\1\105\2\43\1\114\1\uffff\1\103\1\124\1\105\1"+
        "\120\1\101\1\uffff\2\124\1\105\1\uffff\1\43\2\110\1\105\1\101\1"+
        "\123\1\43\1\110\1\111\1\125\1\116\1\124\1\122\1\uffff\1\116\1\123"+
        "\1\165\1\145\1\43\1\164\1\155\1\124\1\43\1\103\1\105\1\101\1\103"+
        "\1\124\1\116\1\103\3\uffff\1\105\1\123\1\uffff\1\43\1\124\1\105"+
        "\1\124\2\123\1\uffff\2\43\1\105\1\131\1\101\1\uffff\1\43\1\uffff"+
        "\1\122\1\111\1\101\1\116\2\43\1\110\1\124\1\114\1\122\1\101\1\uffff"+
        "\1\105\1\uffff\1\105\1\116\1\uffff\1\43\1\125\1\101\1\uffff\2\43"+
        "\1\uffff\1\111\1\116\1\104\1\103\1\43\1\101\1\107\4\uffff\1\43\1"+
        "\uffff\1\104\1\116\1\43\1\uffff\1\101\1\43\2\uffff\1\111\1\124\2"+
        "\43\1\117\1\122\1\43\1\111\1\43\1\uffff\1\43\1\101\1\123\1\102\1"+
        "\43\1\uffff\1\43\1\104\1\105\1\43\1\105\1\43\1\107\1\40\1\145\1"+
        "\162\1\uffff\1\145\1\157\4\uffff\1\105\3\uffff\1\43\1\116\1\124"+
        "\1\43\2\124\1\122\1\105\1\uffff\1\43\1\116\2\111\1\43\2\uffff\1"+
        "\116\1\137\1\116\1\uffff\1\43\1\103\1\114\1\101\2\uffff\1\101\1"+
        "\43\1\124\1\105\1\114\2\43\1\103\1\uffff\1\122\1\123\2\uffff\1\126"+
        "\1\124\1\125\1\124\1\uffff\1\43\1\105\1\uffff\2\43\1\uffff\1\103"+
        "\1\uffff\1\116\1\43\2\uffff\2\111\1\uffff\1\117\2\uffff\1\122\1"+
        "\43\1\105\1\uffff\2\43\1\uffff\1\43\1\uffff\1\43\1\106\1\157\1\137"+
        "\2\uffff\1\122\1\uffff\1\124\1\43\1\uffff\1\43\1\105\1\43\1\103"+
        "\1\uffff\1\43\1\117\1\126\1\uffff\1\43\1\104\1\43\1\uffff\2\43\1"+
        "\114\1\122\1\uffff\3\43\2\uffff\1\124\1\122\3\105\1\122\1\43\1\uffff"+
        "\1\43\1\uffff\1\116\1\uffff\1\113\1\124\1\uffff\1\116\1\117\1\116"+
        "\1\43\1\uffff\1\114\4\uffff\1\162\1\uffff\1\101\1\147\2\43\2\uffff"+
        "\1\122\1\uffff\1\124\1\uffff\1\116\1\105\1\uffff\1\116\1\114\1\117"+
        "\3\uffff\2\43\3\uffff\1\43\2\137\1\43\1\107\1\105\2\uffff\1\107"+
        "\2\43\1\124\3\43\1\uffff\1\43\1\157\5\uffff\4\43\1\124\1\117\1\125"+
        "\1\uffff\1\43\2\uffff\2\120\1\uffff\1\105\2\43\2\uffff\1\43\3\uffff"+
        "\1\155\4\uffff\1\105\1\101\1\102\1\uffff\2\105\1\122\3\uffff\1\102"+
        "\1\107\1\124\1\114\2\122\1\43\2\uffff\1\105\1\43\1\105\2\111\1\uffff"+
        "\1\122\1\uffff\1\43\2\117\1\43\1\uffff\2\104\1\uffff\2\43\2\uffff";
    static final String DFA26_maxS =
        "\1\175\2\uffff\1\122\1\123\1\126\1\130\1\131\1\126\1\117\1\122\1"+
        "\111\1\122\2\117\1\122\1\145\1\125\1\101\1\117\1\122\1\125\1\103"+
        "\2\uffff\1\166\1\uffff\1\157\2\uffff\1\106\1\165\1\145\1\125\1\105"+
        "\3\76\1\uffff\1\71\2\uffff\1\120\1\uffff\1\57\2\uffff\1\12\1\40"+
        "\1\uffff\1\uffff\1\uffff\1\71\1\52\6\uffff\1\55\1\124\1\174\2\uffff"+
        "\1\105\1\116\1\101\1\117\1\123\1\124\4\137\1\114\1\137\1\131\2\107"+
        "\1\104\1\111\1\123\1\124\1\116\2\117\1\111\1\137\1\115\1\124\1\114"+
        "\1\101\1\127\1\103\1\123\1\124\1\125\1\123\1\124\1\117\1\124\1\111"+
        "\1\124\2\123\1\117\1\103\1\117\1\113\1\127\1\124\1\127\1\137\1\102"+
        "\1\105\1\125\1\101\1\124\2\101\1\126\1\uffff\1\105\1\114\1\115\1"+
        "\117\1\116\1\114\1\122\1\117\1\124\1\122\1\123\2\116\1\130\1\117"+
        "\1\111\1\104\3\137\1\124\1\126\1\120\2\uffff\1\143\1\uffff\1\156"+
        "\1\uffff\1\103\1\145\1\164\2\101\11\uffff\1\57\20\uffff\1\117\10"+
        "\uffff\1\101\1\123\1\115\1\122\1\102\1\105\1\137\1\uffff\1\137\2"+
        "\105\1\uffff\1\124\1\uffff\1\137\1\uffff\1\137\1\uffff\5\137\1\114"+
        "\1\123\2\111\1\127\1\101\1\114\1\102\1\114\1\uffff\1\114\1\105\1"+
        "\125\1\101\1\117\1\122\1\101\1\137\1\55\1\101\1\137\1\103\2\105"+
        "\1\102\1\124\1\117\1\125\1\137\1\122\1\114\1\110\1\111\1\137\1\104"+
        "\1\117\1\107\1\113\1\107\1\113\1\120\1\105\1\137\1\123\1\114\1\117"+
        "\1\125\1\137\1\114\1\uffff\1\114\1\116\1\105\1\114\1\137\1\105\2"+
        "\122\1\105\1\116\2\137\1\101\1\103\1\123\1\137\1\115\2\103\1\125"+
        "\1\114\1\137\1\105\1\124\1\137\1\127\1\121\1\101\2\uffff\1\105\1"+
        "\uffff\1\137\1\111\1\103\1\162\1\132\1\116\1\141\1\137\2\122\1\127"+
        "\2\124\1\105\1\111\3\137\1\uffff\1\122\1\137\1\uffff\1\130\1\122"+
        "\1\110\6\uffff\1\120\1\125\1\124\1\137\1\106\1\116\1\105\1\122\1"+
        "\105\1\137\1\105\1\137\1\105\2\122\1\117\1\122\1\102\1\103\1\111"+
        "\2\uffff\1\125\1\101\1\115\1\uffff\1\137\1\124\1\137\1\114\1\111"+
        "\1\137\1\120\1\103\1\137\2\105\1\137\1\124\1\111\1\105\1\125\1\122"+
        "\1\115\1\101\4\137\1\uffff\1\105\1\137\2\122\1\104\1\137\1\uffff"+
        "\1\102\1\105\2\137\1\114\1\uffff\1\103\1\124\1\105\1\120\1\101\1"+
        "\uffff\2\124\1\105\1\uffff\1\137\2\110\1\105\1\101\1\123\1\137\1"+
        "\110\1\111\1\125\1\116\1\124\1\122\1\uffff\1\116\1\123\1\165\1\145"+
        "\1\137\1\164\1\165\1\124\1\137\1\124\1\105\1\101\1\103\1\124\1\116"+
        "\1\103\3\uffff\1\105\1\123\1\uffff\1\137\1\124\1\105\1\124\2\123"+
        "\1\uffff\2\137\1\105\1\131\1\101\1\uffff\1\137\1\uffff\1\122\1\111"+
        "\1\101\1\116\2\137\1\110\1\124\1\114\1\122\1\101\1\uffff\1\105\1"+
        "\uffff\1\105\1\116\1\uffff\1\137\1\125\1\101\1\uffff\2\137\1\uffff"+
        "\1\111\1\116\1\104\1\103\1\137\1\101\1\107\4\uffff\1\137\1\uffff"+
        "\1\104\1\116\1\137\1\uffff\1\101\1\137\2\uffff\1\111\1\124\2\137"+
        "\1\117\1\122\1\137\1\111\1\137\1\uffff\1\137\1\101\1\123\1\102\1"+
        "\137\1\uffff\1\137\1\104\1\105\1\137\1\105\1\137\1\107\1\40\1\145"+
        "\1\162\1\uffff\1\145\1\162\4\uffff\1\105\3\uffff\1\137\1\116\1\124"+
        "\1\137\2\124\1\122\1\105\1\uffff\1\137\1\116\2\111\1\137\2\uffff"+
        "\1\116\1\137\1\116\1\uffff\1\137\1\103\1\114\1\101\2\uffff\1\101"+
        "\1\137\1\124\1\105\1\114\2\137\1\103\1\uffff\1\122\1\123\2\uffff"+
        "\1\126\1\124\1\125\1\124\1\uffff\1\137\1\105\1\uffff\2\137\1\uffff"+
        "\1\103\1\uffff\1\116\1\137\2\uffff\2\111\1\uffff\1\117\2\uffff\1"+
        "\122\1\137\1\105\1\uffff\2\137\1\uffff\1\137\1\uffff\1\137\1\106"+
        "\1\157\1\137\2\uffff\1\122\1\uffff\1\124\1\137\1\uffff\1\137\1\105"+
        "\1\137\1\103\1\uffff\1\137\1\117\1\126\1\uffff\1\137\1\111\1\137"+
        "\1\uffff\2\137\1\114\1\122\1\uffff\3\137\2\uffff\1\124\1\122\3\105"+
        "\1\122\1\137\1\uffff\1\137\1\uffff\1\116\1\uffff\1\113\1\124\1\uffff"+
        "\1\116\1\117\1\116\1\137\1\uffff\1\114\4\uffff\1\162\1\uffff\1\103"+
        "\1\155\2\137\2\uffff\1\122\1\uffff\1\124\1\uffff\1\116\1\105\1\uffff"+
        "\1\116\1\114\1\117\3\uffff\2\137\3\uffff\4\137\1\107\1\105\2\uffff"+
        "\1\107\2\137\1\124\3\137\1\uffff\1\137\1\157\5\uffff\4\137\1\124"+
        "\1\117\1\125\1\uffff\1\137\2\uffff\2\120\1\uffff\1\105\2\137\2\uffff"+
        "\1\137\3\uffff\1\155\4\uffff\1\105\1\101\1\102\1\uffff\2\105\1\122"+
        "\3\uffff\1\102\1\107\1\124\1\114\2\122\1\137\2\uffff\1\105\1\137"+
        "\1\105\2\111\1\uffff\1\122\1\uffff\1\137\2\117\1\137\1\uffff\2\104"+
        "\1\uffff\2\137\2\uffff";
    static final String DFA26_acceptS =
        "\1\uffff\1\1\1\2\24\uffff\1\165\1\166\1\uffff\1\173\1\uffff\1\177"+
        "\1\u0084\10\uffff\1\u009b\1\uffff\1\u009d\1\u009e\3\uffff\1\u00a4"+
        "\1\u00a5\2\uffff\1\u00a7\1\uffff\1\u00ab\2\uffff\1\u00b1\1\u00b2"+
        "\1\u00b3\1\u00b4\1\u00b5\1\u00b6\3\uffff\1\u00bf\1\u00c0\71\uffff"+
        "\1\u0083\27\uffff\1\167\1\176\1\uffff\1\u0088\1\uffff\1\u00aa\5"+
        "\uffff\1\u0093\1\u00bc\1\u00a2\1\u0096\1\u00b9\1\u0094\1\u0097\1"+
        "\u00ba\1\u0095\1\uffff\1\u00bb\1\u00a0\1\u00ac\1\u00a1\1\u00a8\1"+
        "\u00a9\1\u00a3\1\u00a6\1\u00c1\1\u00ae\1\u00ad\1\u00af\1\u00b0\1"+
        "\u00c2\1\u00b7\1\u00c3\1\uffff\1\u00c5\1\u00c6\1\u00c7\1\u00c9\1"+
        "\u00ca\1\u00b8\1\u00be\1\u00bd\7\uffff\1\4\3\uffff\1\65\1\uffff"+
        "\1\101\1\uffff\1\5\1\uffff\1\134\16\uffff\1\73\47\uffff\1\34\34"+
        "\uffff\1\71\1\115\1\uffff\1\u0099\22\uffff\1\u009f\2\uffff\1\37"+
        "\3\uffff\1\126\1\106\1\137\1\u0098\1\u0086\1\6\24\uffff\1\u009a"+
        "\1\u008f\3\uffff\1\27\27\uffff\1\31\6\uffff\1\145\5\uffff\1\46\5"+
        "\uffff\1\u0092\3\uffff\1\77\15\uffff\1\154\20\uffff\1\44\1\60\1"+
        "\133\2\uffff\1\107\6\uffff\1\102\5\uffff\1\57\1\uffff\1\11\13\uffff"+
        "\1\127\1\uffff\1\33\2\uffff\1\15\3\uffff\1\16\2\uffff\1\35\7\uffff"+
        "\1\30\1\143\1\153\1\125\1\uffff\1\42\3\uffff\1\122\2\uffff\1\74"+
        "\1\75\11\uffff\1\110\5\uffff\1\144\12\uffff\1\u0085\2\uffff\1\u008a"+
        "\1\u008b\1\u008d\1\u008e\1\uffff\1\u0091\1\u00c4\1\u00c8\10\uffff"+
        "\1\72\5\uffff\1\152\1\7\3\uffff\1\62\4\uffff\1\51\1\61\10\uffff"+
        "\1\121\2\uffff\1\116\1\164\4\uffff\1\132\2\uffff\1\157\2\uffff\1"+
        "\63\1\uffff\1\70\2\uffff\1\117\1\146\2\uffff\1\41\1\uffff\1\76\1"+
        "\142\3\uffff\1\114\2\uffff\1\112\1\uffff\1\124\4\uffff\1\u0089\1"+
        "\u008c\1\uffff\1\3\2\uffff\1\100\4\uffff\1\140\3\uffff\1\135\3\uffff"+
        "\1\24\4\uffff\1\130\3\uffff\1\136\1\43\7\uffff\1\156\1\uffff\1\160"+
        "\1\uffff\1\161\2\uffff\1\103\4\uffff\1\141\1\uffff\1\64\1\105\1"+
        "\123\1\111\1\uffff\1\u0080\4\uffff\1\120\1\151\1\uffff\1\36\1\uffff"+
        "\1\170\2\uffff\1\131\3\uffff\1\32\1\25\1\22\2\uffff\1\12\1\13\1"+
        "\26\6\uffff\1\u0090\1\155\7\uffff\1\47\2\uffff\1\174\1\175\1\u0087"+
        "\1\u009c\1\10\7\uffff\1\54\1\uffff\1\52\1\104\2\uffff\1\23\3\uffff"+
        "\1\163\1\40\1\uffff\1\67\1\50\1\55\1\uffff\1\45\1\113\1\14\1\147"+
        "\3\uffff\1\53\3\uffff\1\66\1\162\1\150\7\uffff\1\u0081\1\u0082\5"+
        "\uffff\1\56\1\uffff\1\20\4\uffff\1\21\2\uffff\1\17\2\uffff\1\171"+
        "\1\172";
    static final String DFA26_specialS =
        "\53\uffff\1\1\6\uffff\1\0\u02d9\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\61\1\60\2\uffff\1\57\22\uffff\1\61\1\77\1\53\2\uffff\1\75"+
            "\1\uffff\1\62\1\70\1\67\1\65\1\73\1\56\1\74\1\64\1\54\2\47\10"+
            "\100\1\52\1\55\1\44\1\43\1\45\1\uffff\1\66\1\5\1\7\1\3\1\11"+
            "\1\6\1\21\1\12\1\26\1\4\2\63\1\15\1\23\1\10\1\25\1\14\1\41\1"+
            "\16\1\20\1\17\1\24\1\22\1\13\1\36\1\42\1\63\1\72\1\uffff\1\71"+
            "\1\77\2\uffff\1\31\1\uffff\1\37\1\35\1\uffff\1\46\1\uffff\1"+
            "\46\1\34\2\uffff\1\30\1\27\1\33\1\uffff\1\51\1\32\1\uffff\1"+
            "\40\1\50\6\uffff\1\1\1\76\1\2",
            "",
            "",
            "\1\105\6\uffff\1\103\3\uffff\1\104\1\uffff\1\106\1\102\2\uffff"+
            "\1\101",
            "\1\111\7\uffff\1\110\4\uffff\1\107",
            "\1\116\4\uffff\1\113\1\uffff\1\115\4\uffff\1\112\1\114\1\uffff"+
            "\1\117",
            "\1\122\1\uffff\1\120\11\uffff\1\121",
            "\1\123\1\127\2\uffff\1\124\2\uffff\1\126\2\uffff\1\125\11\uffff"+
            "\1\130",
            "\1\132\1\uffff\1\133\1\136\12\uffff\1\135\5\uffff\1\131\1\134",
            "\1\140\3\uffff\1\137\3\uffff\1\142\5\uffff\1\141",
            "\1\145\11\uffff\1\143\2\uffff\1\144",
            "\1\146\1\147",
            "\1\153\12\uffff\1\151\2\uffff\1\150\2\uffff\1\152",
            "\1\155\5\uffff\1\154",
            "\1\156\3\uffff\1\157\11\uffff\1\160",
            "\1\162\6\uffff\1\163\6\uffff\1\161\2\uffff\1\164",
            "\1\171\1\uffff\1\173\1\uffff\1\166\2\uffff\1\170\4\uffff\1"+
            "\165\3\uffff\1\174\2\uffff\1\167\1\175\17\uffff\1\172",
            "\1\u0080\3\uffff\1\u0083\6\uffff\1\176\2\uffff\1\u0081\2\uffff"+
            "\1\u0082\2\uffff\1\177",
            "\1\u0084",
            "\1\u0088\7\uffff\1\u0086\2\uffff\1\u0085\2\uffff\1\u0087",
            "\1\u008a\1\uffff\1\u008b\1\uffff\1\u0089",
            "\1\u008c\7\uffff\1\u008d\3\uffff\1\u008e\2\uffff\1\u008f",
            "\1\u0090\1\uffff\1\u0091",
            "",
            "",
            "\1\u0092\1\u0094\1\u0095\7\uffff\1\46\11\uffff\1\u0093",
            "",
            "\1\u0097\107\uffff\1\u0096",
            "",
            "",
            "\1\u0098",
            "\1\u0099\2\uffff\1\51",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d\1\u009e",
            "\1\u00a1\1\u00a0\1\77",
            "\1\u00a3\1\u00a4",
            "",
            "\12\u00a6",
            "",
            "",
            "\1\u00a7\4\uffff\1\u00a8\15\uffff\1\u00a8",
            "\0\63",
            "\1\u00ab\4\uffff\1\u00ac",
            "",
            "",
            "\1\60",
            "\2\61\2\uffff\1\61\22\uffff\1\61",
            "",
            "\0\u0097",
            "",
            "\1\u00b1\1\uffff\12\100",
            "\1\u00b2",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00b4",
            "\1\u00bb\1\u00bc\2\uffff\1\u00b9\2\uffff\1\u00ba\4\uffff\1"+
            "\u00b8\3\uffff\1\u00b7\1\uffff\1\u00b6",
            "\1\u00be",
            "",
            "",
            "\1\u00c0",
            "\1\u00c2\1\u00c1",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\2\63\13\uffff\12\63\7\uffff\3\63\1\u00c9\16\63\1\u00ca\1\u00c8"+
            "\6\63\4\uffff\1\63",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\u00cc",
            "\2\63\13\uffff\12\63\7\uffff\2\63\1\u00ce\27\63\4\uffff\1\63",
            "\1\u00d0",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u00d3\24\uffff\1\u00d2",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7\5\uffff\1\u00d8",
            "\1\u00d9",
            "\1\u00da\14\uffff\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u00e1\1\u00e2",
            "\1\u00e3",
            "\1\u00e4\3\uffff\1\u00e5",
            "\1\u00e6",
            "\1\u00e8\2\uffff\1\u00e7",
            "\1\u00e9",
            "\1\u00eb\2\uffff\1\u00ea\5\uffff\1\u00ed\6\uffff\1\u00ec",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4\3\uffff\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00fb\7\uffff\1\u00fa\5\uffff\1\u00f9",
            "\1\u00fc",
            "\1\u00fe\12\uffff\1\u00fd\1\u00ff",
            "\1\u0100",
            "\1\u0102\15\uffff\1\u0101",
            "\1\u0103\1\uffff\1\u0104\20\uffff\1\u0105",
            "\1\u0107\12\uffff\1\u0106",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010e\7\uffff\1\u010d",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011c\5\uffff\1\u011b",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f\11\uffff\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\2\63\13\uffff\12\63\7\uffff\3\63\1\u0127\26\63\4\uffff\1\63",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "",
            "",
            "\1\u012c",
            "",
            "\1\u012d",
            "",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\50",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0133",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0134",
            "\1\u0136\4\uffff\1\u0135",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "",
            "\2\63\13\uffff\12\63\7\uffff\4\63\1\u013c\11\63\1\u013d\13"+
            "\63\4\uffff\1\63",
            "\1\u013f",
            "\1\u0140",
            "",
            "\1\u0141",
            "",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u0148\6\uffff\1\u0149",
            "\1\u014a",
            "\1\u014b\3\uffff\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "",
            "\1\u0153",
            "\1\u0154\2\uffff\1\u0155",
            "\1\u0157\13\uffff\1\u0156",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u015d",
            "\1\u015e",
            "\2\63\13\uffff\12\63\7\uffff\10\63\1\u0160\2\63\1\u015f\16"+
            "\63\4\uffff\1\63",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a\3\uffff\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\2\63\13\uffff\12\63\7\uffff\10\63\1\u017e\11\63\1\u017f\7"+
            "\63\4\uffff\1\63",
            "\1\u0181",
            "",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\2\63\13\uffff\12\63\7\uffff\24\63\1\u0196\5\63\4\uffff\1\63",
            "\1\u0197",
            "\1\u0198",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u0199",
            "\1\u019b\1\uffff\1\u019a",
            "\1\u019c",
            "",
            "",
            "\1\u019d",
            "",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u019f",
            "\1\u01a0",
            "\1\u01a1",
            "\1\u01a2",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "\1\u01a8",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "\1\u01ad\3\uffff\1\u01ac",
            "\2\63\13\uffff\12\63\7\uffff\1\u01ae\31\63\4\uffff\1\63",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "",
            "\1\u01b2\12\uffff\1\u01b3",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u01b8",
            "\1\u01b9",
            "\1\u01ba",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u01bc",
            "\1\u01bd",
            "\1\u01be",
            "\1\u01bf",
            "\1\u01c0",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u01c2",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u01c4",
            "\1\u01c5",
            "\1\u01c6",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c9",
            "\1\u01ca",
            "\1\u01cb",
            "",
            "",
            "\1\u01cc",
            "\1\u01cd",
            "\1\u01ce",
            "",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u01d0",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u01d2",
            "\1\u01d3",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u01d5",
            "\1\u01d7\1\u01d6",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u01d9",
            "\1\u01da",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u01dc",
            "\1\u01dd",
            "\1\u01de",
            "\1\u01df",
            "\1\u01e0",
            "\1\u01e1",
            "\1\u01e2",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "",
            "\1\u01e7",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u01e9",
            "\1\u01ea",
            "\1\u01eb",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "",
            "\1\u01ed",
            "\1\u01ee",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u01f1",
            "",
            "\1\u01f2",
            "\1\u01f3",
            "\1\u01f4",
            "\1\u01f5",
            "\1\u01f6",
            "",
            "\1\u01f7",
            "\1\u01f8",
            "\1\u01f9",
            "",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u01fb",
            "\1\u01fc",
            "\1\u01fd",
            "\1\u01fe",
            "\1\u01ff",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u0201",
            "\1\u0202",
            "\1\u0203",
            "\1\u0204",
            "\1\u0205",
            "\1\u0206",
            "",
            "\1\u0207",
            "\1\u0208",
            "\1\u0209",
            "\1\u020a",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u020c",
            "\1\u0210\2\uffff\1\u020d\1\uffff\1\u0211\1\u020e\1\uffff\1"+
            "\u020f",
            "\1\u0212",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u0215\20\uffff\1\u0214",
            "\1\u0216",
            "\1\u0217",
            "\1\u0218",
            "\1\u0219",
            "\1\u021a",
            "\1\u021b",
            "",
            "",
            "",
            "\1\u021c",
            "\1\u021d",
            "",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u021f",
            "\1\u0220",
            "\1\u0221",
            "\1\u0222",
            "\1\u0223",
            "",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u0226",
            "\1\u0227",
            "\1\u0228",
            "",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "",
            "\1\u022a",
            "\1\u022b",
            "\1\u022c",
            "\1\u022d",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u0230",
            "\1\u0231",
            "\1\u0232",
            "\1\u0233",
            "\1\u0234",
            "",
            "\1\u0235",
            "",
            "\1\u0236",
            "\1\u0237",
            "",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u0239",
            "\1\u023a",
            "",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "",
            "\1\u023d",
            "\1\u023e",
            "\1\u023f",
            "\1\u0240",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u0242",
            "\1\u0243",
            "",
            "",
            "",
            "",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "",
            "\1\u0245",
            "\1\u0246",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "",
            "\1\u0248",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "",
            "",
            "\1\u024a",
            "\1\u024b",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u024e",
            "\1\u024f",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u0251",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u0254",
            "\1\u0255",
            "\1\u0256",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u0258",
            "\1\u0259",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u025b",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u025d",
            "\1\u015d",
            "\1\u025e",
            "\1\u025f",
            "",
            "\1\u0260",
            "\1\u0261\2\uffff\1\u0262",
            "",
            "",
            "",
            "",
            "\1\u0263",
            "",
            "",
            "",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u0265",
            "\1\u0266",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u0268",
            "\1\u0269",
            "\1\u026a",
            "\1\u026b",
            "",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u026d",
            "\1\u026e",
            "\1\u026f",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "",
            "",
            "\1\u0271",
            "\1\u0272",
            "\1\u0273",
            "",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u0275",
            "\1\u0276",
            "\1\u0277",
            "",
            "",
            "\1\u0278",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u027a",
            "\1\u027b",
            "\1\u027c",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u027f",
            "",
            "\1\u0280",
            "\1\u0281",
            "",
            "",
            "\1\u0282",
            "\1\u0283",
            "\1\u0284",
            "\1\u0285",
            "",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u0287",
            "",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\2\63\13\uffff\12\63\7\uffff\10\63\1\u0289\21\63\4\uffff\1"+
            "\63",
            "",
            "\1\u028b",
            "",
            "\1\u028c",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "",
            "",
            "\1\u028e",
            "\1\u028f",
            "",
            "\1\u0290",
            "",
            "",
            "\1\u0291",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u0293",
            "",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u0298",
            "\1\u029a",
            "\1\u029b",
            "",
            "",
            "\1\u029c",
            "",
            "\1\u029d",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u02a0",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u02a2",
            "",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u02a4",
            "\1\u02a5",
            "",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u02a9\1\uffff\1\u02a8\2\uffff\1\u02a7",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u02ad",
            "\1\u02ae",
            "",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "",
            "",
            "\1\u02b2",
            "\1\u02b3",
            "\1\u02b4",
            "\1\u02b5",
            "\1\u02b6",
            "\1\u02b7",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "",
            "\1\u02ba",
            "",
            "\1\u02bb",
            "\1\u02bc",
            "",
            "\1\u02bd",
            "\1\u02be",
            "\1\u02bf",
            "\2\63\13\uffff\2\63\1\u02c0\7\63\7\uffff\32\63\4\uffff\1\63",
            "",
            "\1\u02c2",
            "",
            "",
            "",
            "",
            "\1\u02c3",
            "",
            "\1\u02c5\1\uffff\1\u02c4",
            "\1\u02c6\5\uffff\1\u02c7",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "",
            "",
            "\1\u02c9",
            "",
            "\1\u02ca",
            "",
            "\1\u02cb",
            "\1\u02cc",
            "",
            "\1\u02cd",
            "\1\u02ce",
            "\1\u02cf",
            "",
            "",
            "",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\2\63\13\uffff\2\63\1\u02d1\7\63\7\uffff\32\63\4\uffff\1\63",
            "",
            "",
            "",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u02d4",
            "\1\u02d5",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u02d7",
            "\1\u02d8",
            "",
            "",
            "\1\u02d9",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u02dc",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u02e0",
            "",
            "",
            "",
            "",
            "",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u02e5",
            "\1\u02e6",
            "\1\u02e7",
            "",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "",
            "",
            "\1\u02e9",
            "\1\u02ea",
            "",
            "\1\u02eb",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "",
            "",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "",
            "",
            "",
            "\1\u02ef",
            "",
            "",
            "",
            "",
            "\1\u02f0",
            "\1\u02f1",
            "\1\u02f2",
            "",
            "\1\u02f3",
            "\1\u02f4",
            "\1\u02f5",
            "",
            "",
            "",
            "\1\u02f6",
            "\1\u02f8",
            "\1\u02f9",
            "\1\u02fa",
            "\1\u02fb",
            "\1\u02fc",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "",
            "",
            "\1\u02fe",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u0300",
            "\1\u0301",
            "\1\u0302",
            "",
            "\1\u0303",
            "",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\1\u0305",
            "\1\u0306",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "",
            "\1\u0308",
            "\1\u0309",
            "",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "\2\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63",
            "",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | T__168 | T__169 | T__170 | T__171 | T__172 | T__173 | T__174 | T__175 | T__176 | T__177 | T__178 | T__179 | T__180 | T__181 | T__182 | T__183 | T__184 | T__185 | T__186 | T__187 | T__188 | T__189 | T__190 | T__191 | T__192 | T__193 | T__194 | T__195 | T__196 | T__197 | T__198 | T__199 | T__200 | T__201 | T__202 | T__203 | T__204 | T__205 | T__206 | T__207 | T__208 | T__209 | T__210 | T__211 | T__212 | T__213 | T__214 | T__215 | T__216 | T__217 | T__218 | T__219 | T__220 | T__221 | T__222 | T__223 | MAXOF | LEASTOF | ABS | IFTHEN | GETCURRPERIOD | GETBASEPERIOD | QTR | NONZEROCOUNT | NONZEROAVG | AVG | IFZERO | ACCRUE | ACCRUEFROMBASE | ACCRUEFROM | SERIESAVERAGE | DATE | XFCN | AGG | CREATEGROUP | ADDPRODUCTSELECTOR | SETPOSTPROCESSCLASS | SETSCENARIOUICLASS | SETUSERINPUTUICLASS | SETPRODUCTUICLASS | SETMODELPROCCLASS | SETREPORTUICLASS | PRODUCTSELECTOR | FORECASTABLETYPE | PERIODICITY | SQL | BOOLOP_EQ | BOOLOP_LT | BOOLOP_GT | BOOLOP_LE | BOOLOP_GE | AND | OR | NOT | AVGBASIS | CREATE_MODEL | DATEFORMAT | XFCNARG | AGGRULE | COMPMODIFIER | DBLQUOTE | EQ | DIV | SEMICOLON | COMMA | NEWLINE | WS | ML_COMMENT | SL_COMMENT | QUOTED_STRING | ID | COLON | DOUBLEDOT | DOT | EXPONENT | ASTERISK | AT_SIGN | RPAREN | LPAREN | RBRACK | LBRACK | PLUS | MINUS | PERCENTAGE | LLABEL | RLABEL | SQL_ASSIGN | ARROW | VERTBAR | DOUBLEVERTBAR | NOT_EQ | NUMBER | QUOTE | SQLSL_COMMENT | TYPE_ATTR | ROWTYPE_ATTR | NOTFOUND_ATTR | FOUND_ATTR | ISOPEN_ATTR | ROWCOUNT_ATTR | BULK_ROWCOUNT_ATTR | CHARSET_ATTR );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_50 = input.LA(1);

                        s = -1;
                        if ( ((LA26_50>='\u0000' && LA26_50<='\uFFFF')) ) {s = 151;}

                        else s = 175;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA26_43 = input.LA(1);

                        s = -1;
                        if ( ((LA26_43>='\u0000' && LA26_43<='\uFFFF')) ) {s = 51;}

                        else s = 170;

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}