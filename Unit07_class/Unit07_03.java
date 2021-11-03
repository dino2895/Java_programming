import java.util.Scanner;

public class Unit07_03 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String inputStr,outputStr;
		int inputInt,outputInt;
		inputStr=sc.next();
		inputInt=sc.nextInt();
        //
        outputInt = new Integer(inputStr);
        outputInt +=3;
        outputStr = Integer.toString(inputInt)+"3";
        //
		System.out.println(outputInt);
		System.out.print(outputStr);
	}
}