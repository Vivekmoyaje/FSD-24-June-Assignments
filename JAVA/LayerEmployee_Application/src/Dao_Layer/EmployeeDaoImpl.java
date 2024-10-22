package Dao_Layer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import Model_Layer.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	

	// database information : collection

	HashMap<Integer, Employee> employee = new HashMap<Integer, Employee>();

	int empId = 7869;

	@Override
	public int addEmployee(Employee emp) {

		employee.put(++empId, emp);
		return empId;
	}

	@Override
	public Employee updateEmployee(int empId, Employee emp) {

		Employee emp1 = employee.put(empId, emp);
		return emp1;
	}

	@Override
	public Employee getEmployee(int empId) {

		Employee emp2 = employee.get(empId);
		return emp2;
	}

	@Override
	public void deleteEmployee(int empId) {

		employee.remove(empId);

	}

	@Override
	public Set<Entry<Integer, Employee>> getAllEmployee() {

		Set<Entry<Integer, Employee>> result = employee.entrySet();
		return result;
	}

}
