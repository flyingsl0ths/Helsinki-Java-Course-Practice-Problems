public class ArraysToStars {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsRows(int columns)
    {
        for(int i = 0; i < columns; i++)
        {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printArrayAsStars(int[] array) {
        // code here
        for(int i = 0, l = array.length; i < l; i++)
        {
            printArrayAsRows(array[i]);
        }
    }
}
