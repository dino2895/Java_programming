import java.util.Scanner;
import java.text.DecimalFormat;
public class Unit04_05 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double x = scn.nextDouble();
        scn.close();
        
        DecimalFormat formatter = new DecimalFormat("NT$#,##0.00");
        System.out.print(formatter.format(x));
    }
}


