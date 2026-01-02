package com.constructor.accessmodifiers;

public class UseEmployee {

	public static void main(String[] args) {
		Employee e1=new Employee(103,"Designing",256767.0);
		Manager m1=new Manager(101,"Testing",456767.0);
		
		Manager m2=new Manager(102,"Developing",956767.0);
		m1.displayManagerDetails();
	    e1.displayEmployeeDetails();
	    m1.displayEmployeeDetails();
	
		System.out.println(e1.department);
		System.out.println(m1.employeeID);
		

	}

}
