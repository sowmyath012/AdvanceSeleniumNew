package organizationPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_Utility.WebDriver_Utility;

public class ProductValidationPage {

	
		public ProductValidationPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
		
		@FindBy(xpath="//input[@value='Delete']")
		private WebElement deleteProduct;

		public WebElement getDeleteProduct() {
			return deleteProduct;
		}
		
		
		//
		
		public void checkprdName(WebDriver driver,String pname)
		{
			driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr//td//a[text()='"+pname+"']"+"/../preceding-sibling::td/input")).click();
		}
		  public void deleteProduct(WebDriver driver,WebDriver_Utility wlib) {
        	  deleteProduct.click();
        	 wlib.acceptAlert(driver);
          }

}
