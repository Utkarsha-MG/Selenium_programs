package selenium_pacakge;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class flipkart_hoverover_assign {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement fashion = driver.findElement(By.xpath("(//div[@class='_2GaeWJ'])[3]"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(fashion).perform();

		WebElement menstopwear = driver.findElement(By.xpath("//a[@class='_1BJVlg _11MZbx']"));
		a1.moveToElement(menstopwear).perform();
		WebElement tshirt = driver.findElement(By.linkText("Men's T-Shirts"));
		tshirt.click();

	}

}
