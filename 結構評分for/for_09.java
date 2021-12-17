import java.util.Scanner;
public class for_09 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        scn.close();
        for (int i = 9;i>=1; i--) {
            for (int j=9;j>=10-i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
