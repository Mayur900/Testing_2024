package Practice_2021;

import java.util.Comparator;

public class MyEmployee implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o) {
		
		if(o1.getId()==o.getId())  
			return 0;  
			else if(o1.getId() >o.getId())  
			return 1;  
			else  
			return -1; 
		}

	

}
