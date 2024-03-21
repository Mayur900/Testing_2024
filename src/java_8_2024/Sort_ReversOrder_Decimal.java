package java_8_2024;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sort_ReversOrder_Decimal {

	public static void main(String[] args) {

        List<Double> list = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out :: println);;

        System.out.println(list);
        

        
	}

}
