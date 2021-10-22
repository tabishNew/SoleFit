package GenericUtils;

import org.testng.ITestResult;

public class RetryAnalyser {

	int count=0;
	int retrylimit=4;
	
	public boolean retry(ITestResult result) {
		
		if(count<retrylimit)
		{
			count++;
			return true;
		}
		return false;
	}

}
