package Practice_2021;

import java.lang.FunctionalInterface;


@FunctionalInterface
 interface Cc {

	public void get();
}

@FunctionalInterface
interface B extends Cc
{
	public void get();
}

public class C implements B
{
	public void get() {
		System.out.println("I am java developer");
	}

	public static void main(String[] args) {
	//	C c= new C();
		Cc v = ()-> System.out.println("lamba exp");
		 v.get();
		 
	}
}