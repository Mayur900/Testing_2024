package demoTest;

public class BracketTest {

	public static void main(String[] args) {

		// the characters '(', ')', '{', '}', '['

		// input: s = "()"Output: true
//		 * Example 2: Input: s = "()[]{}"Output: true 
		// Example 3: Input: s = "(]"Output:
		// * false
		// */

		String s = "(ab{a[c}a)]a)";

		System.out.println(stringFind(s));

	}

	public static boolean stringFind(String s) {

		char ch[] = s.toCharArray();
		int count = 0;
		char c = ' ';
		boolean flage = false;
		int asci = 0;
		for (int i = 0; i < ch.length; i++) {

			if (count == 1) {
				if (((int) c + asci) == (int) ch[i]) {
					flage = true;
					count = 0;
					c = ' ';
				}
			} else {

				count++;
				c = ch[i];

				if (ch[i] == '(') {

					asci = +1;
				} else {
					asci = +2;
				}

				flage = false;

			}
		}

		return flage;

	}

}
