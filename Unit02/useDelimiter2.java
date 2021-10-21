import java.util.Scanner;

public class useDelimiter2 {
	public static void main(String args[]) {
		String s1, s2;
		Scanner scn = new Scanner(System.in);
		scn.useDelimiter("s2 | \n");
		s1 = scn.nextLine();
		s2 = scn.nextLine();
		String[] out = s1.split(s2);
		
		for(String w: out)
			System.out.println(w);
	}
}