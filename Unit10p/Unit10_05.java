import java.util.*;

import javax.sound.midi.SysexMessage;
public class Unit10_05 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double darr [] = new double[5];
        int iarr [] = new int [5];
        if(scn.hasNextInt()){
            for(int i=0;i<iarr.length;i++){
                iarr[i] = scn.nextInt();
            }
            Arrays.sort(iarr);
            System.out.println("Output");
            System.out.println("The least score is "+iarr[0]);
            System.out.println("The scores are:");

            for(int i=0;i<iarr.length;i++){
                double diff=iarr[i]-iarr[0];
                System.out.print(iarr[i]+" differs from min by "+Math.round(diff*10.0)/10.0);
                if(i+1!=iarr.length)
                    System.out.println();
            }
        }
        else if(scn.hasNextDouble()){
            for(int i=0;i<darr.length;i++){
                darr[i] = scn.nextDouble();
            }
            Arrays.sort(darr);
            System.out.println("Output");
            System.out.println("The least score is "+darr[0]);
            System.out.println("The scores are:");

            for(int i=0;i<darr.length;i++){
                double diff=darr[i]-darr[0];
                System.out.print(darr[i]+" differs from min by "+Math.round(diff*10.0)/10.0);
                if(i+1!=darr.length)
                    System.out.println();
            }
        }
    }
}
