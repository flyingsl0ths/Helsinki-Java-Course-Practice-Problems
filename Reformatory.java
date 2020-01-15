
public class Reformatory
{
    private int numberOfTimesMeasured = 0;
    
    private static class Person 
    {

        private String name;
        private int age;
        private int height;
        private int weight;
    
        public Person(String name, int age, int height, int weight) 
        {
            this.name = name;
            this.age = age;
            this.height = height;
            this.weight = weight;
        }
    
        public void becomeOlder() 
        {
            this.age++;
        }
    
        public boolean adult() 
        {
            if (this.age < 18) 
            {
                return false;
            }
    
            return true;
        }
    
        public double weightIndex() 
        {
            double heightInMeters = this.height / 100.0;
    
            return this.weight / (heightInMeters * heightInMeters);
        }
    
        public void setHeight(int height) 
        {
            this.height = height;
        }
    
        public int getHeight() 
        {
            return this.height;
        }
    
        public int getWeight() 
        {
            return this.weight;
        }
    
        public void setWeight(int weight) 
        {
            this.weight = weight;
        }
    
        public String getName() 
        {
            return this.name;
        }
    
        public String toString() 
        {
            return this.name + " I am " + this.age + " years old, my weight index is " + this.weightIndex();
        }
    } // End of Person Class
    
    public int weight(Person person) 
    {
        // increments the number Of times measured by 1 each time method is called
        this.numberOfTimesMeasured++;
        
        // returns the weight of the parameter
        return person.getWeight();
    }
    
    public void feed(Person person)
    {
        // increases the weight of the parameter by 1
        person.setWeight(person.getWeight() + 1);
    }
    
    public int totalWeightsMeasured()
    {
        // returns the number of times measured
        return this.numberOfTimesMeasured;
    }
    
    public static void main(String[] args) 
    {
        Reformatory eastHelsinkiReformatory = new Reformatory();

        Person brian = new Person("Brian", 1, 110, 7);
        Person pekka = new Person("Pekka", 33, 176, 85);
    
        System.out.println("total weights measured "+eastHelsinkiReformatory.totalWeightsMeasured());
    
        eastHelsinkiReformatory.weight(brian);
        eastHelsinkiReformatory.weight(pekka);
    
        System.out.println("total weights measured "+eastHelsinkiReformatory.totalWeightsMeasured());
    
        eastHelsinkiReformatory.weight(brian);
        eastHelsinkiReformatory.weight(brian);
        eastHelsinkiReformatory.weight(brian);
        eastHelsinkiReformatory.weight(brian);
    
        System.out.println("total weights measured "+eastHelsinkiReformatory.totalWeightsMeasured());
    }
}
