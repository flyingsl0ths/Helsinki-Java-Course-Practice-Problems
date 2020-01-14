import java.util.Random;

public class PasswordRandomizer 
{
    // Define the variables here
    int length;
    Random random;
    
    public PasswordRandomizer(int length) 
    {
        // Format the variable here
        this.length = length;
        this.random = new Random();
    }

    public String createPassword() 
    {
      // Write the code here which returns the new password
      String password = "";
      
      for (int i = 0; i < this.length; i++) 
      {
          /* Generate a String whose length is size of "this.length"
           * whose values are random numbers within the range of "a - z" ASCII values 97 - 122 
          */
          char letter = (char) (this.random.nextInt(26) + 'a');
          password += letter;
      }
      
      return password;
    }
    
    public static void main(String[] args) 
    {
        PasswordRandomizer randomizer = new PasswordRandomizer(13);
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
    }
}