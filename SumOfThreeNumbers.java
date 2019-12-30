import java.util.Scanner;

public class SumOfThreeNumbers
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int sum = 0;
        try
        {
            System.out.print("Type your first number: ");
            num1 = Integer.parseInt(reader.nextLine());
            System.out.print("Type your second number: ");
            num2 = Integer.parseInt(reader.nextLine());
            System.out.print("Type your third number: ");
            num3 = Integer.parseInt(reader.nextLine());
            
            sum = num1 + num2 + num3;
            System.out.println("Sum: " + sum);
                
        } catch(NumberFormatException e){
            System.out.println("Only Numbers");
        }
    }
}