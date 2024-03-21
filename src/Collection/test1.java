package Collection;

import java.util.Arrays;

public class test1 {

	// move distinct elements at the begining of an array
	public static void main(String[] args) {
		
		
			Class cs = boolean.class;
			
			System.out.println(cs.getName());
		
            Class cs1 = test1.class;
			
			System.out.println(cs1.getName());
	}
		
		/*int arr[] = new int[] {1,2,2,4,6,6,6,9};
		 int k =0 ;
		 
		for(int i = 0 ; i < arr.length;i++) {
			boolean flag = true;
			for(int j = i+1; j< arr.length ; j++) {
				 if(arr[i] == arr[j])
				 {
					flag = false ;
					
				 }
			}
			if(flag)
			{
				arr[k] = arr[i];
				k++;
			}
			
		}
		System.out.println(Arrays.toString(arr));
	}*/
}
// time complexcity of the programs is O(n)
// find the max salary per city table employee , columns: employee name , salary , city , manager name 

/*
 * select city , empname , manager name , salary from employee where (city,
 * salary) in (select city , max(salary) from employee group by city)
 */


