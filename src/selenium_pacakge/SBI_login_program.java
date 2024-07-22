package selenium_pacakge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SBI_login_program {

	public static void main(String[] args) {

		ChromeDriver driver= new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		
		WebElement loginbtn = driver.findElement(By.className("login_button"));
		loginbtn.click();
		
		WebElement un = driver.findElement(By.name("userName"));
		un.sendKeys("utkarsha");
		
		WebElement pass = driver.findElement(By.id("label2"));
		pass.sendKeys("rabhya");
		
		WebElement captcha = driver.findElement(By.name("loginCaptchaValue"));
		captcha.sendKeys("abcdedf");;
	}

}
