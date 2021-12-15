import java.util.Scanner;
import java.util.concurrent.PriorityBlockingQueue;
import java.math.*;
public class if_else08 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double x = scn.nextDouble();
        double y = scn.nextDouble();
        double profit = (y-x)*100/x;
        
        if(profit>0)
            System.out.printf("profit %.2f%%",profit);
        else if(profit<0||profit==0){
            profit = 100-(profit+100);
            System.out.printf("loss %.2f%%",profit);
        }
    }
}
