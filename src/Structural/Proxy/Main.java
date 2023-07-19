package Structural.Proxy;

public class Main {

	public static void main(String[] aargs) {
		OfficeInternetAccess access = new ProxyInternetAccess("Nagsen Shinde");
		access.grantInternetAccess();
	}
	
}
