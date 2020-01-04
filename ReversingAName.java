import java.util.Scanner;

public class ReversingAName
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        
        System.out.print("In reverse order: ");
        for(int i = 0, length = name.length() - 1; length >= i; length--)
        {
            /* Loop iterates from length of string minus one until beginning
             * of string, zero
             */
            
            char currentLetter = name.charAt(length);
            System.out.print(currentLetter);
            
        }
            
    }
}
