//他媽的\n 跟println 有啥差別??? \r\n\r\n\r\n\r\n\
import java.util.Scanner;
public class Unit04_04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double x = scn.nextDouble();
        scn.close();

        System.out.printf("Start%10.2fEnd\r\n", x);
        //System.out.println();
        System.out.printf("Start%-10.2fEnd", x);
    }
}
