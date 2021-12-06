import java.util.Scanner;
public class Unit08_04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double c,s;
        double circle = scn.nextDouble();
        double square = scn.nextDouble();
        double price = scn.nextDouble();
        double pi = 3.14;
        c = circle*circle*pi*price;
        s = square*square*price;
        System.out.println(c+s);
        //System.out.println(s);
    }
}
