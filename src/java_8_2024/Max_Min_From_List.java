package java_8_2024;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Max_Min_From_List {
	
	public static void main(String[] args) {
		
		
        List<Integer> list = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        
        list.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out :: println);
        
        
	}

}
