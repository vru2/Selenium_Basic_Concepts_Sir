package WebELementInterfaceMathods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Submit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/webhp");
		
		
		WebElement searchTextFeild=driver.findElement(By.id("APjFqb"));
		searchTextFeild.sendKeys("virat");
		searchTextFeild.submit();

		String actualPrice="130.00";
		String expPrice="130.00";
		
		if(actualPrice.equals(expPrice))
		{
			System.out.println("Test Case is pass");
		}
		else
			System.out.println("Test Case is Fail");
		
		}
		
		
	}
