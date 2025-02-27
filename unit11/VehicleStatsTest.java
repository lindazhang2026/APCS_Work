import java.util.*;
public class VehicleStatsTest
{
    public static void main(String[] args)
    {
        System.out.println("Vehicle Stats Test: ");
        
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        
        vehicles.add(new Bicycle("Bicycle", 2, true));
        vehicles.add(new Car("Car", 4, false));
        vehicles.add(new Motorcycle("Motorcycle", 2, false));
        vehicles.add(new Unicycle("Unicycle", 1, true));
        
        VehicleStats stats = new VehicleStats(); // creating an object of VehicleStats to call its methods
        
        int totalWheels = stats.totalWheelNumber(vehicles);
        // in the line above vehicles goes in the parenthesis
        // bc the method totalWheelNumber() expects an ArrayList<Vehicle> parameter
        // as it is defined as 
        // public int totalWheelNumber(ArrayList<Vehicle> vehicles)
        
        ArrayList<Vehicle> humanpoweredvehicles = stats.arraylistOfHumanPowered(vehicles);
        
        System.out.println("Total number of wheels in the ArrayList: " + totalWheels);
        
        System.out.println("ArrayList of human powered vehicles: ");
        
        for (Vehicle vehicle : humanpoweredvehicles)
        {
            System.out.print(vehicle.name() + " ");
        }
    }
    
}