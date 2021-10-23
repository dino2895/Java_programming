import java.util.Scanner;


public class DateDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casenum=sc.nextInt();
		
		DateTry d1=new DateTry("July",13,2013);
		DateTry d2=new DateTry("July",13,2013);
		DateTry d3=new DateTry("June",22,2009);
		
		switch(casenum){
		case 1:
			
			System.out.println("d1 is equal d2 -> "+ d1.equals(d2));
			System.out.println("d1 is equal d3 -> "+ d1.equals(d3));
			break;
		case 2:
			System.out.println(d1.getMonth()+" "+d1.getDay()+", "+d1.getYear());
			break;
		case 3:
			d1.setMonth("May");
			d1.setDay(7);
			d1.setYear(2009);
			System.out.println(d1.getMonth()+" "+d1.getDay()+", "+d1.getYear());
			break;
		case 4:
			d1.setDate("May", 5, 2014);
			System.out.println(d1.getMonth()+" "+d1.getDay()+", "+d1.getYear());
			break;
		case 5:
			d1.setDate(11, 5, 2014);
			System.out.println(d1.getMonth()+" "+d1.getDay()+", "+d1.getYear());
			break;
		case 6: 
			d1.setDate(d3);
			System.out.println(d1.getMonth()+" "+d1.getDay()+", "+d1.getYear());
			break;
		}
		
		

	}

}
