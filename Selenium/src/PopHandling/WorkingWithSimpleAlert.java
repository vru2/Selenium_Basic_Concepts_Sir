package PopHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithSimpleAlert {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		//To change the 
		Alert alt =driver.switchTo().alert();
		
		String message =alt.getText();
		System.out.println(message);
		
		alt.accept();
		
		//driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

	}

}
