package fortesting;

public class MissingNumber {

	public static void main(String[] args) {

		int[] n = { 1,2, 3, 4, 5, 7, 8, 9, 10, 12, 14, 15 };

		for (int i = 1; i <= 15; i++) {
			boolean flage = false;
			
			for (int j = 0; j < n.length; j++) {

				if (n[j] == i) {
					flage = true;
					break;
				}
			}
			if (!flage) {
				System.out.println(i);
			}
		}
	}

}
