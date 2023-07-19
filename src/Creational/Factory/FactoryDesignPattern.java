package Creational.Factory;

public class FactoryDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle vehicle1 = VehicleFactory.getInstance("Car", 4);
		
		Vehicle vehicle2 = VehicleFactory.getInstance("Bike",2);
		
		System.out.println(vehicle1 + "  "+ vehicle2 );
	}

}
