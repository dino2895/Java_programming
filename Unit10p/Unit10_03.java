import java.util.Scanner;
public class Unit10_03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        double r,guess=n/2;
        for(int i=0;i<6;i++){
            r=n/guess;
            guess = (guess+r)/2;
        }
        System.out.print(Math.round(guess*100)/100);
    }
}
