import java.util.Scanner;
import java.util.InputMismatchException;

public class NumberStatistics 
{
    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() 
    {
        // initialize here the object variable amountOfNumbers
        this.amountOfNumbers = 0;
    }

    public void addNumber(int number) 
    {
        this.amountOfNumbers++;
        this.sum += number;
    }

    public int amountOfNumbers() 
    {
        return this.amountOfNumbers;
    }

    public int sum() 
    {
        if (amountOfNumbers == 0) 
        {
            return 0;
        } else {
            return sum;
        }
    }

    public double average() 
    {
        double average;

        if (amountOfNumbers == 0) {
            return 0;
        } else {
            average = (double) this.sum / this.amountOfNumbers;
            return average;
        }
    } // End of NumberStatistics Class

    private static class AskForNumbers
    {
        private Scanner reader;
        private int inputNum;
        
        public AskForNumbers()
        {
            this.reader = new Scanner(System.in);
            this.inputNum = 0;
        }
        
        public void askForNumbs()
        {
            NumberStatistics nSum = new NumberStatistics();
            NumberStatistics nEven = new NumberStatistics();
            NumberStatistics nOdd = new NumberStatistics();
            
            System.out.println("Type numbers:");
            try
            {
                while (this.inputNum != -1) {
                    
                    nSum.addNumber(this.inputNum);
                    if (inputNum % 2 == 0) {
                        nEven.addNumber(this.inputNum);
                    } else {
                        nOdd.addNumber(this.inputNum);
                    }
                    
                    this.inputNum = reader.nextInt();
                }
                
                System.out.println("sum: " + nSum.sum());
                System.out.println("sum of even: " + nEven.sum());
                System.out.println("sum of odd: " + nOdd.sum());
                
            } catch(InputMismatchException e) {
                System.out.println("Only Numbers");
            }
        }

    }
    
    public static void main(String[] args)
    {
        AskForNumbers asker = new AskForNumbers();
            
        asker.askForNumbs();
    }
}
