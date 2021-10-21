import java.util.Scanner;

public class circle {
	public static void main(String args[]) {
		int x, y;
		Scanner scn = new Scanner(System.in);
		
		x = scn.nextInt();
		y = scn.nextInt();
		if(x * x + y * y < 100 * 100)
			System.out.print("inside");
		else 
			System.out.print("outside");
	}
}