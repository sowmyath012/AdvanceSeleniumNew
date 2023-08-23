package databaseJDBC;

import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import generic_Utility.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EncryptDecrypt {

	public static void main(String[] args) {
		
		String encryptedUsername = new String(Base64.getEncoder().encode("admin".getBytes()));
		String encryptedPassword = new String(Base64.getEncoder().encode("admin".getBytes()));
		System.out.println(encryptedUsername);
		System.out.println(encryptedPassword);
		
		String dencryptedUsername = new String(Base64.getDecoder().decode(encryptedUsername.getBytes()));
		String dencryptedPassword = new String(Base64.getDecoder().decode(encryptedPassword.getBytes()));
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		//driver.findElement(By.name("user_name")).sendKeys(encryptedUsername);
		//driver.findElement(By.name("user_password")).sendKeys(encryptedPassword);
		driver.findElement(By.name("user_name")).sendKeys(dencryptedUsername);
		driver.findElement(By.name("user_password")).sendKeys(dencryptedPassword);
		driver.findElement(By.id("submitButton")).click();
		
	}

}
