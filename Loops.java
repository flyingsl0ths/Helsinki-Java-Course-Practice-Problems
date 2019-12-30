import java.util.Scanner;

public class Loops
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        double average;
        int n = 0;
        int sum = 0;
        int evens = 0;
        int odds = 0;
        
        System.out.println("Type Numbers: ");
        
        while(true)
        {
            // Ask for user input
            int number = Integer.parseInt(reader.nextLine());
            if(number == -1)
            {
                break;
            }
            
            // sum of user inputted number
            sum += number;
            n++;
            
            // Check for odd or even numbers
            if(number % 2 == 0)
            {
                evens++;
            } else {
                odds++;
            }
        }
        average = (double)sum / n;
        
        System.out.println("Thank you and see you later");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + n);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + evens);
        System.out.println("Odd numbers: " + odds);
    }
}
