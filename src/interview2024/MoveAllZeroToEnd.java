package interview2024;

import java.util.Arrays;

public class MoveAllZeroToEnd {

	public static void main(String[] args) {
		int a[] = { 2, 3, 0, 5, 3, 0, 0, 7, 5, 0, 2 };

		for (int i = 0; i < a.length; i++) {

			int s = a[i];
			if (s == 0) {
				int d = i;
				for (int j = i+1; j < a.length; j++) {

					a[d] = a[j];
					a[j] = s;
					d++;

				}
			}

		}
		System.out.println(Arrays.toString(a));

	}

}
