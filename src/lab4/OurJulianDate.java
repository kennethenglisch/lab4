package lab4;

public class OurJulianDate implements JulianDate {

	int julianDay, gregorianDay;
	
	int year;
	
	int month;
	
	int[] julianDate, gregorianDate;
	
	int[] months, leapMonths;
	
	String weekday;
	
	int JULIAN_START_YEAR = - 4713;
	
	
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
			int[] leapMonths = {};
			
		}
	}
	
	/**
	 * @credit Lena
	 */
	public int calculateDate() 
	{
		
		int date = 0;
		
		return date;
	}
	
	public int calculateDays() 
	{
		// plus 1 bc 0 is also a year that we are missing
		int totalYears = Math.abs(JULIAN_START_YEAR - 2019) + 1;
		
		System.out.println("Jahre insgesamt: " + totalYears);
		
		int leapYears = leapYears() + leapDays();
		
		System.out.println("Schaltjahre insgesamt: " + leapYears);
		
		int years = totalYears - leapYears;
		
		System.out.println("Jahre ohne Schaltjahre: " + years);
		
		int days_1 = years * 365;
		System.out.println("Tage normale Jahre: " + days_1);
		int days_2 = leapYears * 366;
		System.out.println("Tage Schaltjahre: " + days_2);
		// minus 10 bc of they substracted 10 days in 1582
		int totalDays = days_1 + days_2 - 10;
		
		return totalDays + 309;
	}
	
	public boolean isLeapYear(int year) 
	{
		int schaltjahr = 0;
		
		for (int i = JULIAN_START_YEAR; i <= year; i++ ) 
		{
			if (i % 400 == 0) { schaltjahr++; }
			else if (i % 100 == 0) { /* do nothing */ }
			else if (i % 4 == 0) { schaltjahr++; }
			else { /* do nothing */ }
		}
		
		System.out.println(schaltjahr);
		
		
		return true;
	}
	
	public int leapYears() 
	{
		int schaltjahr = 0;
		
		for (int i = 1582; i <= 2019; i++ ) 
		{
			if (i % 400 == 0) { schaltjahr++; }
			else if (i % 100 == 0) { /* do nothing */ }
			else if (i % 4 == 0) { schaltjahr++; }
			else { /* do nothing */ }
		}
		
		System.out.println("Schaltjahre seit 1582: " + schaltjahr);
		
		return schaltjahr;
	}
 
	public int leapDays() 
	{
		int schaltjahre = Math.abs((JULIAN_START_YEAR - 1582) / 4);
		System.out.println("Schaltjahre bis 1582: " + schaltjahre);
		return schaltjahre;
	}
	
//	public void setYear(int year) 
//	{
//		this.year = year;
//	}
//	
	public void setJulianDate(int year, int day)
	{
		
	}
	 
//	public void setGregorianMonth(int month)
//	{
//		this.month = month;
//	}
//	
//	public void setGregorianDate(int year, int month, int day)
//	{
//		
//	}
//	
	
//	// getting things
//	public int getWeekday(int date, boolean julian){}
//	public int getYear(){}
//	
//	public int getJulianDay(){}
//	public int[] getJulianDate(){}
//	//public int getJulianYear();
//	
//	public int getGregorianDay(){}
//	public int getGregorianMonth(){}
//	public int[] getGregorianDate(){}
//	//public int getGregorianYear();
//	
//	// calc everything
//	public int calcJulianDay(int gregorianDay, int gregorianMonth){}
//	public int calcJulianDate(int gregorianDay, int gregorianMonth, int gregorianYear){}
//	
//	public int calcGregorianDayMonth(int julianDay){}
//	public int calcGregorianDate(int julianDay, int julianYear){}
//	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OurJulianDate ojd = new OurJulianDate(); 
//		ojd.isLeapYear(2019);
//		ojd.calculateDate();
		
//		int test = ojd.leapYears() + ojd.leapDays();
//System.out.println(ojd.leapYears() + ojd.leapDays() + ojd.calculateDate() + 309);
		
		int calcDays = ojd.calculateDays();
		int today = 2458793;
		int difference = Math.abs(today - calcDays);
		
		System.out.println("Differenz: " + difference);
	}
	
	

}
