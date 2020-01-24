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
