package com.programming.class2;

import java.util.Objects;

//user defines or custom class

class Employee {
	String FirstName;
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(FirstName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(FirstName, other.FirstName);
	}

}

 class LetstestequalswitchUserDefinedClass{
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.setFirstName("ABC");
		e1.setFirstName("ABC");
		
		if(e1.equals(e2)) {
			System.out.println("equals work with custom class");
		}else {
			System.out.println("Equals does not work with custom class");
		}
		
		System.out.println("Memory Address is " + e1.hashCode());
		System.out.println("Memory Address is " + e2.hashCode());
		
	}
}


