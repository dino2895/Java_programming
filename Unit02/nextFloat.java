import java.util.Scanner;

public class nextFloat {
	public static void main(String args[]) {
		float x, y, R;
		Scanner scn = new Scanner(System.in);
		
		x = scn.nextFloat();
		y = scn.nextFloat();
		R = x * (y * 2 / 9.8f);
		System.out.printf("%.2f", R);
	}
}