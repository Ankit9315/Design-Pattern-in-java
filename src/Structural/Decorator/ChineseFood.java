package Structural.Decorator;

public class ChineseFood extends FoodDecorator{

	public ChineseFood(Food newFood) {
		super(newFood);
	}

	public String prepareFood() {
		return super.prepareFood()+"chicken curry";
	}
	
	public double foodPrice() {
		return super.foodPrice()+25.0;
	}
}
