import java.util.Scanner;

public class while_10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = 0;
        int balance = 1000;
        char c=scn.next().charAt(0);;
        while (c!='E') {
            switch(c){
                case 'A': 
                    x = scn.nextInt();
                    if(balance-x>=0)
                        balance-=x;
                    else System.out.println("error");
                    break;
                case 'B': 
                    x = scn.nextInt();
                    balance+=x;break;
                case 'C': System.out.println(balance);break;
            }
            c = scn.next().charAt(0);
        }
        
        //System.out.print(balance);
    }
}
