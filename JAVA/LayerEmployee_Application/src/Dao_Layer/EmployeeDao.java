package Dao_Layer;

import java.util.Set;
import java.util.Map.Entry;

import Model_Layer.Employee;

public interface EmployeeDao {

	int addEmployee(Employee emp);

	Employee updateEmployee(int empId, Employee emp);

	Employee getEmployee(int empId);

	void deleteEmployee(int empId);

	Set<Entry<Integer, Employee>> getAllEmployee();

}
