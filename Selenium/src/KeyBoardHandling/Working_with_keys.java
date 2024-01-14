package KeyBoardHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_keys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		WebElement userNameTF=driver.findElement(By.id("user-name"));
		
		userNameTF.sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.TAB,Keys.ENTER);

	}

}
