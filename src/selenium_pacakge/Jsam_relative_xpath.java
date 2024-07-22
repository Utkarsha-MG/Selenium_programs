package selenium_pacakge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jsam_relative_xpath {

	public static void main(String[] args) {
    
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		
		WebElement un = driver.findElement(By.xpath("//input[@id='1']"));
		un.sendKeys("Utkarsha");
		WebElement hint = driver.findElement(By.xpath("//input[@id='2']"));
        hint.sendKeys("my name");
		WebElement pass = driver.findElement(By.xpath("//input[@id='3']"));
		pass.sendKeys("Utk@1234");
		WebElement fname = driver.findElement(By.xpath("//input[@name='fname']"));
		fname.sendKeys("UtkarshaG");
		WebElement boy = driver.findElement(By.xpath("//input[@id='123']"));
		boy.sendKeys("I have a boy");
		WebElement girl = driver.findElement(By.xpath("//input[@name='name2']"));
		girl.sendKeys("I have a girl");
		WebElement baby = driver.findElement(By.xpath("//input[@name='name3']"));
        baby.sendKeys("I have a baby");
		



		
	}

}
