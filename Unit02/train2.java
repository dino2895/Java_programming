import java.util.Scanner;

public class train2 {
	public static void main(String args[]) {
		String name1, name2, name3;
		int a, b, c, x, y, z, sum;
		Scanner scn = new Scanner(System.in);
		
		name1 = scn.next();
		a = scn.nextInt();
		x = scn.nextInt();
		
		name2 = scn.next();
		b = scn.nextInt();
		y = scn.nextInt();
		
		name3 = scn.next();
		c = scn.nextInt();
		z = scn.nextInt();
		
		sum = a * x + b * y + c * z;
		System.out.println(name1 + " " + a + " " + x + " " + a * x);
		System.out.println(name2 + " " + b + " " + y + " " + b * y);
		System.out.println(name3 + " " + c + " " + z + " " + c * z);
		System.out.print("sum " + sum);
	}
}