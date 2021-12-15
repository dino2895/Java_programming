import java.util.Scanner;
public class if_else10{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        if(x%6==0)
            System.out.print("6");
        else if(x%3==0&&x%2!=0)
            System.out.print("3");
        else if(x%2==0&&x%3!=0)
            System.out.print("2");
        else 
            System.out.print("0");
    }
}
