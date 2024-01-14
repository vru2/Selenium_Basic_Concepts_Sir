package MouseActionsHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingWithDragandDropBy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.className("_30XB9F")).click();
		driver.findElement(By.name("q")).sendKeys("iphones",Keys.ENTER);
		WebElement point1=driver.findElement(By.xpath("(//div[@class='_3FdLqY'])[1]"));
		Actions act=new Actions(driver);
		act.dragAndDropBy(point1, 50, 0).perform();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));	
wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='Clear all']"))));
		WebElement point2=driver.findElement(By.xpath("(//div[@class='_3FdLqY'])[2]"));
		act.dragAndDropBy(point2, -50, 0).perform();
	 
	}
}
