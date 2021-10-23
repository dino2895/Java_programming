public class DateTry{
        private String month;
        private int day;
        private int year;   
        public DateTry(String month,int day,int year){
              this.month=month;
              this.day=day;
              this.year=year;
        }

	public boolean equals(DateTry date){
        //Enter your code here
        boolean result=false;
        result = month.equalsIgnoreCase(date.month)&& 
        (day==date.day) && (year==date.year);
        
        return result;
        }
        
    public String getMonth(){
        //Enter your code here
        return month;
    }

    public int getDay(){
        //Enter your code here
        return day;
    }

    public int getYear(){
        //Enter your code here
        return year;
    }

    public boolean setMonth(String month){
        //Enter your code here
        boolean result=true;
        this.month = month;
        return result;

    }

    public boolean setDay(int day){
        //Enter your code here
        boolean result=true;
        this.day = day;
        return result;
    }

    public boolean setYear(int year){
        boolean result=true;
        //Enter your code here
        this.year = year;
        return result;
    }

    public boolean setDate(String month,int day,int year){
        boolean result=true;
        //Enter your code here
        this.month = month;
        this.day = day;
        this.year = year;
        return result;
    }

    public boolean setDate(int monthInt,int day,int year){
        boolean result=true;
        //Enter your code here
        month = monthString(monthInt);
        this.day = day;
        this.year = year;
        return result;
    }

    public boolean setDate(DateTry date){
        boolean result=true;
        //Enter your code here
        this.month = date.month;
        this.day = date.day;
        this.year = date.year;
        return result;
    }
    
    
    public String monthString(int monthNumber)
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
            return "Error"; 
        }
    }
}