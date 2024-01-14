package WorkingWithSmartWaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithImpilcitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.instagram.com/");
		//Thread.sleep(3000);
		driver.findElement(By.name("qwertyu")).sendKeys("Rakesh");
		driver.findElement(By.name("password")).sendKeys("Rakesh@!@#");
		

	}

}
