package fortesting;

public class ReversWordInStringArray {

    public static void main(String[] args) {

		/*
		 * String k = "hello world java javatpoint";
		 * 
		 * String h[] = k.split(" "); for (int i = h.length -1; i >= 0; i--) {
		 * System.out.println(h.length); System.out.print(h[i] + " "); }
		 */
    	String s1 = new String("java");
    	String s2 = new String("java1");
    	System.out.println(s1.equals(s2));
        ReversWordInStringArray ab = new ReversWordInStringArray();
        ab.test();
        System.out.println(ab.test());
    }

	//@SuppressWarnings("finally")
	private int test() {
		try { 
        	int i = 10/0;
        	         }
		catch(Exception e) {
			throw new ArithmeticException();
		}
		finally {
			return 3;
		}
	}
}
