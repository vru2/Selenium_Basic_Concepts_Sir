package DropDownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_with_MultiSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		
		WebElement ttt=driver.findElement(By.id("multiselect1"));
		
		Select s = new Select(ttt);
		
		s.selectByVisibleText("Volvo");
		Thread.sleep(3000);
		s.selectByValue("audix");
		Thread.sleep(3000);
		
		List<WebElement> something=s.getAllSelectedOptions();
		
		for(WebElement any:something)
		{
			System.out.println(any.getText());
		}
		
		System.out.println(s.isMultiple());
		
		driver.close();

	}

}
