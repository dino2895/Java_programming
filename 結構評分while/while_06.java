import java.util.Scanner;
public class while_06 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        //System.out.println(x);
        int tmp=x;
        while(tmp!=0){
            if(tmp>x){
                x=tmp;
                System.out.println(x);
            }
            else 
                System.out.println(x);
            tmp=scn.nextInt();
        }
        System.out.println(x);
    }
}
