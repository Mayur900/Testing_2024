package Practice;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class HashMap_Duplicate_Key {

    public static void main(String[] args) {
        IdentityHashMap<Integer, String> hm = new IdentityHashMap<>();
        Integer i = new Integer(10);
        Integer j = new Integer(10);
        hm.put(i, "hello");
        hm.put(2, "mayur");
        hm.put(j, "rahul");
        System.out.println(hm);
        
        for (Map.Entry<Integer,String> map : hm.entrySet()) {
			map.getKey();
			map.getValue();
			System.out.println(map);
        	
		}
        
    }

}
