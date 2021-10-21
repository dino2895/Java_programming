import java.util.Scanner;
import java.text.DecimalFormat;
public class Unit04_09 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double x = scn.nextDouble();
        scn.close();
        DecimalFormat y1 = new DecimalFormat("0.###");
        // DecimalFormat y2 = new DecimalFormat("0.000");

        // System.out.print(y1.format(x)+"\r\n");
        System.out.print(y1.format(x));
    }
}

