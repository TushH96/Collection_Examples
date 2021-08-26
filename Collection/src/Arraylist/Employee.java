package Arraylist;

public class Employee {

	private int id;
	private String name;
	private String department;
	private double salary;
	private Address address;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Employee(int id, String name, String department, double salary, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.address = address;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary
				+ ", address=" + address + "]";
	}
	
	
	
}
