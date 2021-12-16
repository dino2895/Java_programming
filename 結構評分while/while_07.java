import java.util.Scanner;
public class while_07 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int sum = 0;
        int count = 1;
        while(x!=count-1){
           sum += count;
           count++;
           System.out.println(sum);
        }
        //System.out.print(sum);
    }
}
