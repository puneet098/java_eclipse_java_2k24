import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {
	class Employee{
		private Integer id;
		private String name;
		private Integer Age;
		public Employee() {

		}
		public Employee(Integer id, String name, Integer age) {
			super();
			this.id = id;
			this.name = name;
			Age = age;
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
		public Integer getAge() {
			return Age;
		}
		public void setAge(Integer age) {
			Age = age;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", Age=" + Age + "]";
		}



	}

	private List<Employee> getEmpList() {
		List <Employee> empList = new ArrayList<>();
		Employee emp01 = new Employee(1,"Mike",40);
		Employee emp02 = new Employee(3,"Brad",30);
		Employee emp03 = new Employee(2,"Chris",20);
		empList.add(emp01);
		empList.add(emp02);
		empList.add(emp03);
		return empList;
	}

	@SuppressWarnings("static-access")
	static Comparator<Employee> sortByAge = (e1,e2)->e1.getAge().compare(e1.getAge(),e2.getAge()); 
	static Comparator<Employee> sortByName = (e1,e2)->e1.getName().compareToIgnoreCase(e2.getName());		

	public static void main(String[] args) {
		
		EmployeeTest test = new EmployeeTest();

		test.getEmpList().stream().sorted(sortByAge).collect(Collectors.toList())
		.forEach(System.out::println);
		System.out.println("*******====Now sorting by name********=====");
		test.getEmpList().stream().sorted(sortByName).collect(Collectors.toList()).forEach(System.out::println);


	}

}
