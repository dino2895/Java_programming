import java.util.Scanner;
public class if_else04{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        if(a>b)
            System.out.print(a);
        else
            System.out.print(b);
    }
}