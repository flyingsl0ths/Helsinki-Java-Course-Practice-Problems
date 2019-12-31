public class PrintingLikeABoss
{
    public static void main(String[] args)
    {
        xmasTree(4);
    }
    
    public static void printStars(int amount)
    {
        for(int i = 0; i < amount; i++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    
    public static void printWhitespaces(int amount)
    {
        for(int i = 0; i < amount; i++)
        {
            System.out.print(" ");
        }
        
    }
    
    public static void printTriangle(int size)
    {
        int j = size - 1;
        
        for(int i = 1; i <= size; i++)
        {
            printWhitespaces(j);
            printStars(i);
            j--;
        }
    }
    
    public static void xmasTree(int height)
    {   
        // Prints Tree
        int i = 1; // Number of Start printed
        int j = height - 1; // Number of whitespaces printed
        int h = height * 2; // Height of tree must be doubled in order to print the exact number of stars else tree will be: height / 2
        
        while (i < h) {
            // whitespace decreases by 1 as stars increase by 2 each iteration
            
            // For example if height is 4:
            /*   www*
                 ww***
                 w*****
                 *******
            */
           
            printWhitespaces(j);
            printStars(i);
            i += 2;
            j--;
        }
        
        // Prints stand
        i = 3;
        j = height - 2;
        
        printWhitespaces(j);
        printStars(i);
        
        printWhitespaces(j);
        printStars(i);
    }
}