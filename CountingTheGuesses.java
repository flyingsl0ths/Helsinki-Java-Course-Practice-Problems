import java.util.Scanner;

public class CountingTheGuesses
{
    public static void main(String[] args)
    {
        guessingGame();
    }
    
    public static int drawNumber()
    {
        int randomNumber = (int)(Math.random() * 100 + 1);
        return randomNumber;
    }
    
    public static void guessingGame()
    {
        Scanner reader = new Scanner(System.in);
        int counter = 0;
        int randomNum = drawNumber();
        
        while(true)
        {
            try
            {
                // Ask for user input
                System.out.print("\nGuess a number: ");
                int number = Integer.parseInt(reader.nextLine());
                
                // Check if guess is greater/less than or equal to random number
                if(number > randomNum)
                {
                    counter++;
                    System.out.print("The number is greater, guesses made: " + counter);
                } else if(number < randomNum) {
                    counter++;
                    System.out.print("The number is lesser, guesses made: " + counter);
                } else {
                    System.out.print("Congratulations, your guess is correct!");
                    break;
                }
                
            } catch(NumberFormatException e){
                System.out.println("Please type a number");
            }
            
        }
    }
}