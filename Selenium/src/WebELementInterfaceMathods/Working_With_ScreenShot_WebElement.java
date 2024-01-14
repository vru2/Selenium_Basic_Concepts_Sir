package WebELementInterfaceMathods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Working_With_ScreenShot_WebElement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		WebElement mobiles = driver.findElement(By.xpath("//img[@alt='Mobiles & Tablets']"));
		
		File src=mobiles.getScreenshotAs(OutputType.FILE);
		File trg=new File("./Screenshot/123.png");
		FileHandler.copy(src, trg);
		
		driver.close();
		
		

	}

}
