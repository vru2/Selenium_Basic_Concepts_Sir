package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WindowPopUp {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.barbequenation.com/");
		Thread.sleep(2000);
		String mainId = driver.getWindowHandle();
		List<WebElement> allLinks = driver.findElements(By.xpath("//ul[contains(@class,'social-media')]/li/a"));
		for (WebElement link : allLinks) {
			link.click();
		}
		Set<String> allIds = driver.getWindowHandles();
		for (String id : allIds) {
			driver.switchTo().window(id);
			if (driver.getTitle().equals("Barbeque Nation | Facebook")) {
				break;
			}
		}
		driver.findElement(By.xpath("//div[@class='x92rtbv x10l6tqk x1tk7jg1 x1vjfegm']")).click();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File("./Screenshot/WindowPopUp.png");
		FileHandler.copy(src, trg);
	}
	}
