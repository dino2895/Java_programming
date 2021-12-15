import java.util.Scanner;
public class if_else11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        if(x>99&&x<1000){
            System.out.print("Y");
        }
        else 
            System.out.print("N");
    }
}
