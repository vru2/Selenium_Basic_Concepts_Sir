package BrowserControlMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_quit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/raki9/OneDrive/Documents/SeleniumWeekendBatch2/Multiple%20Windows.html");
		Thread.sleep(4000);
		driver.findElement(By.id("open-windows-button")).click();
		Thread.sleep(4000);
		//driver.close();
		driver.quit();
	}

}
