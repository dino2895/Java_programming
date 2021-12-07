//11
import java.util.*;
public class MyMain {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        while(!input.equals("0")){
            String arr[] = new String [99];
            StringTokenizer st = new StringTokenizer(input," $");
            int i=0;
            while(st.hasMoreElements()){
                arr[i] = st.nextToken();
                i++;
            }
            for(int j=0;j<i;j++){
                String first = arr[j].substring(0,1);
                String last = arr[j].substring(1,arr[j].length());
                first = first.toUpperCase();
                last = last.toLowerCase();
                System.out.print(first+last);
                if(j<i-1)
                    System.out.print(" ");
            }
            System.out.println();
            input = scn.nextLine();
        }
        if(input.equals("0")){
            System.out.print("Bye");
        }
    }
}
