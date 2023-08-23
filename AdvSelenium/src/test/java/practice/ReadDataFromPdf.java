package practice;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class ReadDataFromPdf {

	public static void main(String[] args) throws Throwable {
	File file = new File("./src/test/resources/IBPS-PO-Previous-Year-Paper-2022.pdf");
	PDDocument doc=PDDocument.load(file);
	
	//pagecount
	int pages = doc.getNumberOfPages();
	System.out.println(pages);
	
	//Read content
	PDFTextStripper pdfdata=new PDFTextStripper();
	
	/*String Data = pdfdata.getText(doc);
	System.out.println(Data);*/
	
	//starts printing text from page3 onwards
	/*pdfdata.setStartPage(3);
    String Data1=pdfdata.getText(doc);
    System.out.println(Data1);*/
	
	//prints 1,2,3 pages
	pdfdata.setStartPage(1);
	pdfdata.setEndPage(3);
	String Data2 = pdfdata.getText(doc);
	System.out.println(Data2);
	}

}
