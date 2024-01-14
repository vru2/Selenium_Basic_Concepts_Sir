package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_name {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Test data
		String expLoginPageTitle="actiTIME - Login";
		String expHomePageTitle="actiTIME - Enter Time-Track";
		
		//To launch the browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		//validation
		if(expLoginPageTitle.equals(driver.getTitle()))
		{
			System.out.println("Navigated to actitime sucessfully");
		}
		else
			System.out.println("Navigation Failed");
		//To perform Login
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		
		//Validation
		if (expHomePageTitle.equals(driver.getTitle())) {
			System.out.println("Login Sucessfull");
		}
		else
			System.out.println("Invalid UN and PWD");
		
		//To perform logout
		driver.findElement(By.id("logoutLink")).click();
		
		//To close the browser
		driver.close();
	}

}
