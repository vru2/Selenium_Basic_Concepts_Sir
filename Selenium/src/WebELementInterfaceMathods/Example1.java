package WebELementInterfaceMathods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement userNameTF = driver.findElement(By.xpath("//input[@name='username']"));
		userNameTF.sendKeys("admin");
		Thread.sleep(3000);
		//to clear the value present in WebElement
		//userNameTF.clear();
		//to fetch the role of the WebElement
		String role=userNameTF.getAriaRole();
		System.out.println(role);
		
		System.out.println(driver.findElement(By.xpath("//a[text()='Forgot your password?']")).getAriaRole());
		

	}

}
