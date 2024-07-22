package selenium_pacakge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pharmacy_apollo_assign {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.medplusmart.com/");
	    WebElement search= driver.findElement(By.xpath("//input[@class='rbt-input-main form-control rbt-input w-100']"));
	    search.sendKeys("crocin");
	}

}
