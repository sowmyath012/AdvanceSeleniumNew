package campaigns;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;

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

import campaignPom.CreateCampaignPage;
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
import organizationPom.ProductPage;
import organizationPom.ValidationPage;

public class CreateCampaign extends BaseClass {
@Test(retryAnalyzer=generic_Utility.RetryAnalyzerImplementation.class)
public void CreateCampaign() throws Throwable {
		//WebDriver driver;
		//WebDriverManager.chromedriver().setup();
		//driver=new ChromeDriver();
		
		
		/*Java_Utility jlib=new Java_Utility();
		File_Utility flib=new File_Utility();
        Excel_Utility elib=new Excel_Utility();
        WebDriver_Utility wlib=new WebDriver_Utility();*/
        
    /* String BROWSER = flib.getStringKeyAndValue("browser");
      WebDriver driver;
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
    	  
      }*/
		
	/*	String link = flib.getStringKeyAndValue("url");
		String name = flib.getStringKeyAndValue("username");
		String pwd  = flib.getStringKeyAndValue("password");
		 driver.get(link);*/
		wlib.maximizeScreen(driver);
		 
		// LoginPage login = new LoginPage(driver);
		
		// login.loginToApp(name, pwd);
		 
		//driver.findElement(By.name("user_name")).sendKeys(name);
		//driver.findElement(By.name("user_password")).sendKeys(pwd);
		//driver.findElement(By.id("submitButton")).click();
		 
		 HomePage home = new HomePage(driver);
		 //home.dropdown();
		 home.more();
		 
	//driver.findElement(By.xpath("//img[@src='themes/softed/images/menuDnArrow.gif']")).click();
		    home.CampaignLink();
		//driver.findElement(By.name("Campaigns")).click();
		    
		    CreateCampaignPage camp=new CreateCampaignPage(driver);
		   camp.clickOnPlusSign();
		  
		  Assert.assertEquals(false, true);
		//driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		 
			/*FileInputStream fis1=new FileInputStream("E:\\orgname1.xlsx");
			Workbook book = WorkbookFactory.create(fis1);
			Sheet sh = book.getSheet("Campaign");
			Row r1 = sh.getRow(1);
			Cell c1 = r1.getCell(1);
			String cname = c1.getStringCellValue()+ranNum;*/

		/*   int ranNum=jlib.getRandomNum();
		     String cname = elib.getExcelDataUsingDataFormatter("Campaign", 1, 1)+ranNum;
		driver.findElement(By.name("campaignname")).sendKeys(cname);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();*/
	
		
		 int ranNum=jlib.getRandomNum();
	     String cname = elib.getExcelDataUsingDataFormatter("Campaign", 1, 1)+ranNum;
	     camp.campData(cname);
	   
	     camp.clickOnSaveButton2(driver);
	     
	     
		
		 //VALIDATION
 	/* WebElement actValue = driver.findElement(By.xpath("//span[@class='dvHeaderText']"));
 		 {
 			 if(actValue.getText().contains(cname)) {
 				 System.out.println("pass");
 			 }
 			 else {
 				 System.out.println("fail");
 			 }
 		 }*/
		/*WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		wlib.actionsMoveToElement(driver, ele);
		driver.findElement(By.linkText("Sign Out")).click();*/
	     
	     
	     //validation
 	//	ValidationPage validate = new ValidationPage(driver);
 		//String campValue = validate.validateCamp();
 		//Assert.assertEquals(false, false);
 		 
 		//home.logout(driver);

	}




}
