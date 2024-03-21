package java_8_2024;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Seprate_Odd_Even {
	public static void main(String[] args) {
		
        List<Integer> list = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

        list.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0)).entrySet().forEach(s -> {
        	
        	System.out.println(s.getValue());
        });
        
		
	}

}
