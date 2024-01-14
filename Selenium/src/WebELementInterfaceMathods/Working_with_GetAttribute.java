package WebELementInterfaceMathods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_GetAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Test Data
		String url="https://sso.godaddy.com/";
		String user="Rakesh";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		WebElement userNameTF = driver.findElement(By.id("username"));
		userNameTF.sendKeys(user);
			
		if(userNameTF.getAttribute("value").equals(user))
		{
			System.out.println("User Name Text field is accepting the data");
		}
		else
			System.out.println("User Name Text field is not accepting the data");
		
		
		driver.close();
	}
}