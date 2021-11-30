import java.util.*;

public class Unit08_04{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int i,j=0,x=0;
		String c;
		String d;
		c = sc.next().toUpperCase();
		d = sc.next().toUpperCase();
        for(i=0;i<c.length();i++){
            if(c.charAt(i)==d.charAt(j)){
                j++;
                x++;
            }
            if(x==d.length())
                break;
        }
        if(x==d.length())
            System.out.print("Y");
        else 
            System.out.print("N");
    }
}
