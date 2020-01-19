// Exercise 93: Person Extended

import java.util.Calendar;

public class Person {
    private String name;
    private MyDate2 birthday;
    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate2(pp, kk, vv);
    }

    public Person(String name, MyDate2 birthday)
    {
        this.name = name;
        this.birthday = birthday;
    }
    
    public Person(String name)
    {
        this.name = name;
        this.birthday = this.getCurrentDate();
    }
    
    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name +", born "+ this.birthday;
    }
    
    public MyDate2 getCurrentDate()
    {   
        // you get the current day as follows:
        // Calendar.getInstance().get(Calendar.DATE);
        int day= Calendar.getInstance().get(Calendar.DATE);
        
        // Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        
        // Calendar.getInstance().get(Calendar.YEAR);
        int year = Calendar.getInstance().get(Calendar.YEAR);
        
        return new MyDate2(day, month, year);
    }
    
    public int age() 
    {
        // calculate the age based on the birthday and the current day
        
        MyDate2 currentDate = getCurrentDate();
        
        return birthday.differenceInYears(currentDate);
    }
    
    public boolean olderThan(Person compared)
    {
        // compare the ages based on birthdays
        return birthday.earlier(compared.birthday);
    }
    
    public static void main(String[] args) 
    {
        Person pekka = new Person("Pekka", new MyDate2(15, 2, 1983));
        Person steve = new Person("Steve");

        System.out.println( pekka );
        System.out.println( steve );
    }
}