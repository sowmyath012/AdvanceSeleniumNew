package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadDataFromJson {

	public static void main(String[] args) throws Throwable, Throwable {
	File file = new File("./src/test/resources/Datafile.json");
	ObjectMapper jsonData = new ObjectMapper();
	JsonNode data = jsonData.readTree(file);
	String URL = data.get("url").asText();
	String USERNAME = data.get("username").asText();
	String PASSWORD = data.get("password").asText();
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get(URL);
	
	

	}

}
