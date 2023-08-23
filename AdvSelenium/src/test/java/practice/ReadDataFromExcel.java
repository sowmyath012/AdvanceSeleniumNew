package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Throwable {
		
		//Set the path
		FileInputStream fis=new FileInputStream("E:\\Data.xlsx");
		
		//open workbook in read mode
		Workbook book=WorkbookFactory.create(fis);
		
		//get control to the sheet
        Sheet store = book.getSheet("Sheet4");
        
        //get control to the row
        Row r1 = store.getRow(0);
        
        //get control to the cell
		Cell c1 = r1.getCell(0);
		
		/*String data = c1.getStringCellValue();
		System.out.println(data);*/
		
		//using dataformatter
		
		DataFormatter formatter = new DataFormatter();
		String data1 = formatter.formatCellValue(c1);
		System.out.println(data1);

	}

}
