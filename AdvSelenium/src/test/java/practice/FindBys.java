package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic_Utility.File_Utility;
import generic_Utility.WebDriver_Utility;
import io.github.bonigarcia.wdm.WebDriverManager;
import organizationPom.Loginpage3;

public class FindBys {

	public static void main(String[] args) throws Throwable {
		       WebDriver driver;
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				File_Utility flib=new File_Utility();
			    WebDriver_Utility wlib=new WebDriver_Utility();
			      
				String link = flib.getStringKeyAndValue("url");
				String name = flib.getStringKeyAndValue("username");
				String pwd  = flib.getStringKeyAndValue("password");
				 driver.get(link);
				 wlib.maximizeScreen(driver);
				 Loginpage3  login=new Loginpage3 (driver);
				 login.loginToApp(name, pwd);
				 

	}

}
