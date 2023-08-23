package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Writedataexcel2 {

	public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("E:\\Data.xlsx");
	 Workbook book = WorkbookFactory.create(fis);
     Sheet sh = book.getSheet("Sheet1");
             Row r1 = sh.createRow(1);
         	Cell c2 = r1.createCell(5);
    		c2.setCellValue("work");
    		FileOutputStream fos=new FileOutputStream("E:\\Data.xlsx");
    		book.write(fos);
    		book.close();
	 
	 
	}

}
