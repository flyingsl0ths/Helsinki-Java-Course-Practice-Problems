import java.util.Scanner;

public class SeparatingFirstCharacters
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        
        int length = name.length();
        
        if(length < 3)
        {
            System.out.println();
        } else {
            char firstLetter = name.charAt(0);
            char secondLetter = name.charAt(1);
            char thirdLetter = name.charAt(2);
            
            
            System.out.println("1. character: " + firstLetter);
            System.out.println("2. character: " + secondLetter);
            System.out.println("3. character: " + thirdLetter);
        }
        
    }
}
