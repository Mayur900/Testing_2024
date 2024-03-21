package Practice_2021;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalInterface {

	public static void main(String[] args) {
		
		List<Aa> ls = new ArrayList<>();
		Aa aa = new Aa(290 , "sneha nagraj", 23);
		Aa ab = new Aa(299 , "sneha_nagraj", 28);
		Aa an = new Aa(298 , "sneha.nagraj", 27);
		Aa am = new Aa(2904 , "sneha@nagraj", 26);
            ls.add(aa);
            ls.add(ab);
            ls.add(an);
            ls.add(am);
            
         List<Aa> ls1 = ls.stream().filter(m -> m.name.equals("sneha.nagraj"))
        		// .map(m -> m.name)
        		 .collect(Collectors.toList());
            System.out.println(ls1);
         Aa nn= ls.stream().max((p1,p2)-> p1.age > p2.age ? 1 : -1).get();
         System.out.println(nn);
            
	}

	@Override
	public String toString() {
		return "FunctionalInterface [toString()=" + super.toString() + "]";
	}
}

class Aa{
	int id; String name ;
	int age;
	public Aa(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Aa [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}