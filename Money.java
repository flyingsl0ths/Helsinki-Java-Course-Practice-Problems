public class Money 
{

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) 
    {

        if (cents > 99) 
        {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros()
    {
        return euros;
    }

    public int cents()
    {
        return cents;
    }

    public String toString() 
    {
        String zero = "";
        if (cents <= 10) 
        {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added)
    {
        int sumOfCents = this.cents + added.cents;
        int sumOfEuros = this.euros + added.euros;
        
        if(sumOfCents > 100)
        {
            sumOfCents = 0;
            sumOfEuros++;
        }  
        
        return new Money(sumOfEuros, sumOfCents);
    }
    
    public boolean less(Money compared)
    {
        return this.euros <= compared.euros() || this.cents < compared.cents();
    }
    
    public Money minus(Money decremented)
    {
        int differenceOfCents = this.cents - decremented.cents;
        int differenceOfEuros = this.euros - decremented.euros;
        
        if(differenceOfCents < 0)
        {
            differenceOfEuros--;
            differenceOfCents += 100;
        }  
        
        if (differenceOfEuros < 0) {
            differenceOfEuros = 0;
            differenceOfCents = 0;
        }
       
        return new Money(differenceOfEuros, differenceOfCents);
    }
}