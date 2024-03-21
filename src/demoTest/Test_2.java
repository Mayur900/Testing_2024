package demoTest;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test_2 {

	public static void main(String[] args) {

		String s = "hello world i am mayur gorakhpuria";
		
		
		Map<Character, Long> map = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));
		System.out.println(map);
	}

}