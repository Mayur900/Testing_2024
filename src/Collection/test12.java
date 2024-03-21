package Collection;

import java.util.HashMap;
import java.util.Map;

public class test12 {

	public static void main(String[] args) {
		
		HashMap<Employee, String> hs = new HashMap<>();

		Employee emp1 = new Employee(12 ,"java", 0);
		Employee emp2 = new Employee(12  ,"java", 0);

		hs.put(emp1, "java");
		hs.put(emp2, "java");
		System.out.println(hs.hashCode());
        for(Map.Entry<Employee,String> mm : hs.entrySet()) {
			
			System.out.println(mm.getKey()+ " "+ mm.getValue());
			
		}
		
		HashMap<Integer, String> hs1 = new HashMap<>();
		hs1.put(1,"hana");
		hs1.put(1,"hana");
		hs1.put(1,"hana");
		
		System.out.println(hs1.hashCode());
		for(Map.Entry<Integer,String> mm : hs1.entrySet()) {
			
			System.out.println(mm.getKey()+ " "+ mm.getValue());
			
		}

  }
}
	


