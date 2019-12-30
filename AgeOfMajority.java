import java.util.Scanner;

public class AgeOfMajority
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        ageOfConsent(reader);
    }
    
    public static void ageOfConsent(Scanner readr)
    {
        int num = 0;
        
        try
        {
            System.out.print("How old are you: ");
            num = Integer.parseInt(readr.nextLine());
            if (num > 18)
            {
                System.out.println("You have reached the age of majority");
            } else {
                System.out.println("You have not reached the age of majority yet!.");
            }
            
        } catch(NumberFormatException e)
        {
            System.out.println("Please type your age");
        }
    }
}