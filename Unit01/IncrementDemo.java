import java.util.Scanner;

public class IncrementDemo {
	public static void main(String[] args){
		int a,b;
		int x,y,z;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		
		//---------------------
		//---Begin to Modify---
		//---------------------		
		x = (++a) + (++a) + (a++);		
		y = (--b) - (--b) - (--b);
		z = a+b;
		//---------------------
		//---End to Modify-----
		//---------------------
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
