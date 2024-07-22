package selenium_pacakge;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukari_assign_3june {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		WebElement register = driver.findElement(By.id("register_Layer"));
		register.click();
		
		WebElement google=driver.findElement(By.name("google-register"));
		google.click();
        
	   Set<String> s1 = driver.getWindowHandles();
	   System.out.println(s1);
	   Iterator <String> pcid = s1.iterator();
	   String parentid= pcid.next();
	   String childid = pcid.next();
	   System.out.println(parentid);
	   System.out.println(childid);
	   driver.switchTo().window(childid);
	   WebElement gmail = driver.findElement(By.id("identifierId"));
	   gmail.sendKeys("utkarsha2811@gmail.com");
	   
	   
	  

}
}