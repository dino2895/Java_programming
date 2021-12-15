import java.util.Scanner;
public class if_else09 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        if(x>=90)
            System.out.print("A");
        else if(x>=80&&90>x)
            System.out.print("B");
        else if(x>=70&&80>x)
            System.out.print("C");
        else if(x>=60&&70>x)
            System.out.print("D");
        else if(60>x)
            System.out.print("F");
        
    }
}
