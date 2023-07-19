package Behavioural.Strategy;

import java.util.Scanner;

public class StrategyMainClass {

	public static void main(String aargs[]) {
		
		Scanner sc = new Scanner(System.in);
		
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		
		Context context = new Context(new Addition());
		
		System.out.println(context.executeStrategy(a, b));
		
		context = new Context(new Substraction());
		System.out.println(context.executeStrategy(a, b));
		context = new Context(new Multiplication());
		System.out.println(context.executeStrategy(a, b));
		
		sc.close();
	}
}
