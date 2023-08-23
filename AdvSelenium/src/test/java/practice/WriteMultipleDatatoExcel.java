package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WriteMultipleDatatoExcel {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		FileInputStream fis=new FileInputStream("C:\\Users\\sowmya\\OneDrive\\Desktop\\Book9.xlsx");
		 Workbook book = WorkbookFactory.create(fis);
		 Sheet sh = book.getSheet("Sheet1");
		 
		driver.get("https://www.amazon.in/?ref_=nav_custrec_signin&");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		
		for(int i=0;i<links.size(); i++) {
			Row r1 = sh.createRow(i);
			Cell c1 = r1.createCell(0);
			c1.setCellValue(links.get(i).getAttribute("href"));
			//setCellValue to pass the data   href-name of attribute
			
		}
		FileOutputStream fos=new FileOutputStream("C:\\Users\\sowmya\\OneDrive\\Desktop\\Book9.xlsx");
		book.write(fos);
		book.close();
		 

	}

}
