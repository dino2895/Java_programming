import java.util.Scanner;
public class Unit08_01 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //double[] score = new double[5];
        int index;
        int min;
        int length;
        length = keyboard.nextInt();
        int [] score = new int [length];

        score[0] = keyboard.nextInt( );
        min = score[0];
        for (index = 1; index < score.length; index++)
        {
            score[index] = keyboard.nextInt( );
            if (score[index] < min)
                min = score[index];
        //max is the largest of the values score[0],..., score[index].
        }

        System.out.println(min);
        //System.out.println("The scores are:");
        for (index = 0; index < score.length; index++)
            System.out.println(score[index]- min);
    }
}
