package Model_Layer;

public  class Employee {
	
	private String empName;
	private double empSalary;
	private String empAddress;
	private String empEmailId;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public String getEmpEmailId() {
		return empEmailId;
	}
	public void setEmpEmailId(String empEmailId) {
		this.empEmailId = empEmailId;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(String empName, double empSalary, String empAddress, String empEmailId) {
		super();
		this.empName = empName;
		this.empSalary = empSalary;
		this.empAddress = empAddress;
		this.empEmailId = empEmailId;
	}
	
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empSalary=" + empSalary + ", empAddress=" + empAddress
				+ ", empEmailId=" + empEmailId + "]";
	}
	
	

}
