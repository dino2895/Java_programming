import java.util.Scanner;
public class for_02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int sum = 0;
        int input = scn.nextInt();
        for (int i = 1; i <= input; i++) {
            sum = sum + i;
        }
        System.out.printf("%d",sum);
    }
}
