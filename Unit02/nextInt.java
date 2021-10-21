import java.util.Scanner;

public class nextInt {
	public static void main(String args[]) {
		int x, y;
		Scanner scn = new Scanner(System.in);
		
		x = scn.nextInt();
		y = scn.nextInt();
		System.out.print(x + y);
	}
}