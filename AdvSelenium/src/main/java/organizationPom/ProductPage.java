package organizationPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_Utility.WebDriver_Utility;

public class ProductPage {
	//INITIALIZATION
			public  ProductPage (WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
			private WebElement plusSign;
			
			@FindBy(name="productname")
		    private WebElement productname;
			
			@FindBy (xpath="(//input[@title='Save [Alt+S]'])[2]")
			private WebElement saveButton2;
			
			@FindBy(xpath="//a[@class='hdrLink']")
			private WebElement productLink;
		

			//
			public WebElement getPlusSign() {
				return plusSign;
			}

			public WebElement getProductname() {
				return productname;
			}
			
			

			public WebElement getSaveButton2() {
				return saveButton2;
			}
			public WebElement getProductLink() {
				return productLink;
			}
			
			
			//
			public void clickOnPlus() {
				 plusSign.click();
			}
			
		
			public void productData(String pname) {
				 productname.sendKeys(pname);
			}
			   public void clickOnSaveButton2(WebDriver driver) {
			    	
			    	saveButton2.click();
			    	
			    }
            public void productlink() {
            	productLink.click();
            }
        
            
            
}
