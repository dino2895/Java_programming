import java.util.Scanner;
public class if_else01{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if(n>100){
            n = n-100;
            System.out.print(n);
        }
        else 
            System.out.print(n);

    }
}