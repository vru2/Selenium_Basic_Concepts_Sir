package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment01 {

	public static void main(String[] args) throws InterruptedException {
		//New changes from lead
		//Changes from lead for 2 time
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		WebElement wb=driver.findElement(By.xpath("//div[text()='Login ']"));
		
		driver.findElement(By.xpath(""));
	//	Thread.sleep(3000);
		//driver.findElement(By.xpath("//div[@class='menuTable']/div[2]")).click();
//		driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_settings ']")).click();
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
		

	}

}
