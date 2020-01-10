public class Product
{
    private String name;
    private double price;
    private int amount;
    
    public Product(String nameAtStart, double priceAtStart, int amountAtStart)
    {
        this.name = nameAtStart;
        this.price = priceAtStart;
        this.amount = amountAtStart;
    }
    
    public void printProduct()
    {
        System.out.print(this.name + ", ");
        System.out.print("price " + this.price + ", ");
        System.out.println("amount " + this.amount);
    }
    
    public static void main(String[] args)
    {
        Product banana = new Product("Banana", 1.1, 13);
        banana.printProduct();
    }
}
