import java.util.Scanner;
public class while_04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        switch(x){
            case 5:System.out.println("*****");
            case 4:System.out.println("****");
            case 3:System.out.println("***");
            case 2:System.out.println("**");
            case 1:System.out.println("*");
        }
    }
}
