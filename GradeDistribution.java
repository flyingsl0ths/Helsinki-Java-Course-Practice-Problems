import java.util.ArrayList;
import java.util.Scanner;

public class GradeDistribution 
{
    private ArrayList<Integer> scores;
    private int[] grades;  // Stores grade counts (indices as grades)
    private int acceptCount;
    
    public GradeDistribution() 
    {
        this.scores = new ArrayList<Integer>();
        this.grades = new int[6];
    }
    
    public void addScore(int score) 
    {
        this.scores.add(score);
    }
    
    public void getGrades() 
    {
        for (int score : scores) 
        {
            if (score < 30) 
            {
                this.grades[0]++;
            } else if (score < 35) 
            {
                this.grades[1]++;
                this.acceptCount++;
            } else if (score < 40) 
            {
                this.grades[2]++;
                this.acceptCount++;
            } else if (score < 45) 
            {
                this.grades[3]++;
                this.acceptCount++;
            } else if (score < 50) 
            {
                this.grades[4]++;
                this.acceptCount++;
            } else if (score <= 60) 
            {
                this.grades[5]++;
                this.acceptCount++;
            }
        }
    }
    
    public static void printStars(int count) 
    {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
    }
    
    public void printGradeDistribution() 
    {
        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) 
        {
            System.out.print(i + ": ");
            printStars(this.grades[i]);
            System.out.println();
        }
    }
    
    public double acceptancePercentage() 
    {
        if (this.scores.size() > 0) 
        {
            return 100 * this.acceptCount / this.scores.size();
        }
        return 0;
    }
    
    public static void main(String[] args)
    {
        GradeDistribution gD = new GradeDistribution();
        
        Scanner reader = new Scanner(System.in);
        
        int currGrade;
        System.out.println("Type exam scores, -1 completes");
        do
        {
            currGrade = reader.nextInt();
            if(currGrade >= 0 && currGrade <= 60) gD.addScore(currGrade);
        } while(currGrade != -1);
        
        gD.getGrades();

        gD.printGradeDistribution();        
        System.out.println("Acceptance percentage: " + gD.acceptancePercentage());
    }
}
