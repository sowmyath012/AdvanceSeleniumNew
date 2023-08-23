package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchmultipledataExcel {

	public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("C:\\Users\\sowmya\\OneDrive\\Desktop\\Book9.xlsx");
	Workbook book = WorkbookFactory.create(fis);
	Sheet sh = book.getSheet("Sheet1");
	
	System.out.println(sh.getLastRowNum());

	
	for(int i=0;i<sh.getLastRowNum(); i++)
	{
		Row r1 = sh.getRow(i);
		for(int j=0;j<r1.getLastCellNum(); j++)
		{
			Cell cel = r1.getCell(j);
			DataFormatter format=new DataFormatter();
			String data = format.formatCellValue(cel);
			System.out.println(data);
			
		}
	}

	
	
	}

}
