import java.util.Scanner;
public class Unit08_05 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double c,s,t;
        double circle = scn.nextDouble();
        double square = scn.nextDouble();
        double base = scn.nextDouble();
        double height = scn.nextDouble();
        double price = scn.nextDouble();
        double pi = 3.14;
        c = circle*circle*pi*price;
        s = square*square*price;
        t = base*height/2*price;
        System.out.println(c+s+t);
    }
}
