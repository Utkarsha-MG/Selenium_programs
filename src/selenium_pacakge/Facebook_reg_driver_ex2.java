package selenium_pacakge;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_reg_driver_ex2 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Utkarsha");
		driver.findElement(By.name("lastname")).sendKeys("Meshram");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8055478390");
        driver.findElement(By.name("websubmit")).click();
		
	}

}
