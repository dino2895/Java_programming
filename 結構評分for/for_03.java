import java.util.Scanner;
public class for_03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int sum = 0;
        int input = scn.nextInt();
        for (int i = 0; i <=input; i+=2) {
            sum = sum + i;
        }
        System.out.printf("%d",sum);
    }
}
