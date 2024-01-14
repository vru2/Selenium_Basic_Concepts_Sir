package PopHandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithWindow1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		//System.out.println("main page : "+driver.getWindowHandle());
		driver.findElement(By.linkText("Facebook")).click();
		driver.findElement(By.linkText("Twitter")).click();
		driver.findElement(By.linkText("Google+")).click();
		
		//To get the session id Main page
		String mainId=driver.getWindowHandle();
		//To get the session id of all Tabs
		Set<String> allIds=driver.getWindowHandles();
		System.out.println(allIds);
		for(String id : allIds)
		{
			//To change the driver focus to all tabs
			driver.switchTo().window(id);
			//To fetch the title of all tabs
			System.out.println(driver.getTitle());
			if(!(driver.getTitle().equals("NopCommerce | Facebook")))
			{
				driver.close();
			}
			//To close all the tabs one by one
			
		}
	}
}