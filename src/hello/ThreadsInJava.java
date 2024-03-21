package hello;

import java.util.ArrayList;

public class ThreadsInJava
{
	static void processElements(ArrayList<? extends StringBuffer> a)
    {
        for (Object element : a)
        {
            System.out.println(element);
        }
    }
	
	public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
 
        list.add("JAVA");
 
 
        for (String str : list)
        {
            //No type casting needed. ClasscastException Never occurs
 
            System.out.println(str);
        }
    }
}