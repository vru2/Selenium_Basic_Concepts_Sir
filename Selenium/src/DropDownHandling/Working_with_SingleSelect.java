package DropDownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_with_SingleSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		Thread.sleep(3000);
		
		WebElement singleSelect=driver.findElement(By.id("drop1"));
		
		Select s = new Select(singleSelect);
		//To select the option form drop down
		s.selectByIndex(3);
		Thread.sleep(3000);
		s.selectByValue("ghi");
		Thread.sleep(3000);
		s.selectByVisibleText("Older Newsletters");
		//To fetch all options
		
		List<WebElement> allopts=s.getOptions();
		
		for(WebElement opt:allopts)
		{
			System.out.println(opt.getText());
		}
		driver.close();
	}
}
