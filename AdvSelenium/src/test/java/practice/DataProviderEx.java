package practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic_Utility.Excel_Utility;

public class DataProviderEx {

	
		@Test(dataProvider="fetchData")
		public void   booktickets(String src, String dest) {
			System.out.println("book tickets from"+" "+src+" "+"to"+" "+dest);
			
		}
 /*@DataProvider
 public Object[][] dataProviderExecute()
 {
	 Object[][] objarr = new Object[2][2] ;
	 objarr[0][0]="Bangalore";
	 objarr[0][1]="Mumbai";
	 objarr[1][0]="Hyderabad";
	 objarr[1][1]="Goa";
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


