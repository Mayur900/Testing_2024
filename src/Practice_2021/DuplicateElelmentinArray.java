package Practice_2021;

public class DuplicateElelmentinArray {
	
	
	public static void main(String[] args) {

		int[] inputArray = new int[] {111, 333, 555, 777, 333, 444, 555};
		
		for (int i = 0; i < inputArray.length; i++) {
			
			int first = inputArray[i];
			
			for (int j = 0; j < inputArray.length; j++) {
				
				
				if(first == inputArray[j] && i != j && first != 0) {
					System.out.println("Duplicate Element : "+inputArray[j]);
					inputArray[j] = 0;
				}
				
				
			}
			
			
		}
		
	}
}
