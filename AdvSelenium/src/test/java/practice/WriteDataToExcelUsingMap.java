package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataToExcelUsingMap {

	public static void main(String[] args) throws Throwable {
		FileInputStream file=new FileInputStream("E:\\Data.xlsx");
		Workbook book = WorkbookFactory.create(file);
		Sheet sheet = book.getSheet("Sheet3");
		
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("10", "pune");
		map.put("20", "Kolkota");
		map.put("30", "Delhi");
		
		map.put("10", "pune");
		map.put("20", "Kolkota");
		map.put("10", "pune");
		map.put("20", "Kolkota");
		
		int rowNum=0;
		for(Entry<String, String> m:map.entrySet())
		{
			Row row = sheet.createRow(rowNum++);
			row.createCell(0).setCellValue((String)m.getKey());
			row.createCell(1).setCellValue((String)m.getValue());
			
		}
		FileOutputStream fos=new FileOutputStream("E:\\Data.xlsx");
		book.write(fos);
		book.close();

	}

}
