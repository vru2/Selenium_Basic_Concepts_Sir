package WebELementInterfaceMathods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_isDisplayed {

	public static void main(String[] args) throws InterruptedException {
		// Test Data
		String url = "https://demo.actitime.com/login.do";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		WebElement checkBox =driver.findElement(By.id("keepLoggedInCheckBox"));
		
		System.out.println("Displayed : "+checkBox.isDisplayed());
		System.out.println("Enabled : "+checkBox.isEnabled());
		System.out.println("Selected : "+checkBox.isSelected());
		Thread.sleep(2000);
		checkBox.click();
		System.out.println("Selected : "+checkBox.isSelected());
		driver.close();
	}

}
