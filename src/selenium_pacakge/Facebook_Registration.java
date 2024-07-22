package selenium_pacakge;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Registration {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
//FirefoxDriver driver = new FirefoxDriver();
driver.manage().window().maximize();
driver.navigate().to("https://www.facebook.com/");
WebElement  bt = driver.findElement(By.linkText("Create new account"));
bt.click();
Thread.sleep(2000);
WebElement f_name = driver.findElement(By.name("firstname"));
		f_name.sendKeys("Utkarsha");
		
		WebElement L_name = driver.findElement(By.name("lastname"));
		L_name.sendKeys("Meshram");
		
		WebElement email =driver.findElement(By.name("reg_email__"));
		email.sendKeys("utkarsha2811@gmail.com");
		
		//WebElement gen = driver.findElement(By.name("sex"));
		//gen.sendKeys("female");
		
		WebElement sign_b = driver.findElement(By.name("websubmit"));
		sign_b.click();

		WebElement day = driver.findElement(By.id("day"));
		Select s1 = new Select(day);
		s1.selectByValue("28");
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.id("month"));
		Select s2 = new Select(month);
		s2.selectByValue("11");
		
		Thread.sleep(2000);

		WebElement year=driver.findElement(By.id("year"));
		Select s3 = new Select(year);
	    s3.selectByVisibleText("1991");
        
        
		
	 
	}


}