import java.util.Scanner;

public class UpToX
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int num = 0;
        do
        {
            System.out.print("Up to what number? ");
            num = Integer.parseInt(reader.nextLine());
            for(int i = 1; i <= num; i++)
            {
                System.out.println(i);
            }
        } while(num > 0);
    }
}
