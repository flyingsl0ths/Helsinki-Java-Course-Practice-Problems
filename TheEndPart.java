import java.util.Scanner;

public class TheEndPart
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        
        try
        {
            // Asks user for a word and a length
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            System.out.print("Length of the first part: ");
            int length = Integer.parseInt(reader.nextLine());
            
            String result = word.substring(word.length() - length);
            System.out.print("Result: " + result);
            
        } catch(NumberFormatException e) {
            /* if a number is not given as a length exception is caught and
             * handled with a warning
            */
            System.out.println("Length should be number");
        }
        
    }
}