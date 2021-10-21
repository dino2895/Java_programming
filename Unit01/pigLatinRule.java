import java.util.*;

public class pigLatinRule {
	public static void main(String args[]) {
		String first, last, str1, str2, flt, llt, result;
		char ch1, ch2;
		Scanner scn = new Scanner(System.in);
		
		first = scn.next();
		last = scn.next();	
		
		first = first.toLowerCase(); 						//walt
		ch1 = first.charAt(0);								//ch1 = w
		first = first.substring(1, first.length());			//alt
		flt = first.substring(0, 1);						//flt = a
		flt = flt.toUpperCase();							//flt = A
		str1 = first.substring(1, first.length());			//str2 = lt
		result = flt + str1 + ch1 + "ay";					//result = Altway
									
		last = last.toLowerCase();							//savitch
		ch2 = last.charAt(0);								//ch2 = s
		last = last.substring(1, last.length());			//avitch
		llt = last.substring(0, 1);							//llt = a
		llt = llt.toUpperCase();							//llt = A	
		str2 = last.substring(1, last.length());			//str2 = vitch
		result = result + " " + llt + str2 + ch2 + "ay";	//result = Altway Avitchsay
		
		System.out.println(result);
		
	}
}