package Structural.Proxy;

public class RealInternetAccess implements OfficeInternetAccess {
	private String employeeName;

	public RealInternetAccess(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public void grantInternetAccess() {
		// TODO Auto-generated method stub
		System.out.println("Grant Access to Employee"+employeeName);
	} 
	
}
