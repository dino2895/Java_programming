import java.util.Scanner;
import java.math.*;
public class if_else07 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char ch=scn.next().charAt(0);
        if(ch=='t'){
            int x = scn.nextInt();
            int y = scn.nextInt();
            System.out.print(Math.round(Math.floor(x*y/2)));
        }
        else if(ch == 'c'){
            int x = scn.nextInt();
            System.out.print(Math.round(Math.floor(x*x*3.14)));
        }
    }
}
