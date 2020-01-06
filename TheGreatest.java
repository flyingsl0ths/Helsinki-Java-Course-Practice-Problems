import java.util.ArrayList;

public class TheGreatest
{
    public static int greatest(ArrayList<Integer> list) 
    {
        int greatest = 0;
        
        
        for(int i : list)
        {
            /* Evaluates previous the previous greatest amount against
             * the current value i to determine current greatest amount
             * 
             * For example:
             * 0 3 : 3 is greatest
             * 3 2 : 3 is still greatest
             * 3 7 : 7 is now greatest
             * 7 2 : 7 is greatest number, 7 is returned
            */
           
            greatest = Math.max(greatest, i);
        }
        
        return greatest;
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
    
        System.out.println("The greatest number is: " + greatest(list));
    }
}
