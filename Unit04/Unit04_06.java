import java.util.Scanner;
import java.text.DecimalFormat;
public class Unit04_06 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double x = scn.nextDouble();
        scn.close();
        DecimalFormat y1 = new DecimalFormat("$#,##0.00");
        DecimalFormat y2 = new DecimalFormat("NT$#,##0.00");

        System.out.print(y1.format(x)+"\r\n");
        System.out.print(y2.format(x));
    }
}


