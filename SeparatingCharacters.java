import java.util.Scanner;

public class SeparatingCharacters
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        
        for(int i = 0, length = name.length(); i < length; i++)
        {
            int currentIndex = i + 1;
            char currentLetter = name.charAt(i);
            
            System.out.println(currentIndex + ". character: " + currentLetter);
            
        }
            
    }
}
