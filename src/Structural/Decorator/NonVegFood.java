package Structural.Decorator;

public class NonVegFood extends FoodDecorator{

	public NonVegFood(Food newFood) {
		super(newFood);
		// TODO Auto-generated constructor stub
	}
	
	public String prepareFood() {
		return super.prepareFood()+"chicken curry";
	}
	
	public double foodPrice() {
		return super.foodPrice()+25.0;
	}

}
