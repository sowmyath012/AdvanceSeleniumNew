package organizationPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganizationPage {
	//initialization
	public  CreateOrganizationPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//declaration
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement clickImg;
	
	@FindBy(name="accountname")
	private WebElement orgName;
	
	@FindBy(id="phone")
	private WebElement orgPhone;
	
	@FindBy(id="email1")
	private WebElement orgEmail;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement SaveButton;
	
	//getter methods

	public WebElement getClickImg() {
		return clickImg;
	}

	public WebElement getOrgName() {
		return orgName;
	}

	public WebElement getOrgPhone() {
		return orgPhone;
	}

	public WebElement getOrgEmail() {
		return orgEmail;
	}
	
	public WebElement getSaveButton() {
		return SaveButton;
	}
	
	//business logic
	
	public void clickOnImg() {
		clickImg.click();
	}

		public void orgData(String oname,String phoneNum, String  email)
		{
			orgName.sendKeys(oname);
			orgPhone.sendKeys(phoneNum);
			orgEmail.sendKeys(email);
		}
		
		public void clickSaveButton()
		{
			SaveButton.click();
		}
	}
	

