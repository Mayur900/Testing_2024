
package fortesting;

public class MySingleton   {

	private static MySingleton myObj = null;

	private MySingleton() {
		if(myObj != null) {
			System.out.println("Hello");
		}
		
		
	}


	public static MySingleton getInstance() {
		if (myObj == null) {
			myObj = new MySingleton();
		}

		return myObj;
	}
	

	public static void main(String[] args) {
		MySingleton ms = getInstance();
		System.out.println(ms);
		MySingleton ms1 = getInstance();
		System.out.println(ms1);
	}


	@Override
	public String toString() {
		return "MySingleton [toString()=" + super.toString() + "]";
	}
    
	
}