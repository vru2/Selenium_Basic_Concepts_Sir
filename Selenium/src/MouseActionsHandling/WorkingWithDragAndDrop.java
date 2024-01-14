package MouseActionsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		WebElement src =driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement trg=driver.findElement(By.xpath("//p[text()='Drop here']"));
		Actions act= new Actions (driver);
		//act.dragAndDrop(src, trg).perform();
		//ex : 1
		act.clickAndHold(src).release(trg).perform();
		//ex : 2
		act.clickAndHold(src).moveToElement(trg).release().perform();
		
		
	}
}
