package selenium_pacakge;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_amazon_assignment_1 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver  = new ChromeDriver();
		driver.get("https://www.amazon.co.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		String title = driver.getTitle(); 
		driver.findElement(By.name("field-keywords")).sendKeys("Mobiles");
		driver.findElement(By.id("nav-search-submit-button")).click();
	}

}
