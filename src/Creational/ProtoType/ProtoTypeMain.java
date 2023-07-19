package Creational.ProtoType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProtoTypeMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		 BufferedReader br =new BufferedReader(new InputStreamReader(System.in));  
	        System.out.print("Enter Employee Id: ");  
	        int eid=Integer.parseInt(br.readLine());  
	        System.out.print("\n");  
	          
	        System.out.print("Enter Employee Name: ");  
	        String ename=br.readLine();  
	        System.out.print("\n");    
	          
	        System.out.print("Enter Employee Salary: ");  
	        int esalary= Integer.parseInt(br.readLine());  
	        System.out.print("\n");  
	           
	        EmployeeRecord e1=new EmployeeRecord(eid,ename,esalary);  
	          
	        e1.showRecord();  
	        System.out.println("\n");  
	        EmployeeRecord e2=(EmployeeRecord) e1.getClone();  
	        e2.showRecord();
	}

}
