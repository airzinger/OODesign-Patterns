package observers;

import domain.Employee;

public interface IObserver {

	public void notifySystem(Employee emp, String msg);
	
}
