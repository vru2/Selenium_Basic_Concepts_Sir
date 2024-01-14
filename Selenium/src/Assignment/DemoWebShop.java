package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoWebShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.partialLinkText("Jewelry")).click();
		
		WebElement dropdown=driver.findElement(By.id("products-orderby"));
		
		Select s = new Select (dropdown);
		s.selectByVisibleText("Price: Low to High");
		
		List<WebElement> allPrice=driver.findElements(By.xpath("//span[@class='price actual-price']"));
		
		for(WebElement price : allPrice)
		{
			System.out.println(price.getText());
		}
		driver.close();
	}

}
