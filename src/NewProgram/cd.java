package NewProgram;

class bc {
	
	static void test() {
		
		System.out.println("test success1"); 
	}
}

public class cd extends bc {
	
	static void test() {
		
		System.out.println("test success2"); 
	}
	
	public static void main(String[] args) {
		bc c = new cd();

		c.test();
	}
	
	
	
}