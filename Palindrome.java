import java.util.ArrayList;
import java.util.Scanner;

public class Palindrome
{
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
    
    public static boolean palindrome(String text) 
    {
        boolean isPalindrome;
        
        String reversed = reverse(text);
        
        if(reversed.equals(text))
        {
            isPalindrome = true;
        } else {
            isPalindrome = false;
        }
        
        return isPalindrome;
    }

    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
    
        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
           System.out.println("The text is a palindrome!");
        } else {
           System.out.println("The text is not a palindrome!");
        }
    }
}
