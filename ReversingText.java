import java.util.Scanner;

public class ReversingText
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        
        System.out.print("In reverse order: " + reverse(text));
            
    }
    
    public static String reverse(String text)
    {
        String reversed = "";
        
        for(int i = 0, length = text.length() - 1; length >= i; length--)
        {
            /* Loop iterates from length of string minus one until beginning
             * of string, index zero
             */
            
            reversed += text.charAt(length);
        }
        
        return reversed;
    }
}
