package selenium_pacakge;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Noof_Links_amazonpage_31may {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.co.in");
		List<WebElement> links = driver.findElements(By.tagName("a")); // 'a' tagname doesn't have id in that page :eg:google .com page
		
		int count=  links.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			WebElement s1 = links.get(i);   //>returntype of get method is webelement and webelement has a method called as getAttribute.
			
			String link_text = s1.getText();

			String link = s1.getAttribute("href");      // all the links present under the "href".>>returntype of getAttribute is String.
			                                                  //getAttribute method present under the WebElement method and it is abstract method.
			System.out.println(link_text);

			System.out.println(link);			
		}
	}

}
