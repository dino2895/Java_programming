import java.util.Scanner;

public class nextLine2 {
	public static void main(String args[]) {
		String a, b, c;
		Scanner scn = new Scanner(System.in);
		
		a = scn.nextLine();
		b = scn.nextLine();
		c = scn.nextLine();
		System.out.print(a + b + c);
	}
}