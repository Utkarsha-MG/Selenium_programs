package selenium_pacakge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Grotechminds_DropnDrag_assign {

	public static void main(String[] args) {

		ChromeDriver driver= new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.id("div2"));
		WebElement e2 = driver.findElement(By.id("container"));
		Actions a1= new Actions(driver);
		a1.dragAndDrop(e1, e2).perform();
		
	}

}
