package vtigerpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderPopup {

	public static void main(String[] args) throws Throwable {

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@role='presentation']")).click();
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		String month = "July 2023";
		int num=15;
        driver.findElement(By.xpath("//div[text()='"+month+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+num+"']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Done']")).click();
        Thread.sleep(3000);
       driver.findElement(By.xpath("//span[text()='Return']")).click();
       String month1 = "August 2023";
        int num1 = 15;
        driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
	}

}
