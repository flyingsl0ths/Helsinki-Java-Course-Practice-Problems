import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int n = 0;
        int sum = 1;
    
        System.out.print("Type a number: ");
        n = Integer.parseInt(reader.nextLine());
            
        for(int i = 1; i <= n; i++)
        {
            sum *= i;
        } 
            
        System.out.println("Factorial is " + sum);
            
        sum = 0;
    }
}
