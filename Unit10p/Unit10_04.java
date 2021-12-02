import java.util.Scanner;
import java.util.*;
public class Unit10_04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x,y;
        x=scn.nextInt();
        y=scn.nextInt();
        
        double arr[][] = new double[x][y];
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        double sum=0;
        int c=0;
        for(int i=0;i<y;i++){
            for(int j=0;j<x;j++){
                sum+=arr[j][i];
            }
            c++;
            System.out.println("exam"+c+":"+Math.round(sum/x));
            sum=0;
        }
        sum=0;
        c=0;
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                sum+=arr[i][j];
            }
            c++;
            System.out.println("st"+c+":"+Math.round(sum/y));
            sum=0;
        }
    }
}
