package selenium_pacakge;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_login {

	public static void main(String[] args) {

		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("utkarsha2811@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("abcds");
		driver.findElement(By.name("login")).click();
		
	}

}
