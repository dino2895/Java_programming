import java.util.Scanner;
import java.lang.Math;

public class unit05_01 {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		float a,out=0.0f;
		a = scn.nextFloat();
		if(a<15000.0f)
			out = 0.0f;
		else if(a<30000.0f&&a>15000.0f)
			out = (a-15000.0f)*0.05f;
		else if(a>=30000.0f)
			out = (15000.0f*0.05f)+((a-30000.0f)*0.1f);
		
		System.out.printf("%.2f",out);
		
	}
}

