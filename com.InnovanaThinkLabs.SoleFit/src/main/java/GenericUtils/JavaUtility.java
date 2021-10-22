package GenericUtils;

import java.util.Date;
import java.util.Random;

public class JavaUtility {
	Date dateobj=new Date();
	
	public static int getRandomNumber() 
	{
	Random random=new Random();
	int ran = random.nextInt(1000);
	return ran;
	}
	
	
	public String getCurrentDate() 
	{
		String todaysdate= dateobj.toString();
		return todaysdate;
	}

	
	public String getCurrentYear() 
	{
		String todaysdate= dateobj.toString();
		String[] arr = todaysdate.split(" ");
		return arr[5];

	}


}
