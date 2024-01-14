package BrowserControlMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_navigateto {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.navigate().to("https://demo.actitime.com/login.do");
		
		URL url=new URL("https://demo.actitime.com/login.do");
		driver.navigate().to(url);
		
		

	}

}
