package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.className("_30XB9F")).click();
		
		driver.findElement(By.name("q")).sendKeys("iphones",Keys.ENTER);
		
		List<WebElement>allNames=driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone')]"));
		
		for(WebElement name :allNames )
		{
			String name1 = name.getText();
			String price =driver.findElement(By.xpath("//div[text()='"+name1+"']/../../div[2]/div[1]/div[1]/div[1]")).getText();
			price = price.replace('?', '$');
			System.out.println(name1+"----"+price);
		}	
	}
}
