package selenium_pacakge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_doubleclick_practice {

	public static void main(String[] args) {

		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.co.in");;
		driver.manage().window().maximize();
		//WebElement dd = driver.findElement(By.linkText(""))
	}

}
