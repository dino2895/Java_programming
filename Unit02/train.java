import java.util.Scanner;


public class train {
	public static void main(String args[]) {
		int a;
		double b;
		Scanner scn = new Scanner(System.in);
		
		a = scn.nextInt();
		b = scn.nextDouble();
		
		System.out.printf("%.2f", a/b);
	}
}