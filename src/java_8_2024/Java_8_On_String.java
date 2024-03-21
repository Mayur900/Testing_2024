package java_8_2024;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java_8_On_String {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("aa","bb","cc","dd");
		
		list =  list.stream().map(String :: toUpperCase).collect(Collectors.toList());
		System.out.println(list);
		
		
		
		
	}

}
