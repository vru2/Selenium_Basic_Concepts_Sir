package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_Dynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Apparel & Shoes')]")).click();
		String price=driver.findElement(By.xpath("//a[text()='Blue Jeans']/../..//span")).getText();

		System.out.println(price);
	}

}
