import java.util.Scanner;

public class time2 {
	public static void main(String args[]) {
		int time;
		Scanner scn = new Scanner(System.in);
		
		time = scn.nextInt();
		System.out.print(time%86400%3600/60);
	}
}