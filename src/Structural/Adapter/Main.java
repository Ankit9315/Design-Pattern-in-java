package Structural.Adapter;

public class Main {

	public static void main(String aargs[]) {
		
		CreditCardTarget target = new BankCustomerAdapter();
		target.giveBankDetails();
		
		System.out.println(target.getCreditCard());
	}
}
