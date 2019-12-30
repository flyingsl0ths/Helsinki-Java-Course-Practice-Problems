import java.util.Scanner;

public class PrintingOutText
{
    public static void main(String[] args)
    {
        int t = 0;
        try
        {
            Scanner reader = new Scanner(System.in);
            System.out.println("How many?");
            t = Integer.parseInt(reader.nextLine());
            for(int i = 0; i < t; i++)
            {
                printText();
            }
            System.out.println();
        } catch(NumberFormatException e){
            System.out.println("Only Numbers");
        }
    }
    
    public static void printText()
    {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}
