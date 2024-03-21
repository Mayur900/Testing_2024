package codeByte;

import java.util.Arrays;

public class Array_Addition_Equal_Large {

	/**
	 * For example: if arr contains [4, 6, 23, 10, 1, 3] the output * should return
	 * true because 4 + 6 + 10 + 3 = 23. The array * will not be empty, will not
	 * contain all the same elements, * and may contain negative numbers.
	 */

	public static void main(String[] args) {

		// int a[] = { 4, 6, 23, 10, 1, 3 };
		int a[] = { 3, 5, -1, 8, 12 };
		int b[] = Arrays.copyOf(a, a.length);
		Arrays.sort(a);
		int sum = 0;
		for (int i = 0; i < b.length; i++) {

			if (b[i] != a[a.length - 1]) {
				sum += b[i];
			}
		}

		if (sum == a[a.length - 1]) {
			System.out.println(true);
		} else {
			boolean f = false;
			for (int i = 0; i < a.length; i++) {
				sum -= a[i];
				if (sum == a[a.length - 1]) {
					f = true;
					break;
				}

			}
			if (f) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		}
	}

}
