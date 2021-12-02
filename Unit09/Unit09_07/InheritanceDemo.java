
public class InheritanceDemo
{
    public static void main(String[] args)
    {
        HourlyEmployee joe = new HourlyEmployee("Joe Worker",
                                   new Date("January", 1, 2004), 50.50, 160);

        System.out.println("---------------------------" );
        System.out.println("Hourly Employee's name is " + joe.getName( ));
        System.out.println("Wage Rate is " + joe.getRate( ));
        System.out.println("Work hours are " + joe.getHours( ));
        System.out.println("Total Salary is " + joe.getRate( )*joe.getHours( ));
        System.out.println("---------------------------" );

        System.out.println("Changing Hourly Employee");
        joe.setName("Mary");
        joe.setHours(100);

        System.out.println("---------------------------" );
        System.out.println("Hourly Employee's name is " + joe.getName( ));
        System.out.println("Wage Rate is " + joe.getRate( ));
        System.out.println("Work hours are " + joe.getHours( ));
        System.out.println("Total Salary is " + joe.getRate( )*joe.getHours( ));
        System.out.println("---------------------------" );
 
       }
}
