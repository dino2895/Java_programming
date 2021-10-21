import java.util.Scanner;

public class nextLong2 {
	public static void main(String args[]) {
		long a, s, m, h, d;
		Scanner scn = new Scanner(System.in);
		
		a = scn.nextLong();
		a = a/1000;
		d = a/86400;
		h = a%86400/3600;
		m = a%86400%3600/60;
		s = a%86400%3600%60;
		System.out.print(d + " " + h + " " + m + " " + s);
	}
}