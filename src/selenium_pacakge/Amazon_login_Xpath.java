package selenium_pacakge;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon_login_Xpath {

	public static void main(String[] args) {

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("shoes");
		search.sendKeys(Keys.ENTER);
	}

}
