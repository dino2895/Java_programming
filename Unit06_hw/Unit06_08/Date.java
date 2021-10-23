import java.util.Scanner;

public class Date
{
    private String month;
    private int day;
    private int year; //a four digit number.

    public Date( )
    {
        month = "January";
        day = 1;
        year = 1000;
    }

    public Date(int myYear)
    {
        setMonth(1);
	    setDay(1);
	    setYear(myYear);
    }

     public Date(int myMonth, int myDay)
    {
       if(monthOK(myMonth) && dayOK(myDay)){
	setMonth(myMonth);
	setDay(myDay);
	setYear(2013);
	} 
      else
       {
            System.out.println("Fatal Error");
            System.exit(0);
        }  
    }

      public Date(String monthString, int day, int year)
    {
        setDate(monthString, day, year);
    }

    public Date(Date aDate)
    {
        if (aDate == null)//Not a real date.
        {
             System.out.println("Fatal Error.");
             System.exit(0);
        }

        month = aDate.month;
        day = aDate.day;
        year = aDate.year;
    }

    public void setDate(String monthString, int day, int year)
    {
        if (dateOK(monthString, day, year))
        {
            this.month = monthString;
            this.day = day;
            this.year = year;
        }
        else
        {
            System.out.println("Fatal Error");
            System.exit(0);
        }
    }

    public void setMonth(int monthNumber)
    {
       //*******************
       // Enter your code here
       //********************
       month = monthString(monthNumber);
    }
    
    public void setMonth(String monthString){
       if(monthOK(monthString)){
          month=new String(monthString);
       }
    }

    public void setDay(int day)
    {
        if ((day <= 0) || (day > 31))
        {
            System.out.println("Fatal Error");
            System.exit(0);
        }
        else
            this.day = day;
    }

    public void setYear(int year)
    {
        if ( (year < 1000) || (year > 9999) )
        {
            System.out.println("Fatal Error");
            System.exit(0);
        }
        else
            this.year = year;
    }

    public int getDay( )
    {
        return day;
    }

    public int getYear( )
    {
        return year;
    }

    private boolean dateOK(String monthString, int dayInt, int yearInt)
    {
        return ( monthOK(monthString) &&
                 (dayInt >= 1) && (dayInt <= 31) &&
                 (yearInt >= 1000) && (yearInt <= 9999) );
    }

   private boolean dayOK(int dayInt)
    {
        return (dayInt >= 1) && (dayInt <= 31) ;
    }

   private boolean monthOK(int monthInt)
    {
         return (monthInt >= 1) && (monthInt <= 12) ;
    }

   private boolean yearOK(int yearInt)
    {
         return (yearInt >= 1000) && (yearInt <= 9999) ;
    }

    private boolean monthOK(String month)
    {
        return (month.equals("January") || month.equals("February") ||
                month.equals("March") || month.equals("April") ||
                month.equals("May") || month.equals("June") ||
                month.equals("July") || month.equals("August") ||
                month.equals("September") || month.equals("October") ||
                month.equals("November") || month.equals("December") );
    }

    private String monthString(int monthNumber)
    {
        switch (monthNumber)
        {
        case 1:
            return "January";
        case 2:
            return "February";
        case 3:
            return "March";
        case 4:
            return "April";
        case 5:
            return "May";
        case 6:
            return "June";
        case 7:
            return "July";
        case 8:
            return "August";
        case 9:
            return "September";
        case 10:
            return "October";
        case 11:
            return "November";
        case 12:
            return "December";
        default:
            System.out.println("Fatal Error");
            System.exit(0);
            return "Error"; //to keep the compiler happy
        }
    }

    public String toString( )
    {
        return (month + " " + day + ", " + year);
    }

}