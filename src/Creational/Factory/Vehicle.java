package Creational.Factory;

public abstract class Vehicle {

	public abstract int getWheel();
	
	public String toString() {
		return "Wheel : "+ getWheel();
		
	}
}
