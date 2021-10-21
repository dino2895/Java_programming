import java.util.Scanner;
import java.lang.Math;
class BMI{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double m,h;
        double result;
        h = sc.nextDouble();
        m = sc.nextDouble();
        h = h/100;
        result = m / (h*h);
        System.out.println(Math.floor(result * 10.0) / 10.0);
    }
}