import java.util.ArrayList;

public class Phonebook
{
    private ArrayList<Person2> phoneNumbers;
    
    public Phonebook()
    {
        this.phoneNumbers = new ArrayList<Person2>();
    }
    
    // Start of Person2 Class
    private static class Person2
    {
        private String name;
        private String phoneNumber;
        
        public Person2(String name, String phoneNumber)
        {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }
        
        public String getName()
        {
            return this.name;
        }
        
        public String getNumber()
        {
            return this.phoneNumber;
        }
        
        public void changeNumber(String newNumber)
        {
            this.phoneNumber = newNumber;
        }
        
        public String toString()
        {
            return this.name + "  " + "number: " + this.phoneNumber; 
        }
    } // End of Person2 Class
    
    public Person2 createEntry(String name, String number)
    {
        return new Person2(name, number);
    }
    
    public void add(String name, String number)
    {
        Person2 newEntry = createEntry(name, number);
        
        this.phoneNumbers.add(newEntry);
    }
    
    public void printAll()
    {
        for(Person2 p : this.phoneNumbers)
        {
            System.out.println(p);
        }
        System.out.println();
    }
    
    public String searchNumber(String name)
    {
        for(Person2 p : this.phoneNumbers)
        {
            if(p.getName().equals(name))
            {
                return p.getNumber();
            }
        }
        
        return "number not known";
    }
    
    public static void main(String[] args) 
    {
        Phonebook phonebook = new Phonebook();
        phonebook.add("Pekka Mikkola", "040-123123");
        phonebook.add("Edsger Dijkstra", "045-456123");
        phonebook.add("Donald Knuth", "050-222333");
    
        String number = phonebook.searchNumber("Pekka Mikkola");
        System.out.println( number );
    
        number = phonebook.searchNumber("Martti Tienari");
        System.out.println( number );
}
}
