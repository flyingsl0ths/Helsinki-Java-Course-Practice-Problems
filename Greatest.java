public class Greatest
{
    public static void main(String[] args)
    {
        int answer = greatest(2, 7, 3);
        System.out.println("Greatest: " + answer);
    }
    
    public static int greatest(int number1, int number2, int number3)
    {
        int greatestOfFirstTwo = Math.max(number1, number2);
        return Math.max(greatestOfFirstTwo, number3);
    }
}