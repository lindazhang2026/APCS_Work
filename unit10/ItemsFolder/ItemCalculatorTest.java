import java.util.*;
public class ItemCalculatorTest
{
       
    public static void main(String[] args)
    {
        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item("Computer", 100)); // don't need the f for integers
        items.add(new Item("Pen", 5.01f));// bc the default type of number is double (twice the amount of decimal places than a float), so adding an 'f' specifies that its a float and rounds it off sooner.
        items.add(new Item("Cup", 15.99993838f));
        
        ItemCalculator calculator = new ItemCalculator();
        
        System.out.println("Names and Prices: ");
        calculator.nameAndPrices(items);
        
        System.out.println("Test Average Price: ");
        float expectedAverage = (100 + 5.01f + 15.99993838f) / 3;
        float actualAverage = calculator.averagePrice(items);
        
        if (expectedAverage == actualAverage)
        {
            System.out.println("Average price correct!");
        }
        else
        {
            System.out.println("Incorrect average price.");
        }
        
        System.out.println("Test Most Expensive Item: ");
        String expectedItem = "Computer";
        String actualItem = calculator.mostExpensiveItem(items);
        
        if (expectedItem.equals(actualItem))
        {
            System.out.println("Most expensive item correct!");
        }
        else
        {
            System.out.println("Incorrect most expensive item.");
        }     
    }  
}
        

       