package lab4;

/**
 * Getting ints back that represent the weekday (0 -> Monday, 6 -> Sunday)
 * 
 * After that looking in an array to get the specific information
 * 
 * @author Kenneth Englisch
 *
 */


public interface JulianDate {

	public String getWeekday(int date);
	
	public int calcJD(int day, int month, int year, boolean bc);
	
	public void daysBetween();

	public void yesterday();
	
	public void tomorrow();	
	
	public void menu();
}

