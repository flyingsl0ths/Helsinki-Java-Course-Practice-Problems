import java.util.Scanner;

public class SumOfPowers
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int n = 0;
        int sum = 0;
    
        System.out.print("Type a number: ");
        n = Integer.parseInt(reader.nextLine());
        
        for(int i = 0; i <= n; i++)
        {
            sum += (int) Math.pow(2, i);
        } 
            
        System.out.println("The result is " + sum);
    }
}
