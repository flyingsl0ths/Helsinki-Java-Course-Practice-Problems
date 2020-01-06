import java.util.ArrayList;

public class Variance
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
    
    public static double variance(ArrayList<Integer> list)
    {
        double variance = 0;
        int length = list.size() - 1;
        double average = average(list);
        
        for(int n : list)
        {
            variance += Math.pow(n - average, 2);
        }
        
        variance /= length;
        
        return variance;
    }

    public static void main(String[] args) 
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
    
        System.out.println("The variance is: " + variance(list));
    }
}
