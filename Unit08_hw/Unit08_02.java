import java.util.*;
public class Unit08_02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int len = scn.nextInt();
        boolean flag = true;
        int [] arr1 = new int[len];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=scn.nextInt();
        }
        int len2 = scn.nextInt();
        int [] arr2 = new int[len2];
        for(int j=0;j<arr2.length;j++){
            arr2[j]=scn.nextInt();
        }
        if(len!=len2)
            flag = false;
        else{
            int x = 0;
            while(x<arr1.length){
                if(arr1[x]!=arr2[x]){
                    flag = false;
                    break;
                }
                x++;
            }
            //flag = true;
        }
        System.out.print(flag);
    }
}
