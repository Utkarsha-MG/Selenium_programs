package selenium_pacakge;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_presenttime_assign {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("India");
		driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
		TakesScreenshot a1= driver;
		File source= a1.getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		
		Date date1 = new Date();
		Date currentDate = new Date(date1.getTime());
		String dateInString = currentDate.toString();
		String dateWithUnderscore = dateInString.replace(":", "_");
		System.out.println(dateWithUnderscore);

		
		File destination = new File("c:\\Users\\Admin\\Desktop\\SS_File\\naju.png");
		
		System.out.println(driver.getClass());
		System.out.println(driver.toString());
	
	}
	

}
