import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class LocationMap {
	
	private static HashMap<String, String> map = new HashMap<String, String>()
	{{
		put("11111", "1");
	}};
	
	private static HashMap<String, List<String>> auth = new HashMap<String, List<String>>()
	{{
		put("11111", Arrays.asList("1", "2", "3")); //ID 11111 is allowed in zones 1 ,2 & 3 (not 7).
	}};
	
	public static String getLocationFromID(String id) {
		return map.get(id);
	}
	//Checks if current employee by ID, is in an authorized zone.
	public static boolean authIDCheck(String id) {
		System.out.println("AuthCheck:" + id);
		
		if (!map.containsKey(id)) return false;
		String zone = map.get(id);
		return ((Boolean) auth.get(id).contains(zone)); // If id is allowed in the specified zone, return true.
	}
	public static void setLocationForID(String id, String zone) {
		map.put(id, zone);
	}
}
