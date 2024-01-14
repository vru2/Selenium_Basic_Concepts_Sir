package MouseActionsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithMoveToElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement abc=driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(abc).perform();
		Thread.sleep(2000);
		WebElement order=driver.findElement(By.xpath("//span[text()='Your Orders']"));
		//Ex : 1
		//act.moveToElement(order).click().perform();
		//Ex : 2
		act.click(order).perform();
		
		
		

	}

}
