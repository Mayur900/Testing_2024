/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fortesting;

public class ReplaceTwoCharInString {

	public static void main(String[] args) {

		String s = "To change this license header, choose License Headers in Project Properties";

		char arr[] = s.toCharArray();
		 s = "";
		char c1 = 'o';
		char c2 = 'h';

		for (int i = 0; i < arr.length; i++) {

			if(arr[i] == c1 || arr[i] == c2) {
				arr[i] = Character.MIN_VALUE;
			}
		}
		
		for (char c : arr) {
			if(c != Character.MIN_VALUE)
			s += c;
		}
		
		System.out.println(s);

	}
}
