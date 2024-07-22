package selenium_pacakge;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart_addtocart_assign {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.amazon.co.in");
		driver.get("https://www.flipkart.com/");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("shoes");
		search.sendKeys(Keys.ENTER);
		
		WebElement shoe = driver.findElement(By.xpath("(//div[@class='wvIX4U'])[1]"));
		shoe.click();
		Thread.sleep(2000);
		WebElement addtocart = driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ _3Yl67G _7Pd1Fp']"));
		addtocart.click();

}
}
