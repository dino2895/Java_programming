import java.util.Scanner;
import java.util.StringTokenizer;
//StringTokenizerDemo
public class Unit06_17 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str;
		str=sc.next();
		StringTokenizer st;
        //
        String delimiters = "%,|abcdefghijklmnopqrstuvwxyz"; //Comma and blank space
        st = new StringTokenizer(str, delimiters);
        //

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
		}
	}
}