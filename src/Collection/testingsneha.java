package Collection;

import java.util.ArrayList;
import java.util.List;

public class testingsneha {
	  int a =0 ;

	public static void main(String[] args) {
		
		 
		 testingsneha ts = new testingsneha();
		    ts.a++;
		    System.out.println("a" +ts.a);
		    
		  
		String s1 = "jaba";
		String s2 = "developer";
		System.out.println(s1 + " " +s2);
		s1 = s1+s2;
		System.out.println(s1.length());
		s2 = s1.substring(0, s1.length() - s2.length());
		System.out.println(s2.length());// 13- 9 = 4	
		s1 = s1.substring(s2.length()); //  9 
		System.out.println(s1.length());
		System.out.println(s1 + " " +s2);
		
		List<Integer> l1 = new ArrayList<Integer>();

		l1.add(1);
		l1.add(2);
		l1.add(3);

		List<Integer> l2= new ArrayList<Integer>();
		l2.add(4);
		l2.add(5);
		l2.add(6);

		System.out.println("l1 == "+l1);
		System.out.println("l2 == "+l2);

		System.out.println(l2.retainAll(l1));
		
		    System.out.println("l2 == "+l2);
		    
		   
		    
		   
	}

}
