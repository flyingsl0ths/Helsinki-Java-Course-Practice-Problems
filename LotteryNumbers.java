import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        this.random = new Random();
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // Write the number drawing here using the method containsNumber()
        for(int i = 0; i < 7; i++)
        {
            /* Generates 7 random numbers between 1 - 39
             * and adds it to this.numbers if the random number
             * is not included already within this.number ArrayList<Integer>
            */ 
            int randomNumber = 1 + (this.random.nextInt(39));
            
            if(!containsNumber(randomNumber))
            {
                this.numbers.add(randomNumber);
            }
        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already among the drawn numbers
        return this.numbers.contains(Integer.valueOf(number));
    }
    
    public static void main(String[] args) 
    {
        LotteryNumbers lotteryNumbers = new LotteryNumbers();
        ArrayList<Integer> numbers = lotteryNumbers.numbers();

        System.out.println("Lottery numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("");
    }
}