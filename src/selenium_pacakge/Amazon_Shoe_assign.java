package selenium_pacakge;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Shoe_assign {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.co.in");
		
		WebElement search= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("shoe");
		
		Thread.sleep(2000);
		List<WebElement> shoes = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		
		shoes.get(5).click();
				
	}

}
