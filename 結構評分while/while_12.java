import java.util.Scanner;

public class while_12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int count = 0;
        while(count!=3){
            String x = scn.next();
            if(x.length()==6){
                int c = Integer.parseInt(x.substring(0,3));
                if(c==107){
                    count++;
                    continue;
                }
                else 
                System.out.println("N");   
            }
            else 
                System.out.println("N");
        }
    }
}
