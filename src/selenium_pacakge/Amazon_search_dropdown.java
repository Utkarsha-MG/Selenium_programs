package selenium_pacakge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_search_dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.co.in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement e1 = driver.findElement(By.id("searchDropdownBox"));
		Select s1 = new Select (e1);
		s1.selectByVisibleText("Baby");
		s1.selectByValue("search-alias=baby");
		s1.selectByIndex(9);
		

	}

}
