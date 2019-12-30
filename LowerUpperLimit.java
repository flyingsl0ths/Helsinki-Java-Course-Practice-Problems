import java.util.Scanner;

public class LowerUpperLimit
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int lower = 0;
        int upper = 0;
            
        System.out.print("First: ");
        lower = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        upper = Integer.parseInt(reader.nextLine());
        
        if(lower < upper & upper > lower)
        {
            for(int i = lower; i <= upper; i++)
            {
                System.out.println(i);
            }  
        }
    }
}
