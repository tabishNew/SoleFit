package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="UserName")
	private WebElement usernametxt;
	
	@FindBy(name="Password")
	private WebElement passwordtxt;
	
	@FindBy(xpath="//button[text()='Sign in']")
	private WebElement loginbtn;

	public WebElement getUsernametxt() {
		return usernametxt;
	}

	public WebElement getPasswordtxt() {
		return passwordtxt;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	public void login(String username, String password) {
		usernametxt.sendKeys(username);
		passwordtxt.sendKeys(password);
		loginbtn.click();
	}
	

}
