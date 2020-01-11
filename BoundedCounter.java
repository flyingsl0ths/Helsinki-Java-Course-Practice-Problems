// Clock Using A Counter
import java.util.*;

public class BoundedCounter {
    
    private int value;
    private int upperLimit;
    
    public BoundedCounter(int upperLimit) 
    {
        this.value = 0;
        this.upperLimit = upperLimit;
    }
    
    public void next() 
    {
        if (value + 1 > upperLimit) {
            this.value = 0;
        } else {
            this.value++;
        }
    }
    
    public String toString() 
    {
        if (this.value < 10) {
            return "0" + this.value;
        } else {
            return "" + this.value;
        }
    }
    
    public int getValue() 
    {
        return this.value;
    }
    
    public void setValue(int newValue) 
    {
        if (newValue > 0 && newValue <= upperLimit) {
            this.value = newValue;
        }
    }
    
    public static void main(String[] args) throws Exception
    {
        try
        {
         
            Scanner reader = new Scanner(System.in);
        
            BoundedCounter seconds = new BoundedCounter(59);
            BoundedCounter minutes = new BoundedCounter(59);
            BoundedCounter hours = new BoundedCounter(23);
    
            System.out.print("seconds: ");
            int s = reader.nextInt();
            System.out.print("minutes: ");
            int m = reader.nextInt();
            System.out.print("hours: ");
            int h = reader.nextInt();
    
            seconds.setValue(s);
            minutes.setValue(m);
            hours.setValue(h);
            
            int i = 0;
            while (i < 121) {
                System.out.println(hours + ":" + minutes + ":" + seconds);
                Thread.sleep(1000);
                seconds.next();
                if (seconds.getValue() == 0) {
                    minutes.next();
                    if (minutes.getValue() == 0) {
                        hours.next();
                    }
                }
                i++;
            }
            
        } catch(InputMismatchException e) {
            System.out.println("Only numbers");
        }
        
    }
}