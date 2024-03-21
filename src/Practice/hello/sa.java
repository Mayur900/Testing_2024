package Practice.hello;

public class sa {

	public static void main(String[] args) {
		
		int alphabet = 65; // ASCII value of alphabet 'A'
        
        for (int i= 0; i<= 6-1 ; i++)
        {
            for (int j=i; j>=0; j--)
            {
                 System.out.print((char) (alphabet + j) + " ");
            }
            System.out.println();
        }
		
		
	}
	
}
