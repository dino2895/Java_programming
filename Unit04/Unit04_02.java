import java.util.Scanner;
public class Unit04_02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        int z = x+y;
        scn.close();
        System.out.printf("%d add %d are %d.",x,y,z);
    }
}
