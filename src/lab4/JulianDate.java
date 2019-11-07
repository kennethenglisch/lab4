package lab4;

/**
 * Getting ints back that represent either the day, the year 
 * or the weekday (0 -> Monday, 6 -> Sunday), or month (0 -> Januar, 11 -> December)
 * 
 * After that looking in an array to get the specific information
 * 
 * @author Kenneth Englisch
 *
 */


public interface JulianDate {

	/**
	 * @param Date date in either Gregorian or Julian form
	 * @param Julian if true, calc Julian weekday, if false calc Gregorian weekday
	 * @return weekday representing int for weekday
	 * 
	 * @important for all we should ask if the year was an leap year or not
	 *
	 * @important remember to decide on how to start counting years
	 */
	
	// getting things
	public String getWeekday(int date);
	
	public int calcJD(int day, int month, int year, boolean bc);

	
	/**
	 * methods:
	 * 1) countDaysBetween
	 * 2) birthday(is using 1)
	 * 3) ? method for Today
	 */
	
}

