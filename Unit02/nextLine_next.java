import java.util.Scanner;

public class nextLine_next {
	public static void main(String args[]) {
		String a, b, c;
		Scanner scn = new Scanner(System.in);
		
		a = scn.next();
		b = scn.next();
		c = scn.nextLine();
		System.out.println(b);
		System.out.print(c.substring(1, c.length()));
	}
}