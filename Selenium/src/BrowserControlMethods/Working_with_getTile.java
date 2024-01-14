package BrowserControlMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_getTile {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		String flipkartTitle =driver.getTitle();
		
		
		System.out.println(flipkartTitle);
		driver.quit();
		
	}

}
