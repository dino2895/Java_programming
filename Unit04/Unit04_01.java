import java.util.Scanner;
public class Unit04_01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        scn.close();
        System.out.printf("You are %d years old.",x);
    }
}