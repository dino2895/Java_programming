import java.util.Scanner;
public class if_else16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        if(x%400==0){
            System.out.print("Y");
        }
        else if(x%100==0){
            if(x%400!=0){
                System.out.print("N");
            }
        }
        else if (x%4==0){
            if(x%100!=0){
                System.out.print("Y");
            }
            else 
                System.out.print("N");
        }
        else   
            System.out.print("N");
    }
}
