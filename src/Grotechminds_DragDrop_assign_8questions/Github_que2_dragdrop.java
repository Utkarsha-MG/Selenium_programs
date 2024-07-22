package Grotechminds_DragDrop_assign_8questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Github_que2_dragdrop {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		WebElement gdrag = driver.findElement(By.id("drag5"));
		WebElement gdrop = driver.findElement(By.id("div2"));
		Actions a1 = new Actions(driver);
		a1.dragAndDrop(gdrag, gdrop).perform();
		
		// Drop and Drag back to place
		
		WebElement gdrop1 = driver.findElement(By.id("div2"));
		WebElement gdrag1 = driver.findElement(By.id("container"));
		Actions a2 = new Actions(driver);
		a2.dragAndDrop(gdrop1, gdrag1).perform();
		
	}

}
