package product;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import generic_Utility.Excel_Utility;
import generic_Utility.File_Utility;
import generic_Utility.Java_Utility;
import generic_Utility.WebDriver_Utility;
import io.github.bonigarcia.wdm.WebDriverManager;
import organizationPom.HomePage;
import organizationPom.LoginPage;
import organizationPom.ProductPage;
import organizationPom.ProductValidationPage;

public class CreateandDeleteProduct {

	//public static void main(String[] args) throws Throwable {
	@Test
	public  void CreateandDeleteProduct() throws Throwable {

		
		//WebDriver driver;
		//WebDriverManager.chromedriver().setup();
		//driver=new ChromeDriver();
	
	    Java_Utility jlib=new Java_Utility();
		Excel_Utility elib=new Excel_Utility();
		File_Utility flib=new File_Utility();
		WebDriver_Utility wlib=new WebDriver_Utility();
	    String BROWSER = flib.getStringKeyAndValue("browser");
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
	    	  
	      }
		
		String link = flib.getStringKeyAndValue("url");
		String name = flib.getStringKeyAndValue("username");
		String pwd = flib.getStringKeyAndValue("password");
		driver.get(link);
		
		LoginPage login = new LoginPage(driver);
		login.loginToApp(name, pwd);
		
		//driver.findElement(By.name("user_name")).sendKeys(name);
	    //driver.findElement(By.name("user_password")).sendKeys(pwd);
		//driver.findElement(By.id("submitButton")).click();
		wlib.maximizeScreen(driver);
		
		//driver.findElement(By.linkText("Products")).click();
		HomePage home = new  HomePage(driver);
		home.ProductLink();
		
		
//driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();*/
		
		ProductPage  product=new ProductPage(driver);
		product.clickOnPlus();
		
		
		 /*FileInputStream fis1=new FileInputStream("E:\\orgname1.xlsx");
		Workbook book = WorkbookFactory.create(fis1);
		Sheet sh = book.getSheet("Product");
	    Row r1 = sh.getRow(0);
		Cell c1 = r1.getCell(0);
		String cname = c1.getStringCellValue()+ranNum;*/
		
		 int ranNum=jlib.getRandomNum();
		String pname = elib.getExcelDataUsingDataFormatter("Product", 0, 1)+ranNum;
		
         // driver.findElement(By.name("productname")).sendKeys(pname);
		
		product.productData(pname);	
	
	
		
	    Thread.sleep(3000);
	    // driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[2]")).click();     
		//WebElement value = driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[2]"));
		/*wlib.javaScriptExecutor(driver, value);
		 Rectangle data = value.getRect();
		System.out.println(data.getX());
		System.out.println(data.getY());
	JavascriptExecutor	js = (JavascriptExecutor) driver;
		 for(int i=0;i<4;i++) {
			 js.executeScript("window.scrollBy(438, 1153)");
		 }*/
	    
	    product.clickOnSaveButton2(driver);
	    
	    
		 Thread.sleep(5000);
		
		// driver.findElement(By.xpath("//a[@class='hdrLink']")).click();
		 product.productlink();
		 //dynamic xpath can't be converted in to findby
		//driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr//td//a[text()='"+pname+"']"+"/../preceding-sibling::td/input")).click();
		 ProductValidationPage validate=new ProductValidationPage(driver);
		 validate.checkprdName(driver, pname);
		// driver.findElement(By.xpath("//input[@value='Delete']")).click();
		validate.deleteProduct(driver, wlib);
		  //validate.deleteProduct(driver,null);
		// wlib.acceptAlert(driver);
List<WebElement>productList= driver.findElements(By.xpath("(//table[@class='lvt small']/tbody/tr/td[3])[position()>1]"));
boolean flag=false;
for (WebElement prdName:productList)
{
	String actData = prdName.getText();
	if (actData.contains(pname))
	{
	flag=true;
	break;
	}
}

if(flag)
{
	System.out.println("product data is deleted");
}
else 
{
	System.out.println("product data is not deleted");
	}

/*WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
wlib.actionsMoveToElement(driver, ele);
driver.findElement(By.xpath("//a[.='Sign Out']")).click();*/

/*WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
wlib.actionsMoveToElement(driver, ele);
driver.findElement(By.linkText("Sign Out")).click();
Alert act = driver.switchTo().alert();
act.accept();*/
	 

home.logout(driver);
Alert act = driver.switchTo().alert();
act.accept();



}
}

