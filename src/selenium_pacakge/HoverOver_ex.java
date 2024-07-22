package selenium_pacakge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverLogLevel;
import org.openqa.selenium.interactions.Actions;

public class HoverOver_ex {

	public static void main(String[] args) {

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.co.in");
		driver.manage().window().maximize();
		WebElement accountnlist =driver.findElement(By.xpath("(//span[@class='nav-line-2 '])"));
		Actions a1= new Actions(driver);
		a1.moveToElement(accountnlist).perform();
		WebElement signin =driver.findElement(By.xpath("(//span[.='Sign in'])[1])"));
		a1.moveToElement(signin).perform();
		driver.close();
		
		
	}

}
