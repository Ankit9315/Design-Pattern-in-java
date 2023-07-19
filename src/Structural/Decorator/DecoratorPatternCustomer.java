package Structural.Decorator;

import java.util.Scanner;

public class DecoratorPatternCustomer {

	private static int choice = 0 ;
	public static void main(String aargs[]) {
		
		Scanner scanner = new Scanner(System.in);
		do {
			
			System.out.println("================ FOOD MENU ===================");
			System.out.println(" 1. Veg Food ");
			System.out.println(" 2. Non-Veg Food ");
			System.out.println(" 3. Chinese Food ");
			System.out.println(" 4. Exit ");
			System.out.println("What you want ");
			choice = scanner.nextInt();
			switch(choice) {
			case 1: 
				Food vegFood = new VegFood();
				System.out.println(vegFood.prepareFood());
				System.out.println(vegFood.foodPrice());
				break;
			case 2:
				Food nonVegFood1 = new NonVegFood(new VegFood());
				System.out.println(nonVegFood1.prepareFood());
				System.out.println(nonVegFood1.foodPrice());
				break;
			case 3:
				Food chineseFood1 = new ChineseFood(new VegFood());
				System.out.println(chineseFood1.prepareFood());
				System.out.println(chineseFood1.foodPrice());
				break;
			default:
				System.out.println("Non Found");
				
			}
		}while(choice!=4);
		scanner.close();
	}
}
