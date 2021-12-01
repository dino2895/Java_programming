

/**
 Class Invariant: All objects have a name string, hire date, 
 and nonnegative salary. A name string of "No name" indicates
 no real name specified yet. A hire date of Jan 1, 1000 indicates
 no real hire date specified yet.
*/
public class SalariedEmployee extends Employee
{
    private double salary; //annual

    public SalariedEmployee( )
    {
        super( );
        salary = 0;
    }

    /**
     Precondition: Neither theName nor theDate are null; 
     theSalary is nonnegative.
    */
    public SalariedEmployee(String theName, Date theDate, double theSalary)
    {

            //****
            // insert your code
            // use super
            //****
        super(theName,theDate);
 
         if (theSalary >= 0) {
            //****
            // insert your code
            //****
            salary = theSalary;

         }
         else
         {
             System.out.println("Fatal Error: Negative salary.");
             System.exit(0);
         }
    }

    public SalariedEmployee(SalariedEmployee originalObject )
    {
         super(originalObject);
         salary = originalObject.salary;
    }

    public double getSalary( )
    {
        //****
        // insert your code
        //****
        return salary;

    }

    /**
     Returns the pay for the month.
    */
    public double getMonthlyPay( )
    {
         //****
        // insert your code
        //****
        return salary/12;

    }

    /**
     Precondition: newSalary is nonnegative.
    */
    public void setSalary(double newSalary)
    {
        //****
        // insert your code
        //****
        salary = newSalary;


    }


}
