package WebELementInterfaceMathods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement checkBox = driver.findElement(By.id("keepMeLoggedInCaptionContainer"));
		
		System.out.println(checkBox.getAttribute("title"));
		
		driver.close();

	}

}
