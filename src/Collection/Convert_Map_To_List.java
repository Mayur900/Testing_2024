package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Convert_Map_To_List {

    public static void main(String[] args) {

      final  Map<String, String> wordMap = new HashMap<>();
        wordMap.put("1", "mayur");
        wordMap.put("4", "mayur");
        wordMap.put("2", "mayur");
        wordMap.put("3", "mayur");
        wordMap.put("5", "mayuwr");

        
      //  List<Entry<String, String>> entryList = new ArrayList<Entry<String, String>>(wordMap.entrySet());

       // Collections.sort(entryList, (i1 , i2) -> i1.toString().compareTo(i2.toString()));
        
        TreeMap<String, Employee> tm = new TreeMap<>((o1, o2) -> o1.compareTo(o2));
        
        wordMap.forEach((k , v) -> {
        	System.out.println(k);
        	System.out.println(v);
        });
        
        
		/*
		 * for (Map.Entry<String, String> h : wordMap.entrySet()) {
		 * 
		 * 
		 * String s = h.getKey(); h.getValue(); }
		 * 
		 * for (Map.Entry<String, String> entry : wordMap.entrySet()) { String key =
		 * entry.getKey(); String val = entry.getValue();
		 * 
		 * }
		 * 
		 * Set<Entry<String, String>> set = wordMap.entrySet();
		 * 
		 * 
		 * 
		 * List<Entry<String, String>> list = new ArrayList<>(set);
		 * 
		 * for (Entry<String, String> entry : list) {
		 * 
		 * System.out.println(entry); }
		 */

    }

}
