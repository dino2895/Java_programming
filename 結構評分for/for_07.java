import java.util.Scanner;
public class for_07 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int sum = 0;
        int n = scn.nextInt();
        int k = scn.nextInt();
        for (int i = 0;n>i*k; i++) {
            sum = sum +n-k*i;
        }
        System.out.printf("%d",sum);
    }
}
