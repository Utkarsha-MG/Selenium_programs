package selenium_pacakge;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_classex_4june {

	public static void main(String[] args) throws IOException, InterruptedException {

		ChromeDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		//String title = driver.getTitle();
		//System.out.println(title);
		driver.findElement(By.name("q")).sendKeys("India");
		//driver.findElement(By.name("csi")).click();
		driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
		TakesScreenshot a1= driver;
		File source= a1.getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);

		File destination = new File("c:\\Users\\Admin\\Desktop\\SS_File\\naju.png");
		FileHandler.copy(source, destination);//  java.io.FileNotFoundException
	
	}

}

