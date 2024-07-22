package Grotechminds_DragDrop_assign_8questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Eclipse_Que5_dragndrop {

	public static void main(String[] args) {
     
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		WebElement edrag = driver.findElement(By.id("drag4"));
		WebElement edrop = driver.findElement(By.id("div2"));
		Actions a1= new Actions(driver);
		a1.dragAndDrop(edrag, edrop).perform();
	}

}
