package Structural.Composite;

public class Cashierleaf implements EmployeeComponent{

	int id;
	String name;
	long salary;
	
	public Cashierleaf(int id, String name, long salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int getId() {
		return id;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public long getSalary() {
		return salary;
	}
	@Override
	public void print() {
		 System.out.println("=========================");  
	     System.out.println("Id ="+getId());  
	     System.out.println("Name ="+getName());  
	     System.out.println("Salary ="+getSalary());  
	     System.out.println("=========================");
	//	System.out.println("Cashier [id=" + id + ", name=" + name + ", salary=" + salary + "]");
	}

	@Override
	public void add(EmployeeComponent employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(EmployeeComponent employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EmployeeComponent getChild(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
