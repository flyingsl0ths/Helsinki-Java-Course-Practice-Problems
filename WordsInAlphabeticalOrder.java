import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class WordsInAlphabeticalOrder
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
                // Sort the words in the ArrayList in alphabetical order
                Collections.sort(words);

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
}
