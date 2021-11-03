//rename class to MyMain
//Math.round(y*y*10000.0)/10000.0
import java.lang.Math;
import java.util.Scanner;
public class Unit07_02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double x = scn.nextDouble();
        double y = Math.sqrt(x);
        if(Math.round(y*y*10000.0)/10000.0==x)
            System.out.print(y);
        else
            System.out.print("NaN");
    }
}