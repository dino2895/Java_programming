import java.util.Scanner;
public class if_else14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char x = scn.next().charAt(0);
        if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'||x=='A'||x=='E'||x=='I'||x=='O'||x=='U'){
            System.out.print("v");
        }
        else 
            System.out.print("c");
    }
}
