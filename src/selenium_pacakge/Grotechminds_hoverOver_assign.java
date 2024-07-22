package selenium_pacakge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Grotechminds_hoverOver_assign {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/hoverover/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//WebElement d1 = driver.findElement(By.xpath("((//div[@class='popup4'])[1]"));
		WebElement d1 = driver.findElement(By.xpath("(//div[@class='popup4'])[1]"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(d1).perform();
		d1.click();
		
		Thread.sleep(2000);
		WebElement d4 = driver.findElement(By.xpath("(//div[@class='popup6'])[1]"));
		a1.moveToElement(d4).perform();
		d4.click();
		
		Thread.sleep(2000);
		WebElement d5 =driver.findElement(By.xpath("(//div[@class='popup7'])[1]"));
		a1.moveToElement(d5).perform();
		d5.click();
		
		Thread.sleep(2000);
		WebElement d2 =driver.findElement(By.xpath("(//div[@class='popup4'])[1]"));
		a1.moveToElement(d2).perform();
		d2.click();
		
		Thread.sleep(2000);
		WebElement d6 = driver.findElement(By.xpath("(//div[@class='popup8'])[1]"));
		a1.moveToElement(d6).perform();
		d6.click();
		
		Thread.sleep(2000);
		WebElement d7 =driver.findElement(By.xpath("(//div[@class='popup9'])[1]")); 
		a1.moveToElement(d7).perform();
		d7.click();
	}

}
