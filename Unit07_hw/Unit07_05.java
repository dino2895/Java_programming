import java.util.Scanner;
import java.util.StringTokenizer;

public class Unit07_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        StringTokenizer st = new StringTokenizer(sentence," ");
        int i=0;
        while(st.hasMoreElements()){
            if(i==0){
                System.out.print(st.nextToken());
                if(st.hasMoreElements())
                    System.out.print(" ");
            }
            else{
                System.out.print(st.nextToken().toUpperCase());
                if(st.hasMoreElements())
                    System.out.print(" ");
            }
            i++;    
        }
    }
}