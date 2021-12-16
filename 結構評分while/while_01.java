import java.util.Scanner;
public class while_01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        switch(x){
            case 100:System.out.print("Excellent");break;
            case 90:System.out.print("Great");break;
            case 80:System.out.print("Good");break;
            case 70:System.out.print("Average");break;
            case 60:System.out.print("Poor");break;
            case 50:System.out.print("Failing");break;
        }
    }
}
