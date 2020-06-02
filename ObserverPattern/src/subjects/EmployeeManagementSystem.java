package subjects;

import java.util.ArrayList;
import java.util.List;

import domain.Employee;
import domain.EmployeeDAO;
import observers.IObserver;

public class EmployeeManagementSystem implements ISubject {

	private List<IObserver> observer;
	private List<Employee> employees;
	
	private EmployeeDAO employeeDao;
	
	private Employee employee;
	private String msg;
	
	public EmployeeManagementSystem() {
		observer = new ArrayList<IObserver>();
		employeeDao = new EmployeeDAO();
		employees = employeeDao.generateEmployees();
	}
	
	@Override
	public void registerObserver(IObserver io) {
		observer.add(io);
	}

	@Override
	public void removeObserver(IObserver io) {
		observer.remove(io);
	}

	@Override
	public void notifyObservers() {
		for(IObserver departments : observer) {
			departments.notifySystem(employee,msg);
		}
	}

	public void hireNewEmployee(Employee e) {
		employee = e;
		msg = "New hire: ";
		employees.add(e);
		notifyObservers();
	}
	
	public void updateEmployeeInformation(int id, String empName) {
		boolean notify = false;
		
		for(Employee emp : employees) {
			if(id==emp.getEmployeeID()) {
				emp.setName("Adi");
				this.employee = emp;
				msg = "Employee name with id "+id+" has been updated to";
				notify=true;
			}
		}
		if(notify)
			notifyObservers();
	}
	
}
