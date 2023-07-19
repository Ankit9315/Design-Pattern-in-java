package Structural.Composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BankManagerComposite  implements EmployeeComponent{

	int id;
	String name;
	long salary;
	
	List<EmployeeComponent> employees = new ArrayList<EmployeeComponent>(); 
	
	public BankManagerComposite(int id, String name, long salary) {
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
		System.out.println("==========================");  
	      System.out.println("Id ="+getId());  
	      System.out.println("Name ="+getName());  
	      System.out.println("Salary ="+getSalary());  
	      System.out.println("==========================");  
	        
	      Iterator<EmployeeComponent> it = employees.iterator();  
	        
	          while(it.hasNext())  {  
	        	  EmployeeComponent employee = it.next();  
	            employee.print();  
	          }
	//	System.out.println("BankManager [id=" + id + ", name=" + name + ", salary=" + salary + "]");
	}

	@Override
	public void add(EmployeeComponent employee) {
		employees.add(employee);
	}

	@Override
	public void remove(EmployeeComponent employee) {
		// TODO Auto-generated method stub
		employees.remove(employee);
	}

	@Override
	public EmployeeComponent getChild(int id) {
		// TODO Auto-generated method stub
		return employees.get(id);
	}
	
}
