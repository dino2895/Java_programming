import java.util.Scanner;
import java.lang.Math;

public class unit05_02 {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		String text;
		int count = 5;
		while (count!=0){
			text = scn.next();
			switch (text){
				case "a":
					System.out.print("A ");
					count--;
					break;
				case "b":
					System.out.print("B ");
					count--;
					break;
				case "c":
					System.out.print("C ");
					count--;
					break;
				case "d":
					System.out.print("D ");
					count--;
					break;
				case "e":
					System.out.print("E ");
					count--;
					break;
				default:
					System.out.print("Z ");
					count--;
					break;
			}
			
		}
		
	}
}

