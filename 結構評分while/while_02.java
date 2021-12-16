import java.util.Scanner;
public class while_02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        switch(x){
            case 100:case 90:case 80:case 70:case 60:System.out.print("Pass");break;
            default:System.out.print("Fail");break;
            
        }
    }
}
