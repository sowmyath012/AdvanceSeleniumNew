package campaignPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_Utility.WebDriver_Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateCampaignPage {
	
	public  CreateCampaignPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement plusSign;
	
	@FindBy (name="campaignname")
	private WebElement campName;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement SaveButton;
	
	@FindBy(xpath="//img[@src='themes/softed/images/select.gif']")
	private WebElement productSign;
	
	@FindBy (name="search_text")
	private WebElement productSearch;
	
	@FindBy (name="search")
	private WebElement searchButton;
	
	@FindBy (xpath="//a[text()='Laptop']")
	private WebElement selectProduct;
	
	@FindBy (xpath="(//input[@title='Save [Alt+S]'])[2]")
	private WebElement saveButton2;
	
	
   //GETTERS
	public WebElement getPlusSign() {
		return plusSign;
	}

	public WebElement getCampName() {
		return campName;
	}
	public WebElement getSaveButton() 
	{
		return SaveButton;
	}
	
	public WebElement getProductSign() {
		return productSign;
	}
	
    public WebElement getProductSearch() {
		return productSearch;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getSelectProduct() {
		return selectProduct;
	}

	public WebElement getSaveButton2() {
		return saveButton2;
	}

	//BUSINESS LOGIC
	public void campData(String cname) {
		campName.sendKeys(cname);
	}
	public void clickOnPlusSign()
	{
		 plusSign.click();
	}
	
	public void clickOnSaveButton() {
		 SaveButton.click();
	}
	public void clickOnProductSign() {
		productSign.click();
	}
	public void clickOnSearchProduct(String pname) {
		productSearch.sendKeys(pname);
	}
    public void clickOnSearchButton() {
    	searchButton.click();
    }
    public void clickOnSelectProduct() {
    	selectProduct.click();
    }
    public void clickOnSaveButton2(WebDriver driver) {
    	//WebElement value = driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[2]"));
    	// WebDriver_Utility wlib=new WebDriver_Utility();
    	//wlib.javaScriptExecutor(driver,saveButton2 );
    	saveButton2.click();
    	
    }
    
}
