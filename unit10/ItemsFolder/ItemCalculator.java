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
       
       return total/item.size(); 
   }
   public String mostExpensiveItem(ArrayList<Item> items)
   {
       Item MostExpensiveItem = items.get(0); // bc the ArrayList items has both floats and Strings, you have do specify type Item instead of float for this variable in order for code to run
       for (Item item : items)
       {
           if (item.getPrice() > MostExpensiveItem)
           {
               MostExpensiveItem = item;
           }
       }
       return MostExpensiveItem.getName();
   }
}