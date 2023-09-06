package com.programming.class2;

public class EmployeeData {
	
	//non static
	
	int empID;
	String empName;
	
	static String orgAddress = "ABC XYZ";
	
	static void orgAddressChange() {
		orgAddress = "MNO PQR";
	}
		
		EmployeeData(int empID, String empName){
			this.empID = empID;
			this.empName = empName;
			
		}
		void display() {
			System.out.println("Id of Emp is " + empID + "and name of the emp is " + empName + "and orgAddress is " + orgAddress );
		}
		
		public static void main(String[] args) {
			EmployeeData.orgAddressChange();
			EmployeeData e1 = new EmployeeData(123, "John");
			EmployeeData e2 = new EmployeeData(789, "Prerna");
			
			e1.display();
			e2.display();
			
		}
	}
	
	


