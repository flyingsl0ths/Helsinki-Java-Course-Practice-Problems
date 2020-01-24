Skip to content
Search or jump to…

Pull requests
Issues
Marketplace
Explore
 
@flyingsl0ths 
flyingsl0ths
/
Helsinki-Java-Course-Practice-Problems
1
00
 Code Issues 0 Pull requests 0 Actions Projects 0 Wiki Security Insights Settings
Added Exercis 103

 master
@flyingsl0ths
flyingsl0ths committed 6 minutes ago
1 parent 7b0cd7b commit f549ae8b0d3b5b9c3fbba047339404778b2b2033
Showing  with 167 additions and 0 deletions.
 167  BirdWatchers.java 
@@ -0,0 +1,167 @@
import java.util.ArrayList;
import java.util.Scanner;

public class BirdWatchers
{
    private ArrayList<Bird> birdCollection;

    public BirdWatchers()
    {
        this.birdCollection = new ArrayList<Bird>();
    }

    public static class Bird
    {
        private String englishName;
        private String latinName;
        private int observed;

        public Bird(String englishName, String latinName)
        {
            this.englishName = englishName;
            this.latinName = latinName;
            this.observed = 0;
        }

        public String getEnglishName()
        {
            return this.englishName;
        }

        public String getLatinName()
        {
            return this.latinName;
        }

        public int getObservationCount()
        {
            return this.observed;
        }

        public void increaseObservationCount()
        {
            this.observed++;
        }

        public String toString()
        {
            return this.englishName + " " + "(" +  this.latinName  + ")" + " " + this.observed + " observations";
        }
    } // End of Bird Class

    public String removeWhitespace(String word)
    {
        return word.trim();
    }

    public void add(String englishName, String latinName)
    {
        if(!englishName.isEmpty() && !latinName.isEmpty())
        {
            englishName = this.removeWhitespace(englishName);
            latinName = this.removeWhitespace(latinName);

            this.birdCollection.add(new Bird(englishName, latinName));
        }

    }

    public void observation(String englishBirdName)
    {
       englishBirdName = this.removeWhitespace(englishBirdName);

        for(Bird b : this.birdCollection)
        {
            if (b.getEnglishName().equalsIgnoreCase(englishBirdName)) 
            {
                b.increaseObservationCount();
                return;
            }

            System.out.println("Is not a bird!");
        }
    }

    public void statistics()
    {
        for (Bird b : this.birdCollection) 
        {
            System.out.println(b);
        }
    }

    public void show(String englishBirdName)
    {
        englishBirdName = this.removeWhitespace(englishBirdName);

        for(Bird b : this.birdCollection)
        {
            if(b.englishName.equalsIgnoreCase(englishBirdName)) 
            {
                System.out.println(b);
                return;
            }
        }

        System.out.println("Is not a bird!");
    }

    public void addBird(Scanner reader)
    {
        System.out.print("Name: ");
        String englishName = reader.nextLine();
        System.out.print("Latin Name: ");
        String latinName = reader.nextLine();

        englishName = this.removeWhitespace(englishName);
        latinName = this.removeWhitespace(latinName);

        this.add(englishName, latinName);
    }

    public void addObservation(Scanner reader)
    {
        System.out.print("What was observed?: ");
        String englishBirdName = reader.nextLine();

        englishBirdName = this.removeWhitespace(englishBirdName);

        this.observation(englishBirdName);
    }

    public void showBird(Scanner reader)
    {
        System.out.print("What?: ");
        String englishBirdName = reader.nextLine();

        englishBirdName = this.removeWhitespace(englishBirdName);

        this.show(englishBirdName);
    }

    public static void main(String[] args)
    {
        BirdWatchers db = new BirdWatchers();
        Scanner reader = new Scanner(System.in);
        String input;

        do
        {
            System.out.print("?: ");
            input = reader.nextLine();

            switch(input.toLowerCase())
            {
                case "add": db.addBird(reader);
                break;
                case "observation": db.addObservation(reader);
                break;
                case "statistics": db.statistics();
                break;
                case "show": db.showBird(reader);
                break;
            }

        } while(!input.equalsIgnoreCase("Quit"));
    }
}
