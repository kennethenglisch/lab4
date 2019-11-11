package lab4;

import java.util.Scanner;

public class MetricDate extends OurJulianDate {

	int year, month, day, julianDay, date;
	
	// hard coding todays date in Metric Date 
	// todays date 10.11.2019 -> 98.07.2458
	int tday = 98, tmonth = 7, tyear = 2458;
	
	Scanner dateScanner;

	public MetricDate() 
	{
		super();
		dateScanner = new Scanner(System.in);
	}
	
	public static void main(String[] args) 
	{
		MetricDate md = new MetricDate();
		md.menu();
	}	
	
	public void convToJul(int day, int month, int year) 
	{
		julianDay = year * 1000 + month * 100 + day;
		
		System.out.println("\nYour Metric Date: " + day + "." + month + "." + year);
		System.out.println("Julian Day: " + this.julianDay);
	}
	
	public void convToMetric(int date)
	{
		year = date / 1000;
		month = ((date - (year * 1000)) / 100 );
		day = (date - (year * 1000) - (month * 100));
		
		if (month == 0) month += 1;
		if (day == 0) day +=1 ;
		
		System.out.println("\nYour Julian Day: " + this.date);
		System.out.println("Metric Date: " + day + "." + month + "." + year);
	}
	
	/**
	 * A simple menu for the users input via the console. The user can decide which method he wants to trigger and use.
	 */
	public void menu() 
	{
		System.out.println("\n----------MENU-----------");
		System.out.println("\nChoose what you want to do by typing the number\n"  +  "of the operation in the console.\n");
		System.out.println("1 - Calculate the Julian Day Number for a Gregorian Date.");
		System.out.println("2 - Calculate the number of days between two Dates.");
		System.out.println("3 - Calculate the number of days you are alive.");
		System.out.println("4 - Get yesterdays date in Julian Day and Gregorian Date.");
		System.out.println("5 - Get tomorrows date in Julian Day and Gregorian Date.");
		System.out.println("\n----METRIC DATE MENU----\n");
		System.out.println("6 - Convert a Juian Day into a Metric Date");
		System.out.println("7 - Convert a Metric Date into a Julian Day");
		System.out.println("8 - Calculate the number of years you are alive in Metric Date.");
		System.out.println("9 - Quit the program.");
		System.out.println("\n-------------------------");
		System.out.print("Choose option: ");
		
		
		int option = menuScanner.nextInt();
	
		if (option >= 1 & option <= 9)
		{
			switch (option) {
				case 1: readDate();
						System.out.println("\nYour Date: " + super.day + "." + super.month + "." + super.year);
						System.out.println("Julian Day Number: " + calcJD(super.day, super.month, super.year, super.bc));
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
						
				case 6: readJulDate();
						convToMetric(date);
						menu();	
						break;
				
				case 7: readMetDate();
						convToJul(day, month, year);
						menu();	
						break;
						
				case 8: yearsAlive();
						menu();	
						break;
				
				case 9: break;
			}
		}
		else { menu(); }
	}
	
	public void readJulDate() 
	{
		System.out.println("\nIn the following you will be asked for a Julian Day.\n" + 
				   "If you are not sure, please covert a Gregorian Date into a Julian Day first.\n");

		System.out.print("Enter the Julian Day: ");
		date = numberScanner.nextInt();
	}
	
	public void readMetDate() 
	{
		System.out.println("\nIn the following you will be asked for a date.\nIt is splitted into day, month and year.\n" + 
						   "Day: number between 1 - 100\n" +
						   "Month: number between 1 - 10 (January -> 1, ... , October -> 10)\n" + 
						   "Year: number from 1 - infinite (positive numbers)\n");
		
		System.out.print("Enter the day: ");
		day = numberScanner.nextInt();
		
		System.out.print("Enter the month: ");
		month = numberScanner.nextInt();
		
		System.out.print("Enter the year: ");
		year = numberScanner.nextInt();
	}
	
	public void yearsAlive() 
	{
		System.out.println("\nYou can now calculate the amount of years you have lived since today in Metric Date.\n" + 
				   		   "Therefore you have to enter your birthday." +
						   "If you are not sure what your borthday is in Metric Date, convert it first from" +
				   		   "Gregorian to Julian and then to Metric.");

		readMetDate();
		bday = day;
		bmonth = month;
		byear = year;
		
		int diff = tyear - byear; 
		if (bmonth > tmonth || bmonth == tmonth && bday > tday) { diff--; }
		
		
		System.out.println("\nYou are alive for '" + diff + "' years.");
	}
}
