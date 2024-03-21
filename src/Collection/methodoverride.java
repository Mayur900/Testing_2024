package Collection;

import java.util.Date;

public class methodoverride {
	

	public static void main(String[] args) {
		
		test11 mn = new test11();
		  mn.test(null);
		
	}
	
}

class test 
{
	public final void test(Object o) {
		System.out.println("Object");
	}
}
class test11 extends test
{
	public final void test(String s) {
		System.out.println("String");
	}
	
	/*
	 * public void test(Date d) { System.out.println("Date"); }
	 */
}