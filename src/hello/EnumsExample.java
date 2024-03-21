package hello;

enum enums
{
    A, B, C;
 
    int i = 10;  //enums can have fields
 
    enums()
    {
        //enums can have Constructor
    }
 
    void methodOfEnum()
    {
        //enums can have methods
    }

	public static enums enums() {
		// TODO Auto-generated method stub
		return null;
	}
}
 
public class EnumsExample
{
    public static void main(String[] args)
    {
        enums en = enums.A;
        System.out.println(en.i);  //Constant A has field i
        en.methodOfEnum();         //Constant A has methodOfEnum()
 
        enums en1 = enums.B;
        System.out.println(en1.i);  //Constant B has field i
        en1.methodOfEnum();         //Constant B has methodOfEnum()
 
        enums en2 = enums.C;
        System.out.println(en2.i);   //Constant C has field i
        en2.methodOfEnum();          //Constant C has methodOfEnum()
    }

	private static Object enums() {
		// TODO Auto-generated method stub
		return null;
	}
}