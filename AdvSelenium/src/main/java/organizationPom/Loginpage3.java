package organizationPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Loginpage3 {


	public Loginpage3(WebDriver driver)
	{
	PageFactory.initElements(driver, this);	
	}

	@FindBy(name="user_name")
	private WebElement userNameTextField;
	
	

	@FindBys({@FindBy(xpath="//input[@type='password']"), @FindBy(xpath="//input[@name='user_password']")})
	private WebElement passwordTextField;
	
     @FindAll({@FindBy(xpath="//input[@type='submit']"), @FindBy(xpath="//input[@value='Login']")})
     private WebElement loginButton;
     
     //
     public WebElement getUserNameTextField() {
 		return userNameTextField;
 	}
	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	public void loginToApp(String name, String pwd) {
		userNameTextField.sendKeys(name);
		passwordTextField.sendKeys(pwd);
		loginButton.click();
	}
     
     
}

