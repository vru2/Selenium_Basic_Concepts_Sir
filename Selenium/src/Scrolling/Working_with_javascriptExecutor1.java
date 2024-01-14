package Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_javascriptExecutor1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		
		WebElement disabledTF=driver.findElement(By.id("tb2"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(false);",disabledTF);
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,200);");
		Thread.sleep(3000);
		
		js.executeScript("arguments[0].value='selenium';", disabledTF);
		
		
		
	}

}
