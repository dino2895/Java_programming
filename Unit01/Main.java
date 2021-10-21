import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int a , b ,c;
		double result = 0.0;
		Scanner sc = new Scanner(System.in);

		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		//---------------------
		//---Begin to Modify---
		//---------------------		
		result = (double)(a + b)*c/2.0;
		//---------------------
		//---End to Modify-----
		//---------------------
		
		System.out.println(result);
	}

}