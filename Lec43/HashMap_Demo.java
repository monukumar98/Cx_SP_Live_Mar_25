package Lec43;

import java.util.*;

public class HashMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		// add
		map.put("Kaju", 77);
		map.put("Raj", 71);
		map.put("Ankit", 71);
		map.put("Kunal", 68);
		map.put("Ankita", 91);
		map.put("Puneet", 61);
		map.put("Amisha", 59);
		map.put("Jaspal", 67);
		map.put("Ankita", 75);
//		map.put(null, 75);
//		map.put(null, 75);
		System.out.println(map);
//		// ContainsKey
//		System.out.println(map.containsKey("Raju"));
//		System.out.println(map.containsKey("Raj"));
//		// get
//		System.out.println(map.get("Raju"));
//		System.out.println(map.get("Raj"));
//		// remove
//		System.out.println(map.remove("Raju"));
//		System.out.println(map.remove("Raj"));
//		System.out.println(map);
//		System.out.println(map.size());
		TreeMap<String, Integer> map1 = new TreeMap<>();
		// add
		map1.put("Kaju", 77);
		map1.put("Raj", 71);
		map1.put("Ankit", 71);
		map1.put("Kunal", 68);
		map1.put("Ankita", 91);
		map1.put("Puneet", 61);
		map1.put("Amisha", 59);
		map1.put("Jaspal", 67);
		map1.put("Ankita", 75);
		// map1.put(null, 11);
		System.out.println(map1);

		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
		// add
		map2.put("Kaju", 77);
		map2.put("Raj", 71);
		map2.put("Ankit", 71);
		map2.put("Kunal", 68);
		map2.put("Ankita", 91);
		map2.put("Puneet", 61);
		map2.put("Amisha", 59);
		map2.put("Jaspal", 67);
		map2.put("Ankita", 75);
		System.out.println(map2);

		//System.out.println(map.keySet());
		Set<String> key = map.keySet();
		for (String k : key) {
			System.out.println(k + " " + map.get(k));
		}

	}

}
