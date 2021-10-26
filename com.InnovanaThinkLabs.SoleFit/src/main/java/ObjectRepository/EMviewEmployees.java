package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericUtils.WebDriverUtility;

public class EMviewEmployees extends WebDriverUtility {
	@FindBy(xpath="//a[@href=\"/Admin/Employee\"]")
	private WebElement viewemployeelink;
	
	@FindBy(id="CountryId")
	private WebElement countrydropdown;

	@FindBy(id="StateId")
	private WebElement statedropdown;
	
	@FindBy(id="CityId")
	private WebElement citydropdown;
	
	@FindBy (id="BranchId")
	private WebElement branchdropdown;
	
	public WebElement getViewemployeelink() {
		return viewemployeelink;
	}

	public WebElement getCountrydropdown() {
		return countrydropdown;
	}

	public WebElement getStatedropdown() {
		return statedropdown;
	}

	public WebElement getCitydropdown() {
		return citydropdown;
	}

	public WebElement getBranchdropdown() {
		return branchdropdown;
	}
	
	public void Viewemployee() {
		
		viewemployeelink.click();
	}
	 public void Country(String CountryName) {
		 
		 countrydropdown.click();
	select(countrydropdown, CountryName);
	 
	 }
	 
	 public void State(String StateName) {
		 statedropdown.click();
		 select(statedropdown, StateName);
	 }
	 
	 public void City(String CityName) {
		 citydropdown.click();
		 select(citydropdown, CityName);
		 
	 }
	 
	 public void Branch (String BranchName) {
		 branchdropdown.click();
		 select(branchdropdown, BranchName);
	 }

}
