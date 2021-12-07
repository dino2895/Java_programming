//1
import java.math.BigInteger;
import java.util.Scanner;
import java.math.*;
public class Main {
    public static long fib(int f){
        if(f==0||f==1)
            return 1;
        else
            return fib(f-1)+fib(f-2);

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int x=scn.nextInt();
        while(x!=-1){
            System.out.println(fib(x));
            x=scn.nextInt();
        }
        
    }
}
