package Practice_2021;

import java.time.*;

public  class Test{
	public static void main(String a[]) {
		
		LocalDate date = LocalDate.now();
		System.out.println(date); // current system date 
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yyyy = date.getYear();
		System.out.println(dd + " " +mm +" " + yyyy);
		System.out.printf("%d/%d/%d",dd,mm,yyyy); // we can format our own current system date 
		
		LocalTime time = LocalTime.now();
		 System.out.println(time);
		 int hh = time.getHour();
		 int min = time.getMinute();
		 int sec = time.getSecond();
		 int ns = time.getNano();
		 System.out.println(hh +"" +min +""+sec+""+ns);
		 System.out.printf("%d:%d:%d:%d",hh,min,sec,ns);
		 
		 LocalDateTime ldt = LocalDateTime.now();
		 System.out.println(ldt);
		 int d = ldt.getDayOfMonth();
		 int m = ldt.getMonthValue();
		 int yy = ldt.getYear();
		 System.out.printf("%d/%d/%d",d,m,yy);
		 int h = ldt.getHour();
		 int minn = ldt.getMinute();
		 int secc = ldt.getSecond();
		 int nss = ldt.getNano();
		 System.out.printf("%d:%d:%d:%d",h,minn,secc,nss);

		 LocalDateTime lt = LocalDateTime.of(yy,m,d,h,minn);
		 LocalDateTime lt1 = LocalDateTime.of(1995,07,28,12,45);
		 System.out.println("\n" +lt1);
		 System.out.println("\n" + lt.plusMonths(6));
		 System.out.println("\n" + lt.minusMonths(7));
		 
     bc bb = () ->  {
    	 System.out.println("I am java developer");
     };
     
     bb.message();

	bd bn = (int b, int c)->(b+c);
		System.out.println(bn.message1(10, 40));
	
	}
}
//@FunctionalInterface
interface bc {
	void message();
	
}


interface bd {
	int message1(int b , int c);
	
}