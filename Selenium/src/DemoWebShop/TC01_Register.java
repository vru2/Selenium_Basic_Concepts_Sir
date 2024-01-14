package DemoWebShop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC01_Register {
	
	public static void main(String[] args) {
		
		//UserName = Testengg111@gmial.com
		//password = Engg@123
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.partialLinkText("Regis")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.name("FirstName")).sendKeys("Test");
		driver.findElement(By.name("LastName")).sendKeys("engg");
		driver.findElement(By.name("Email")).sendKeys("Testengg111@gmial.com");
		driver.findElement(By.name("Password")).sendKeys("Engg@123");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("Engg@123");
		driver.findElement(By.name("register-button")).click();
		String expText=driver.findElement(By.xpath("//div[@class='result']")).getText();
		
		if(expText.equals("Your registration completed"))
		{
			System.out.println("Register Test Case Pass");
		}
		else
			System.out.println("Register Test Case Fail");
		
		driver.close();
		
	}
}