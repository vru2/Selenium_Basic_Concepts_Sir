package PopHandling;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCalenderPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://jqueryui.com/datepicker/");
//		driver.switchTo().frame(0);
//		driver.findElement(By.id("datepicker")).click();
//		
//		driver.findElement(By.xpath("//a[contains(@class,'ui-state-highlight')]")).click();

		Calendar cal = Calendar.getInstance();
		//To change the month
		cal.add(Calendar.MONTH ,1);
		//To change the year
		cal.add(Calendar.YEAR, -1);
		//To change the date
		cal.add(Calendar.DAY_OF_MONTH, 1);
		Date date = cal.getTime();
		SimpleDateFormat sdf= new SimpleDateFormat("MM/dd/YYYY");
		String modDate=sdf.format(date);
		System.out.println(modDate);
		
		//driver.findElement(By.id("datepicker")).sendKeys(modDate,Keys.ESCAPE);
		
	}

}
