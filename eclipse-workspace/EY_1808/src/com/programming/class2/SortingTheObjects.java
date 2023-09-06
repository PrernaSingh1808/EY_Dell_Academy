package com.programming.class2;
import java.util.Arrays;
import java.util.Comparator;

class Employee1 implements Comparable<Employee1> {

	    private int empId;

	    private int empAge;

	    private int empSalary;

	    private String empName;

	    public int getEmpId() {

	        return empId;

	    }

	    public void setEmpId(int empId) {

	        this.empId = empId;

	    }

	    public int getEmpAge() {

	        return empAge;

	    }

	    public void setEmpAge(int empAge) {

	        this.empAge = empAge;

	    }

	    public int getEmpSalary() {

	        return empSalary;

	    }

	    public void setEmpSalary(int empSalary) {

	        this.empSalary = empSalary;

	    }

	    public String getEmpName() {

	        return empName;

	    }

	    public void setEmpName(String empName) {

	        this.empName = empName;

	    }

	    Employee1(int empId,int empAge,String empName,int empSalary)

	    {

	        this.empId=empId;

	        this.empAge=empAge;

	        this.empSalary=empSalary;

	        this.empName=empName;

	        

	    }

	    
	    public String toString() {
	    	return ("id is: "+ this.empId +" age is: "+ this.empAge +" name is: "+ this.empName +" Salary is: "+ this.empSalary);
	    }
	    
	    public int compareTo(Employee1 o) {
	    	return this.empId - o.empId;
	    }
	    public static Comparator<Employee1> ageComparator = new Comparator<>() {
	    	public int compare(Employee1 o1, Employee1 o2) {
	    		return o1.getEmpAge() - o2.getEmpAge();
	    		}
	    	};
	    	
	    	 public static Comparator<Employee1> nameeComparator = new Comparator<>() {
	 	    	public int compare(Employee1 o1, Employee1 o2) {
	 	    		return o1.getEmpName() .compareTo(o2.getEmpName());
	 	    		}
	 	    	};
	 	    	
	 	    	 public static Comparator<Employee1> salaryComparator = new Comparator<>() {
	 		    	public int compare(Employee1 o1, Employee1 o2) {
	 		    		return o1.getEmpSalary() - o2.getEmpSalary();
	 		    		}
	 		    	};

	}

	public class SortingTheObjects

	{

	    public static void main(String[] args) {

	        Employee1[] empArr = new Employee1[4];

	        empArr[0] = new Employee1(1,20,"R",40051);

	        empArr[1] = new Employee1(2,21,"S",40021);

	        empArr[2] = new Employee1(3,22,"T",40041);

	        empArr[3] = new Employee1(4,23,"U",40031);

	        Arrays.sort(empArr);

	        System.out.println("Sorted objects are: "+ Arrays.toString(empArr));

	    }

	}
