package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_Class {
	
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	
	driver.findElement(By.className("textField")).sendKeys("admin");
	driver.findElement(By.className("pwdfield")).sendKeys("manager");
	driver.findElement(By.className("initial")).click();
	
}

}
