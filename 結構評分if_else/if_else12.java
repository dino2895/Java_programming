import java.util.Scanner;
public class if_else12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        int z = scn.nextInt();
        if(x+y>z&&x+z>y&&y+z>x){
            System.out.print("Y");
        }
        else 
            System.out.print("N");
    }
}
