import java.util.Scanner;
public class if_else05{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        if(a%10==a/100){
            System.out.print("T");
        }
        else 
            System.out.print("F");
    }
}