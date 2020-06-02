package domain;
import java.util.ArrayList;
import java.util.List;

import domain.Employee.Builder;

public class EmployeeDAO {

	Employee emp1 = new Employee.Builder().setName("Aditya").setAge(25).setEmployeeID().build();
	Employee emp2 = new Employee.Builder().setName("Akshay").setAge(25).setEmployeeID().build();
	Employee emp3 = new Employee.Builder().setName("Arpit").setAge(28).setEmployeeID().build();
	
	List<Employee> employees;
	
	public List<Employee> generateEmployees(){
		employees = new ArrayList<Employee>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		return employees;
	}
	
	public void addEmployee(Employee emp) {
		employees.add(emp);
	}
	
	
	public Employee getDetails(String name) {
		for(Employee e : employees) {
			if(e.getName().equals(name))
				return e;
		}
		throw new IllegalArgumentException();
	}
}
