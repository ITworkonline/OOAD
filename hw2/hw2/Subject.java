package hw2;

//Observer Pattern: Interface Subject 
public interface Subject {
	
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();

}
