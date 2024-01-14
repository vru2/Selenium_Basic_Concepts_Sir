package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ViaAssignment {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.via.com/");
		driver.findElement(By.xpath("//button[text()='No thanks!']")).click();
		driver.findElement(By.xpath("//span[text()='Cruise ']")).click();
		WebElement e=driver.findElement(By.id("hotelsCheckIn"));
		
		Select s = new Select (e);
		s.selectByVisibleText("Singapore");
		
	}

}
