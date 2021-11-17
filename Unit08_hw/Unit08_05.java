import java.util.Scanner;
public class Unit08_05 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int col = scn.nextInt();
        int [][] arr1 = new int[row][col];
        int [][] arr2 = new int[row][col];
        int [][] sum = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr1[i][j]=scn.nextInt();
            }
        }
        row = scn.nextInt();
        col = scn.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr2[i][j]=scn.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                for(int k=0;k<row;k++){
                    sum[i][j]+=arr1[i][k]*arr2[k][j];
                }
                System.out.print(sum[i][j]+" ");
            }
        }
    }
}
