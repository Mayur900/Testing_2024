package java_8_2024;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Min_Max {
	
	public static void main(String[] args) {
		
        List<Integer> list = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        
       int i = list.stream().max(Comparator.comparingInt(Integer :: valueOf)).get();
        System.out.println(i);
        
        
        
        
	}

}
