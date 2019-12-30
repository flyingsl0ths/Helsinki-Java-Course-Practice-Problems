import java.util.Scanner;

public class LeapYear
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int[] ages = new int[4];
        for(int i = 0, l = ages.length; i < l; i++)
        {
            checkYear(reader);
            System.out.println();
        }
    }
    
    public static void checkYear(Scanner readr)
    {
        int year = 0;
        
        try
        {
            System.out.print("Type a year: ");
            year = Integer.parseInt(readr.nextLine());
            if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            {
                System.out.println("This year is a leap year");
            } else {
                System.out.println("This year is not a leap year");
            }
            
        } catch(NumberFormatException e)
        {
            System.out.println("Please type a year");
        }
    }
}