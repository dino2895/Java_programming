import java.util.Scanner;
import java.math.BigDecimal;

public class Factorial {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int flag = scn.nextInt();
		System.out.println(factorial(flag));
	}
	private static BigDecimal factorial(int flag){
		if(flag <= 0)
			return new BigDecimal(1);
		return new BigDecimal(flag).multiply(factorial(flag - 1));
			
	}
}