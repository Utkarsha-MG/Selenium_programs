package selenium_pacakge;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_180_back_forword_refresh {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.findElement(By.name("q")).sendKeys("India");
		driver.navigate().refresh();
	}

}
