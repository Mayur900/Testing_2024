package Practice.hello;

import java.util.ArrayList;

/**
     a
    a a
   a b a
  a b b a
 a b c b a
a b c c b a
 a b c b a
  a b b a
   a b a
    a a
     a
 */
public class Patren20 {

    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
    	
    	
    	int alphabet = 64;

        int u = 0;
        for (int i = 1; i < 5; i++) {
            for (int j = 5 - i; 1 < j; j--) {
                System.out.print(" ");
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
//                System.out.print(j + " ");
                System.out.print((char) (alphabet + j) + " ");
                if (j > u) {
                    int o = u;
                    for (int k = 1; k <= u; k++) {
//                        System.out.print(o-- + " ");
                    	o--;
                        System.out.print((char) (alphabet + o) + " ");

                    }
                    u++;
                }
            }
            System.out.println("");
        }
    }
}
