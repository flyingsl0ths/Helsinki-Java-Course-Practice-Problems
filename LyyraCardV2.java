// Lyyra card and Cash Register Exercise
public class LyyraCardV2
{
    private double balance;

    public LyyraCardV2(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void loadMoney(double amount) {
        this.balance += amount;
    }

    public boolean pay(double amount){
       // the method checks if the balance of the card is at least the amount given as parameter
       if(this.balance >= amount)
       {
           // if the balance is enough, the given amount is taken from the balance and true is returned
           this.balance -= amount;
           return true;
       } else {
           // if not, the method returns false meaning that the card could not be used for the payment
           return false;
       }
    }
    
    private static class CashRegister 
    {
        private double cashInRegister = 0;   // the amount of cash in the register
        private int economicalSold = 0;      // the amount of economical lunches sold
        private int gourmetSold = 0;         // the amount of gourmet lunches sold
        private double economicalLunchPrice = 2.50;
        private double gourmetLunchPrice = 4.00;
        
        public CashRegister() 
        {
            // at start the register has 1000 euros
            this.cashInRegister = 1000;
        }
    
        public double payEconomical(double cashGiven) 
        {
            // the price of the economical lunch is 2.50 euros
            // if the given cash is at least the price of the lunch:
            if(cashGiven >= this.economicalLunchPrice)
            {
                //  the price of lunch is added to register
                this.cashInRegister += this.economicalLunchPrice;
                
                //  the amount of the sold lunches is incremented by one
                this.economicalSold++;
                
                // the method returns cashGiven - lunch price
                return cashGiven - this.economicalLunchPrice;
            }
            
            
            // if not enough money is given, all is returned and nothing else happens
            return cashGiven;
        }
    
        public double payGourmet(double cashGiven) 
        {
            // the price of the gourmet lunch is 4.00 euros
            // if the given cash is at least the price of the lunch:
            if(cashGiven >= this.gourmetLunchPrice)
            {
                //  the price of lunch is added to register
                this.cashInRegister += this.gourmetLunchPrice;
                
                //  the amount of the sold lunches is incremented by one
                this.gourmetSold++;
                
                // the method returns cashGiven - lunch price
                return cashGiven - this.gourmetLunchPrice;
            }
            
            
            // if not enough money is given, all is returned and nothing else happens
            return cashGiven;
        }
    
        public String toString() 
        {
            return "money in register "+ cashInRegister +" economical lunches sold: "+ economicalSold +" gourmet lunches sold: "+ gourmetSold;
        }
        
        public boolean payEconomical(LyyraCardV2 card) 
        {
            // the price of the economical lunch is 2.50 euros
            // if the balance of the card is at least the price of the lunch:
            if(card.balance() >= this.economicalLunchPrice)
            {
                // charge the card
                card.pay(this.economicalLunchPrice);
                
                // the amount of sold lunches is incremented by one
                this.economicalSold++;
                
                // the method return true
                return true;
                
            }
            
            // if not, the method returns false
            return false;
            
        }

        public boolean payGourmet(LyyraCardV2 card) 
        {
            // the price of the economical lunch is 4.00 euros
            // if the balance of the card is at least the price of the lunch:
            if(card.balance() >= this.gourmetLunchPrice)
            {
                // charge the card
                card.pay(this.gourmetLunchPrice);
                
                // the amount of sold lunches is incremented by one
                this.gourmetSold++;
                
                // the method return true
                return true;
                
            }
            
            // if not, the method returns false
            return false;
        }
        
        public void loadMoneyToCard(LyyraCardV2 card, double sum) 
        {
            if(sum > 0)
            {
                card.loadMoney(sum);
                cashInRegister += sum;
            }
        }
    }
    
    public static void main(String[] args)
    {
        CashRegister unicafeExactum = new CashRegister();
        System.out.println( unicafeExactum );

        LyyraCardV2 cardOfJim = new LyyraCardV2(2);

        System.out.println("the card balance " + cardOfJim.balance() + " euros");

        boolean succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);

        unicafeExactum.loadMoneyToCard(cardOfJim, 100);

        succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);

        System.out.println("the card balance " + cardOfJim.balance() + " euros");

        System.out.println( unicafeExactum );
    }
}
