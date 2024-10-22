package UI_Layer;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import Model_Layer.Employee;
import Service_Layer.EmployeeService;
import Service_Layer.EmployeeServiceImpl;

public class Client {

	public static void main(String[] args) {

		// object creation of service layer

		EmployeeService service = new EmployeeServiceImpl();

		while (true) {

			System.out.println("*** Employee management System ***");
			System.out.println("1.Add Employee");
			System.out.println("2.Update Employee");
			System.out.println("3.Get Employee");
			System.out.println("4.Delete Employee");
			System.out.println("5.Get All Employees");

			Scanner sc = new Scanner(System.in);
			int option = sc.nextInt();

			switch (option) {

			case 1:
				System.out.println("Enter Employee details to insert");
				System.out.println("Enter Employee name");
				String empName = sc.next();
				System.out.println("Enter Employee salary");
				int empSalary = sc.nextInt();
				System.out.println("Enter Employee address");
				String empAddress = sc.next();
				System.out.println("Enter Employee email Id");
				String empEmailId = sc.next();

				Employee emp = new Employee(empName, empSalary, empAddress, empEmailId);
				int empId = service.addEmployee(emp);
				System.out.println("Employee added succesfully of Id :" + empId);

				break;

			case 2:
				System.out.println("Enter Employee Id to update");
				int eId = sc.nextInt();

				System.out.println("Enter Employee name");
				String eName = sc.next();
				System.out.println("Enter Employee salary");
				int eSalary = sc.nextInt();
				System.out.println("Enter Employee address");
				String eAddress = sc.next();
				System.out.println("Enter Employee email Id");
				String eEmailId = sc.next();

				Employee emp1 = new Employee(eName, eSalary, eAddress, eEmailId);

				service.updateEmployee(eId, emp1);

				System.out.println("Employee update succesfully : " + eId);
				break;

			case 3:
				System.out.println("Enter Employee Id to get");
				int eId1 = sc.nextInt();

				Employee emp2 = service.getEmployee(eId1);
				System.out.println(emp2);

				break;

			case 4:
				System.out.println("Enter Employee Id delete");
				int eId2 = sc.nextInt();

				service.deleteEmployee(eId2);
				System.out.println("Employee deleted : " + eId2);
				break;

			case 5:
				Set<Entry<Integer, Employee>> itr = service.getAllEmployee();
				Iterator<Entry<Integer, Employee>> res = itr.iterator();

				while (res.hasNext()) {

					Entry<Integer, Employee> finalResult = res.next();
					System.out.println(finalResult.getKey() + " " + finalResult.getValue());

				}
				break;
			default:
				System.out.println("No input match");
				break;
			}
		}

	}

}
