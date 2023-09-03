import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

public class DoorIDDB {
	private static HashMap<String, List<String>> auth = new HashMap<String, List<String>>()
	{{
		put("11111", Arrays.asList("1", "2", "3")); //ID 11111 has access to door 1, 2 & 3.
	}};
	
	public static boolean authDoorAccess(String id, String door) {
		if (!auth.containsKey(id)) return false;
		if (auth.get(id).contains(door)) return true;
		return false;
	}
}
