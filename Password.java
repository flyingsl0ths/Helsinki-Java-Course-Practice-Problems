import java.util.Scanner;

public class Password
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        while(true)
        {
            System.out.print("Type the password: ");
            String passwrd = reader.nextLine();
            if(passwrd.equals("carrot"))
            {
                System.out.println("Right!\n");
                System.out.println("The secret is: jryy qbar!");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }
    }
}