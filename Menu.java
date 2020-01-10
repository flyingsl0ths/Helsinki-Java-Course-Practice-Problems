import java.util.ArrayList;

public class Menu 
{

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    // Implement the methods here
    
    public void addMeal(String meal)
    {
        if(!this.meals.contains(meal))
        {
            this.meals.add(meal);
        }
    }
    
    public void printMeals()
    {
        if(this.meals.size() != 0)
        {
            for(String meal : this.meals)
            {
                System.out.println(meal);
            }
        } else {
            System.out.println("Menu is empty");
        }
    }
    
    public void clearMenu()
    {
        this.meals.clear();
    }
    
    public static void main(String[] args)
    {
        Menu foodMenu = new Menu();
        
        foodMenu.addMeal("Pizza");
        foodMenu.addMeal("Hot Dogs");
        foodMenu.addMeal("Salad");
        
        foodMenu.addMeal("Pizza"); // Will not be added since exists already
        
        foodMenu.printMeals(); // Prints all added meals except duplicates
        
        foodMenu.clearMenu(); // Deletes all menu items
        foodMenu.printMeals();
    }
}