import java.util.*;
public class Unit08_03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int len = scn.nextInt();
        int [] arr1 = new int[len];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=scn.nextInt();
        }
        int len2 = scn.nextInt();
        int [] arr2 = new int[len2];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=scn.nextInt();
        }
        for(int i=0;i<arr1.length;i++){
            arr1[i]+=arr2[i];
            System.out.print(arr1[i]+" ");
        }
        
    }
}
