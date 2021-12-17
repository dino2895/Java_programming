import java.util.Scanner;

public class for_14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int input = 0;
        int sum = 0;
        for(;;){
            input = scn.nextInt();
            sum += input;
            if(input == 0)
                break;
        }
        System.out.print(sum);
    }
}