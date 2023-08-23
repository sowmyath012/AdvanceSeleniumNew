package generic_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import organizationPom.HomePage;
import organizationPom.LoginPage;

public class BaseClass {
	public	Java_Utility jlib=new Java_Utility();
	public File_Utility flib=new File_Utility();
	public Excel_Utility elib=new Excel_Utility();
	public WebDriver_Utility wlib=new WebDriver_Utility();
    
	public  WebDriver driver;
	//public static WebDriver Sdriver;
	@BeforeSuite(groups={"smokeTest", "regressionTest"})
	public void beforeSuite() 
	{
		System.out.println("DataBase Connection");
	}
	
	@BeforeTest(groups={"smokeTest", "regressionTest"})
	
	public void beforetest()
	{
		System.out.println("parallel execution");
	}
	
	/*@Parameters("BROWSER")
	@BeforeClass (groups={"smokeTest", "regressionTest"})
public void beforeClass(String BROWSER) throws Throwable{*/

		
		
	@BeforeClass (groups={"smokeTest", "regressionTest"})
	public void beforeClass() throws Throwable
	{
		File_Utility flib=new File_Utility();
		 String BROWSER = flib.getStringKeyAndValue("browser");
	     // WebDriver driver;
	      if(BROWSER.equalsIgnoreCase("chrome"))
		   {
			   WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		   }
	      else if(BROWSER.equalsIgnoreCase("edge"))
	      {
	    	  WebDriverManager.edgedriver().setup();
	    	  driver=new EdgeDriver();
	      }
	      else if(BROWSER.equalsIgnoreCase("firefox"))
	      {
	    	  WebDriverManager.firefoxdriver().setup();
	      driver=new FirefoxDriver(); 
	      }
	     else 
	     {
	     driver=new FirefoxDriver();
	    	  
	      }
	     //Sdriver =driver;
		System.out.println("launching browser");
	
	}
	
	@BeforeMethod(groups={"smokeTest", "regressionTest"})
	public void beforeMethod() throws Throwable
	{
		//File_Utility flib=new File_Utility();
		String link = flib.getStringKeyAndValue("url");
		String name = flib.getStringKeyAndValue("username");
		String pwd  = flib.getStringKeyAndValue("password");
		 driver.get(link);
		// WebDriver_Utility wlib=new WebDriver_Utility();
		 wlib.maximizeScreen(driver);
		 LoginPage login = new LoginPage(driver);
			
		 login.loginToApp(name, pwd);
		System.out.println("login to application");
	}
	
	
    @AfterMethod(groups={"smokeTest", "regressionTest"})
    public void afterMethod()
    {
    	HomePage home = new HomePage(driver);
    	 home.logout(driver);
    	System.out.println("logout from application");
    }
    @AfterClass(groups={"smokeTest", "regressionTest"})
    public void afterClass() {
    	//driver.close();
    	System.out.println("close browser");
    }
    @AfterTest(groups={"smokeTest", "regressionTest"})
    public void afterTest() {
    	System.out.println("parallel execution done");
    }
    @AfterSuite(groups={"smokeTest", "regressionTest"})
    public void afterSuite() {
    	System.out.println("data base connection close");
    }
}
