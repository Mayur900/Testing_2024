package codeByte;

public class Arithmetic_Geometric {

	// * Arithmetic example: [2, 4, 6, 8] and *
	// * Geometric example: [2, 6, 18, 54]. Negative numbers may be *

	public static void main(String[] args) {

		//int a[] = { 2, 4, 6, 8 };
		//int a[] = { 2, 4, 18, 54 };
		int a[] = {1,2,3,4,5,6,7,8};
		int multiplied = a[0];
		boolean flage = true;
		int lastNum = multiplied;
		for (int i = 1; i < a.length; i++) {

			if (a[i] - lastNum != multiplied) {
				flage = false;
				break;
			}
			
			lastNum = a[i];

		}

		if (flage) {
			System.out.println("Arithmetic");
		} else {
			System.out.println("Geometric");
		}

	}

}
