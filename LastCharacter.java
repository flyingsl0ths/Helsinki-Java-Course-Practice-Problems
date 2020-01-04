import java.util.Scanner;

public class LastCharacter
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        
        System.out.println("Last Character: " + lastCharacter(name));
    }
    
    public static char lastCharacter(String text)
    {
        /* Gets the total length of the text and subtracts one from it
         * This used to get the last character within the string or last index
         */
        int lastIndex = text.length() - 1;
        
        char lastCharacter = text.charAt(lastIndex);
        
        return lastCharacter;
    }
}
