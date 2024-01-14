package DemoWebShop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC04_WishList {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("Testengg111@gmial.com");
		driver.findElement(By.id("Password")).sendKeys("Engg@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		driver.findElement(By.partialLinkText("Books")).click();
		
		WebElement product = driver.findElement(By.linkText("Fiction EX"));
		
		System.out.println(product.isDisplayed());

		product.click();
		
		WebElement wishListButton=driver.findElement(By.xpath("//input[@value='Add to wishlist']"));
	
		System.out.println(wishListButton.isDisplayed());
	}

}
