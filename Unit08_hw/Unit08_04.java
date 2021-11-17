import java.util.Scanner;
public class Unit08_04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int col = scn.nextInt();
        int [][] arr1 = new int[row][col];
        //int [][] arr2 = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr1[i][j]=scn.nextInt();
            }
        }
        row = scn.nextInt();
        col = scn.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr1[i][j]+=scn.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.printf(arr1[i][j]+" ");
                //System.out.printf("%2d ",arr1[i][j]);
            }
            //System.out.println();
        }
    }
}
