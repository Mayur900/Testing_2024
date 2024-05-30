package codeByte;

import java.util.Arrays;

public class Array_Similar {

	/**
	 * Examples * Input 1: a = [1, 2, 3] and b = [1, 2, 3] * Output 1: true * *
	 * Input 2: [1, 2, 3] and b = [2, 1, 3] * Output 2: true * Explanation: We can
	 * obtain b from a by swapping 2 and 1 in b.* * Input 3: [1, 2, 2] and b = [2,
	 * 1, 1] * Output 3: false
	 */
	
	public static void main(String[] args) {

		int a[] = {1,2,3};
		int b[] = {2,1,3};
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		System.out.println(Arrays.equals(a, b));
		
		
	}

}
