package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic_Utility.Excel_Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider2 {
@Test(dataProvider="fetchData")
public void vtiger(String orgName,String phoneNum,String email) throws Throwable {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost:8888/");
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("admin");
	driver.findElement(By.id("submitButton")).click();
	driver.findElement(By.linkText("Organizations")).click();
	driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("accountname")).sendKeys( orgName);
	driver.findElement(By.name("phone")).sendKeys(phoneNum);
	driver.findElement(By.name("email1")).sendKeys(email);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
	driver.findElement(By.xpath("//a[.='Sign Out']")).click();
	driver.quit();
}
	/*@DataProvider
	 public Object[][] getData()
	 {
		Random ran = new Random();
		int ranNum = ran.nextInt(1000);
		 Object[][] objarr = new Object[3][3] ;
		 objarr[0][0]="Wipro"+ranNum;
		 objarr[0][1]="987456123";
		 objarr[0][2]="wipro@gmail.com";
		 
		 objarr[1][0]="Infotech"+ranNum;
		 objarr[1][1]="987654123";
		 objarr[1][2]="info@gmail.com";
		 
		 objarr[2][0]="Tcs"+ranNum;
		 objarr[2][1]="987546123";
		 objarr[2][2]="tcs@gmail.com";
		 return objarr ;
	 }*/

@DataProvider
public Object[][] fetchData() throws Throwable
{
	Excel_Utility elib = new Excel_Utility();
	 Object[][] value=elib.readMultipleData("DataProvider");
	return value;
	
	
	

}
	
}
