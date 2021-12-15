import java.util.Scanner;
public class if_else03{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        if(a>b){
            System.out.println(a);
            System.out.print(b);
        }
        else if(b>a){
            System.out.println(b);
            System.out.print(a);
        }

    }
}