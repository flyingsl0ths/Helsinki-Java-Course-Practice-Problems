import java.util.Scanner;

public class GradesNPoints
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        gradePoints(reader);
    }
    
    public static void gradePoints(Scanner readr)
    {
        int point = 0;
        try
        {
            System.out.print("Type the points [0-60]: ");
            point = Integer.parseInt(readr.nextLine());
            
            if ( point <= 29 )
            {
                System.out.println("Failed");
            } else if( point <= 34 ){
                System.out.println("Grade: 1");
            } else if( point <= 39 ){
                System.out.println("Grade: 2");
            } else if( point <= 44 ){
                System.out.println("Grade: 3");
            } else if( point <= 49 ){
                System.out.println("Grade: 4");
            } else if( point <= 60 ){
                System.out.println("Grade: 5");
            }
            
            
        } catch(NumberFormatException e){
            System.out.println("Only Numbers");
        }
    }
}