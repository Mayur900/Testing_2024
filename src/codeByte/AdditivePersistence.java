package codeByte;

public class AdditivePersistence {

	// if num is 2718 then your program should return 2 because 2 + 7 + 1 + 8 = 18
	// and 1 + 8 = 9 and you stop at 9.

	public static void main(String[] args) {

		boolean flage = true;
		int num = 271854598;
		int count = 0;
		int newNum = 0;
		while (flage) {

			int n = num % 10;
			newNum += n;
			num = num / 10;
			if (num == 0) {
				num = newNum;
				newNum = 0;
				count++;
				if (num > 0 && num < 10) {
					flage = false;
					System.out.println(count);
				}
			}

		} 

	}
}
