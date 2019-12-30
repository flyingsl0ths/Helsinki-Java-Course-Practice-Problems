import java.util.Scanner;

public class EvenOrOdd
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        evenOdd(reader);
    }
    
    public static void evenOdd(Scanner readr)
    {
        int num = 0;
        
        try
        {
            System.out.print("Type a number: ");
            num = Integer.parseInt(readr.nextLine());
            if (num % 2 == 0)
            {
                System.out.println("Number " + num + " is even.");
            } else {
                System.out.println("Number " + num + " is odd.");
            }
            
        } catch(NumberFormatException e)
        {
            System.out.println("Please type a number");
        }
    }
}