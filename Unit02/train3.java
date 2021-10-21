import java.util.*;

public class train3 {
	public static void main(String args[]) {
		String s1;
		Scanner scn = new Scanner(System.in);
		s1 = scn.nextLine();
		String[] out = s1.split("#");
		
		System.out.print(out[0] + out[2]);
	}
}