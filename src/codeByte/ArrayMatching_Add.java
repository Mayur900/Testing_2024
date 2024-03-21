package codeByte;

public class ArrayMatching_Add {

	public static void main(String[] args) {

//		int a[] = { 1, 2, 5, 6 };
//		int b[] = { 5, 2, 8, 11 };
		
//		int a[] = {5, 2, 3};
//		int b[] = {2, 2, 3, 10, 6};
		
		int a[] = {2, 2, 3, 10, 6};
		int b[] = {5, 2, 3};
		
		String s = "";
		if (a.length == b.length) {
			for (int i = 0; i < b.length; i++) {
				s += a[i] + b[i] + "-";
			}
		} else {
			
			if(a.length > b.length) {
			
				for (int i = 0; i < a.length; i++) {
					if(i < b.length) {
						s += a[i] + b[i] + "-";
					}else {
						s += a[i] + "-";
					}
				}
			}else {
				for (int i = 0; i < b.length; i++) {
					if(i < a.length) {
						s += a[i] + b[i] + "-";
					}else {
						s += b[i] + "-";
					}
				}
			}
		}
		System.out.println(s.substring(0, s.length()-1));
	}

}
