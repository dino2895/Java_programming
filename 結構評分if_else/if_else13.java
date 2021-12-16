import java.util.Scanner;
public class if_else13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        if(x%2==0||x%3==0){
            System.out.print("Y");
        }
        else 
            System.out.print("N");
    }
}
