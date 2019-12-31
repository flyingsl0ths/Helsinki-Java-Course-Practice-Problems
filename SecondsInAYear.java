public class SecondsInAYear
{
    public static void main(String[] args)
    {
        /* Contains Exercises:
         * Seconds In a Year
         * Sum Of
         * Product Of
        */
        
        secondsInAYear();
        sumOf(73457, 12888);
        productOf(277, 111);
    }
    
    public static void secondsInAYear()
    {
        int secondsInYear = 31557600;
        
        System.out.println("There are " + secondsInYear + " seconds in a year");
        
    }
    
    public static void sumOf(int a, int b)
    {
        int c = a + b;
        
        System.out.println(a + " + " + b + " = " + c );
    }
    
    public static void productOf(int a, int b)
    {
        int c = a * b;
        
        System.out.println(a + " * " + b + " = " + c );
    }
}