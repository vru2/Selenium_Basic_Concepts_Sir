package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_RelativeXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		//by Attribute
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		//by contains Attribute
		driver.findElement(By.xpath("//input[contains(@class,'pwd')]")).sendKeys("manager");
		//by visible textq
		//driver.findElement(By.xpath("//label[text()='Keep me logged in']")).click();
		//by contains visible Text
		driver.findElement(By.xpath("//label[contains(text(),'Keep')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='initial']")).click();
		
		

	}

}
