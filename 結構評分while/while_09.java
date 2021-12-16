import java.util.Scanner;

public class while_09 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = 0;
        int sum = 0;
        while (x!=9999) {
            sum += x;
            x = scn.nextInt();
        }
        System.out.print(sum);
    }
}
