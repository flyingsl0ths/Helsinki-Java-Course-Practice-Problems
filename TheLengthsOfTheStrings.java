import java.util.ArrayList;

public class TheLengthsOfTheStrings
{
    public static ArrayList<Integer> lengths(ArrayList<String> list) 
    {
        ArrayList<Integer> lengths = new ArrayList<Integer>();
        
        // Iterate over each item in the String ArrayList
        for(String item : list)
        {
            // Get the length of each item in String ArrayList
            int length = item.length();
            
            // And add it to the Integer ArrayList
            lengths.add(length);
        }
        
        return lengths;
    }

    public static void main(String[] args) 
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hallo");
        list.add("Moi");
        list.add("Benvenuto!");
        list.add("badger badger badger badger");
        ArrayList<Integer> lengths = lengths(list);
    
        System.out.println("The lengths of the Strings: " + lengths);
    }
}
