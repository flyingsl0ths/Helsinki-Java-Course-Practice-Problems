public class ElegantPrintingOfAnArray
{
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        // write code here
        int l = array.length - 1;
        for(int i = 0; i < l; i++)
        {
            System.out.print(array[i] + ", ");
        }
        
        System.out.print(array[l]);
    }
}
