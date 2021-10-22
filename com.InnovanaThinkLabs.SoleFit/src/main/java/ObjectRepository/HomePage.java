package ObjectRepository;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@href=\"/Admin/Dashboard\"]")
	private WebElement dashboard;
	
	@FindBy(xpath="//i[@class=\"fas fa-male\"]")
	private WebElement employeemanagement;
	
	@FindBy(xpath="(//a[@class=\"dropdown-toggle\"])[2]")
	private WebElement signoutdropdown;
	
	@FindBy(xpath = "//a[@class=\"btn btn-primary btn-flat\"]")
	private WebElement signoutlink;
	
	
	public WebElement getDashboard() {
		return dashboard;
	}

	public WebElement getEmployeemanagement() {
		return employeemanagement;
	}

	public WebElement getSignoutdropdown() {
		return signoutdropdown;
	}

	public WebElement getSignout() {
		return signoutlink;
	}
	 public void employeemanagementlink() {
		 employeemanagement.click();
		 
	 }
	 public void signOut() {
		 signoutdropdown.click();
		 signoutlink.click();
		 
	 }

	
	
	

	
}
