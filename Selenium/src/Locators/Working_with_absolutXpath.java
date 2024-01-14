package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_absolutXpath {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/raki9/OneDrive/Documents/SeleniumWeekendBatch2/RegistrationPage.html");
		
		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("Rakesh123");
		
		
		
	}

}
