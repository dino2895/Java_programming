import java.util.Scanner;
public class if_else02{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if(n>0)
            System.out.print("P");
        else if(n<0)
            System.out.print("N");
        else if(n==0)
            System.out.print("Z");
    }
}