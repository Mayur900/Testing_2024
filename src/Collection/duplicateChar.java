package Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;

public class duplicateChar {

	public static void main(String[] args) {
		
		 String s ="mynameissnehanagraj";
		 
		 long i = s.chars().filter(c -> c == 'm').count();
		 System.out.println(i);
		 
		 
		 String[] str = s.split(" ");
		 
		 Map<String, Long> m = Arrays.stream(str).collect(Collectors.groupingBy(c -> c , Collectors.counting()));
		 
		 m.forEach((k, v) -> System.out.println(k + " : "+ v));
	
	
	HashSet<String> set=new HashSet<String>();  
	  set.add("Ravi");  
	  set.add("Vijay");  
	  set.add("Ravi");  
	  set.add("Ajay");  
	  System.out.println(set.size());
}
}