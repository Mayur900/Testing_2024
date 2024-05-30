package demoTest;

public class Test_ABABAB {

	public static void main(String[] args) {

		// String s = "AABAAB";

		// String s = "AAAA";

		String s = "ABABABAB";

		char ch[] = s.toCharArray();
		int count = 0;
		char c = ' ';
		for (int i = 0; i < ch.length; i++) {

			if (c == ch[i]) {
				count++;

			} else {

				c = ch[i];

			}
		}

		System.out.println(count);

	}

}
