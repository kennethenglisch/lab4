package lab4;

public class MetricDate extends OurJulianDate {

	int year, month, day, julianDay;
	
	
	public MetricDate() {
		
	}

	public static void main(String[] args) {
		MetricDate md = new MetricDate();
	//	OurJulianDate ojd = new OurJulianDate();
		
		//md.convToMetric(2451288);
		md.convToJul(88, 2, 2451);

	}	
	
	/**
	 * 10 days, 10 weeks a month, 10 months
	 * 
	 * 10 * 10 * 10 -> 1000 days / year
	 *  
	 * 1000 / 365 ->  2,7397 ...
	 * 
	 * One year in metric is 2,7 in normal
	 * 
	 * days stay same with julian my bday -> 7507
	 * 
	 * 86400 sec / day
	 * 
	 * January 51st -> Day: 51
	 * April 19th -> Day: 319
	 */
	
	public void convToJul(int day, int month, int year) 
	{
		julianDay = year * 1000 + month * 100 + day;
		System.out.println(julianDay);
	}
	
	public void convToMetric(int date)
	{
		year = date / 1000;
		month = (date - (year * 1000)) / 100;
		day = (date - (year * 1000) - (month * 100));
		System.out.println(day + "." + month + "." + year);
	}
	
}
