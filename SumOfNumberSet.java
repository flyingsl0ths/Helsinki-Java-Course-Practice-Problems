import java.util.Scanner;

public class SumOfNumberSet
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int max = 0;
        int sum = 0;
        
        do
        {
            System.out.print("Until What?: ");
            max = Integer.parseInt(reader.nextLine());
            for(int i = 1; i <= max; i++)
            {
                sum += i;
            }
            
            System.out.println("\nSum is " + sum);
            sum = 0;
            
        } while(max > 0);
    }
}
