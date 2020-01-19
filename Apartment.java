// Exercise 87: Apartment comparison

public class Apartment 
{
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter)
    {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment otherApartment)
    {
        return this.squareMeters > otherApartment.squareMeters;
    }
    
    public int priceDifference(Apartment otherApartment)
    {
        int priceOfThisApartment = this.squareMeters * this.pricePerSquareMeter;
        
        int priceOfOtherApartment = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        
        return Math.abs(priceOfThisApartment - priceOfOtherApartment);
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment)
    {
        int priceOfThisApartment = this.squareMeters * this.pricePerSquareMeter;
        
        int priceOfOtherApartment = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        
        return priceOfThisApartment > priceOfOtherApartment;
    }
}
