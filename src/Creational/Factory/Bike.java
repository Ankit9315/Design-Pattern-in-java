package Creational.Factory;

public class Bike extends Vehicle{
	int wheel;

	public Bike(int wheel) {
		super();
		this.wheel = wheel;
	}

	@Override
	public int getWheel() {
		// TODO Auto-generated method stub
		return wheel;
	}
	
}
