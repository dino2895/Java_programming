import java.util.Scanner;
public class for_10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int sum = 0;
        scn.close();
        for (int i = 1;i<11; i++) {
            sum = sum + i;
            System.out.println(sum);
        }
    }
}
