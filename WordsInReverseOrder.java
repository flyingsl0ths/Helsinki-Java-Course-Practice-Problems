import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class WordsInReverseOrder
{
    public static void main(String[] args)
    {
        // Creates a new ArrayList(Array which dynamically increases in size and memory for each item added)
        ArrayList<String> words = new ArrayList<String>();
        Scanner reader = new Scanner(System.in);
        
        while(true){
            /* While the input string is not empty continue 
             * asking for words and adding them into the ArrayList
             * else display all the given words
            */
             
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            
            if(word.isEmpty())
            {
                // Reverse the words in ArrayList
                Collections.reverse(words); // If doesn't work try reverse function

                // Display inputted words
                System.out.println("You typed the following words: ");
                for (String item : words) {
                    System.out.println(item);
                }
                
                break;
                
            } else {
                words.add(word);
            }
            
        }
    }
    
    public static void reverse(String text)
    {
        for(int i = 0, length = text.length() - 1; length >= i; length--)
        {
            /* Loop iterates from length of string minus one until beginning
             * of string, index zero
             */
            
            System.out.print(text.charAt(length));
        }
        System.out.println();
    }
}
