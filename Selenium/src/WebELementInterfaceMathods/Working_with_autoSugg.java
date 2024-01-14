package WebELementInterfaceMathods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_autoSugg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/webhp");
		
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		
		Thread.sleep(3000);
		List<WebElement> allsug=driver.findElements(By.xpath("//div[@class='erkvQe']//li"));
		
		for(WebElement sug : allsug)
		{
			System.out.println(sug.getText());
			if(sug.getText().equals("selenium dev"))
			{
				sug.click();
				break;
			}
		}
		driver.close();
	}
}