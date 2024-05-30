package demoTest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class findFrequcyInEachWordAndArrage {

	public static void main(String[] args) {
		 
		String statement = "Hello World My name is Jane and I hate Mango Fruit";
		 
		String s[] = statement.split("//s");
		
// output		{5 = [“Hello”, “World”, “Mango”, “Fruit”], 4 = [“name”, “Jane”, “hate”], 3 = [“and”], 2 = [“My”, “is”], 1 = [“I”]}
		
		
	Map<Integer, List<String>> map = 	Arrays.stream(s).collect(Collectors.groupingBy(st -> st.length() , Collectors.toList()));
		
	System.out.println(map);
		
	}

}
