package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Writedataexcel3 {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("E:\\Book1.xlsx");
		 Workbook book = WorkbookFactory.create(fis);
	     Sheet sh = book.getSheet("Sheet2");
	             Row r1 = sh.createRow(0);
	         	Cell c2 = r1.createCell(2);
	    		c2.setCellValue("level");
	    		FileOutputStream fos=new FileOutputStream("E:\\Book1.xlsx");
	    		book.write(fos);
	    		book.close();
		 

	}

}
