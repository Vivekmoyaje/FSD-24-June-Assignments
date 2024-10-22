package car_Showroom;

import java.util.Scanner;

class Employee extends Showroom implements utility {

	private int emp_id;
	private String emp_name;
	private int emp_age;
	private String emp_department;

	@Override

	public void get_details() {

		System.out.println(" \n *****Employee Details : *****");
		System.out.println("ID : " + emp_id);
		System.out.println("Name : " + emp_name);
		System.out.println("Age : " + emp_age);
		System.out.println("Department : " + emp_department);
		System.out.println("\n-------------------------------------------\n");

	}

	@Override

	public void set_details() {

		Scanner input = new Scanner(System.in);
		
		System.out.println("\n *** Enter Employee Details *** \n");

		System.out.print("Enter Employee ID : ");
		emp_id = input.nextInt();
		input.nextLine();

		System.out.print("Enter Employee Name : ");
		emp_name = input.nextLine();

		System.out.print("Enter Employee Age : ");
		emp_age = input.nextInt();
		input.nextLine();

		System.out.print("Enter Employee Department : ");
		emp_department = input.nextLine();
		
		System.out.println("\n-------------------------------------------\n");

	}

}
