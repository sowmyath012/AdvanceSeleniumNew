package generic_Utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;

public class Java_Utility {
	/**
	 * This method is used to avoid duplicates
	 * @return
	 */
	public int getRandomNum()
	{
		Random ran=new Random();
	    int ranNum=ran.nextInt(1000);
		return ranNum;
	}
	public void scrollDown() throws Throwable{
		Robot r = new Robot();
		  r.keyPress(KeyEvent.VK_PAGE_DOWN);
		  r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}


}
