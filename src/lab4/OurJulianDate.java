package lab4;

public class OurJulianDate implements JulianDate {

	int julianDay, gregorianDay;
	
	int year;
	
	int month;
	
	int[] julianDate, gregorianDate;
	
	int[] months, leapMonths;
	
	String weekDay;
	
	
	public void setDay(int day, boolean julian) {
		
		if (isLeapYear(year)) 
		{
			if (julian) 
			{
				// code
				if ( 0 < day || day < 367) {this.julianDay = day;}
				else {System.out.println("The day should be between 1 and 366. Nothing has changed.");}
			}
			// check month too
			else 
			{
				//code
				if ( 0 < day || day < 31) {this.julianDay = day;}
				else {System.out.println("The day should be between 1 and 366. Nothing has changed.");}
			}
		}
		else 
		{
			if (julian) 
			{
				// code
				
			}
			else 
			{
				//code
			}
		}
	}
	
	public void fillMonths(int[] month, boolean leap) 
	{
		if (leap) 
		{
			int[] leapMonthss = {};
			
		}
	}
	
	public boolean isLeapYear(int year) 
	{
		// have a look at the exercise
		return true;
	}
	
	public void setYear(int year) 
	{
		this.year = year;
	}
	
	public void setJulianDate(int year, int day)
	{
		
	}
	 
	public void setGregorianMonth(int month)
	{
		this.month = month;
	}
	
	public void setGregorianDate(int year, int month, int day)
	{
		
	}
	
	
	// getting things
	public int getWeekday(int date, boolean julian){}
	public int getYear(){}
	
	public int getJulianDay(){}
	public int[] getJulianDate(){}
	//public int getJulianYear();
	
	public int getGregorianDay(){}
	public int getGregorianMonth(){}
	public int[] getGregorianDate(){}
	//public int getGregorianYear();
	
	// calc everything
	public int calcJulianDay(int gregorianDay, int gregorianMonth){}
	public int calcJulianDate(int gregorianDay, int gregorianMonth, int gregorianYear){}
	
	public int calcGregorianDayMonth(int julianDay){}
	public int calcGregorianDate(int julianDay, int julianYear){}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	

}
