package lab4;

/**
 * Getting ints back that represent either the day, the year 
 * or the weekday (0 -> Monday, 7 -> Sunday), or month (0 -> Januar, 11 -> December)
 * 
 * After that looking in an array to get the specific information
 * 
 * @author Kenneth Englisch
 *
 */


public interface JulianCalendar {

	/**
	 * @param Date date in either Gregorian or Julian form
	 * @param Julian if true, calc Julian weekday, if false calc Gregorian weekday
	 * @return weekday representing int for weekday
	 * 
	 * @important for all we should ask if the year was an leap year or not
	 */
	public int getWeekday(int date, boolean julian);
	
	public int getJulianDay();
	public int getJulianTime();
	public int[] getJuianDate();
	public int getJulianYear();
	
	public int getGregorianDay();
	public int getGregorianMonth();
	public int getGregorianTime();
	public int[] getGregorianDate();
	public int getGregorianYear();
	
	public int calcJulianTime(int gregorianTime); 
	public int calcJulianDay(int gregorianDay, int gregorianMonth);
	public int calcJulianDate(int gregorianDay, int gregorianMonth, int gregorianYear, int gregorianTime);
	
	public int calcGregorianTime(int julianTime);
	public int calcGregorianDayMonth(int julianDay);
	public int calcGregorianDate(int julianDay, int julianYear, int JulianTime);
	
}
