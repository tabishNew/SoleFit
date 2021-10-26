package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import GenericUtils.BaseClass;
import GenericUtils.ExcelUtility;
import GenericUtils.PropertyFileUtility;
import ObjectRepository.EMviewEmployees;
import ObjectRepository.HomePage;

public class ViewEmployee extends BaseClass {
	WebDriver driver; 
	HomePage homepage;
	

	@Test
	public void employeeList() throws Throwable
	{
		ExcelUtility eLib = new ExcelUtility();
		String eCountry = eLib.getExcelData("Sheet2",1,0);
		String eState = eLib.getExcelData("Sheet2",1, 1);
		String eCity = eLib.getExcelData("Sheet2",1, 2);
		String eBranch = eLib.getExcelData("Sheet2", 1, 3);
		
		//reading browser type from property file
		PropertyFileUtility pr=new PropertyFileUtility();
		pr.readDataFromPropertyFile("browser");
		
		
		// navigate to employee management
		homepage=new HomePage(driver);
		
		EMviewEmployees eme = new EMviewEmployees();
		eme.Viewemployee();
		eme.Country(eCountry);
		eme.State(eState);
		eme.City(eCity);
		eme.Branch(eBranch);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

