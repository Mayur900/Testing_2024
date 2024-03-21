package Collection;

public class add {
	
	public static void main(String[] args) {
		
		 System.out.println(test());   
	}

	static int test() {
		try {
	    	
	    	return 1;
	    }
	    catch(Exception e) {
	    	throw e;
	    }
	    finally {
	    	return 3;
	     }
		
	}
}
