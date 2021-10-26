package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtils.WebDriverUtility;

public class EMaddEmployees extends WebDriverUtility {

	public EMaddEmployees(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href=\"/Admin/Employee/Create\"]")
	private WebElement empaddemployeelink;
	
	@FindBy(name="CountryId")
	private WebElement empcountrydropdown;
	
	@FindBy(name="StateId")
	private WebElement empstatedropdown;
	
	@FindBy(name="CityId")
	private WebElement empcitydropdown;
	
	@FindBy(name="BranchId")
	private WebElement empbranchdropdown;
	
	@FindBy(name="DepartmentId")
	private WebElement empdepartmentdropdown;
	
	@FindBy(name="DesignationId")
	private WebElement empdesignationdropdown;
	
	@FindBy(name="RoleId")
	private WebElement emproledropdown;
	
	@FindBy(id="Title")
	private WebElement emptitledropdown;
	
	@FindBy(name="FirstName")
	private WebElement empfirstnametxt;
	
	@FindBy(id="Email")
	private WebElement empemailtxt;
	
	@FindBy(id="Mobile")
	private WebElement empmobileno;
	
	@FindBy(name="Emergency_Contact_Name")
	private WebElement empemergencycontactnametxt;
	
	@FindBy(name="Emergency_Contact_Number")
	private WebElement empemergencycontactnumber;
	
	@FindBy(id="EmployeeSalary")
	private WebElement empsalarylink;
	
	@FindBy(id="Date_of_Joining")
	private static WebElement calendarlink;
	
	
	
	
	public WebElement getAddemployeelink() {
		return empaddemployeelink;
	}
	public WebElement getCountrydropdown() {
		return empcountrydropdown;
	}
	
	public WebElement getStatedropdown() {
		return empstatedropdown;
	}
	public WebElement getCitydropdown() {
		return empcitydropdown;
	}
	public WebElement getBranchdropdown() {
		return empbranchdropdown;
	}
	public WebElement getDepartmentdropdown() {
		return empdepartmentdropdown;
	}
	public WebElement getDesignationdropdown() {
		return empdesignationdropdown;
	}
	public WebElement getEmproledropdown() {
		return emproledropdown;
	}
	public WebElement getEmptitledropdown() {
		return emptitledropdown;
	}
	public WebElement getEmpfirstname() {
		return empfirstnametxt;
	}
	public WebElement getEmpemail() {
		return empemailtxt;
	}
	public WebElement getEmpmobileno() {
		return empmobileno;
	}
	public WebElement getEmpemergencycontactname() {
		return empemergencycontactnametxt;
	}
	public WebElement getEmpemergencycontactnumber() {
		return empemergencycontactnumber;
	}
	public WebElement getEmpsalary() {
		return empsalarylink;
	}

	
	
	public void empaddEmployee(WebDriver driver) {
		empaddemployeelink.click();
		waitForElementToBeClickable(empaddemployeelink, driver);
	}
	public void empcountry(String countryname) {
		empcountrydropdown.click();
		select(empcountrydropdown, countryname);
	}
	public void empstate(String statename) {
		empstatedropdown.click();
		select(empstatedropdown,statename);
	}
	public void empcity(String cityname) {
		empcitydropdown.click();
		select(empcitydropdown,cityname);
	}
	public void empbranch(String branchname) {
		empbranchdropdown.click();
		select(empbranchdropdown, branchname);
	}
	public void empdepartment(String departmentname) {
		empdepartmentdropdown.click();
		select(empdepartmentdropdown,departmentname);
	}
	public void empdesignation(String designationname) {
		empdesignationdropdown.click();
		select(empdesignationdropdown,designationname);
	}
	public void emprole(String emprolename) {
		emproledropdown.click();
		select(emproledropdown,emprolename);
	}
	public void emptitle(String emptitlename) {
		emptitledropdown.click();
		select(emptitledropdown,emptitlename);
	}
	public void empfirstname(String name) {
		empfirstnametxt.sendKeys(name);
	}
	public void empemail(String email) {
		empemailtxt.sendKeys(email);	
	}
	public void empmobile(String mobile) {
		empmobileno.sendKeys(mobile);
	}
	public void empempemergencycontactname(String ecname) {
		empemergencycontactnametxt.sendKeys(ecname);
	}
	public void empempemergencycontact(String enumber) {
		empemergencycontactnumber.sendKeys(enumber);
	}
	public void empsalary(String salary) {
		empsalarylink.sendKeys(salary);
	}
	
    
	

	 
	
	
	
	

}
