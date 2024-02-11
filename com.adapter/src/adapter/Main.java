package adapter;

public class Main {

	
    public static void main(String[] args) {
        Vehicle car = new Car();

        Vehicle bicycle = new BicycleAdapter(new Bicycle());
 
        playWithVehicle(car);

        playWithVehicle(bicycle);
    }
	
    private static void playWithVehicle(Vehicle vehicle) {

        vehicle.accelerate();
        vehicle.push_Break();
        vehicle.sound_Horn();;
        System.out.println("\n");
    }
}
