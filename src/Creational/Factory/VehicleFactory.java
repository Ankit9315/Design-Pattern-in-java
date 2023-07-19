package Creational.Factory;

public class VehicleFactory {

	public static Vehicle getInstance(String type , int wheel) {
		if(type == "Car") {
			return new Car(wheel);
		}
		else {
			return new Bike(wheel);
		}
	}
}
