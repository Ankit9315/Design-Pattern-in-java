package Structural.Composite;

public interface EmployeeComponent {

	public int getId();
	public String getName();
	public long getSalary();
	public void print();
	
	public void add(EmployeeComponent employee);
	public void remove(EmployeeComponent employee);
	public EmployeeComponent getChild(int id);
	
}
