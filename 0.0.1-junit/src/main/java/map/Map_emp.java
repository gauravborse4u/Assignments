package map;

import java.util.HashMap;
import java.util.Map;

public class Map_emp {

	public static String show() {
		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(100, "Ram");
		map.put(101, "Sham");
		map.put(102, "Tejas");
		map.put(103, "Sameer");
		map.put(104, "Bhavesh");
		map.put(104, "Yogesh");// Previous key value is get updated with new

		System.out.println(map.get(104));
		return map.get(104);
	}

}
