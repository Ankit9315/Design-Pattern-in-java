package Structural.Composite;

public class CompositePatternClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeComponent emp1=new Cashierleaf(101,"Sohan Kumar", 20000);  
		EmployeeComponent emp2=new Cashierleaf(102,"Mohan Kumar", 25000);  
		EmployeeComponent emp3=new Accountantleaf(103,"Seema Mahiwal", 30000);   
		EmployeeComponent manager1=new BankManagerComposite(100,"Ashwani Rajput",100000);  
           
        manager1.add(emp1);  
        manager1.add(emp2);  
        manager1.add(emp3);  
        manager1.print();  
	}

}
