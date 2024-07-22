package selenium_pacakge;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart_Parent_to_cild_tab
{

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("shoes");
		search.sendKeys(Keys.ENTER);
		
		WebElement shoe = driver.findElement(By.xpath("(//div[@class='wvIX4U'])[1]"));
		shoe.click();
		Set<String> s1= driver.getWindowHandles();
		System.out.println(s1);
		Iterator<String> pcid = s1.iterator(); //returntype of iterator is string
		String parentid = pcid.next();
		String childid = pcid.next();
		System.out.println(parentid);
		System.out.println(childid);
		driver.switchTo().window(parentid);
		driver.close();

 
}
}
