package lab4;

public class MetricDate extends OurJulianDate {

	int year, month, day, julianDay;

	public static void main(String[] args) {
		
		MetricDate md = new MetricDate();
		OurJulianDate ojd = new OurJulianDate();
		
		md.convToMetric(2232001);
		md.convToJul(88, 2, 2451);
	}	
	
	public void convToJul(int day, int month, int year) 
	{
		julianDay = year * 1000 + month * 100 + day;
		System.out.println(julianDay);
	}
	
	public void convToMetric(int date)
	{
		year = date / 1000;
		month = ((date - (year * 1000)) / 100 );
		day = (date - (year * 1000) - (month * 100));
		
		if (month == 0) month += 1;
		if (day == 0) day +=1 ;
		System.out.println(day + "." + month + "." + year);
	}
	
}
