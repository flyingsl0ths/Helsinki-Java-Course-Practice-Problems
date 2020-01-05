import java.util.Scanner;
import java.util.ArrayList;

public class RecurringWord
{
    public static void main(String[] args)
    {
        // Creates a new ArrayList(Array which dynamically increases in size and memory for each item added)
        ArrayList<String> words = new ArrayList<String>();
        Scanner reader = new Scanner(System.in);
        
        while (true) {
            // Get new word from user and add it to the ArrayList
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            
            // If the ArrayList contains the word then print message else continue adding words
            if(words.contains(word))
            {
                System.out.println("You gave the word " + word + " twice");
                break;
            } else {
                words.add(word);
            }
        }
        
    }
}
