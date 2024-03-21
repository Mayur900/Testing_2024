package java_8_2024;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Freqecy_Count_String {

	public static void main(String[] args) {

        List<String> list = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");

        Map<String, Long> j =   list.stream().collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));
        
        System.out.println(j);
        
		
	}

}
