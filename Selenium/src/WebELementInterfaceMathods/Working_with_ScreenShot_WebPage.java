package WebELementInterfaceMathods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Working_with_ScreenShot_WebPage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		//To take screen shot
		File src=ts.getScreenshotAs(OutputType.FILE);
		//target folder
		File trg=new File("./Screenshot/backup.png");
		//to copy from src to trg
		FileHandler.copy(src, trg);

		driver.close();
		
	}
}
