package demoTest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java_Identity {

	public static void main(String[] args) {


	//List<String> list = Arrays.asList("AA","BB","CC","AA","BB","BB","DD"); 
		//Count the occurance of each String and return the one which has highest value.
		
	//Map<String, Long> map =	list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	//map.entrySet().stream().filter(e -> e.getValue() > 2 ).forEach(System.out :: println);

		
		List<Integer> list = Arrays.asList(101,103,104,101,103,104,111,112,104);
		
//		Set<Integer> set = new HashSet<Integer>();
		
//		List<Integer> st = list.stream().filter(s -> !set.add(s)).collect(Collectors.toList());
		
//		System.out.println(st);
	
		
		Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	
		System.out.println(map);
		
		
	}

}
