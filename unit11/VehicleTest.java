import java.util.*; // need to import this if you're using an arraylist!
public class VehicleTest
{
    public static void main(String[] args)
    {
        System.out.println("Vehicle Test: ");
        
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        
        vehicles.add(new Bicycle("Bicycle", 2, true));
        vehicles.add(new Car("Car", 4, false));
        vehicles.add(new Motorcycle("Motorcycle", 2, false));
        vehicles.add(new Unicycle("Unicycle", 1, true));
        
        for (Vehicle vehicle : vehicles)
        {
            System.out.println("Name: " + vehicle.name() + "; " + "Number of wheels: " + vehicle.wheelCount() + "; " + "It is human powered? " + vehicle.isHumanPowered());
        }
        
    }
}