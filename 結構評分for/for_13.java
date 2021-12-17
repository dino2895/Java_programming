import java.util.Scanner;

public class for_13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int input = scn.nextInt();
        scn.close();
        for(int i=0;i<=100;i++){
            if(i%input==0)
                continue;
            System.out.println(i);
        }
    }
}
