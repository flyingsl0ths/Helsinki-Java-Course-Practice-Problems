public class Printing
{
    public static void main(String[] args)
    {
        //printStars(5);
        //printSquare(5);
        printRectangle(17, 3);
    }
    
    public static void printStars(int amount)
    {
        for(int i = 0; i < amount; i++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    
    public static void printSquare(int sideSize)
    {
        for(int i = 0; i < sideSize; i++)
        {
            printStars(sideSize);
        }
    }
    
    public static void printRectangle(int width, int height)
    {
        for(int i = 0; i < height; i++)
        {
            printStars(width);
        }
    }
}