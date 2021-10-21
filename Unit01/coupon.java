import java.util.Scanner;

public class coupon {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int coupon,candy,gum;
		
		coupon = scn.nextInt();
		candy = coupon/10;
		gum = (coupon%10)/3;
		coupon = coupon - candy*10 - gum*3;
		
		System.out.print(candy);
		System.out.print(" ");
		System.out.print(gum);
		System.out.print(" ");
		System.out.println(coupon);
		
	}
}