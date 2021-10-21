import java.util.Scanner;

class EchoDemo {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		String myName;
		
		myName = keyin.next();
		
		System.out.println(myName);
	}
}