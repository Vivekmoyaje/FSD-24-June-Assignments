package Service_Layer;

import java.util.Map.Entry;
import java.util.Set;

import Model_Layer.Employee;

public interface EmployeeService {

	// employee service : to get security

	int addEmployee(Employee emp);

	Employee updateEmployee(int empId, Employee emp);

	Employee getEmployee(int empId);

	void deleteEmployee(int empId);

	Set<Entry<Integer, Employee>> getAllEmployee();

}
