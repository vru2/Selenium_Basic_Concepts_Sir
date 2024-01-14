package Assignment;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomerCreation {

	public static void main(String[] args) throws InterruptedException {
		// Test data
		String url="https://demo.actitime.com/login.do";
		String userName="admin";
		String password="manager";
		String discription="qspider";
		
		Random r=new Random();
		String customerName="Rakesh"+r.nextInt(1000);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.name("pwd")).sendKeys(password);
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		driver.findElement(By.xpath("//div[text()='+ New Customer']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys(customerName);
		
		driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys(discription);
		
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		Thread.sleep(3000);
		String actualCustomerName=driver.findElement(By.xpath("//div[@class='titleEditButtonContainer']/div[1]")).getText();
		System.out.println(actualCustomerName);
		driver.close();
		

	}

}
