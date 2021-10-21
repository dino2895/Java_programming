import java.util.*;

public class useDelimiter {
	public static void main(String args[]) {
		String s1, s2, s3;
		Scanner scn = new Scanner(System.in);
		scn.useDelimiter("#");
		
		s1 = scn.next();
		s2 = scn.next();
		s3 = scn.next();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.print(s3);
	}
}