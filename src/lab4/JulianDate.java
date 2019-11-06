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
	 * 
	 * add 
	 */
	
	// setting things
//	public void setDay(int day, boolean julian);
//	public void setYear(int year);
	
	public void setJulianDate(int year, int day);
	 
//	public void setGregorianMonth(int month);
//	
//	public void setGregorianDate(int year, int month, int day);
	
	
	// getting things
	public int getWeekday(int date);
//	public int getYear();
	
	public int getJulianDay();
	public int[] getJulianDate();
	
	public int calculateDate();
	//public int getJulianYear();
	
//	public int getGregorianDay();
//	public int getGregorianMonth();
//	public int[] getGregorianDate();
	//public int getGregorianYear();
	
	// calc everything
//	public int calcJulianDay(int gregorianDay, int gregorianMonth);
//	public int calcJulianDate(int gregorianDay, int gregorianMonth, int gregorianYear);
//	
//	public int calcGregorianDayMonth(int julianDay);
//	public int calcGregorianDate(int julianDay, int julianYear);
//	
	
	/**
	 * methods:
	 * 1) countDaysBetween
	 * 2) birthday(is using 1)
	 * 3) ? method for Today
	 */
	
}

