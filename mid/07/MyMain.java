//07
import java.util.Scanner;
public class MyMain {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        double r,guess=n/2,lastguess;
        
        do{
            r=n/guess;
            lastguess = guess;
            guess = (guess+r)/2;
        }while(guess < 0.99*lastguess || guess > 1.01*lastguess);
            System.out.print(Math.round(guess*100)/100);
        
        
    }
}
