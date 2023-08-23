 package organizationPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_Utility.WebDriver_Utility;

public class HomePage {
	
	//INITIALIZATION
		public  HomePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
      
		 //DECLARATION
		@FindBy(linkText="Organizations")
		private WebElement OrganizationLink;
		
		@FindBy(linkText="Products")
		private WebElement ProductLink;
		
		@FindBy(xpath="//a[.='More']")
		private WebElement more;
		

		
		@FindBy(xpath="//img[@src='themes/softed/images/menuDnArrow.gif']")
		private  WebElement dropdown;
		
		@FindBy(name="Campaigns")
		private WebElement CampaignLink;
		
		@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
		private WebElement Adminstrator;
		
		@FindBy(linkText="Sign Out")
		private WebElement Signout;
		
		
		

		//GETTER METHODS
		public WebElement getOrganizationLink() {
			return OrganizationLink;
		}
		
		public WebElement getProductLink() {
			return ProductLink;
		}
		public WebElement getMore() {
			return more;
		}
		public WebElement getdropdown() {
			return dropdown;
		}
		public WebElement getCampaignLink() {
			return CampaignLink;
		}
		public WebElement getAdminstrator() {
			return Adminstrator;
		}

		public WebElement getSignout() {
			return Signout;
		}
        

		//BUSINESS LOGIC
		/**
		 * this method is used to click on organization link
		 */
		public void  OrganizationLink() {
			OrganizationLink.click();
		}
		public void ProductLink() {
			ProductLink.click();
		}
		public void more() {
			more.click();
			// WebDriver_Utility wlib=new WebDriver_Utility();
		       // wlib.mouseHoverAction(driver, more);
			
		}


		
		public void dropdown() {
			dropdown.click();
		}
		public void CampaignLink() {
			CampaignLink.click();
		}
		
		public void logout(WebDriver driver)
		{
			
			Actions act=new Actions(driver);
			act.moveToElement(Adminstrator).perform();	
			Signout.click();
		
			
			//WebDriver_Utility wlib=new WebDriver_Utility();
			//wlib.actionsMoveToElement(driver, Adminstrator);
		}
}
