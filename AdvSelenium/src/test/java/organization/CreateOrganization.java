package organization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import generic_Utility.BaseClass;
import generic_Utility.Excel_Utility;
import generic_Utility.File_Utility;
import generic_Utility.Java_Utility;
import generic_Utility.WebDriver_Utility;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import organizationPom.CreateOrganizationPage;
import organizationPom.HomePage;
import organizationPom.LoginPage;

public class  CreateOrganization extends BaseClass{

	
	//public static void main(String[] args) throws Throwable {
	@Test(groups="smokeTest")
		public  void CreateOrganization()  throws  Throwable{
		
		
		//WebDriver driver;
		//WebDriverManager.chromedriver().setup();
		//driver=new ChromeDriver();
		
	/*	WebDriver_Utility wlib=new WebDriver_Utility();
		Java_Utility jlib=new Java_Utility();
		File_Utility flib=new File_Utility();
		Excel_Utility elib=new Excel_Utility();*/
	 
	    
	    
	 /*  String BROWSER = flib.getStringKeyAndValue("browser");
	   WebDriver driver;
	   if(BROWSER.equalsIgnoreCase("chrome"))
	   {
		   WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	   }
	   else if (BROWSER.equalsIgnoreCase("firefox"))
	   {
		   WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	   }
	   else if (BROWSER.equalsIgnoreCase("edge"))
	   {
		   WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	   }
	   else 
	   {
		   driver=new ChromeDriver();
	   }*/
	   
		wlib.implicitwait(driver);
	
	/*	String link = flib.getStringKeyAndValue("url");
		String name = flib.getStringKeyAndValue("username");
		String pwd  = flib.getStringKeyAndValue("password");
		driver.get(link);
		
		LoginPage login = new LoginPage(driver);
		login.loginToApp(name, pwd);*/
		//driver.findElement(By.name("user_name")).sendKeys(name);
		//driver.findElement(By.name("user_password")).sendKeys(pwd);
		//driver.findElement(By.id("submitButton")).click();
		
		wlib.maximizeScreen(driver);
		
		HomePage home= new HomePage(driver);
		home.OrganizationLink();
		
		//driver.findElement(By.linkText("Organizations")).click();
		
		/*driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		 int ranNum=jlib.getRandomNum();
	     String oname = elib.getExcelData("Sheet1", 0, 1)+ranNum;
	     driver.findElement(By.name("accountname")).sendKeys(oname);
	     String phoneNum = elib.getExcelDataUsingDataFormatter("Sheet1", 1, 1);
	     driver.findElement(By.id("phone")).sendKeys(phoneNum);
	      String email = elib.getExcelDataUsingDataFormatter("Sheet1", 0, 3);
		driver.findElement(By.id("email1")).sendKeys(email);
	
		Thread.sleep(8000);*/
		
	     int ranNum=jlib.getRandomNum();
		  String oname = elib.getExcelData("Sheet1", 0, 1)+ranNum;
		  String phoneNum = elib.getExcelDataUsingDataFormatter("Sheet1", 1, 1);
		  String email = elib.getExcelDataUsingDataFormatter("Sheet1", 0, 3);
		  
		  CreateOrganizationPage org=new CreateOrganizationPage(driver);
		  org.clickOnImg();
		   org.orgData(oname, phoneNum,  email);
		
			
			org.clickSaveButton();
			//driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		
		//Validation
		   
		/*String actualData = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();  
		{
		if(actualData.contains(oname)) {
			System.out.println("pass");
		}
		
		else {
			System.out.println("fail");
		}
		}
		/*WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		wlib.actionsMoveToElement(driver, ele);
		driver.findElement(By.linkText("Sign Out")).click();*/
		
		// HomePage home1=new HomePage(driver);
  		// home1.logout(driver);
  		
	
	

	}

}
