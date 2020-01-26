import java.util.Arrays;

public class Sorting
{
    // Step 1: Find the smallest value in the array
    public static int smallest(int[] array)
    {
        if (array == null || array.length == 0) return -1;
    
        int smallestValue = array[0];
        
        for(int i = 0, l = array.length; i < l; i++)
        {
            if(array[i] < smallestValue) smallestValue = array[i];
        }
        return smallestValue;
    }
    
    // Step 2: Find the index of the smallest value in the array
    public static int indexOfTheSmallest(int[] array)
    {
        if (array == null || array.length == 0) return -1;
    
        int minIndex = 0;
        
        for(int i = 0, l = array.length; i < l; i++)
        {
            if(array[i] < array[minIndex]) 
            {
                minIndex = i;   
            }
        }
        return minIndex;
    }

    /* Step 3: find the index of the smallest values in the array 
     * starting from a specific index
     */ 
    public static int indexOfTheSmallestStartingFrom(int[] array, int index)
    {
        if (array == null || array.length == 0) return -1;
        if (index < 0 || index > array.length) return -1;
        
        int minIndex = index;
        
        for(int i = index, l = array.length; i < l; i++)
        {
            if(array[i] < array[minIndex]) 
            {
                minIndex = i;   
            }
        }
        return minIndex;
    }

    // Step 4: swap the values at any two specific indexes
    public static void swap(int[] array, int index1, int index2) 
    {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        
    }

    /* Step 4: iterate though the array and swap the index of the current
     * value with the index of the smallest value starting from the current index
     */
    public static void sort(int[] array)
    {
        System.out.println(Arrays.toString(array));
        for(int i = 0, l = array.length; i < l; i++)
        {
            int smallestIndex = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, smallestIndex);
            System.out.println(Arrays.toString(array));
        }
    }

    public static void main(String[] args)
    {
       int[] values = {8, 3, 7, 9, 1, 2, 4};
       sort(values);
    }
}
