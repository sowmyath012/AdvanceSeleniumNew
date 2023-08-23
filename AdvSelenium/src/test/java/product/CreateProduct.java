package product;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
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
import organizationPom.HomePage;
import organizationPom.LoginPage;
import organizationPom.ProductPage;
import organizationPom.ValidationPage;

public class CreateProduct extends BaseClass{
@Test(groups="regressionTest")
	public void CreateProduct() throws InterruptedException, Throwable {
		//WebDriver driver;
		//WebDriverManager.chromedriver().setup();
		//driver=new ChromeDriver();
		

	  /*  Java_Utility jlib=new Java_Utility();
		Excel_Utility elib=new Excel_Utility();
		File_Utility flib=new File_Utility();
		WebDriver_Utility wlib=new WebDriver_Utility();*/
		
	
	    
	  /* String BROWSER = flib.getStringKeyAndValue("browser");
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
	   
		
		/*String link = flib.getStringKeyAndValue("url");
		String name = flib.getStringKeyAndValue("username");
		String pwd = flib.getStringKeyAndValue("password");
		driver.get(link);
		
		
		 LoginPage login = new LoginPage(driver);
		 login.loginToApp(name, pwd);*/
		 
		
		//driver.findElement(By.name("user_name")).sendKeys(name);
		//driver.findElement(By.name("user_password")).sendKeys(pwd);
		//driver.findElement(By.id("submitButton")).click();
		wlib.maximizeScreen(driver);
		
		HomePage home = new HomePage(driver);
		home.ProductLink();
		//driver.findElement(By.linkText("Products")).click();
		//driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		
		ProductPage product=new ProductPage (driver);
		product.clickOnPlus();
		
		//To avoid duplicate
		 int ranNum=jlib.getRandomNum();
		String pname = elib.getExcelDataUsingDataFormatter("Product", 0, 0)+ranNum;

		
		 /*FileInputStream fis1=new FileInputStream("E:\\orgname1.xlsx");
			Workbook book = WorkbookFactory.create(fis1);
			Sheet sh = book.getSheet("Product");
		    Row r1 = sh.getRow(0);
			Cell c1 = r1.getCell(0);
			String cname = c1.getStringCellValue()+ranNum;*/

		
	    //driver.findElement(By.name("productname")).sendKeys(pname);
		
		product.productData(pname);
		
		/*WebElement value = driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[2]"));
		JavascriptExecutor	js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()",  value);*/
		
		/*WebElement value = driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[2]"));
		wlib.javaScriptExecutor(driver, value);
		value.click();*/
		
		product.clickOnSaveButton2(driver);
		
	   /* Rectangle data = value.getRect();
		System.out.println(data.getX());
		System.out.println(data.getY());
	JavascriptExecutor	js = (JavascriptExecutor) driver;
		 for(int i=0;i<4;i++) {
			 js.executeScript("window.scrollBy(438, 1153)");
		 }
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[2]")).click();*/
		
        
		//Validation
	/*	String actualData = driver.findElement(By.xpath("//span[@class='lvtHeaderText']")).getText();  //dynamic xpath
		{
		if(actualData.contains(pname)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		}*/
	//	ValidationPage validate = new ValidationPage(driver); 
	//	String productname = validate.validateProduct();
	//	Assert.assertEquals(productname, pname);
		
		//WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		//wlib.actionsMoveToElement(driver, ele);
		// driver.findElement(By.linkText("Sign Out")).click();
	
		//home.logout(driver);

	}

}
