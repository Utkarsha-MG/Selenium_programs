package selenium_pacakge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.firefox.FirefoxDriver;

public class JSAM_absolute_xpath {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		
		WebElement un = driver.findElement(By.xpath("(/html/body/input)[1]"));
		un.sendKeys("Utkarsha");
		WebElement hint = driver.findElement(By.xpath("(/html/body/input)[2]"));    
		hint.sendKeys("my name");
		WebElement pass = driver.findElement(By.xpath("(/html/body/input)[3]"));
		pass.sendKeys("Rabhya@2020");
		WebElement f_name = driver.findElement(By.xpath("(/html/body/form/input)[1]"));
		f_name.sendKeys("UtkarshaM");
		//WebElement l_name = driver.findElement(By.xpath("(/html/body/form/input)[2]")); Lastname
       //l_name.sendKeys("Gaikwad");
  
		WebElement boy = driver.findElement(By.xpath("(/html/body/form/input)[4]"));
		boy.sendKeys("I have a Boy");
		WebElement girl  = driver.findElement(By.xpath("(/html/body/form/input)[5]"));
		girl.sendKeys("I have a Girl");
		WebElement baby  = driver.findElement(By.xpath("(/html/body/form/input)[6]"));
		baby.sendKeys("I have a baby");
		//WebElement submit2  = driver.findElement(By.xpath("(/html/body/form/input)[7]"));
		//submit2.sendKeys("submit btn");
		//WebElement fe_radio  = driver.findElement(By.xpath("(/html/body/form/input)[2]")); //Radiobutton
		//fe_radio.sendKeys("radio btn female");



		


		
}
}
