package WebELementInterfaceMathods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_GetCssValue {

	public static void main(String[] args) throws InterruptedException {
		//Test Data
		String url="https://demo.actitime.com/login.do";
		String userName="admin132";
		String password="manager143";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.name("pwd")).sendKeys(password);
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(3000);
		WebElement errMessage=driver.findElement(By.className("errormsg"));
		//To fetch the error message
		System.out.println(errMessage.getText());
		//To fetch the color
		System.out.println(errMessage.getCssValue("color"));
		//To fetch the font
		System.out.println(errMessage.getCssValue("font"));
		//To fetch the location
		System.out.println(errMessage.getLocation());
		//To fetch the height and width 
		System.out.println(errMessage.getSize());
		
		Rectangle r = errMessage.getRect();
		System.out.println("Height : "+r.getHeight());
		System.out.println("Width : "+r.getWidth());
		System.out.println("x : "+r.getX());
		System.out.println("Y : "+r.getY());
		
		System.out.println(errMessage.getTagName());
		
		driver.close();

	}

}
