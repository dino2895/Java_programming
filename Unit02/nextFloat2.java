import java.util.Scanner;

public class nextFloat2 {
	public static void main(String args[]) {
		float a;
		Scanner scn = new Scanner(System.in);
		
		a = scn.nextFloat();
		
		System.out.printf("%.1f", a*10.0);
	}
}