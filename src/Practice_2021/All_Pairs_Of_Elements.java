package Practice_2021;

public class All_Pairs_Of_Elements {

	public static void main(String[] args) {
		
		findThePairs(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);
	}
	
	static int findThePairs(int inputArray[] , int j) {
		
		for (int j2 = 0; j2 < inputArray.length; j2++) {
			
			int value = inputArray[j2];
			
			for (int k = 0; k < inputArray.length; k++) {
				
				if(value + inputArray[k] == j && j2 != k) {
					
					System.out.println(inputArray[j2]+" + "+inputArray[k]+" = "+j);
				}
				
			}
			
			
		}
		
		
		
		return 0;
	}
	

}
