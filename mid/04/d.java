import java.util.Scanner;

public class d
{
	public static void main(String[] args)
	{
		Scanner Keyboard = new Scanner(System.in);
		int count = Keyboard.nextInt();
		float price = Keyboard.nextFloat();
		double total = count * price;

		System.out.printf("%d item at %.2f each.",count,price);
		System.out.printf("Total amount due $%.2f",total);
	}
}