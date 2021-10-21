import java.util.Scanner;

public class nextLong2 {
	public static void main(String args[]) {
		long a, s, m, h, d;
		Scanner scn = new Scanner(System.in);
		
		a = scn.nextLong();
		d = a/86400000;
		h = a%86400000/3600;
		m = a%86400000%3600/60;
		s = a%86400000%3600%60;
		System.out.print(d + " " + h + " " + m + " " + s);
	}
}