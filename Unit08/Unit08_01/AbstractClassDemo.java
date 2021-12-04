
import java.util.Scanner;

/**
 Demonstrates where the clone method works,
 but copy constructors do not.
*/
public class AbstractClassDemo
{

    public static void main(String[] args)
    {
        
        Employee a1,a2,a3;
        int b1,b2,b3;
        int hourlyrate, weeklyrate;
        Scanner keyboard = new Scanner(System.in);

        //System.out.println("Enter the rate per hour for hourly Employee Tom:");
        hourlyrate = keyboard.nextInt( );
        //System.out.println("Enter the work hours for hourly Employee Tom:");
        b1 = keyboard.nextInt( );

        //System.out.println("Enter the Salary per year for the Salary Employee Mary:");
        b2 = keyboard.nextInt( ); 
 
        //System.out.println("Enter the weeklyrate per week for weekly Employee Keivan:");
        weeklyrate = keyboard.nextInt( );
        //System.out.println("Enter the work weeks for weekly Employee Keivan:");
        b3 = keyboard.nextInt( );

       // ***********************************
       // insert your code
       //a1: assign a HourlyEmployee class, name is Tom
       //a1: assign a SalariedEmployee class, name is Mary
       //a1: assign a WeeklyEmployee class, name is Mary
       // ***********************************

        a1 = new HourlyEmployee("Tom",new Date(),hourlyrate,b1);
        a2 = new SalariedEmployee("Mary",new Date(),b2);
        a3 = new WeeklyEmployee("Mary",new Date(),weeklyrate,b3);
        
        if (a1.samePay(a2) )
            System.out.print("Tom and Mary are the same pay");
        else
            System.out.print("Tom and Mary are not the same pay");

        if (a1.samePay(a3) )
            System.out.println("Tom and Keivan are the same pay");
        else
            System.out.println("Tom and Keivan are not the same pay");


     }
 }
