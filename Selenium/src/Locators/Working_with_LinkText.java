package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_LinkText {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
//		driver.findElement(By.linkText("Forgot your password?")).click();
//		
//		String message=driver.findElement(By.id("headerContainer")).getText();
//		System.out.println(message);
	//	Thread.sleep(2000);
		//driver.findElement(By.linkText("Keep me logged in")).click();
		driver.findElement(By.id("keepLoggedInLabel")).click();
		
		
	}

}
