package Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_Actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/");
		
		
		Actions act = new Actions(driver);
//		//To scroll down
//		act.scrollByAmount(0, 500).perform();
//		//To scroll up
//		act.scrollByAmount(0, -500).perform();
		
		WebElement news = driver.findElement(By.xpath("//h2[text()='News']"));
		
		try {
			act.scrollToElement(news).perform();
		} catch (Exception e) {
			
		}
		
		

	}

}
