package java_8_2024;

import java.util.Arrays;
import java.util.List;

public class Remove_Duplicate {
	
	public static void main(String[] args) {
		
        List<String> list = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");

        list.stream().distinct().forEach(System.out :: println);
        
		
	}

}
