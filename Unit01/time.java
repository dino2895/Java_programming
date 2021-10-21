import java.util.Scanner;

public class time {
	public static void main(String args[]) {
		int km;
		Scanner scn = new Scanner(System.in);
		
		km = scn.nextInt();
		System.out.print((int)Math.ceil(km/0.238));
	}
}