package LearningTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkingWithDataProvider {

	@Test(dataProvider = "provider")
	public void testCase(String email, String password) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@DataProvider(name = "provider")
	public Object dataSupply() {
		Object[][] arr = new Object[3][2];
		arr[0][0] = "admin@gmail.com";
		arr[0][1] = "password";
		arr[1][0] = "admin1@gmail.com";
		arr[1][1] = "Password1";
		arr[2][0] = "admin2@gmail.com";
		arr[2][1] = "password2";
		return arr;
	}

}
