package Practice_2021;

import java.util.ArrayList;
import java.util.Iterator;

class My {

	int story = 0;

	public My go(My my) {
		my = null;
		return my;
	}

}

public class A {

	public static void main(String[] args) {
		/*
		 * My m1 = new My(); My m2 = new My(); My m3 = m2.go(m2); m1 = null;
		 * 
		 * System.out.println(m1); System.out.println(m2); System.out.println(m3);
		 */
		
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
		list.remove("Vijay");
		System.out.println(list.size());
		list.add("neha");
		System.out.println(list);
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  
	}


