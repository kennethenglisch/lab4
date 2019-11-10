package lab4;

import java.time.LocalDate;
import java.util.Scanner;

public class OurJulianDate implements JulianDate {

	private final String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
	
	private int day, month, year;
	
	private int dtoday, mtoday, ytoday;
	
	private int bday, bmonth, byear;
	
	private boolean bc, bbc;
	
	private Scanner numberScanner, menuScanner;
	
	private LocalDate ld;
	
	public void readDate() 
	{
		System.out.println("\nIn the following you will be asked for a date.\nIt is splitted into day, month and year.\n" + 
						   "Day: number between 1 - 31\n" +
						   "Month: number between 1 - 12 (January -> 1, ... , December -> 12)\n" + 
						   "Year: number from 1 - infinite (positive numbers)\n" + 
						   "Note: If you want to enter a negative year, enter it as a positive year and afterwards say it is BC.\n" +
						   "You will be asked if the year is BC.\n" + 
						   "If it is the case you have to type 'yes' or 'true' if it is not the case just type 'no'.\n");
		
		System.out.print("Enter the day: ");
		day = numberScanner.nextInt();
		
		System.out.print("Enter the month: ");
		month = numberScanner.nextInt();
		
		System.out.print("Enter the year: ");
		year = numberScanner.nextInt();
	
		System.out.print("Is the year BC? ");
		
		String numscan = numberScanner.next().toLowerCase();
		if(numscan.equals("yes") || numscan.equals("true")) bc = true;
		else bc = false;
		
		// calculating the astronomical year instead of historical year
		if (bc) year = -year - 1;
		
	}
	

	/**
	 * Calculating the Julian Day Number from an Gregorian Date
	 * works for all gregorian dates since November 23rd 4712 BC
	 * 
	 * The user can even input the 31st February and it will give the exact date for the 3rd March in this year with this formula.
	 * This formula even considers the leap years. Have a look at the credits if you want to know how it works exactly.
	 * 
	 * @return Julian Day Number
	 * 
	 * @credits Formula: https://de.wikipedia.org/wiki/Julianisches_Datum#Umrechnung_Kalenderdatum_%E2%86%92_JD
	 * The formula from: https://en.wikipedia.org/wiki/Julian_day#Converting_Gregorian_calendar_date_to_Julian_Day_Number
	 * was to inconvenient so we took this one that makes exactly the same
	 */
	public int calcJD(int day, int month, int year, boolean bc) 
	{		
		if (month < 3) 
		{
			year = year - 1;
			month = month + 12;
		}
		
		int b = 2 - (year / 100) + (year / 400);
		double JD = Math.floor(365.25 * (year + 4716)) + Math.floor(30.6001 * ( month + 1 )) + day + b - 1524.5;
		
		// plus 1 because we don't calculate time
		return (int) JD + 1;
	}

	/**
	 * Getting the weekday of an julian day (JD)
	 * @return number 0 - 6 (0 -> Monday, ... , 6 -> Sunday)
	 */
	public String getWeekday(int jd) {
		
		int weekdayNumber = jd % 7;
		String weekday = this.weekdays[weekdayNumber];
		
		return weekday;
	}
	
	/**
	 * Gets todays date and stores it.
	 */
	public void getTodaysDate() 
	{
		dtoday = ld.getDayOfMonth();
		mtoday = ld.getMonthValue();
		ytoday = ld.getYear();
	}
	
	/**
	 * Calculating the days between your birthday and today
	 * @return daysAlive Days you are living since today.
	 */
	public void daysAlive() 
	{
		System.out.println("\nYou can now calculate the amount of days you have lived since today.\n" + 
				   "Therefore you have to enter your birthday.");

		int bjd, jdToday, daysAlive;

		readDate();
		bday = day;
		bmonth = month;
		byear = year;
		bbc = bc;

		bjd = calcJD(bday, bmonth, byear, bbc);
		
		// Calculating JD for today
		getTodaysDate();
		jdToday = calcJD(dtoday, mtoday, ytoday, false);
		
		daysAlive = Math.abs(bjd - jdToday);
		
		
		System.out.println("\nYou are alive for '" + daysAlive + "' days.");
		System.out.println("You were born on a " + getWeekday(bjd) + ".");
		
		if (bday == dtoday & bmonth == mtoday) { System.out.println( "\nHAPPY BIRTHDAY BUDDY!" ); }
		if (daysAlive % 100 == 0) { System.out.println("\nWOW. Your days alive can be cleanly divided by 100."); }
		
		
	}
	
	/**
	 * Calculates the days between two dates
	 * @return number of days between two dates
	 */
	public void daysBetween() 
	{
		System.out.println("\nYou can now calculate the amount of days between two dates.\n" + 
						   "Therefore you have to enter two dates.");
		
		int day1, month1, year1, jd1, day2, month2, year2, jd2;
		
		boolean bc1, bc2;
		
		System.out.println("\nStarting of with the first date.");
		readDate();
		day1 = day;
		month1 = month;
		year1 = year;
		bc1 = bc;
		
		jd1 = calcJD(day1, month1, year1, bc1);
		
		System.out.println("\nGoing on with the second date.");
		readDate();
		day2 = day;
		month2 = month;
		year2 = year;
		bc2 = bc;
		
		jd2 = calcJD(day2, month2, year2, bc2);
		
		int daysBetween = Math.abs(jd1 - jd2);
		
		System.out.println("There are '" + daysBetween + "' days between the these two dates. [" + 
				   		   day1 + "." + month1 + "." + year1 + " <-> " + day2 + "." + month2 + "." + year2 + "]");
		
	}
	
	/**
	 * Printing out yesterdays date in Gregorian date and Julian Day
	 */
	public void yesterday() 
	{
		LocalDate yesterday = ld.minusDays(1);
		int yday = yesterday.getDayOfMonth();
		int ymonth = yesterday.getMonthValue();
		int yyear = yesterday.getYear();
		
		int yjd = calcJD(yday, ymonth, yyear, false);
		
		System.out.println("\nYesterdays date:");
		System.out.println("Gregorian Calendar --> " + yday + "." + ymonth + "." + yyear + "." );
		System.out.println("Julian Day --> " + yjd);
	}
	
	/**
	 * Printing out tomorrows date in Gregorian date and Julian Day
	 */
	public void tomorrow()
	{
		LocalDate tomorrow = ld.plusDays(1);
		int tday = tomorrow.getDayOfMonth();
		int tmonth = tomorrow.getMonthValue();
		int tyear = tomorrow.getYear();
		
		int tjd = calcJD(tday, tmonth, tyear, false);
		
		System.out.println("\nTomorrows date:");
		System.out.println("Gregorian Calendar --> " + tday + "." + tmonth + "." + tyear + "." );
		System.out.println("Julian Day --> " + tjd);
	}
	
	/**
	 * A simple menu for the users input via the console. The user can decide which method he wants to trigger and use.
	 */
	private void menu() 
	{
		System.out.println("\n----------MENU----------");
		System.out.println("Choose what you want to do by typing the number\n"  +  "of the operation in the console.\n");
		System.out.println("1 - Calculate the Julian Day Number for a Gregorian Date.");
		System.out.println("2 - Calculate the number of days between two Dates.");
		System.out.println("3 - Calculate the number of days you are alive.");
		System.out.println("4 - Get yesterdays date in Julian Day and Gregorian Date.");
		System.out.println("5 - Get tomorrows date in Julian Day and Gregorian Date.");
		System.out.println("6 - Quit the program.");
		System.out.println("\n------------------------");
		System.out.print("Choose option: ");
		
		
		int option = menuScanner.nextInt();
	
		switch (option) {
			case 1: readDate();
					System.out.println("\nYour Date: " + day + "." + month + "." + year);
					System.out.println("Julian Day Number: " + calcJD(day, month, year, bc));
					menu();
					break;
			
			case 2: daysBetween();
					menu();
					break;
					
			case 3: daysAlive();
					menu();	
					break;
					
			case 4: yesterday();
					menu();
					break;
			
			case 5: tomorrow();
					menu();	
					break;
			
			case 6: break;
		}
	}

	public static void main(String[] args) {
		
		OurJulianDate ojd = new OurJulianDate(); 
		ojd.ld = LocalDate.now();
		ojd.numberScanner = new Scanner(System.in);
		ojd.menuScanner = new Scanner(System.in);
		ojd.menu();
	}
	
	
}
