
package fortesting;

public class PrimeNumber {
	public static void main(String args[]) {
		int i, flag = 0;
		int n = 18;// it is the number to be checked
		
		for (i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.println("Number is not prime");
				flag = 1;
				break;
			}
		}
		
		if (flag == 0)
			System.out.println("Number is prime");
	}
}
