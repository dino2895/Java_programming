
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
        int b1,b2,b3,b4;
        int rate;
        Scanner keyboard = new Scanner(System.in);
        //System.out.println("Enter the rate per hour for hourly Employee Tom:");
        rate = keyboard.nextInt( );
        //System.out.println("Enter the work hours for hourly Employee Tom:");
        b1 = keyboard.nextInt( );

        //work weeks per year
        b2 = keyboard.nextInt( ); 
        //System.out.println("Enter the Salary per year for the Salary Employee Mary:");
        
        b3 = keyboard.nextInt( ); 
        //System.out.println("Enter the Salary per year for the Salary Employee Keivan:");
        b4 = keyboard.nextInt( ); 
        keyboard.close();

        // System.out.println();
        a1 = new HourlyEmployee("Tom", new Date("January", 1, 2008), rate, b1, b2);
                               //(theName, Date , theWageRate, theHours)
        a2 = new SalariedEmployee("Mary", new Date("January", 11, 2008), b3);
                               //(theName, Date , the year Salary)
        a3 = new SalariedEmployee("Keivan", new Date("January", 21, 2008), b4);
                               //(theName, Date , the year Salary)
                               
        // System.out.println((int)a1.getSalary());
        // System.out.println((int)a2.getSalary());
        // System.out.println((int)a3.getSalary());
        // System.out.println();
        if(a1.getSalary()>a2.getSalary()){
            if(a1.getSalary()>a3.getSalary()){
                System.out.print((int)a1.getSalary());
            }
            else
                System.out.print((int)a3.getSalary());
        }
        else{
            if(a2.getSalary()>a3.getSalary())
            System.out.print((int)a2.getSalary());
            else
            System.out.print((int)a3.getSalary());
        }
     }
 }
