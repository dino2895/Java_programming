import java.util.Scanner;

public class OverloadingDemo
{
    public static void main(String[] args)
    {
        System.out.println("Please Inpute one  year");

        Scanner sc =new Scanner(System.in);
       int year; 
       
       year=sc.nextInt();

        Date myBirthday = new Date(year);
       
        System.out.println("Your Date is " + myBirthday + ".");
        System.out.println("Please Input new month: ");
        int newMonth=sc.nextInt();
        myBirthday.setMonth(newMonth);
        System.out.println("Your new date is " + myBirthday + ".");


     }
}
