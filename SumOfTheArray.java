public class SumOfTheArray
{
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sum(array));
    }

    public static int sum(int[] array) {
        // write code here
        int sumOfArrayItems = 0;
        for(int i = 0, l = array.length; i < l; i++)
        {
            sumOfArrayItems += array[i];
        }
        return sumOfArrayItems;
    }
}
