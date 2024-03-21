package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import fortesting.System_Exit;

public class java8 {
	
	public static void main(String[] args) {
		
		int arr[] = new int[] {12 ,700, 45, 39 , 34, 90};
		
		List<Integer> list = new ArrayList<Integer>(arr.length);
		
		for (int i : arr)
		{
		    list.add(i);
		}
		
		Stream<Integer> sb = list.stream().filter(i -> i > 34).sorted((i1 , i2) -> i2.compareTo(i1));
				
		System.out.println("Highest Number");
		sb.forEach(System.out :: println);
		
		Arrays.sort(arr);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[4]);
		System.out.println(arr[arr.length - 1]);
		System.out.println(arr[arr.length - 2]);
   }

}

class test
{
	public void display()
	{
		System.out.println("");
	}
}