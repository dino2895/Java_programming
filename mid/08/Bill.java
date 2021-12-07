import java.util.Scanner;
public class Bill {
 public static double RATE=150.00;
 
 private int hours;
 private int minutes;
 private double fee;
    public void inputTimeWorked() {
     System.out.println("Enter number of full hours worked");
     System.out.println("followes by number of minutes:");
     Scanner keyboard=new Scanner(System.in);
     hours=keyboard.nextInt();
     minutes=keyboard.nextInt();
     }
    
    public double computeFee(int hours,int minutes)
    {
     minutes=hours*60+minutes;
        int quarterHours=minutes/15;
        return quarterHours*RATE;

    }
    
    public void updateFee() 
    {
     fee=computeFee(hours,minutes);
    }
    public void outputBill() 
    {
    System.out.println("Time worked: ");
    System.out.println(hours + " hours and "+ minutes +" minutes");
    System.out.println("Rate: $"+ RATE +" per quarter hour.");
    System.out.println("Amount due: $"+ fee);
    }
}


