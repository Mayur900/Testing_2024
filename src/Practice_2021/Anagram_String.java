package Practice_2021;

import java.util.Arrays;

public class Anagram_String {

	public static void isAnagram(String str1, String str2) {

		if (str1 == null || str2 == null) {
			System.out.println("Null Input String " + str1 + " , " + str2);
			return;
		}

		char[] firtsArs = str1.replaceAll("\\s", "").toLowerCase().toCharArray();

		char[] secoundArs = str2.replaceAll("\\s", "").toLowerCase().toCharArray();

		
		Arrays.sort(firtsArs);
		
		Arrays.sort(secoundArs);
		
		Arrays.equals(firtsArs, secoundArs);
		
		if (Arrays.equals(firtsArs, secoundArs)) {
			System.out.println(str1 + " and " + str2 + " are anagrams");
		} else {
			System.out.println(str1 + " and " + str2 + " are not ====== anagrams");
		}

	}

	public static void main(String[] args) {
		isAnagram("Mother In Law", "Hitler Woman");

		isAnagram("keip", "peRL");

		isAnagram("SiLeNt CAT", "LisTen AcT");

		isAnagram("Debit Card", "Bad Credit");

		isAnagram("Debit Card", null);

		isAnagram(null, "School MASTER");

		isAnagram(null, null);

		isAnagram("School MASTER", "The ClassROOM");

		isAnagram("DORMITORY", "Dirty Room");

		isAnagram("ASTRONOMERS", "NO MORE STARS");

		isAnagram("Toss", "Shot");

		isAnagram("joy", "enjoy");

	}
}
