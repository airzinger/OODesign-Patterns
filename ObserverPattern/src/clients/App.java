package clients;
import domain.Employee;
import domain.EmployeeDAO;
import observers.HRDepartment;
import observers.IObserver;
import observers.PayrollDepartment;
import subjects.EmployeeManagementSystem;

public class App {

	public static void main(String[] args) {
		
		IObserver payroll = new PayrollDepartment();
		IObserver hrSystem = new HRDepartment();
		
		EmployeeManagementSystem ems = new EmployeeManagementSystem();
		
		ems.registerObserver(payroll);
		ems.registerObserver(hrSystem);
		
		Employee emp = new Employee.Builder().setName("Batata").setAge(20).setEmployeeID().build();
		
		//ems.hireNewEmployee(emp);
		
		ems.updateEmployeeInformation(3, "Adi");
//		EmployeeDAO edao = new EmployeeDAO();
//		edao.generateEmployees();
//		System.out.println(edao.getDetails("Akshay"));
	}
	
}
