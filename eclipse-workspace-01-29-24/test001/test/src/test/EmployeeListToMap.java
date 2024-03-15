package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{
	private Integer id;
	private String name;
	private double salary;
	public Employee() {
		
	}
	public Employee(Integer id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public List<Employee> getEmployeeList(){
		Employee emp1 = new Employee(1,"A",10.00d);
		Employee emp2 = new Employee(2,"B",20.00d);
		Employee emp3 = new Employee(3,"C",30.00d);
		List<Employee> empList = new ArrayList<>();
		empList.add(emp1);empList.add(emp2);empList.add(emp3);
		return empList;
	}
}
public class EmployeeListToMap {
		
	public static void main(String[] args) {
		Employee emp = new Employee();
		Map<Integer, Double> empSalary = emp.getEmployeeList().stream()
		.collect(Collectors.toMap(Employee::getId, Employee::getSalary));
		System.out.println(empSalary);
		
		List<Employee>empList = emp.getEmployeeList().stream().filter(p -> p.getSalary() > 10.00d)
				.limit(1).collect(Collectors.toList());
		System.out.println(empList);
	}

}
