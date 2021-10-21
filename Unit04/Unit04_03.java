import java.util.Scanner;
public class Unit04_03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String x = scn.nextLine();
        scn.close();
        System.out.printf("Hello %s, how are you. %s is a undergraduate student.",x,x);
    }
}
