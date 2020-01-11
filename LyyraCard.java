
public class LyyraCard
{
    private double balance;
    
    public LyyraCard(double balanceAtStart)
    {
        this.balance = balanceAtStart;
    }
    
    public String toString()
    {
        return "The card has " + this.balance + " euros";
    }
    
    public void payEconomical()
    {
        double economicalPrice = 2.50;
        
        if(this.balance > economicalPrice)
        {
            this.balance -= economicalPrice;
        }
    }
    
    public void payGourmet()
    {
        double gourmetPrice = 4.00;
        
        if(this.balance > gourmetPrice)
        {
            this.balance -= gourmetPrice;
        }
    }
    
    public void loadMoney(double amount)
    {
        double maximumAmount = 150;
        
        if(amount > 0)
        {
            this.balance += amount;
        }
        
        if(this.balance > maximumAmount)
        {
            this.balance = maximumAmount;
        }
    }
    
    public static void main(String[] args)
    {
        LyyraCard cardPekka = new LyyraCard(20);
        LyyraCard cardBrian = new LyyraCard(30);
        
        cardPekka.payGourmet();
        System.out.println("Pekka: " + cardPekka.toString());
        
        cardBrian.payEconomical();
        System.out.println("Brian: " + cardBrian.toString());
        
        cardPekka.loadMoney(20);
        cardBrian.payGourmet();
        
        System.out.println("Pekka: " + cardPekka.toString());
        System.out.println("Brian: " + cardBrian.toString());
        
        cardPekka.payEconomical();
        cardPekka.payEconomical();
        
        cardBrian.loadMoney(50);
        
        System.out.println("Pekka: " + cardPekka.toString());
        System.out.println("Brian: " + cardBrian.toString());
    }
}
