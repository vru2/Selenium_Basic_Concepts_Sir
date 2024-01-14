package BrowserControlMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_Navigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		driver.get("https://login.live.com/");
		Thread.sleep(2000);
		// to navigate back
		driver.navigate().back();
		Thread.sleep(2000);
		// to navigate forward
		driver.navigate().forward();
		Thread.sleep(2000);
		// to refresh the webPage
		driver.navigate().refresh();
		
		
		
		// - flipkart
		// - cowin 
		// perform back
		// fetch title 								//flipkart title
		// perform forward
		// fetch title								// cowin title
		// perform back
		// fetch the size of browser				// browser size
		// fetch the position						// browser position
		// close
	}

}
