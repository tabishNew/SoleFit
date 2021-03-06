package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import GenericUtils.BaseClass;
import GenericUtils.ExcelUtility;
import GenericUtils.PropertyFileUtility;
import ObjectRepository.EMaddEmployees;
import ObjectRepository.HomePage;

public class AddEmployees extends BaseClass{
	public PropertyFileUtility pLib = new PropertyFileUtility();
	
	
	

	@Test(groups="regressiontest")
	public void createEmployee() throws Throwable {
		//reading data from excel file
		ExcelUtility eu=new ExcelUtility();
		String Country=eu.getExcelData("Sheet1", 1, 0);
		String State= eu.getExcelData("Sheet1", 1, 1);
		String City=eu.getExcelData("Sheet1", 1, 2);
		String Branch=pLib.readDataFromPropertyFile("Branch");
		String Department=eu.getExcelData("Sheet1", 1, 4);
		String Designation=eu.getExcelData("Sheet1", 1, 5);
		String EmployeeRole=eu.getExcelData("Sheet1", 1, 7);
		String Title=eu.getExcelData("Sheet1", 1, 8);
		String FirstName=eu.getExcelData("Sheet1", 1, 9);
		String EmployementEmail=eu.getExcelData("Sheet1", 1, 10);
		String EmployeeMobileNo = pLib.readDataFromPropertyFile("EmployeeMobileNo");
		String EmergencyContactName=eu.getExcelData("Sheet1", 1, 12);
		String EmergencyContactNumber = pLib.readDataFromPropertyFile("EmergencyContactNumber");
		String EmployeeSalary = pLib.readDataFromPropertyFile("EmployeeSalary");
	
		
		//reading browser type from property file
		PropertyFileUtility pr=new PropertyFileUtility();
		pr.readDataFromPropertyFile("browser");
		
		
		// navigate to employee management
		homepage=new HomePage(driver);
		
	
		EMaddEmployees emp=new EMaddEmployees(driver);
		emp.empaddEmployee(driver);
		emp.empcountry(Country);
		emp.empstate(State);
		emp.waitForPageToLoad(driver);
		emp.empcity(City);
		emp.empbranch(Branch);
		emp.empdepartment(Department);
		emp.empdesignation(Designation);
		emp.emprole(EmployeeRole);
		emp.emptitle(Title);
		emp.empfirstname(FirstName);
		emp.empemail(EmployementEmail);
		emp.empmobile(EmployeeMobileNo);
		emp.empempemergencycontactname(EmergencyContactName);
		emp.empempemergencycontact(EmergencyContactNumber);
		emp.empsalary(EmployeeSalary);
		
	
		
		
		
	
		

		
		
		
	
		
		
	

		
		
		
		
		
		
		
		
		
	
}

}

