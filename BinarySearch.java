import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch
{
    public static int average(int num1, int num2)
    {
        return (num1 + num2) / 2;
    }

    public static boolean search(int[] array, int searchedValue)
    {
        int found = Arrays.binarySearch(array, searchedValue);
        
        if(found != 0)
        {
            return true;
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        // Here you can test binary search
        int[] array = { -3, 2, 3, 4, 7, 8, 12 };
        Scanner reader = new Scanner(System.in);

        System.out.print("Values of the array: " + Arrays.toString(array));
        System.out.println();

        System.out.print("Enter searched number: ");
        String searchedValue = reader.nextLine();
        System.out.println();

        boolean result = BinarySearch.search(array, Integer.parseInt(searchedValue));

        // Print the binary search result here
        if(result == true)
        {
            System.out.println("Value " + searchedValue + " is in the array");
        } else {
            System.out.println("Value " + searchedValue + " is not in the array");
        }
    }
}
