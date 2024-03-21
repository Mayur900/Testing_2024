package interview2024;

import java.util.Arrays;

public class MoveAllZeroToEnd_2 {

	public static void main(String[] args) {
		int a[] = { 2, 3, 0, 5, 3, 0, 0, 7, 5, 0, 2 };

		String s = "";

		for (int i = 0; i < a.length; i++) {

			if (a[i] != 0) {
				s += String.valueOf(a[i]);
				a[i] = 0;
			}
		}

		for (int i = 0; i < s.length(); i++) {

			a[i] = Integer.parseInt(Character.toString(s.charAt(i)));
		}

		System.out.println(Arrays.toString(a));

	}

}
