import java.util.Scanner;

public class while_08 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = 0;
        int sum = 0;
        int count = 0;
        while (sum < 100) {
            x = scn.nextInt();
            sum += x;
            if(sum<100)
                System.out.println(sum);
            count++;
        }
        System.out.printf("over, %d times.", count);
    }
}
