import java.util.Scanner;

public class AgeCheck
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        for(int i = 0; i < 4; i++)
        {
            checkAge(reader);
            System.out.println();
        }
    }
    
    public static void checkAge(Scanner readr)
    {
        int num = 0;
        
        try
        {
            System.out.print("How old are you: ");
            num = Integer.parseInt(readr.nextLine());
            if (num > 0 && num < 120)
            {
                System.out.println("OK");
            } else {
                System.out.println("Impossible!");
            }
            
        } catch(NumberFormatException e)
        {
            System.out.println("Please type your age");
        }
    }
}