package WorkingWithSmartWaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingWithExplicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Rakesh";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.instagram.com/");
		// Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
		driver.findElement(By.name("username")).sendKeys("hiiiiii");
		wait.until(ExpectedConditions.attributeToBe(By.name("username"), "value", name));
		System.out.println("pass");
		driver.findElement(By.name("password")).sendKeys("Rakesh@!@#");

		FluentWait wait1=new FluentWait(driver);
		wait1.withTimeout(Duration.ofSeconds(10));
		wait1.pollingEvery(Duration.ofSeconds(1));
		wait1.ignoring(NoSuchElementException.class);
		wait1.until(ExpectedConditions.alertIsPresent());
	}

}
