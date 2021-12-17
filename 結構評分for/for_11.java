//bug 題目 須將檔名改成Main.java 以及class 為Main 才會過
import java.util.*;

class Main{
	public static void main(String[] args){
		int sum = 0;
		for(int i =5;i<=100;i+=5){
			sum += i;
		}
		System.out.print(sum);
	}
}