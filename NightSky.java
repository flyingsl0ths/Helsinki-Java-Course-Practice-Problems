import java.util.Random;

public class NightSky
{
  private double density;
  private int width;
  private int height;
  private int starsInLastPrint = 0;
  
  public NightSky(double density)
  {
    this.density = density;
    this.width = 20;
    this.height = 10;
  }
  
  public NightSky(int width, int height)
  {
    this.width = width;
    this.height = height;
    this.density = 0.1;
  }
  
  public NightSky(double density, int width, int height)
  {
    this.density = density;
    this.width = width;
    this.height = height;
  }
  
  public void printLine()
  {
    Random random = new Random();
    
    for(int i = 0; i < this.width; i++)
    {
      if (random.nextDouble() < density) 
      {
        System.out.print("*");
        this.starsInLastPrint++;
      } else {
        System.out.print(" ");
      }
    }
    System.out.println(); // Print a newline after each method call
  }
  
  public void print()
  {
    // Counter must be reset to keep track of stars in current method call 
    this.starsInLastPrint = 0;
    
    for(int j = 0; j < this.height; j++)
    {
      this.printLine();
    }
  }

  public int starsInLastPrint()
  { 
    return this.starsInLastPrint;
  }

  public static void main(String[] args)
  {
    NightSky NightSky = new NightSky(0.1, 40, 10);
    NightSky.print();
    System.out.println("Number of stars: " + NightSky.starsInLastPrint());
    System.out.println("");

    NightSky = new NightSky(0.2, 15, 6);
    NightSky.print();
    System.out.println("Number of stars: " + NightSky.starsInLastPrint());
  }
}
