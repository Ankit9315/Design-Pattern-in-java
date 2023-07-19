package Behavioural.State;

import java.util.Scanner;

public class StatePatternMain {

	public static void main(String[] aargs) {
		
		Scanner sc = new Scanner(System.in);
		
		String con = sc.nextLine();
		
		Controller controller = new Controller();
		
		if(con.equalsIgnoreCase("management")) {
			controller.setManagementConnection();
		}
		if(con.equalsIgnoreCase("sales")) {
			controller.setSalesConnection();
		}
		if(con.equalsIgnoreCase("Accounting")) {
			controller.setAccountingConnection();
		}
		
		controller.open();
		controller.close();
		controller.log();
		controller.update();
		System.out.println();
		sc.close();
	}
}
