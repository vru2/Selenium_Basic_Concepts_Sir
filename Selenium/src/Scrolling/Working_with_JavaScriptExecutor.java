package Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,500);");
		
		WebElement aboutSelenium = driver.findElement(By.xpath("//p[@class='mt-2']/a"));
		js.executeScript("arguments[0].scrollIntoView(true);", aboutSelenium);
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(false);", aboutSelenium);
		Thread.sleep(2000);
		
		
		js.executeScript("arguments[0].click();", aboutSelenium);
		
	}

}
