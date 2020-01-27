import java.util.Scanner;

public class GuessingGame 
{

    private Scanner reader;

    public GuessingGame() 
    {
        this.reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) 
    {
        instructions(upperLimit, lowerlimit);

        // write the guessing logic here
        while (lowerLimit != upperLimit) 
        {
            int average = average(lowerLimit, upperLimit);
            if (isGreaterThan(average)) 
            {
                lowerLimit = average + 1;
            } else {
                upperLimit = average;
            }
        }
        
        System.out.println("The number you're thinking of is " + lowerLimit);
    }

    // implement here the methods isGreaterThan and average
    public boolean isGreaterThan(int value) 
    {
        System.out.println("Is your number greater than " + value + "? (y/n)");
        return reader.nextLine().equalsIgnoreCase("y");
    }

    public int average(int firstNumber, int secondNumber)
    {
        return (firstNumber + secondNumber) / 2;
    }

    public void instructions(int lowerLimit, int upperLimit) 
    {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking of with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you with a series of questions. Answer them honestly.");
        System.out.println("");
    }

    // a helper method:
    public static int howManyTimesHalvable(int number) 
    {
        // we create a base two logarithm  of the given value
        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
    
    public static void main(String[] args)
    {
        GuessingGame game = new GuessingGame();

        // we play two rounds
        game.play(1,10);  // value to be guessed now within range 1-10
        game.play(10,99);  // value to be guessed now within range 10-99
    }
}
