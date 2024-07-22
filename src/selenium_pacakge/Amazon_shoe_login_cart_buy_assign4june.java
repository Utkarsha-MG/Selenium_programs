package selenium_pacakge;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_shoe_login_cart_buy_assign4june {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.co.in");
		WebElement search= driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoes");
		search.sendKeys(Keys.ENTER);
		WebElement shoe= driver.findElement(By.xpath("(//div[@class='s-image-padding'])[1]"));
		shoe.click();

		Set<String> s1 = driver.getWindowHandles();
		   System.out.println(s1);
		   Iterator <String> pcid = s1.iterator();
		   String parentid= pcid.next();
		   String childid = pcid.next();
		   System.out.println(parentid);
		   System.out.println(childid);
		   driver.switchTo().window(childid);
		   
	 WebElement addtowish = driver.findElement(By.xpath("//a[@class='a-button-text a-text-left']"));
	 addtowish.click();
	 
	 WebElement email = driver.findElement(By.id("ap_email"));
	 email.sendKeys("srjgkwd25@gmail.com");
	 
	 WebElement cont = driver.findElement(By.id("continue"));
	 cont.click();
	 
	 WebElement pass = driver.findElement(By.name("password"));
	 pass.sendKeys("Amazon@1208");
	 
	 WebElement signin = driver.findElement(By.id("auth-signin-button"));
	 signin.click();
	 
	 
	 
	 
	}

}
