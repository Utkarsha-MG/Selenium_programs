package Grotechminds_DragDrop_assign_8questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jenkins_Que6_dragdrop {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		WebElement jdrag = driver.findElement(By.id("drag3"));
		WebElement jdrop = driver.findElement(By.id("div2"));
		Actions a1= new Actions(driver);
		a1.dragAndDrop(jdrag, jdrop).perform();
	}

}
