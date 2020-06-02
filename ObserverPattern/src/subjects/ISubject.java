package subjects;

import domain.Employee;
import observers.IObserver;

public interface ISubject {

	public void registerObserver(IObserver io);
	public void removeObserver(IObserver io);
	public void notifyObservers();
}
