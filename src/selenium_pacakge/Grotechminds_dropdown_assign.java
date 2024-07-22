package selenium_pacakge;

import org.bouncycastle.util.Selector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Grotechminds_dropdown_assign {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/dropdown/");
		driver.manage().window().maximize();
		
		WebElement e1 = driver.findElement(By.id("Choice1"));
		Select s1 = new Select(e1);
		s1.selectByVisibleText("Demo2");
		
		WebElement e2 = driver.findElement(By.id("Choice2"));
		Select s2 = new Select(e2);
		s2.selectByValue("practice15");
		
		WebElement e3 = driver.findElement(By.id("Choice3"));
		Select s3 = new Select(e3);
		s3.selectByIndex(9);

		WebElement e4 = driver.findElement(By.name("Choice4"));
		Select s4 = new Select(e4);
		s4.selectByVisibleText("Energy10");
		s4.selectByVisibleText("Energy15");
		
		WebElement e5 = driver.findElement(By.name("Choice5"));
		Select s5 = new Select(e5);
		s5.selectByVisibleText("Day9");
		s5.selectByVisibleText("Day14");
		
		WebElement e6 = driver.findElement(By.name("Choice6"));
		Select s6 = new Select(e6);
		s6.selectByVisibleText("Night8");
		s6.selectByVisibleText("Night13");
		
		WebElement e7 = driver.findElement(By.name("Choice7"));
		Select s7 = new Select(e7);
		s7.selectByVisibleText("Night7");
		s7.selectByVisibleText("Night12");
		
		/*WebElement e7a = driver.findElement(By.id("Choice7"));
	   Select s7a = new Select(e7a);
	   s7a.selectByVisibleText("Selenium6");
	   s7a.selectByVisibleText("Selenium11");*/
		
		WebElement e8 = driver.findElement(By.name("Choice8"));
		Select s8 = new Select(e8);
		s8.selectByVisibleText("QTP5");
		s8.selectByVisibleText("QTP10");
		
		WebElement e9 = driver.findElement(By.name("Choice9"));
		Select s9 = new Select(e9);
		s9.selectByVisibleText("SQL4");
		s9.selectByVisibleText("SQL9");
		
		WebElement e10 = driver.findElement(By.name("Choice10"));
		Select s10 = new Select(e10);
		s10.selectByVisibleText("CoreJava3");
		s10.selectByVisibleText("CoreJava8");
		
		WebElement e11 = driver.findElement(By.name("Choice11"));
		Select s11 = new Select(e11);
		s11.selectByVisibleText("CoreJava2");
		s11.selectByVisibleText("CoreJava7");

		
		



		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
