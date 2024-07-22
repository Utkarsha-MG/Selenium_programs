package selenium_pacakge;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selectors_ex{

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#APjFqb")).sendKeys("India");//1st way
		
	     driver.findElement(By.cssSelector(".gLFyf")).sendKeys("India"); // 2nd way
		
		driver.findElement(By.cssSelector("textarea#APjFqb")).sendKeys("india");// 3rd way
		
		// driver.findElement(By.className(""))---4th way is not working
		
		driver.findElement(By.cssSelector("[name='q']")).sendKeys("India");//5 th way css selector
		
		driver.findElement(By.cssSelector("textarea[name='q']")).sendKeys("India"); // 6th way css selector
		
		driver.findElement(By.cssSelector("textarea.gLFyf[name='q']")).sendKeys("India");// 7 the way TN.CN[AN='AV']
		
		driver.findElement(By.cssSelector("textarea[class^='gLF']")).sendKeys("India");// 8th way tagname[AN^='SUB string ofAV']
		
	}

}
