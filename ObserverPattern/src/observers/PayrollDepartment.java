package observers;
import domain.Employee;

public class PayrollDepartment implements IObserver	{

	@Override
	public void notifySystem(Employee emp, String msg) {
		System.out.println("Payroll Department Notified");
		System.out.println(msg+" "+emp.getName());
	}

}
