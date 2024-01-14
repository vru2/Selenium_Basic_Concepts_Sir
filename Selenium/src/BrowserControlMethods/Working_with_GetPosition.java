package BrowserControlMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_GetPosition {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/login");
		
		//To fetch the position
		Point position=driver.manage().window().getPosition();
		System.out.println(position);

		//To set the position of browser 
		driver.manage().window().setPosition(new Point(100,500));
		
		Thread.sleep(8000);
		driver.close();
	}
}
