package Inheritance_Task;

//Hierarchy inheritance example.

//Exercise:3  Employee Management System
//Create a Java class hierarchy for an employee management system with three classes: Employee, Manager, and Developer.

//Employee Class:
//Properties: name, employeeId, salary
//Method: displayDetails(), which prints the employee's name, ID, and salary.

//Manager Class (subclass of Employee):
//Additional Property: department
//Method: manageTeam(), which prints "Managing the team."

//Developer Class (subclass of Employee):
//Additional Property: programmingLanguage
//Method: writeCode(), which prints "Writing code in Java."

//Write a Main class to demonstrate the use of these classes by creating instances of both Manager and Developer, 
//setting their properties, and calling their methods.

class Employee {

	String name;
	int employeeId;
	double salary;

	public Employee(String name, int employeeId, double salary) {

		this.name = name;
		this.employeeId = employeeId;
		this.salary = salary;
		this.displayDetails();
	}

	public void displayDetails() {

		System.out.println("Employee name is : " + name);
		System.out.println("Employee id is : " + employeeId);
		System.out.println("Employee salary is : " + salary);

	}

}

class Manager extends Employee {

	String department;

	public Manager(String name, int employeeId, double salary, String department) {

		super(name, employeeId, salary);
		this.department = department;

		System.out.println("Programming language skill : " + department);
		

	}

	public void manageTeam() {

		System.out.println("Managing the team.");
	}

}

class Developer extends Employee {

	String programmingLanguage;

	public Developer(String name, int employeeId, double salary, String programmingLanguage) {

		super(name, employeeId, salary);
		this.programmingLanguage = programmingLanguage;

		System.out.println("Programming language skill : " + programmingLanguage);
	
	}

	public void writeCode() {
		System.out.println("Writing code in java .");
	}

}

public class EmployeeManagmentSystem {

	public static void main(String[] args) {

		Manager Mr = new Manager("Rohit", 45, 50000, "Software development");
		Mr.manageTeam();
		
		System.out.println("-----------------------------------------");
		
		Developer Dr = new Developer("Rahul", 34, 78000, "JAVA");
		Dr.writeCode();

	}

}

//Output:

//Employee name is : Rohit
//Employee id is : 45
//Employee salary is : 50000.0
//Programming language skill : Software development
//Managing the team.
//-----------------------------------------
//Employee name is : Rahul
//Employee id is : 34
//Employee salary is : 78000.0
//Programming language skill : JAVA
//Writing code in java .

