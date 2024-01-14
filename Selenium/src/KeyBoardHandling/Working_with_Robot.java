package KeyBoardHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_Robot {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/webhp");
		
		driver.findElement(By.id("APjFqb")).click();
		Thread.sleep(2000);
//		Robot r = new Robot();
//		
//		r.keyPress(KeyEvent.VK_SHIFT);
//		r.keyPress(KeyEvent.VK_S);
//		r.keyRelease(KeyEvent.VK_S);
//		r.keyRelease(KeyEvent.VK_SHIFT);
		
		
		Actions act = new Actions (driver);
		
		act.keyDown(Keys.SHIFT).sendKeys("selenium").perform();
		act.keyUp(Keys.SHIFT).perform();
		
		
	
		

	}

}
