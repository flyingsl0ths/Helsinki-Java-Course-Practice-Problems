import java.util.ArrayList;

public class AverageOfNumbers
{
    public static double average(ArrayList<Integer> list) 
    {
        int sum = 0;
        int length = list.size();
        double average;
        
        for(int item : list)
        {
            sum += item;
        }
        
        average = (double) sum / length;
        
        return average;
    }
    
    public static void main(String[] args) 
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
    
        System.out.println("The average is: " + average(list));
    }
    
}
