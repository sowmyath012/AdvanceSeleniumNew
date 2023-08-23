package generic_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Utility {
	/**
	 * This method is used to fetch data from excel sheet
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return
	 * @throws Throwable
	 */
	public String getExcelData(String sheetName,int rowNum,int cellNum) throws Throwable{
		
	
	FileInputStream fis1=new FileInputStream("E:\\orgname1.xlsx");
	Workbook book = WorkbookFactory.create(fis1);
	Sheet sh = book.getSheet("Sheet1");
	Row r1 = sh.getRow(rowNum);
	Cell c1 = r1.getCell(cellNum);
	String value = c1.getStringCellValue();
	return value;

}
	/**
	 * This method is used to fetch data from excel sheet using formatter
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return
	 * @throws Throwable
	 */
	public String getExcelDataUsingDataFormatter(String sheetName,int rowNum,int cellNum) throws Throwable {
	

		FileInputStream fis1=new FileInputStream("E:\\orgname1.xlsx");
		Workbook book = WorkbookFactory.create(fis1);
		DataFormatter format=new DataFormatter();
		String value =format.formatCellValue(book.getSheet(sheetName).getRow(rowNum).getCell(cellNum));
		return value;

	}
	/**
	 * This method is used to fetch data from excel sheet using formatter
	 * @param Sheet1
	 * @return
	 * @throws Throwable
	 */
	public Object[][] readMultipleData(String Sheet1) throws Throwable {
		 FileInputStream file = new FileInputStream("E:\\companiesList.xlsx");
		Workbook book = WorkbookFactory.create(file);
		Sheet sh = book.getSheet("Sheet1");
	int lastRow = sh.getLastRowNum()+1;
	int lastCell = sh.getRow(0).getLastCellNum();
	
	 Object[][] obj=new  Object[lastRow][lastCell];
	for(int i=0;i<lastRow;i++)
	{
		for(int j=0;j<lastCell;j++) {
			obj[i][j]=sh.getRow(i).getCell(j).getStringCellValue();                                                                             
		}
	}
	
return obj;
	
	}
}
