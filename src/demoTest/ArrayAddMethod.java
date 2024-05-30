package demoTest;

import java.util.ArrayList;
import java.util.List;

public class ArrayAddMethod {
	public static void main(String[] args) {
		
		List<Integer> intergerList = new ArrayList<>();

		intergerList.add(1);

		intergerList.add(2);

		intergerList.add(3);

		intergerList.add(4);

		intergerList.add(5);

		intergerList.remove(3);

		intergerList.add(3);

		intergerList.add(3, 3);

System.out.println(intergerList);

		
	}
}