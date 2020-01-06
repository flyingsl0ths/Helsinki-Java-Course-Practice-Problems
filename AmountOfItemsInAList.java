import java.util.ArrayList;

public class AmountOfItemsInAList
{
    // Method counts the number of items in any ArrayList
    public static int countItems(ArrayList<String> list)
    {
        // ArrayList.size() implementation
        
        int counter = 0;
        
        for(String item : list)
        {
            counter++;
        }
        
        return counter;
    }
    
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hallo");
        list.add("Ciao");
        list.add("Hello");
        System.out.println("There are this many items in the list:");
        System.out.println(countItems(list));
    }
}
