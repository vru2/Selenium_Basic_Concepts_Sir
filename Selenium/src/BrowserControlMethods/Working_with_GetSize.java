package BrowserControlMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_GetSize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.live.com/");
		// to fetch the size of the browser.
//		Dimension size = driver.manage().window().getSize();
//		System.out.println(size);
		
		//to set the size of the browser
		driver.manage().window().setSize(new Dimension(500, 600));
		
		Thread.sleep(5000);
		driver.close();

	}

}
