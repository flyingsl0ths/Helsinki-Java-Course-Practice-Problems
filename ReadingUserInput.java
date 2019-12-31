import java.util.Scanner;

public class ReadingUserInput
{   
    public static void main(String[] args)
    {   
        Scanner reader = new Scanner(System.in);
        
        /* Inludes exercises:
         * Adder
         * Divider
         * Circumference
         * Biggest Number
         * Sum Of Ages
        */
        // adder(reader);
        // divider(reader);
        // circumference(reader);
        // biggestNumber(reader);
        // sumOfAges(reader);
    }
    
    public static void adder(Scanner readr)
    {
        int num1 = 0;
        int num2 = 0;
        int sumOf = 0;
        
        try
        {
            System.out.println("Type a number:");
            num1 = Integer.parseInt(readr.nextLine());
            System.out.println("Type another number:");
            num2 = Integer.parseInt(readr.nextLine());
            sumOf = num1 + num2;
            System.out.println("Sum of the numbers " + sumOf);
            
        } catch(NumberFormatException e) {
            System.out.println("Only Numbers");
        }
    }
    
    public static void divider(Scanner readr)
    {
        int num1 = 0;
        int num2 = 0;
        double product = 0;
        
        try
        {
            System.out.println("Type a number:");
            num1 = Integer.parseInt(readr.nextLine());
            System.out.println("Type another number:");
            num2 = Integer.parseInt(readr.nextLine());
            product = 1.0 * num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + product);
            
        } catch(NumberFormatException e) {
            System.out.println("Only Numbers");
        }
    }
    
    public static void circumference(Scanner readr)
    {
        int radius = 0;
        double result = 0;
        
        try
        {
            System.out.print("Type the radius: ");
            radius = Integer.parseInt(readr.nextLine());
            result = 2 * Math.PI * radius;
            System.out.println("\nCircumference of the circle: " + result);
            
        } catch(NumberFormatException e){
            System.out.println("Only Numbers");
        }
    }
    
    public static void biggestNumber(Scanner readr)
    {
        int num1 = 0;
        int num2 = 0;
        int biggestNum = 0;
        
        try
        {
           System.out.print("Type a number: ");
           num1 = Integer.parseInt(readr.nextLine());
           System.out.print("Type another number: ");
           num2 = Integer.parseInt(readr.nextLine());
           
           biggestNum = Math.max(num1, num2);
           System.out.println("\nThe biggest number of the two numbers given was: " + biggestNum);
           
        } catch(NumberFormatException e){
            System.out.println("Only Numbers");
        }
    }
    
    public static void sumOfAges(Scanner readr)
    {
        String name1 = "";
        int age1 = 0;
        String name2 = "";
        int age2 = 0;
        
        int ageSum = 0;
        
        try
        {
            System.out.print("Type your name: ");
            name1 = readr.nextLine();
            System.out.print("Type your age: ");
            age1 = Integer.parseInt(readr.nextLine());
            
            System.out.print("\nType your name: ");
            name2 = readr.nextLine();
            System.out.print("Type your age: ");
            age2 = Integer.parseInt(readr.nextLine());
            
            ageSum = age1 + age2;
            System.out.println(name1 + " and " + name2 + " are " +  ageSum + " years old in total");
            
        } catch(NumberFormatException e){
            System.out.println("Please type in a number");
        }
    }
}
