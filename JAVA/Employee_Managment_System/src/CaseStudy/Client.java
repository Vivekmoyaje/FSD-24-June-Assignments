package CaseStudy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Client {

	public static void main(String[] args) {

		HashMap<Integer, Employee> employee = new HashMap<Integer, Employee>();

		int empid = 7890;

		while (true) {
			System.out.println("****Employee Management System***");
			System.out.println("1.Add Employee");
			System.out.println("2.Update Employee");
			System.out.println("3.get Employee");
			System.out.println("4.Delete Employee");
			System.out.println("5.Get All Employees");

			Scanner sc = new Scanner(System.in);
			int option = sc.nextInt();

			switch (option) {
			case 1:
				System.out.println("Add Employee details");
				System.out.println("Enter Employee Name..");
				String empName = sc.next();
				System.out.println("Enter Employee salary");
				int empSal = sc.nextInt();
				System.out.println("Enter Employee Address");
				String empAdd = sc.next();
				System.out.println("Enter Employee mail id");
				String empMail = sc.next();

				Employee emp = new Employee(empName, empSal, empAdd, empMail);

				employee.put(++empid, emp);
				System.out.println("Employee added suufully :" + empid);
				break;
			case 2:
				System.out.println("Update Employee details");
				System.out.println("for update enter employee id");
				int eid = sc.nextInt();
				System.out.println("Enter Employee Name..");
				String eName = sc.next();
				System.out.println("Enter Employee salary");
				int eSal = sc.nextInt();
				System.out.println("Enter Employee Address");
				String eAdd = sc.next();
				System.out.println("Enter EMPLOYE mail id");
				String eMail = sc.next();

				Employee emp1 = new Employee(eName, eSal, eAdd, eMail);
				employee.put(eid, emp1);
				System.out.println("employee updadted succesfully :" + eid);
				break; 
				
			case 3:
				System.out.println("get Employee details");
				System.out.println("Enter employee id to get details");
				int eid2 = sc.nextInt();

				Employee empobj = employee.get(eid2);
				System.out.println(empobj);

				break;
			case 4:
				System.out.println("delete Employee details");
				System.out.println("Enter Employee id to dleete");
				int eid3 = sc.nextInt();

				employee.remove(eid3);
				System.out.println("Employee deleted suufully :" + eid3);
				break;
			case 5:
				System.out.println("Get all Employee details");
				Set<Entry<Integer, Employee>> result = employee.entrySet();
				Iterator<Entry<Integer, Employee>> itr = result.iterator();

				while (itr.hasNext()) {
					Entry<Integer, Employee> finalResult = itr.next();
					System.out.println(finalResult.getKey() + "  " + finalResult.getValue());
				}
				break;
			default:
				System.out.println("no case is not matched");
				break;
			}
		}
	}
}
