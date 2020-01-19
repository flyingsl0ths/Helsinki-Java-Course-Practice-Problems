// Exercise 89: Clock object

public class Clock
{
    private BoundedCounter2 hours;
    private BoundedCounter2 minutes;
    private BoundedCounter2 seconds;
    
    public class BoundedCounter2 
    {
    
        private int value;
        private int upperLimit;
        
        public BoundedCounter2(int upperLimit) 
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
    }
    

    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) 
    {
      // the counters that represent hours, minutes and seconds are created and
      // set to have the correct initial values
      this.hours = new BoundedCounter2(23);
      this.hours.setValue(hoursAtBeginning);
      this.minutes = new BoundedCounter2(59);
      this.minutes.setValue(minutesAtBeginning);
      this.seconds = new BoundedCounter2(59);
      this.seconds.setValue(secondsAtBeginning);
    }

    public void tick()
    {
        // Clock advances by one second
        this.seconds.next();
        if (this.seconds.getValue() == 0) 
        {
            this.minutes.next();
            if (this.minutes.getValue() == 0) 
            {
                this.hours.next();
            }
        }
    }

    public String toString() 
    {
        // returns the string representation
        return this.hours + ":" + this.minutes + ":" + this.seconds;
    }
    
    public static void main(String[] args) 
    {
        Clock clock = new Clock(23, 59, 50);

        int i = 0;
        while( i < 20 ) 
        {
            System.out.println( clock );
            clock.tick();
            i++;
        }
    }
}
