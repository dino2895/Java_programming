import java.util.*;

public class e {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replaceAll("hate", "love");
        System.out.println(s);
        sc.close();
    }
}