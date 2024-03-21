package Practice.hello;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapSort {

	public static void main(String[] args) {
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();

		// Adding Key and Value pairs to HashMap
		hashmap.put(22, "A");
		hashmap.put(55, "B");
		hashmap.put(33, "Z");
		hashmap.put(44, "M");
		hashmap.put(99, "I");
		hashmap.put(88, "X");

		TreeMap<Integer, String> t = new TreeMap<>(hashmap);

		for (Map.Entry<Integer, String> map : t.entrySet()) {

			System.out.println(map.getKey() + " " + map.getValue());
		}

	}

}
