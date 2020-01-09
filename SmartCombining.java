import java.util.ArrayList;

public class SmartCombining
{

    public static void main(String[] args)
    {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        
        list1.add(5);
        list1.add(3);
        
        list2.add(5);
        list2.add(3);
        list2.add(7);
        
        combine(list1, list2);
        
        System.out.println(list1); // 7 was added
        
        System.out.println(list2); 
    }
    
    public static void combine(ArrayList<Integer> first, ArrayList<Integer> second)
    {
        for(int n : second)
        {
            if(!first.contains(n))
            {
                first.add(n);
                System.out.println(n + " is being added");
            }
        }
    }
}
