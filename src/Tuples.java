import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * A set of tuples represents an OLAP cube.
 * @author clan
 *
 */
public class Tuples {
	
	public static final String SUM = "SUM";
	public static final String MIN = "MIN";
	public static final String MAX = "MAX";
	public static final String CNT = "CNT";
	
	public List<String> dimensions;
	public List<Tuple> tuples;

	public Tuples(List<String> dimensions) {
		this.dimensions = dimensions;
		tuples = new ArrayList<Tuple>();
	}

	public Tuples add(Tuples other, List<String> inputDims, Map<String, List<String>> limits, String calcPeriod, String aggRule) {
		Tuples self = createTuples(limits, aggregate(this, inputDims, aggRule), inputDims);
		Tuples ot = createTuples(limits, aggregate(other, inputDims, aggRule), inputDims);
		Tuples result = createTuples(limits, inputDims);
		result.sortBy(inputDims);
		for (int idx = 0; idx < self.tuples.size(); idx++) {
			Tuple tuple = result.tuples.get(idx);
			if ((calcPeriod != null) && !calcPeriod.equals(tuple.map.get("PERIOD"))) {
				continue;
			}
			BigDecimal selfVal = (BigDecimal)self.tuples.get(idx).map.get("VALUE");
			if (selfVal == null) {
				selfVal = new BigDecimal(0);
			}
			BigDecimal otherVal = (BigDecimal)ot.tuples.get(idx).map.get("VALUE");
			if (otherVal == null) {
				otherVal = new BigDecimal(0);
			}
			BigDecimal value = selfVal.add(otherVal).setScale(10, BigDecimal.ROUND_HALF_UP).setScale(10, BigDecimal.ROUND_HALF_UP);				
			tuple.map.put("VALUE", value);
		}
		return result;
	}

	public Tuples subtract(Tuples other, List<String> inputDims, Map<String, List<String>> limits, String calcPeriod, String aggRule) {
		Tuples self = createTuples(limits, aggregate(this, inputDims, aggRule), inputDims);
		Tuples ot = createTuples(limits, aggregate(other, inputDims, aggRule), inputDims);
		Tuples result = createTuples(limits, inputDims);
		result.sortBy(inputDims);
		for (int idx = 0; idx < self.tuples.size(); idx++) {
			Tuple tuple = result.tuples.get(idx);
			if ((calcPeriod != null) && !calcPeriod.equals(tuple.map.get("PERIOD"))) {
				continue;
			}
			BigDecimal selfVal = (BigDecimal)self.tuples.get(idx).map.get("VALUE");
			if (selfVal == null) {
				selfVal = new BigDecimal(0);
			}
			BigDecimal otherVal = (BigDecimal)ot.tuples.get(idx).map.get("VALUE");
			if (otherVal == null) {
				otherVal = new BigDecimal(0);
			}
			BigDecimal value = selfVal.subtract(otherVal).setScale(10, BigDecimal.ROUND_HALF_UP).setScale(10, BigDecimal.ROUND_HALF_UP);
			tuple.map.put("VALUE", value);
		}
		return result;
	}

	public Tuples multiply(Tuples other, List<String> inputDims, Map<String, List<String>> limits, String calcPeriod, String aggRule) {
		Tuples self = createTuples(limits, aggregate(this, inputDims, aggRule), inputDims);
		Tuples ot = createTuples(limits, aggregate(other, inputDims, aggRule), inputDims);
		Tuples result = createTuples(limits, inputDims);
		result.sortBy(inputDims);
		for (int idx = 0; idx < self.tuples.size(); idx++) {
			Tuple tuple = result.tuples.get(idx);
			if ((calcPeriod != null) && !calcPeriod.equals(tuple.map.get("PERIOD"))) {
				continue;
			}
			BigDecimal selfVal = (BigDecimal)self.tuples.get(idx).map.get("VALUE");
			if (selfVal == null) {
				selfVal = new BigDecimal(0);
			}
			BigDecimal otherVal = (BigDecimal)ot.tuples.get(idx).map.get("VALUE");
			if (otherVal == null) {
				otherVal = new BigDecimal(0);
			}
			BigDecimal value = selfVal.setScale(10, BigDecimal.ROUND_HALF_UP).multiply(otherVal.setScale(10, BigDecimal.ROUND_HALF_UP)).setScale(10, BigDecimal.ROUND_HALF_UP).setScale(10, BigDecimal.ROUND_HALF_UP);	
			tuple.map.put("VALUE", value);
		}
		return result;
	}
	
	public static Tuples combine(Tuples t1, Tuples t2) {
		return null;
	}

	public Tuples divide(Tuples other, List<String> inputDims, Map<String, List<String>> limits, String calcPeriod, String aggRule) {
		Tuples self = createTuples(limits, aggregate(this, inputDims, aggRule), inputDims);
		Tuples ot = createTuples(limits, aggregate(other, inputDims, aggRule), inputDims);
		Tuples result = createTuples(limits, inputDims);
		result.sortBy(inputDims);
		for (int idx = 0; idx < self.tuples.size(); idx++) {
			Tuple tuple = result.tuples.get(idx);
			if ((calcPeriod != null) && !calcPeriod.equals(tuple.map.get("PERIOD"))) {
				continue;
			}
			BigDecimal selfVal = (BigDecimal)self.tuples.get(idx).map.get("VALUE");
			if (selfVal == null) {
				selfVal = new BigDecimal(0);
			}
			BigDecimal otherVal = (BigDecimal)ot.tuples.get(idx).map.get("VALUE");
			if (otherVal == null) {
				otherVal = new BigDecimal(0);
			}
			BigDecimal value = selfVal.setScale(10, BigDecimal.ROUND_HALF_UP).divide(otherVal.setScale(10, BigDecimal.ROUND_HALF_UP), BigDecimal.ROUND_HALF_UP).setScale(10, BigDecimal.ROUND_HALF_UP);	
			tuple.map.put("VALUE", value);
		}
		return result;
	}

	public Tuples and(Tuples other, List<String> inputDims, Map<String, List<String>> limits, String calcPeriod, String aggRule) {
		Tuples self = createTuples(limits, aggregate(this, inputDims, aggRule), inputDims);
		Tuples ot = createTuples(limits, aggregate(other, inputDims, aggRule), inputDims);
		Tuples result = createTuples(limits, inputDims);
		result.sortBy(inputDims);
		for (int idx = 0; idx < self.tuples.size(); idx++) {
			Tuple tuple = result.tuples.get(idx);
			if ((calcPeriod != null) && !calcPeriod.equals(tuple.map.get("PERIOD"))) {
				continue;
			}
			Boolean selfVal = (Boolean)self.tuples.get(idx).map.get("VALUE");
			if (selfVal == null) {
				selfVal = new Boolean(false);
			}
			Boolean otherVal = (Boolean)ot.tuples.get(idx).map.get("VALUE");
			if (otherVal == null) {
				otherVal = new Boolean(false);
			}
			Boolean value = selfVal && otherVal;	
			tuple.map.put("VALUE", value);
		}
		return result;
	}

	public Tuples or(Tuples other, List<String> inputDims, Map<String, List<String>> limits, String calcPeriod, String aggRule) {
		Tuples self = createTuples(limits, aggregate(this, inputDims, aggRule), inputDims);
		Tuples ot = createTuples(limits, aggregate(other, inputDims, aggRule), inputDims);
		Tuples result = createTuples(limits, inputDims);
		result.sortBy(inputDims);
		for (int idx = 0; idx < self.tuples.size(); idx++) {
			Tuple tuple = result.tuples.get(idx);
			if ((calcPeriod != null) && !calcPeriod.equals(tuple.map.get("PERIOD"))) {
				continue;
			}
			Boolean selfVal = (Boolean)self.tuples.get(idx).map.get("VALUE");
			if (selfVal == null) {
				selfVal = new Boolean(false);
			}
			Boolean otherVal = (Boolean)ot.tuples.get(idx).map.get("VALUE");
			if (otherVal == null) {
				otherVal = new Boolean(false);
			}
			Boolean value = selfVal || otherVal;	
			tuple.map.put("VALUE", value);
		}
		return result;
	}

	public Tuples eq(Tuples other, List<String> inputDims, Map<String, List<String>> limits, String calcPeriod, String aggRule) {
		Tuples self = createTuples(limits, aggregate(this, inputDims, aggRule), inputDims);
		Tuples ot = createTuples(limits, aggregate(other, inputDims, aggRule), inputDims);
		Tuples result = createTuples(limits, inputDims);
		result.sortBy(inputDims);
		for (int idx = 0; idx < self.tuples.size(); idx++) {
			Tuple tuple = result.tuples.get(idx);
			if ((calcPeriod != null) && !calcPeriod.equals(tuple.map.get("PERIOD"))) {
				continue;
			}
			BigDecimal selfVal = (BigDecimal)self.tuples.get(idx).map.get("VALUE");
			if (selfVal == null) {
				selfVal = new BigDecimal(0);
			}
			BigDecimal otherVal = (BigDecimal)ot.tuples.get(idx).map.get("VALUE");
			if (otherVal == null) {
				otherVal = new BigDecimal(0);
			}
			Boolean value = selfVal.compareTo(otherVal) == 0;
			tuple.map.put("VALUE", value);
		}
		return result;
	}
	
	public Tuples lt(Tuples other, List<String> inputDims, Map<String, List<String>> limits, String calcPeriod, String aggRule) {
		Tuples self = createTuples(limits, aggregate(this, inputDims, aggRule), inputDims);
		Tuples ot = createTuples(limits, aggregate(other, inputDims, aggRule), inputDims);
		Tuples result = createTuples(limits, inputDims);
		result.sortBy(inputDims);
		for (int idx = 0; idx < self.tuples.size(); idx++) {
			Tuple tuple = result.tuples.get(idx);
			if ((calcPeriod != null) && !calcPeriod.equals(tuple.map.get("PERIOD"))) {
				continue;
			}
			BigDecimal selfVal = (BigDecimal)self.tuples.get(idx).map.get("VALUE");
			if (selfVal == null) {
				selfVal = new BigDecimal(0);
			}
			BigDecimal otherVal = (BigDecimal)ot.tuples.get(idx).map.get("VALUE");
			if (otherVal == null) {
				otherVal = new BigDecimal(0);
			}
			Boolean value = selfVal.compareTo(otherVal) < 0;
			tuple.map.put("VALUE", value);
		}
		return result;
	}

	public Tuples gt(Tuples other, List<String> inputDims, Map<String, List<String>> limits, String calcPeriod, String aggRule) {
		Tuples self = createTuples(limits, aggregate(this, inputDims, aggRule), inputDims);
		Tuples ot = createTuples(limits, aggregate(other, inputDims, aggRule), inputDims);
		Tuples result = createTuples(limits, inputDims);
		result.sortBy(inputDims);
		for (int idx = 0; idx < self.tuples.size(); idx++) {
			Tuple tuple = result.tuples.get(idx);
			if ((calcPeriod != null) && !calcPeriod.equals(tuple.map.get("PERIOD"))) {
				continue;
			}
			BigDecimal selfVal = (BigDecimal)self.tuples.get(idx).map.get("VALUE");
			if (selfVal == null) {
				selfVal = new BigDecimal(0);
			}
			BigDecimal otherVal = (BigDecimal)ot.tuples.get(idx).map.get("VALUE");
			if (otherVal == null) {
				otherVal = new BigDecimal(0);
			}
			Boolean value = selfVal.compareTo(otherVal) > 0;
			tuple.map.put("VALUE", value);
		}
		return result;
	}
	
	public Tuples le(Tuples other, List<String> inputDims, Map<String, List<String>> limits, String calcPeriod, String aggRule) {
		Tuples self = createTuples(limits, aggregate(this, inputDims, aggRule), inputDims);
		Tuples ot = createTuples(limits, aggregate(other, inputDims, aggRule), inputDims);
		Tuples result = createTuples(limits, inputDims);
		result.sortBy(inputDims);
		for (int idx = 0; idx < self.tuples.size(); idx++) {
			Tuple tuple = result.tuples.get(idx);
			if ((calcPeriod != null) && !calcPeriod.equals(tuple.map.get("PERIOD"))) {
				continue;
			}
			BigDecimal selfVal = (BigDecimal)self.tuples.get(idx).map.get("VALUE");
			if (selfVal == null) {
				selfVal = new BigDecimal(0);
			}
			BigDecimal otherVal = (BigDecimal)ot.tuples.get(idx).map.get("VALUE");
			if (otherVal == null) {
				otherVal = new BigDecimal(0);
			}
			Boolean value = selfVal.compareTo(otherVal) <= 0;	
			tuple.map.put("VALUE", value);
		}
		return result;
	}
	
	public Tuples ge(Tuples other, List<String> inputDims, Map<String, List<String>> limits, String calcPeriod, String aggRule) {
		Tuples self = createTuples(limits, aggregate(this, inputDims, aggRule), inputDims);
		Tuples ot = createTuples(limits, aggregate(other, inputDims, aggRule), inputDims);
		Tuples result = createTuples(limits, inputDims);
		result.sortBy(inputDims);
		for (int idx = 0; idx < self.tuples.size(); idx++) {
			Tuple tuple = result.tuples.get(idx);
			if ((calcPeriod != null) && !calcPeriod.equals(tuple.map.get("PERIOD"))) {
				continue;
			}
			BigDecimal selfVal = (BigDecimal)self.tuples.get(idx).map.get("VALUE");
			if (selfVal == null) {
				selfVal = new BigDecimal(0);
			}
			BigDecimal otherVal = (BigDecimal)ot.tuples.get(idx).map.get("VALUE");
			if (otherVal == null) {
				otherVal = new BigDecimal(0);
			}
			Boolean value = selfVal.compareTo(otherVal) >= 0;	
			tuple.map.put("VALUE", value);
		}
		return result;
	}
	
	public Tuples ifThen(Tuples t, Tuples f, List<String> inputDims, Map<String, List<String>> limits, String calcPeriod, String aggRule) {
		Tuples trueTuple = createTuples(limits, aggregate(t, inputDims, aggRule), inputDims);
		Tuples falseTuple = createTuples(limits, aggregate(f, inputDims, aggRule), inputDims);
		Tuples thisTuple = createTuples(limits, aggregate(this, inputDims, aggRule), inputDims);
		Tuples result = createTuples(limits, inputDims);
		result.sortBy(inputDims);
		for (int idx = 0; idx <thisTuple.tuples.size(); idx++) {
			Tuple tuple = thisTuple.tuples.get(idx);
			if ((calcPeriod != null) && !calcPeriod.equals(tuple.map.get("PERIOD"))) {
				continue;
			}
			Boolean value = (Boolean)tuple.map.get("VALUE");
			if (value == null) {
				value = new Boolean(false);
			}
			Tuple retTuple = result.tuples.get(idx);
			if (value) {
				retTuple.map.put("VALUE", trueTuple.tuples.get(idx).map.get("VALUE"));
			} else {
				retTuple.map.put("VALUE", falseTuple.tuples.get(idx).map.get("VALUE"));
			}
		}
		return result;
	}

	public Tuples not(List<String> inputDims, Map<String, List<String>> limits, String calcPeriod, String aggRule) {
		Tuples result = createTuples(limits, aggregate(this, inputDims, aggRule), inputDims);
		for (int idx = 0; idx < result.tuples.size(); idx++) {
			Tuple tuple = result.tuples.get(idx);
			if ((calcPeriod != null) && !calcPeriod.equals(tuple.map.get("PERIOD"))) {
				continue;
			}
			Boolean value = (Boolean)tuple.map.get("VALUE");
			if (value == null) {
				value = new Boolean(false);
			}
			tuple.map.put("VALUE", !value);
		}
		return result;
	}

	public static Tuples number(BigDecimal number, List<String> inputDims, Map<String, List<String>> limits, String calcPeriod, String aggRule) {
		Tuples result = createTuples(limits, inputDims);
		for (int idx = 0; idx < result.tuples.size(); idx++) {
			Tuple tuple = result.tuples.get(idx);
			if ((calcPeriod != null) && !calcPeriod.equals(tuple.map.get("PERIOD"))) {
				continue;
			}
			tuple.map.put("VALUE", number);
		}
		return result;
	}

	public Tuples identity(List<String> inputDims, Map<String, List<String>> limits, String aggRule) {
		return identity(inputDims, limits, 0, aggRule);
	}
	
	public Tuples identity(List<String> inputDims, Map<String, List<String>> limits, int periodOffset, String aggRule) {
		Tuples self = createTuples(limits, aggregate(this, inputDims, aggRule), inputDims);
		if (periodOffset < 0) {
			List<String> dimensions = new ArrayList<String>(inputDims);
			dimensions.remove("PERIOD");
			dimensions.add("PERIOD");
			self.sortBy(dimensions);
			//Shift -periodOffset times
			for (int i = 0; i < -periodOffset; i++) {
				String firstPeriod = null;
				BigDecimal priorTupleValue = null;
				for (int idx = 0; idx < self.tuples.size(); idx++) {
					Tuple tuple = self.tuples.get(idx);
					if(firstPeriod == null) {
						firstPeriod = (String)tuple.map.get("PERIOD");					
					}
					BigDecimal tempTupleValue = (BigDecimal)tuple.map.get("VALUE");
					tuple.map.put("VALUE", priorTupleValue);
					priorTupleValue = tempTupleValue;				
				}
			}
		}
		// Need to sort it since we sorted it differently earlier on.
		self.sortBy(inputDims);
		return self;
	}

	public static Tuples getCurrPeriod(List<String> inputDims, Map<String, List<String>> limits, String aggRule) {
		Tuples result = createTuples(limits, inputDims);
		for (int idx = 0; idx < result.tuples.size(); idx++) {
			Tuple tuple = result.tuples.get(idx);
			tuple.map.put("VALUE", new BigDecimal((String)tuple.map.get("PERIOD")));
		}
		return result;
	}
	
	public void sortBy(final List<String> dims) {
		Collections.sort(tuples, new Comparator<Tuple>() {		
			public int compare(Tuple o1, Tuple o2) {
				for (String dim : dims) {
					String v1 = (String)o1.map.get(dim);
					String v2 = (String)o2.map.get(dim);
					if (v1 == null && v2 == null) {
						continue;
					}
					if (v2 == null) {
						return 1;
					}
					if (v1 == null) {
						return -1;
					}
					if (v1.compareTo(v2) == 0) {
						continue;
					}
					return v1.compareTo(v2);
				}
				return 0;
			}
		});
	}
	
	public void sortBy(final List<String> dims, final List<Integer> direction) {
		Collections.sort(tuples, new Comparator<Tuple>() {		
			public int compare(Tuple o1, Tuple o2) {
				for (int idx = 0; idx < dims.size(); idx++) {
					String dim = dims.get(idx);
					String v1 = (String)o1.map.get(dim);
					String v2 = (String)o2.map.get(dim);
					if (v1 == null && v2 == null) {
						continue;
					}
					if (v2 == null) {
						return 1;
					}
					if (v1 == null) {
						return -1;
					}
					if (v1.compareTo(v2) == 0) {
						continue;
					}
					return (direction.get(idx) >= 0) ? 
							v1.compareTo(v2) : -v1.compareTo(v2);
				}
				return 0;
			}
		});
	}
	
	public String toString() {
		StringBuffer buf = new StringBuffer("\t");
		final Map<String, Integer> maxDimSizes = new HashMap<String, Integer>(dimensions.size() + 1);
		maxDimSizes.put("VALUE", 5);	
		for (int idx = 0; idx < dimensions.size(); idx++) {
			final String dim = dimensions.get(idx);
			maxDimSizes.put(dim, dim.length());
		}
		for (int idx = 0; idx < tuples.size(); idx ++) {
			Tuple tuple = tuples.get(idx);
			if (tuple.map.get("VALUE") == null) {
				continue;
			}
			Object val = tuple.map.get("VALUE");
			if (maxDimSizes.get("VALUE").compareTo(val.toString().length()) < 0) {
				maxDimSizes.put("VALUE", val.toString().length());
			}
			for (int i = 0; i < dimensions.size(); i++) {
				final String dim = dimensions.get(i);
				val = tuple.map.get(dim);
				if (maxDimSizes.get(dim).compareTo(val.toString().length()) < 0) {
					maxDimSizes.put(dim, val.toString().length());
				}
			}
		}		
		String padding = createPadding(maxDimSizes.get("VALUE") - 5);	
		buf.append("VALUE" + padding + " ");
		for (int idx = 0; idx < dimensions.size(); idx++) {
			final String dim = dimensions.get(idx);
			padding = createPadding(maxDimSizes.get(dim) - dim.length());
			buf.append(dim);
			if (idx < dimensions.size() - 1) {
				buf.append(padding + " ");
			}			
		}
		buf.append("\n\n");		
		int cnt = 0;
		for (int idx = 0; idx < tuples.size(); idx ++) {
			Tuple tuple = tuples.get(idx);
			if (tuple.map.get("VALUE") == null) {
				continue;
			}
			buf.append(++cnt).append(":\t");
			Object val = tuple.map.get("VALUE");
			padding = createPadding(maxDimSizes.get("VALUE") - val.toString().length());			
			buf.append(tuple.map.get("VALUE")).append(padding + " ");
			for (int i = 0; i < dimensions.size(); i++) {
				final String dim = dimensions.get(i);
				val = tuple.map.get(dim);
				padding = createPadding(maxDimSizes.get(dim) - val.toString().length());
				buf.append(tuple.map.get(dimensions.get(i)));
				if (i < dimensions.size() - 1) {
					buf.append(padding + " ");
				}
			}
			buf.append("\n");
		}
		return buf.toString();
	}
	
	public String createPadding(int numSpaces) {
		StringBuffer retVal = new StringBuffer();
		for (int idx = 0; idx < numSpaces; idx++) {
			retVal = retVal.append(" ");
		}
		return retVal.toString();
	}
	
	/**
	 * Creates a Tuple from a database query results.
	 * 
	 * @param query
	 * @param dimensions
	 * @param inputDims
	 * @param limits
	 * @return
	 */
	public static Tuples getValueBySQL(String query, List<String> dimensions, List<String> inputDims, Map<String, List<String>> limits, String aggRule, String userName, String password, String hostName, String sid) {
       	Connection conn = null;
       	try { 
       	    DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
       	 conn = DriverManager
         .getConnection("jdbc:oracle:thin:" + userName + "/" + password + "@" + hostName + ":1521:" + sid, userName, password);
        	Statement stmt = conn.createStatement();
        	ResultSet rs = stmt.executeQuery(augmentQuery(query, dimensions, limits));
        	Tuples result = new Tuples(dimensions);
        	while(rs.next()) {
        		Tuple tuple = new Tuple();
        		tuple.map.put("VALUE", rs.getBigDecimal("VALUE"));
        		for (String dim : dimensions) {
        			tuple.map.put(dim, rs.getString(dim));
        		}
        		result.tuples.add(tuple);
        	}
        	result = aggregate(result, inputDims, aggRule);
        	result = createTuples(limits, result, inputDims);
        	result.sortBy(inputDims);
        	return result;
        	
       	} catch (SQLException e) {
       		e.printStackTrace();
       	} finally {
       		if(conn != null) {
       		   try {
       	              conn.close();
       	           } catch (SQLException e2) {
        	       e2.printStackTrace();
        	   }
       	        }
       	}
       	return null;
    }
	
	public Tuples query(Tuple tuple) {
		Tuples result = new Tuples(new ArrayList<String>(this.dimensions));
		for (int idx = 0; idx < this.tuples.size(); idx++) {
			Tuple currTuple = this.tuples.get(idx);
			boolean matched = true;
			List<String> queryDims = new ArrayList<String>(tuple.map.keySet());
			for (int i = 0; i < queryDims.size(); i++) {
				if(!currTuple.map.get(queryDims.get(i)).equals(tuple.map.get(queryDims.get(i)))) {
					matched = false;
					break;
				}
			}
			if (matched) {
				result.tuples.add(currTuple);
			}
		}
		return result;
	}
	
	public Tuples updateOnMatch(Tuples source, Tuple matchTuple) {
		for (int idx = 0; idx < this.tuples.size(); idx++) {
			Tuple currThisTuple = this.tuples.get(idx);
			for (int i = 0; i < source.tuples.size(); i++) {
				Tuple currSourceTuple = source.tuples.get(i);
				if (matchTuple.dimEquals(currThisTuple) && currThisTuple.dimEquals(currSourceTuple)) {
					currThisTuple.map.put("VALUE", currSourceTuple.map.get("VALUE"));
				}
			}
		}
		return this;
	}
	
	public static String augmentQuery(String query, List<String> dimensions, Map<String, List<String>> limits) {
		StringBuffer result = new StringBuffer();
		result.append(createSelectList(dimensions));
		result.append(" FROM (");
		result.append(query);
		result.append(") WHERE ");
		List<String> limitKeys = new ArrayList<String>(limits.keySet());
		Collections.sort(limitKeys);
		for (int idx = 0; idx < dimensions.size(); idx++) {
			result.append(dimensions.get(idx) + " ");
			result.append(createInClause(limits.get(dimensions.get(idx))));
			if (idx < dimensions.size() - 1) {
				result.append(" AND ");
			}
		}
		result.append(createGroupBy(dimensions));
                /*
		System.out.println("Query = " + result.toString());
		System.out.flush();
                */
		return result.toString();
	}
	
	public static String createGroupBy(List<String> s) {
		StringBuffer result = new StringBuffer(" GROUP BY ");
		result.append(createCommaDelimitedList(s));
		return result.toString();
	}
	
	public static String createCommaDelimitedList(List<String> s, String decorator) {
		StringBuffer result = new StringBuffer();
		for (int idx = 0; idx < s.size(); idx++) {
			result.append(decorator).append(s.get(idx)).append(decorator);
			if (idx < s.size() - 1) {
				result.append(", ");
			}
		}
		return result.toString();
	}
	
	public static String createCommaDelimitedList(List<String> s) {
		return createCommaDelimitedList(s, "");
	}
	
	public static String createSelectList(List<String> s) {
		StringBuffer result = new StringBuffer("SELECT SUM(VALUE) AS VALUE, ");
		result.append(createCommaDelimitedList(s));
		return result.toString();
	}
	
	public static String createInClause(List<String> s) {
		StringBuffer result = new StringBuffer("IN (");
		result.append(createCommaDelimitedList(s, "'"));
		result.append(")");
		return result.toString();
	}
	
	/**
	 * Returns a list of commons strings.
	 * 
	 * @param s1
	 * @param s2
	 * @return
	 */
    public static List<String> getCommonStrings(List<String> s1, List<String> s2) { 
    	if(s1 == null | s2 == null || s1.size() == 0 || s2.size() == 0) {
    		return new ArrayList<String>();
    	}
    	List<String> s1Clone = new ArrayList<String>(s1);
    	List<String> s2Clone = new ArrayList<String>(s2);
    	Collections.sort(s1Clone);
    	Collections.sort(s2Clone);
    	int idx1 = 0;
    	int idx2 = 0;
    	List<String> result = new ArrayList<String>();
    	do {
    		if (s1Clone.get(idx1).compareTo(s2Clone.get(idx2)) == 0) {
    			result.add(s1Clone.get(idx1));
    			boolean incremented = false;
    			if (idx1 < (s1Clone.size() - 1)) {
    				idx1++;
    				incremented = true;
    			}
    			if (idx2 < (s2Clone.size() - 1)) {
    				idx2++;
    				incremented = true;
    			}
    			if (incremented) {
    				continue;
    			} else {
    				break;
    			}
    		}
    		if (s1Clone.get(idx1).compareTo(s2Clone.get(idx2)) > 0 && 
    				idx2 < (s2Clone.size() - 1)) {
    			idx2++;
    			continue;
    		}
    		if (s1Clone.get(idx1).compareTo(s2Clone.get(idx2)) < 0 &&
    				idx1 < (s1Clone.size() - 1)) {
    			idx1++;
    			continue;
    		}
    		break;    		
    	} while (true);
    	
    	return result;
    }
    
    /**
     * Creates a tuple based on limits, and copies values from source to
     * target.
     * 
     * @param limits
     * @param source
     * @return
     */
    public static Tuples createTuples(Map<String, List<String>> limits, Tuples source, List<String> dims) {
    	Tuples target = createTuples(limits, dims);
    	Tuples result = new Tuples(target.dimensions);
    	List<String> commonDims = getCommonStrings(target.dimensions, source.dimensions);
    	for (Tuple targetTuple : target.tuples) {
    		boolean sourceMatched = false;
    		for (Tuple sourceTuple : source.tuples) {
    			boolean matched = true;
    			for (String commonDim : commonDims) {    				
    				if (!targetTuple.map.get(commonDim).equals(sourceTuple.map.get(commonDim))) {
    					matched = false;
    					break;
    				}
    			}    			
    			if (matched) {   
    				Tuple targetClone = targetTuple.clone();
					targetClone.map.put("VALUE", sourceTuple.map.get("VALUE"));
					result.tuples.add(targetClone);
					sourceMatched = true;
    			}				
    		}
    		if (!sourceMatched) {
    			Tuple targetClone = targetTuple.clone();
				result.tuples.add(targetClone);
    		}
    	}
    	result.sortBy(dims);
    	return result;
    }
    
    /**
     * Creates tuples based on limits.
     * 
     * @param limits
     * @return
     */
    public static Tuples createTuples(Map<String, List<String>> limits) {
    	List<String> dims = new ArrayList<String>(limits.keySet());
    	return createTuples(limits, dims);
    }
    
    public static Tuples createTuples(
    		Map<String, List<String>> limits, 
    		List<String> dims) {
    	Set<String> combinations = new HashSet<String>();
    	List<String> dimsClone = new ArrayList<String>(dims);
    	Collections.sort(dimsClone);
    	combinations.add("");
    	for (String dim : dimsClone) {
    		Set<String> combinationsClone = new HashSet<String>(combinations);
    		for (String combo : combinationsClone) {
    			for (String dimVal : limits.get(dim)) {
    				if (combo.equals("")) {
    					combinations.add(dimVal);
    				} else {
    					combinations.add(combo + "||" + dimVal);
    				}
    				combinations.remove(combo);
    			}
    		}
    	}
    	Tuples tuples = new Tuples(dims);
    	for (String combo : combinations) {
    		String[] d = combo.split("\\|\\|");
    		Tuple t = new Tuple();
    		for (int idx = 0; idx < dimsClone.size(); idx++) {
    			t.map.put(dimsClone.get(idx), d[idx]);
    		}
    		tuples.tuples.add(t);
    	}
    	return tuples;
    }
    
    /**
     * Aggregates tuples based on input dimensions.  Does SUM.
     * 
     * @param t
     * @param inputDims
     * @return
     */
    public static Tuples aggregate(Tuples t, List<String> inputDims) {  
    	return aggregate(t, inputDims, SUM);
    }
    
    /**
     * Aggrates tuples based based on input dimensions and function.  
     * 
     * @param t
     * @param inputDims
     * @param function
     * @return
     */
    public static Tuples aggregate(Tuples t, List<String> inputDims, String function) {
    	if (function == null) {
    		function = SUM;
    	}
    	List<String> commonDims = getCommonStrings(t.dimensions, inputDims);
        Map<String, Object> groups = new HashMap<String, Object>();
    	for(Tuple tuple : t.tuples) {
    		StringBuffer newKey = new StringBuffer();
    		for (int idx = 0; idx < commonDims.size(); idx++) {
    			String dim = commonDims.get(idx);
    		    String dimVal = (String)tuple.map.get(dim);
    		    if (dimVal == null) {
    		    	dimVal = "NULL";    		    	
    		    }
    		    newKey.append(dimVal);
    		    if (idx < commonDims.size() - 1) {
    		    	newKey.append("||");
    		    }
    		}
    		String comboKey = newKey.toString();
    		Object currentVal = groups.get(comboKey);
			Object val = tuple.map.get("VALUE");
			if (val != null) {
				if (currentVal != null) {
					if (val instanceof BigDecimal) {
						if (SUM.equals(function)) {
							BigDecimal sum = ((BigDecimal)currentVal).add((BigDecimal)val).setScale(10, BigDecimal.ROUND_HALF_UP);
							groups.put(comboKey, sum);
							continue;
						}
						if (MAX.equals(function)) {
							final BigDecimal curr = (BigDecimal) currentVal;
							final BigDecimal newVal = (BigDecimal) val;
							if (newVal.compareTo(curr) > 0) {
								groups.put(comboKey, newVal);
							}
							continue;
						}
						if (MIN.equals(function)) {
							final BigDecimal curr = (BigDecimal) currentVal;
							final BigDecimal newVal = (BigDecimal) val;
							if (newVal.compareTo(curr) < 0) {
								groups.put(comboKey, newVal);
							}
							continue;
						}
						if (CNT.equals(function)) {
							final BigDecimal curr = (BigDecimal) currentVal;
							groups.put(comboKey, curr.add(BigDecimal.ONE));
						}
						if (val instanceof Boolean) {
							// Default aggregate boolean function is AND
							Boolean b = ((Boolean) currentVal).booleanValue() && ((Boolean)val).booleanValue();
							groups.put(comboKey, b);
						}
					}
				} else {
					if (CNT.equals(function)) {
						groups.put(comboKey, BigDecimal.ONE);
					} else {
						groups.put(comboKey, val);
					}
				}
			}
    	}
    	List<Tuple> newTuples = new ArrayList<Tuple>();
    	for (String grpKey : groups.keySet()) {
    		Tuple tuple = new Tuple();
    		String[] keys = grpKey.split("\\|\\|");
    		for (int idx = 0; idx < commonDims.size(); idx++) {
    			tuple.map.put(commonDims.get(idx), keys[idx]);
    		}
			tuple.map.put("VALUE", groups.get(grpKey));
			newTuples.add(tuple);
    	}
    	Tuples result = new Tuples(commonDims);
    	result.tuples = newTuples;    	
    	return result;
    }
    
    public static void main(String[] args) {
    	// Test getCommonStrings();
    	List<String> a = new ArrayList<String>();
    	List<String> b = new ArrayList<String>();
    	List<String> states = Arrays.asList("CA", "AK", "NJ");
    	List<String> ndcs = Arrays.asList("19999960001", "19999960002", "19999960003", "19999960004", "19999960005");
    	List<String> periods = Arrays.asList("20073", "20074", "20081", "20082", "20083", "20084");
    	a.add("PERIOD");
    	a.add("NDC");
    	a.add("STATE");
    	b.add("PERIOD");
    	b.add("STATE");
    	List<String> results = Tuples.getCommonStrings(a, b);
    	for (String result : results) {
    		System.out.println(result);
    	}
    	// Test aggregate
    	Tuples utilization = new Tuples(a);
    	Tuple t1 = new Tuple();
    	t1.map.put("PERIOD", "20041");
    	t1.map.put("NDC", "19999900001");
    	t1.map.put("STATE", "CA");
    	t1.map.put("VALUE", new BigDecimal(100));
    	utilization.tuples.add(t1);
    	Tuple t2 = new Tuple();
    	t2.map.put("PERIOD", "20041");
    	t2.map.put("NDC", "19999900002");
    	t2.map.put("STATE", "CA");
    	t2.map.put("VALUE", new BigDecimal(120));
    	utilization.tuples.add(t2);
    	Tuple t3 = new Tuple();
    	t3.map.put("PERIOD", "20041");
    	t3.map.put("NDC", "19999900003");
    	t3.map.put("STATE", "NJ");
    	t3.map.put("VALUE", new BigDecimal(110));
    	utilization.tuples.add(t3);
    	System.out.println(aggregate(utilization, Arrays.asList("PERIOD", "STATE")));   
    	
    	// Test createTuples
    	Map<String, List<String>> limits = new HashMap<String, List<String>>();
    	limits.put("PERIOD", periods);
    	limits.put("STATE", states);
    	limits.put("NDC", ndcs);
    	Tuples r = createTuples(limits);
    	r.sortBy(Arrays.asList("PERIOD", "NDC"));
    	System.out.println(r);
    	
    	// Test augmentQuery
    	System.out.println(augmentQuery(new String("SELECT 1 AS VALUE, '20041' AS PERIOD, '19999000001' AS NDC, 'CA' AS STATE FROM TEST_TABLE "), 
    			Arrays.asList("PERIOD", "NDC", "STATE"), limits));
    	    	
    }
}
