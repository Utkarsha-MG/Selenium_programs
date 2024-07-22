package selenium_pacakge;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enable_displayed {

	public static void main(String[] args) throws InterruptedException {
    ChromeDriver driver = new ChromeDriver();
    driver.get("https://www.google.com");
    driver.manage().window().maximize();
    driver.findElement(By.id("APjFqb")).sendKeys("India");
    Thread.sleep(2000);
    List<WebElement> first_auto = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
    int count = first_auto.size();
    System.out.println(count);
    first_auto.get(4).click();
    			
	}

}
