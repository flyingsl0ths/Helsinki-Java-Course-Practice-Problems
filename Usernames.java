import java.util.Scanner;

public class Usernames
{
    static String usernameOne = "alex";
    static String passwordOne = "mightyducks";
    static String usernameTwo = "emily";
    static String passwordTwo = "cat"; 
    
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        for(int i = 0; i < 2; i++)
        {
            checkInfo(reader);
            System.out.println();
        }
    }
    
    public static void checkInfo(Scanner readr)
    {
        String username1 = "";
        String password1 = "";
        
        System.out.print("Type your username: ");
        username1 = readr.nextLine();
        System.out.print("Type your password: ");
        password1 = readr.nextLine();
        
        if(username1.equals(usernameOne) & password1.equals(passwordOne) | username1.equals(usernameTwo) & password1.equals(passwordTwo))
        {
            System.out.println("You are now logged into the system!");
        } else {
            System.out.println("Your username or password was invalid");
        }
    }
}