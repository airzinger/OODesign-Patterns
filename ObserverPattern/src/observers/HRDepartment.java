package observers;
import domain.Employee;

public class HRDepartment implements IObserver {

	@Override
	public void notifySystem(Employee emp, String msg) {
		System.out.println("HR Department Notified: ");
		System.out.println(msg+" "+emp.getName());
	}

}
