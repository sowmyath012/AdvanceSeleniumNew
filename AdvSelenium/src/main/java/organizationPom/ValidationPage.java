package organizationPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidationPage {


	public ValidationPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//Declaration
  @FindBy(xpath="//span[@class='dvHeaderText']")  
  private WebElement campValidate;
  

  @FindBy(xpath="//span[@class='lvtHeaderText']")
  private WebElement productValidate;

//Getters
public WebElement getCampValidate() {
	return campValidate;
}


public WebElement getProductValidate() {
	return productValidate;
}


//Business logic
  public String validateCamp()
  {
	  return campValidate.getText();
  }
  

public String validateProduct()
{
	  return productValidate.getText();
}
	}


