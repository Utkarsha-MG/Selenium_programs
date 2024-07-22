package selenium_pacakge;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_first_program {

	public static void main(String[] args) {

		
		ChromeDriver driver  = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.name("q")).sendKeys("India");
		//driver.findElement(By.name("csi")).click();
		driver.findElement(By.name("btnK"));
		
	}

}
