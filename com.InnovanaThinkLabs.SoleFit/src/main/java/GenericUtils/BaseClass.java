package GenericUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;

public class BaseClass {
	public WebDriver driver;
	public WebDriverUtility wLib = new WebDriverUtility();
	public PropertyFileUtility pLib = new PropertyFileUtility();
	public ExcelUtility eLib = new ExcelUtility();
	public HomePage homepage;
	public static WebDriver sdriver;
	
	
	@BeforeSuite(groups = {"smokeTest","regressionTest"})
	public void configBS() 
	{
		System.out.println("Connect to DataBase");
	}
	
	//@Parameters("browser")
	@BeforeClass(groups = {"smokeTest","regressionTest"})
	public void configBC() throws Throwable
	{
		String browsername = pLib.readDataFromPropertyFile("browser");
		if(browsername.equalsIgnoreCase("firefox")) {
			driver= new FirefoxDriver();
			}
		else if(browsername.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\tabish\\Downloads\\Eclipse\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		sdriver=driver;
		driver.manage().window().maximize();
		
	}
	
	@BeforeMethod(groups= {"smokeTest","regressionTest"})
	public void setUp() throws Throwable {
		
		String URL = pLib.readDataFromPropertyFile("url");
		String USERNAME = pLib.readDataFromPropertyFile("username");
		String PASSWORD = pLib.readDataFromPropertyFile("password");
		driver.get(URL);
		
		
		//Login to Application
		LoginPage loginpage = new LoginPage(driver);
		loginpage.login(USERNAME, PASSWORD);
	}
}
	/*@AfterMethod(groups= {"smokeTest","regressionTest"})
	public void tearDown() {
		homepage.signOut();
	}
	
	//@AfterClass(groups= {"smokeTest","regressionTest"})
	public void configAC() {
		driver.quit();
	}
	//@AfterSuite(groups= {"smokeTest","regressionTest"})
	public void configAS() {
		System.out.println("Close the Connection from DataBase");
	}
	
		
		
		
		
		
	}
	*/
	
	
	
	

