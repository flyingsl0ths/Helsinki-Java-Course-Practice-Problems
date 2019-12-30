import java.util.Scanner;

public class APositiveNumber
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        positiveNumber(reader);
    }
    
    public static void positiveNumber(Scanner readr)
    {
        int num = 0;
        
        try
        {
            System.out.print("Type a number: ");
            num = Integer.parseInt(readr.nextLine());
            if (num > 0)
            {
                System.out.println("The number is positive!");
            } else {
                System.out.println("The number is not positive.");
            }
            
        } catch(NumberFormatException e)
        {
            System.out.println("Only Numbers");
        }
    }
}