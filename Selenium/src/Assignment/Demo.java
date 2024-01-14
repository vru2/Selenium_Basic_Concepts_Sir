package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		
//		String expTitle = "Demo Web Shop. Register";
//		System.out.println(expTitle);
//		System.out.println(driver.getTitle());
//		
//		
//		if(expTitle.equals(driver.getTitle()))
//		{
//			System.out.println("Pass");
//		}
//		else
//			System.out.println("Fail");
//		
	//	driver.close();
		driver.findElement(By.cssSelector(".forcheckbox")).click();
		driver.findElement(By.cssSelector("#FirstName")).sendKeys("Rakesh");
		
		
	}

}
