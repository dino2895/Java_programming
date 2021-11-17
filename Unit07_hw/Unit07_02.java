import java.util.Scanner;

import javax.swing.DefaultBoundedRangeModel;


public class Temperature
{
    private double degrees; //Celsius

    public Temperature( )
    {
        degrees = 0;
    }

    public Temperature(double initialDegrees)
    {
        degrees = initialDegrees;

    }

    public void setDegrees(double newDegrees)
    {
        degrees = newDegrees;

    }

    public double getDegrees()
    {
        return degrees;

    }    

    public String toString()
    {
        return (degrees + " C"); 
    }

    public boolean equals(Temperature otherTemperature)
    {
        if(degrees == otherTemperature) 

    }



    public static double toCelsius(double degreesF)
    {
       degrees = (degreesF-32.0)*5/9;
         

    }
public static void main(String[] args)
    {
        double degreesF, degreesC;
                      
        Scanner keyboard = new Scanner(System.in);
        
        degreesF = keyboard.nextDouble( );

        degreesC = toCelsius(degreesF);

        Temperature temperatureObject = new Temperature(degreesC);
        System.out.print("Equivalent Celsius temperature is "+ temperatureObject.toString( ));
    }

}