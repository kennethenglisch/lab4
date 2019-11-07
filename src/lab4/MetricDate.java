package lab4;

public class MetricDate extends OurJulianDate {

	long days;
	
	public MetricDate() {
		
	}

	public static void main(String[] args) {
		MetricDate md = new MetricDate();

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
	
	public void convToJul() 
	{
		
	}
	
}
