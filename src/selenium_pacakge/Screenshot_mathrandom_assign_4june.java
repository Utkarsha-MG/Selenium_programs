package selenium_pacakge;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_mathrandom_assign_4june {

	public static void main(String[] args) throws InterruptedException, IOException {

		ChromeDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("India");
		driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
		TakesScreenshot a1= driver;
		File source= a1.getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);

		File destination = new File("c:\\Users\\Admin\\Desktop\\SS_File\\naju"+ Math.random()+".png");
		FileHandler.copy(source, destination);

	}

}
