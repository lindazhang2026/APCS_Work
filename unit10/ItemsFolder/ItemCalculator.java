import java.util.*;
public class ItemCalculator
{
   // printing names and prices of Items:
   public void nameAndPrices(ArrayList<Item> items) // Arraylist of type Item called items
   {
       for (Item item : items)
       {
           System.out.println("Name: " + item.getName() + "; Price: " + item.getPrice());
       }
   }

   public float averagePrice(ArrayList<Item> items)
   {
       float total = 0;
       for (Item item : items)
       {
           total += item.getPrice();
       }
       
       return total/items.size(); 
   }
   public String mostExpensiveItem(ArrayList<Item> items)
   {
       Item MostExpensiveItem = items.get(0); // they want you to use the class name bc you're literally getting something from the class
       for (Item item : items)
       {
           if (item.getPrice() > MostExpensiveItem.getPrice())
           {
               MostExpensiveItem = item;
           }
       }
       return MostExpensiveItem.getName();
   }
}