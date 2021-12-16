import java.util.Scanner;
public class if_else15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int c = 0;
        x = Math.abs(x);
        while(x!=0){
            x/=10;
            c++;
        }
        if(c==2){
            System.out.print("Y");
        }
        else 
            System.out.print("N");
    }
}
