import java.util.Scanner;

public class PizzaDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPrice = 0;
        String line = sc.nextLine();
        String[] token = line.split(" ");
        if (isInt(token[0])) {
            switch (token.length) {
            case 1:
                totalPrice = compute(Integer.valueOf(token[0]));
                break;
            case 2:
                totalPrice = compute(Integer.valueOf(token[0]), Integer.valueOf(token[1]));
                break;
            case 3:
                totalPrice = compute(Integer.valueOf(token[0]), Integer.valueOf(token[1]), Integer.valueOf(token[2]));
                break;
            }
        } else {
            if (token.length == 2) {
                totalPrice = compute(token[0], Integer.valueOf(token[1]));
            } else {
                totalPrice = compute(token);
            }
        }
        System.out.print(totalPrice);
    }

    private static boolean isInt(String msg) {
        if (java.lang.Character.isDigit(msg.charAt(0))) {
            return true;
        }
        return false;
    }

    // Method1
    private static int compute(int pbnum) {
        int totalPrice = 0;
        totalPrice = pbnum * 500;

        return totalPrice;
    }

    // Method2
    private static int compute(int pbnum, int cbnum) {
        int totalPrice = 0;
        totalPrice = pbnum * 500 + cbnum * 200;

        return totalPrice;
    }

    // Method3
    private static int compute(int pbnum, int cbnum, int dbnum) {
        int totalPrice = 0;
        totalPrice = pbnum * 500 + cbnum * 200 + dbnum * 50;

        return totalPrice;
    }

    // Method4
    private static int compute(String item, int num) {
        int totalPrice = 0;

        switch (item) {
            case "pb": totalPrice = 500 * num; break;
            case "pm": totalPrice = 400 * num; break;
            case "ps": totalPrice = 300 * num; break;
            case "cb": totalPrice = 200 * num; break;
            case "cs": totalPrice = 100 * num; break;
            case "db": totalPrice =  50 * num; break;
            case "ds": totalPrice =  30 * num; break;
        }

        return totalPrice;
    }

    // Method5
    private static int compute(String... token) {
        int totalPrice = 0;
        int num = 0;

        for (int i = 0; i < token.length; i += 2) {
            num = Integer.valueOf(token[i+1]);
            switch(token[i]) {
                case "pb": totalPrice += 500 * num; break;
                case "pm": totalPrice += 400 * num; break;
                case "ps": totalPrice += 300 * num; break;
                case "cb": totalPrice += 200 * num; break;
                case "cs": totalPrice += 100 * num; break;
                case "db": totalPrice +=  50 * num; break;
                case "ds": totalPrice +=  30 * num; break;
            }
        }

        return totalPrice;
    }
}