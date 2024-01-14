package WebELementInterfaceMathods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_findElements1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		List<WebElement> allRadioButtons=driver.findElements(By.xpath("//li[@class='answer']/label"));
		
		
		for(WebElement radioButton : allRadioButtons)
		{
			radioButton.click();
			Thread.sleep(3000);
		}

	}

}
