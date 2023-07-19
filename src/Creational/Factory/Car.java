package Creational.Factory;

public class Car extends Vehicle{
 int wheel;

public Car(int wheel) {
	super();
	this.wheel = wheel;
}

@Override
public int getWheel() {
	// TODO Auto-generated method stub
	return wheel;
}

}
