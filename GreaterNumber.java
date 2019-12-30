import java.util.Scanner;

public class GreaterNumber
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        greaterNum(reader);
    }
    
    public static void greaterNum(Scanner readr)
    {
        int num1 = 0;
        int num2 = 0;
        int maxNum = 0;
        
        try
        {
            System.out.print("Type the first number: ");
            num1 = Integer.parseInt(readr.nextLine());
            System.out.print("Type the second number: ");
            num2 = Integer.parseInt(readr.nextLine());
            
            maxNum = Math.max(num1, num2);
            
            if(num1 > num2 | num1 < num2)
            {
                System.out.println("\nGreater number: " + maxNum); 
            } else if(num1 == num2) {
                System.out.println("The numbers are equal.");
            }
            
        } catch(NumberFormatException e){
            System.out.println("Only Numbers.");
        }
        
    }
}