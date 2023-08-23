package organizationPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//INITIALIZATION
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
     //DECLARATION
	@FindBy(name="user_name")
	private WebElement userNameTextField;
	
	@FindBy(name="user_password")
	private WebElement passWordTextField;
	
	@FindBy(id="submitButton")
	private WebElement loginButton;
	
	//GETTER METHODS
	public WebElement getUserNameTextField() {
		return userNameTextField;
	}

	public WebElement getPassWordTextField() {
		return passWordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	//BUSINESS LOGIC
	public void loginToApp(String name,String pwd) {
		userNameTextField.sendKeys(name);
		passWordTextField.sendKeys(pwd);
		loginButton.click();
	}
	
	
	
}