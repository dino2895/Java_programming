import java.util.Scanner;

public class while_13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int lucky=scn.nextInt();
        int guess;
        do{
            guess = scn.nextInt();
            if(guess < lucky){
                System.out.println("bigger");
            }
            else if (guess > lucky){
                System.out.println("smaller"); 
            }
            else if(guess == lucky){
                System.out.println("bingo");
                break;
            }
        }while(true);
    }
}
