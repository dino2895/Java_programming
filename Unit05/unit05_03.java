import java.util.Scanner;
import java.lang.Math;

public class unit05_03 {
	Scanner scn=new Scanner(System.in);
	int a;
	a = scn.nextInt();
	for (int i = 1; i <= a; i  ) { 
		for (int j = 1; j <= a - i; j  ) { 
			System.out.print(" ");
		}
		for (int k = 1; k <= i * 2 - 1; k  ) {  
			System.out.print("*");
		}
		System.out.println("");
	}
}