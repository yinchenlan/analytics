import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tuple {
	public Map<String, Object> map = new HashMap<String, Object>();
	public Tuple clone() {
		Tuple clone = new Tuple();
		for(String key : map.keySet()) {
			clone.map.put(key, map.get(key));
		}
		return clone;
	}
	public boolean dimEquals(Tuple other) {
		List<String> dims = new ArrayList<String>(map.keySet());
		dims.remove("VALUE");
		Collections.sort(dims);
		boolean result = true;
		for (int idx = 0; idx < dims.size(); idx++) {
			String thisDimVal = (String) map.get(dims.get(idx));
			String otherDimVal = (String) other.map.get(dims.get(idx));
			if (otherDimVal == null) {
				result = false;
				break;
			}
			if (!thisDimVal.equals(otherDimVal)) {
				result = false;
				break;
			}
		}
		return result;
	}
}