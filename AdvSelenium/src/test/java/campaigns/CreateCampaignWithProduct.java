package campaigns;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Rectangle;
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
import organizationPom.HomePage;
import organizationPom.LoginPage;
import organizationPom.LoginPage1;

public class CreateCampaignWithProduct extends BaseClass {
@Test(groups="regressionTest")
	public void CreateCampaignWithProduct() throws Throwable {
	//public static void main(String[] args) throws Throwable {
		//WebDriver driver;
		//WebDriverManager.chromedriver().setup();
		//driver=new ChromeDriver();
		
		/* Java_Utility jlib=new  Java_Utility ();
		 File_Utility flib=new File_Utility();
		 Excel_Utility elib=new  Excel_Utility();
		 WebDriver_Utility wlib=new WebDriver_Utility();*/
			
	 /*  String BROWSER = flib.getStringKeyAndValue("browser");
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
	      else if(BROWSER.equalsIgnoreCase("browser"))
	      {
	    	  WebDriverManager.firefoxdriver().setup();
	      driver=new FirefoxDriver(); 
	      }
	      else 
	      {
	    	  driver=new ChromeDriver();
	    	  
	      }*/
		 
		/*FileInputStream fis=new FileInputStream("vtiger.txt");
		Properties pro=new Properties();
		pro.load(fis);*/
		 
		 wlib.implicitwait(driver);
		
	 /*   String link =flib.getStringKeyAndValue("url");
	    String name = flib.getStringKeyAndValue("username");
	    String pwd = flib.getStringKeyAndValue("password");
	    driver.get(link);
	    
	   LoginPage login = new LoginPage(driver); 
	   login.loginToApp(name, pwd);*/
	   
	    
	  //  driver.findElement(By.name("user_name")).sendKeys(name);
		//driver.findElement(By.name("user_password")).sendKeys(pwd);
		//driver.findElement(By.id("submitButton")).click();
		
	    wlib.maximizeScreen(driver);
	  HomePage home = new  HomePage(driver);
	  home.dropdown();
	  home.CampaignLink();
		//driver.findElement(By.xpath("//img[@src='themes/softed/images/menuDnArrow.gif']")).click();
		//driver.findElement(By.name("Campaigns")).click();
	  
	  
		//driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
	  
	 CreateCampaignPage camp = new  CreateCampaignPage(driver);
	 camp.clickOnPlusSign();
	  
		/*FileInputStream fis2=new FileInputStream("E:\\orgname1.xlsx");
		Workbook book = WorkbookFactory.create(fis2);
		Sheet sh = book.getSheet("Campaign");
		Row r2 = sh.getRow(1);
		Cell c2 = r2.getCell(1);*/
	 
		/*int ranNum = jlib.getRandomNum();
		String cname = elib.getExcelDataUsingDataFormatter("Campaign", 1, 1)+ranNum;
		 driver.findElement(By.name("campaignname")).sendKeys(cname);*/
	 

		int ranNum = jlib.getRandomNum();
		String cname = elib.getExcelDataUsingDataFormatter("Campaign", 1, 1)+ranNum;
		camp.campData(cname);
	 
	
      // driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")).click();
		camp.clickOnProductSign();
       wlib.switchWindow(driver, "Products&action");
   
     /* Set<String> allWindows = driver.getWindowHandles();
      Iterator<String> id = allWindows.iterator();
      while(id.hasNext())
      {
    	  String win = id.next();
    	  driver.switchTo().window(win);
    	  String title = driver.getTitle();
    	  if(title.contains("Products&action"))
    	  {
    		  break;
    	  }
      }*/
       
     	/*String pname = elib.getExcelDataUsingDataFormatter("Product", 0, 0)+ranNum;
    	  driver.findElement(By.name("search_text")).sendKeys("pname");
    	   driver.findElement(By.name("search")).click();
    	   driver.findElement(By.xpath("//a[text()='Laptop']")).click();*/
    
   String pname = elib.getExcelDataUsingDataFormatter("Product", 0, 1)+ranNum;  //dynamic xpath
  
   	camp.clickOnSearchProduct(pname);
   	camp.clickOnSearchButton();
   	camp.clickOnSelectProduct();
   	
   	
    	 wlib.switchWindow(driver, "Campaigns&action");
    	
    	  /* Set<String> allWindows1 = driver.getWindowHandles();
    	      Iterator<String> id1 = allWindows1.iterator();
    	      while(id1.hasNext())
    	      {
    	    	  String win1 = id1.next();
    	    	  driver.switchTo().window(win1);
    	    	  String title = driver.getTitle();
    	    	  if(title.contains("Campaigns&action"))
    	    	  {
    	    		  break;
    	    	  }
    	      }*/
    	
    	/*WebElement value = driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[2]"));
    	wlib.javaScriptExecutor(driver, value);
    	 value.click();*/
    	 
    	  	/*WebElement value = driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[2]"));
  	      Rectangle data = value.getRect();
  		System.out.println(data.getX());
  		System.out.println(data.getY());
  	JavascriptExecutor	js = (JavascriptExecutor) driver;
  		 for(int i=0;i<4;i++) {
  			 js.executeScript("window.scrollBy(438, 1153)");
  		 }
  	 Thread.sleep(5000);
  		 value.click();*/
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
  		 Thread.sleep(2000);*/
  		// driver.findElement(By.linkText("Sign Out")).click();
  		//driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
  		//driver.findElement(By.linkText("Sign Out")).click();*/
  		 
  		 
  		// HomePage home1=new HomePage(driver);
  		// home.logout(driver);
  		 
  	}
    		   
      }
        
	


