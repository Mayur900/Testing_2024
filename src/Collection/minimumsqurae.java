package Collection;

import java.util.Scanner;

public class minimumsqurae {
	
	private static int getMinNumSqr(int len, int wid) {

        int count = 0;
       
        if(wid>len) {
             int tmp = len;
             len = wid;
             wid = tmp;
        }

        while(wid>0) {
             count = count + len/wid;
            
             int rem = len % wid;
             len = wid;   
             wid = rem;   
        }
       
        return count;
  }   
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int wid = sc.nextInt();
        int minSqr = getMinNumSqr(len,wid);
        System.out.println("Min Number of square#"+ minSqr);
  }
	}


