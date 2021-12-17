import java.time.Month;
import java.util.Scanner;

public class while_11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        outer:
        while(true){
            String x = scn.next();
            int m = Integer.parseInt(x.substring(0,2));
            int d = Integer.parseInt(x.substring(2,4));
            //System.out.printf("%d %d",m,d);
            if(d<32&&m<13){
                switch(m){
                    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                        if(d<=31&&d!=0){    
                            System.out.print("confirm");break outer;
                        }
                    case 4: case 6: case 9: case 11:
                        if(d<=30&&d!=0){
                            System.out.print("confirm");break outer;
                        }
                        else 
                            System.out.println("illegal");break;
                    case 2:
                        if(d<=28&&d!=0){
                            System.out.print("confirm");break outer;
                        }
                        else 
                            System.out.println("illegal");break;
                    default:
                        System.out.println("illegal");break;
                }

            }
            else
                System.out.println("illegal");
        }
        
    }
}
