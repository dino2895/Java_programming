
public class InheritanceDemo
{
    public static void main(String[] args)
    {
        SalariedEmployee booch = new SalariedEmployee("Booch",
                                   new Date("January", 1, 2008), 600000);

        System.out.println("---------------------------" );
        System.out.println("Salary Employee's name is " + booch.getName( ));
        System.out.println("Total Salary is " + booch.getSalary( ));
        System.out.println("Monthly pay is " + booch.getMonthlyPay( ));
        System.out.println("---------------------------" );

        System.out.println("Changing Salary Employee");
        booch.setName("Mary");
        booch.setSalary(360000);

        System.out.println("---------------------------" );
        System.out.println("Salary Employee's name is " + booch.getName( ));
        System.out.println("Total Salary is " + booch.getSalary( ));
        System.out.println("Monthly pay is " + booch.getMonthlyPay( ));
        System.out.println("---------------------------" );
 
       }
}
