public class OverloadedCounter
{
    private int counter;
    private boolean belowZero;
    
    public OverloadedCounter(int startingValue, boolean check)
    {
        this.counter = startingValue;
        this.belowZero = check;
    }
    
    public OverloadedCounter(int startingValue)
    {
        this(startingValue, false);
    }
    
    public OverloadedCounter(boolean check)
    {
        this(0, check);
    }
    
    public OverloadedCounter()
    {
        this(0, false);
    }
    
    public int value()
    {
        return this.counter;
    }
    
    public void increase()
    {
        this.counter++;
    }
    
    public void decrease()
    {
        this.counter--;
        if(this.belowZero && this.counter < 0)
        {
            this.counter = 0;
        }
    }
    
    public void increase(int increaseAmount)
    {
        if(increaseAmount > 0)
        {
            this.counter += increaseAmount;
        }
    }
    
    public void decrease(int decreaseAmount)
    {
        if(decreaseAmount > 0)
        {
            this.counter-= decreaseAmount;
            
            if(this.belowZero && this.counter < 0)
            {
                this.counter = 0;
            }
        }
    }
}