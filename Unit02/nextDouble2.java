import java.util.Scanner;
import java.lang.Math;

public class nextDouble2 {
	public static void main(String args[]) {
		double x, ph;
		Scanner scn = new Scanner(System.in);
		
		x = scn.nextDouble();
		ph = 14.0 + Math.log10(x);
		System.out.printf("%.2f", ph);
	}
}