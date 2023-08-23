package organizationPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {


	
	//INITIALIZATION
	public LoginPage1(WebDriver driver)
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
	
	//@FindBys({@FindBy(id="submitButton"),@FindBy(xpath="(//input[@value='LOGIN'])[2]")})
	//private WebElement loginButton;
	
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

	public void loginToApp(String name,String pwd) {
		userNameTextField.sendKeys(name);
		passWordTextField.sendKeys(pwd);
		loginButton.click();
	}
}
