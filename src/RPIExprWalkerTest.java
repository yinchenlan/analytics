import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.Tree;


public class RPIExprWalkerTest {

	public static void main(String[] args) throws Exception {	
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String inp = null;
		Map nameToValueMemory  = new HashMap();
		Map nameToSQLMemory = new HashMap();
                Map<String, String> connectionMemory = new HashMap();		
		Map<String, List<String>> limits = new HashMap<String, List<String>>();
		try {			
			while((inp = in.readLine()) != null) {
				if (inp.trim().length() == 0) {
					continue;
				}
				ANTLRStringStream input = new ANTLRStringStream(inp);
				RPIExprASTLexer lexer = new RPIExprASTLexer(input);
		        CommonTokenStream tokens = new CommonTokenStream(lexer);
		        RPIExprASTParser parser = new RPIExprASTParser(tokens);
	        	RPIExprASTParser.stat_return result = parser.stat();
	        	Tree t = (Tree) result.getTree();
	        	CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
	        	nodes.setTokenStream(tokens);	        	
	        	RPIExprWalker exprWalker = new RPIExprWalker(nodes);
	        	exprWalker.setValueMemory(nameToValueMemory);
	        	exprWalker.setSQLMemory(nameToSQLMemory);
	        	exprWalker.setLimits(limits);
                        exprWalker.setConnectionMemory(connectionMemory);
	        	RPIExprWalker.stat_return val = exprWalker.stat(true, null, null);	        	
	        	String varName = ((Tree)val.getTree()).getChild(0).toString();	        	
	        	if (val.calculatePeriodByPeriod) {
	        		List<String> inputDims = val.inputDims;
	        		Tuples currTuples = (Tuples) nameToValueMemory.get(varName);
	        		if (currTuples == null) {
	        			currTuples = Tuples.createTuples(limits, inputDims);
	        			currTuples.sortBy(inputDims);
	        			nameToValueMemory.put(varName, currTuples);
	        		}
	        		List<String> periods = new ArrayList<String>(limits.get("PERIOD"));
	        		Collections.sort(periods);
	        		for (int idx = 0; idx < periods.size(); idx++) {
	        			nodes = new CommonTreeNodeStream(t);
	    	        	nodes.setTokenStream(tokens);
	    	        	exprWalker = new RPIExprWalker(nodes);
	    	        	exprWalker.setValueMemory(nameToValueMemory);
	    	        	exprWalker.setSQLMemory(nameToSQLMemory);
	    	        	exprWalker.setLimits(limits);
                                exprWalker.setConnectionMemory(connectionMemory);
	        			val = exprWalker.stat(false, periods.get(idx), null);
	        		}
	        	} else {
	        		nodes = new CommonTreeNodeStream(t);
		        	nodes.setTokenStream(tokens);
		        	exprWalker = new RPIExprWalker(nodes);
		        	exprWalker.setValueMemory(nameToValueMemory);
		        	exprWalker.setSQLMemory(nameToSQLMemory);
		        	exprWalker.setLimits(limits);
                                exprWalker.setConnectionMemory(connectionMemory);
	        		val = exprWalker.stat(false, null, null);
	        	}
			}			
		} catch (Exception e) {			
			e.printStackTrace();
			System.exit(0);
		} finally {
			in.close();
		}
	}
}
