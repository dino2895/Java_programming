import java.util.*;
public class Unit10_02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        //ArrayList<String> arr = new ArrayList<String>();
        double arr[] = new double[10];
        StringTokenizer st = new StringTokenizer(input," ");
        int i=0;
        while(st.hasMoreElements()){
            arr[i]=Double.parseDouble(st.nextToken());
            i++;
        }
        Arrays.sort(arr);
        System.out.print("Large to small: ");
        for(int j=arr.length-1;arr[j]!=0;j--){
            System.out.print(arr[j]);
            if(arr[j]!=0)
                System.out.print(" ");
        }
    }
}
