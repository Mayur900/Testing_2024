package java_8_2024;

import java.util.Arrays;
import java.util.List;

public class Java_8_On_Integer {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32);

		// Even or Odd
		// list = list.stream().filter( i-> i % 2 !=0).collect(Collectors.toList());

		// Given a list of integers, find out all the numbers starting with 1 using
		// list = list.stream().filter(i -> i > 9 && i < 19).collect(Collectors.toList());

		//  How to find duplicate elements in a given integers list in java using
        //List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        //Set<Integer> s = new HashSet<>();
        //myList  =  myList.stream().filter(i -> !s.add(i)).collect(Collectors.toList());
		
		
		//list.stream().findFirst().ifPresent(System.out :: println);
		
		
		//Sum of all the number
		
//		int total  = 0;
//		total =  list.stream().mapToInt(Integer :: intValue).sum();
//		System.out.println(total);
	
		int i = list.stream().min(Integer :: compare).get();
		
		
		System.out.println(i);
	}

}
