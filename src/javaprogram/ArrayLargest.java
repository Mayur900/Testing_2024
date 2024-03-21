package javaprogram;

public class ArrayLargest {

	public static void main(String[] args) {
		
		int m[]= {30,80,20,12,34};
		
		int max = m[0];
		
		for(int i = 0 ; i< m.length ;i++)
		{
			if(m[i] > max)
			{
				max = m[i];
			}
		}
		System.out.println(max);
		
        int min = m[0];
		
		for(int i = 0 ; i< m.length ;i++)
		{
			if(m[i] < min)
			{
				min = m[i];
			}
		}
		System.out.println(min);
		System.out.println(m.length);
		for(int j = m.length-1 ; j>=0;j--) {
			System.out.println(m[j] + " ");
		}
		int n[] = {2,5,3,8,9};
		int l = n.length;
		for(int b=0 ; b < n.length;b++)
		{
			for(int v = b+1; v< n.length ; v++)
			{
				
				//  if(n[b] == n[v]) { 
				//    System.out.println("\n" + n[v]); // duplicate elemnts from array 
				  
				 // }
				 
				
				  if(n[b] > n[v]) { 
					int temp = n[b]; 
					n[b]=n[v]; 
					n[v] =temp; }
				 
				
			}
		//	System.out.println(n[b]); // sorting an array 
			
			/*
			 * int sum = 0; for (int i = 0; i < n.length; i++) { sum = sum + n[i]; }
			 * System.out.println(sum);
			 */
		}
		System.out.println(n[l-2]);
		
	}
}
