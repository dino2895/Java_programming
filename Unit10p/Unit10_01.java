import java.util.Scanner;
public class Unit10_01 {
    public static void main(String[] args) {
        int input;
        Scanner scn = new Scanner(System.in);
        String str1 = scn.next();
        StringBuilder str2 = new StringBuilder(str1);
        str2.reverse();
        if(str1.equals(str2.toString()))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}
