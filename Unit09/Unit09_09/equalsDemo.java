
public class equalsDemo
{
    public static void main(String[] args)
    {
        Employee em1 = new Employee("em1", new Date("January", 1, 2004));
        Employee em2 = em1;
        HourlyEmployee  he1 = new HourlyEmployee( "HE1", new Date("January", 1, 2004),50, 100);
        HourlyEmployee  he2 = he1;
        SalariedEmployee se1= new SalariedEmployee( "SE1", new Date("January", 1, 2004),600000);
        SalariedEmployee se2= se1;
       
 

       
        System.out.println("---------------------------" );
        System.out.println("(em1 object) Employee's name is " + em1.getName( ));
        System.out.println("(em2 object) Employee's name is " + em2.getName( ));
        System.out.println("(he1 object) Employee's name is " + he1.getName( ));
        System.out.println("(he2 object) Employee's name is " + he2.getName( ));
        System.out.println("(se1 object) Employee's name is " + se1.getName( ));
        System.out.println("(se2 object) Employee's name is " + se2.getName( ));
        
        System.out.println("-------------------------" );
        System.out.println("em1 is compared with em2" );
        if (em1.equals(em2) )
           System.out.println("== Two objects are equal." );
        else 
           System.out.println("=! Two objects are not equal." );

        System.out.println("-------------------------" );
        System.out.println("he1 is compared with he2" );
        if (he1.equals(he2) )
           System.out.println("== Two objects are equal." );
        else 
           System.out.println("=! Two objects are not equal." );
           
        System.out.println("-------------------------" );
        System.out.println("se1 is compared with se2" );
        if (se1.equals(se2) )
           System.out.println("== Two objects are equal." );
        else 
           System.out.println("=! Two objects are not equal." );

        System.out.println("-------------------------" );
        System.out.println("he1 is compared with em1" );
        if (he1.equals(em1) )
           System.out.println("== Two objects are equal." );
        else 
           System.out.println("=! Two objects are not equal." );

        System.out.println("-------------------------" );
        System.out.println("se1 is compared with em1" );
        if (se1.equals(em1) )
           System.out.println("== Two objects are equal." );
        else 
           System.out.println("=! Two objects are not equal." );


   
        System.out.println("---------------------------" );
 
       }
}
