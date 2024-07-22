package selenium_pacakge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Grotechminds_registration_popup_assign2 {

	public static void main(String[] args) {

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registeration-form/");
		WebElement first_n = driver.findElement(By.id("firstName"));
		first_n.sendKeys("Utkarsha");
		
		WebElement last_n = driver.findElement(By.id("lastName"));
		last_n.sendKeys("Meshram");
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("utkarsha2811@gmail.com");
		
		WebElement phone_n = driver.findElement(By.id("phone"));
		phone_n.sendKeys("8055748390");
		
		WebElement gender = driver.findElement(By.id("gender"));
		Select s1 = new Select(gender);
		s1.selectByValue("female");
		
		WebElement state = driver.findElement(By.id("state"));
		Select s2 = new Select(state);
		s2.selectByVisibleText("Maharashtra");
		
		WebElement adhar = driver.findElement(By.id("aadhaar"));
		adhar.sendKeys("123456789101");
		
		WebElement pan = driver.findElement(By.id("pan"));
		pan.sendKeys("URSRN7894M");
		
		WebElement checkbox = driver.findElement(By.id("terms"));
		checkbox.sendKeys("I agree to the Terms and Conditions (Required)");
		
		WebElement submit = driver.findElement(By.name("Submit"));
		submit.click();

		
		
		
		
		
		

		
		
		
		
		
	}

}
