import java.util.*;
public class VehicleStats // you don't have to implement vehicle for VehicleStats or VehicleTest bc you are not defining the methods declared in the Vehicle interface such as name(), wheelCount(), and isHumanPowered()!
{
    public int totalWheelNumber(ArrayList<Vehicle> vehicles)
    {
        int total = 0;
        for (Vehicle vehicle : vehicles)
        {
            total += vehicle.wheelCount();
        }
        return total;
    }
    public ArrayList<Vehicle> arraylistOfHumanPowered(ArrayList<Vehicle> vehicles)
    {
        ArrayList<Vehicle> humanpoweredvehicles = new ArrayList<Vehicle>();
        for (Vehicle vehicle : vehicles)
        {
            if (vehicle.isHumanPowered() == true)
            {
                humanpoweredvehicles.add(vehicle);
            }  
        }
        return humanpoweredvehicles; 
    }
}