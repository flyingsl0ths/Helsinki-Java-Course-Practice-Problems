import java.util.Scanner;

public class SumBetweenTwoNumbers
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int lower = 1;
        int upper = 1;
        int sum = 0;
            
        while(lower < upper && upper > lower);
        {
            System.out.print("First: ");
            lower = Integer.parseInt(reader.nextLine());
            System.out.print("Last: ");
            upper = Integer.parseInt(reader.nextLine());
            
            for(int i = lower; i <= upper; i++)
            {
                sum += i;
            } 
            
            System.out.println("The sum is " + sum);
            
            sum = 0;
            
        }
    }
}
