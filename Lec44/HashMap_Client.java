package Lec44;

public class HashMap_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>(100);
		map.put("Kaju", 77);
		map.put("Raj", 71);
		map.put("Ankit", 71);
		map.put("Kunal", 68);
		map.put("Ankita", 91);
		map.put("Puneet", 61);
		map.put("Amisha", 59);
		map.put("Jaspal", 67);
		map.put("Ankita", 75);
		System.out.println(map.get("Ankita"));
		System.out.println(map);
	}

}
