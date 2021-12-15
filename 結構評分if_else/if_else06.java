import java.util.Scanner;
public class if_else06{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String st = scn.nextLine();
        StringBuilder sb = new StringBuilder(st);
        sb.reverse();
        if(st.equals(sb.toString())){
            System.out.print("T");
        }
        else
            System.out.print("F");
    }
}