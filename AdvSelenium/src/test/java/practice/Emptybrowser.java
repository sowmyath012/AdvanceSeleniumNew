package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Emptybrowser {

	public static void main(String[] args) {
		String key="Webdriver.chrome.driver";
		String value="./src/main/resources/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.amazon.in/?ref_=nav_custrec_signin&");
          
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver= new ChromeDriver();
	}

}
