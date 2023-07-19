package Structural.Proxy;

public class ProxyInternetAccess implements OfficeInternetAccess{

	private String employeeName; 
	
	private RealInternetAccess realInternetAccess;
	
	public ProxyInternetAccess(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public void grantInternetAccess() {
		// TODO Auto-generated method stub
		
		if(getRole(employeeName)>5) {
			realInternetAccess = new RealInternetAccess(employeeName);
			realInternetAccess.grantInternetAccess();
		}
		else {
			System.out.println("You donot have access");
		}
	}

	public int getRole(String employeeName) {
		return 4;
	}
}
