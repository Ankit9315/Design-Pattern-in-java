package Creational.ProtoType;

public class EmployeeRecord implements ProtoType{

	int id;
	String name;
	
	int salary;
	
	public EmployeeRecord() {
		// TODO Auto-generated constructor stub
		System.out.println("EmpolyeeRecord [id=" + id + ", name=" + name + ", salary=" + salary + "]");
	}

	@Override
	public String toString() {
		return "EmpolyeeRecord [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public EmployeeRecord(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public ProtoType getClone() {
		// TODO Auto-generated method stub
		return new EmployeeRecord(id,name,salary);
	}

	public void showRecord() {
		
		System.out.println("EmpolyeeRecord [id=" + id + ", name=" + name + ", salary=" + salary + "]");
		
	}

}
