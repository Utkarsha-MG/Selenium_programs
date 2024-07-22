package selenium_pacakge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Grotechmind_uploadfile_assign3june {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		
		Thread.sleep(2000);
		
		WebElement f_name = driver.findElement(By.id("fname"));
		f_name.sendKeys("Utkarsha");
		
		WebElement l_name = driver.findElement(By.id("lname"));
		l_name.sendKeys("Meshram");
		
		WebElement email =driver.findElement(By.id("email"));
		email.sendKeys("utkarsha2811@gmail.com");
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("abcdef");
		
		WebElement gender = driver.findElement(By.id("Female"));
		gender.click();
		
		WebElement skills = driver.findElement(By.id("Skills"));
		Select s1 = new Select(skills);
		s1.selectByValue("select1");
		
		WebElement Tskills = driver.findElement(By.id("technicalskills"));
		Select s2 = new Select(Tskills);
		s2.selectByVisibleText("Selenium");
		
		WebElement country = driver.findElement(By.id("Country"));
		Select s3 = new Select(country);
		s3.selectByValue("India");
		
		WebElement P_add = driver.findElement(By.id("Present-Address"));
		P_add.sendKeys("Lohegaon pune");
		
		WebElement Permnt_add= driver.findElement(By.id("Permanent-Address"));
		Permnt_add.sendKeys("Loegaon nr airport pune 411047");
		
		WebElement Pincode = driver.findElement(By.id("Pincode"));
		Pincode.sendKeys("411047");
		
		WebElement religion = driver.findElement(By.id("Relegion"));
        Select s4 = new Select(religion);
        s4.selectByVisibleText("Hindu");
        
        WebElement relocate = driver.findElement(By.id("relocate"));
        relocate.click();
        
        WebElement up_file = driver.findElement(By.id("file"));
        up_file.sendKeys("C:\\Users\\Admin\\Downloads.pdf");
        
        WebElement submit = driver.findElement(By.name("Submit"));
        submit.clear();
        
        
        

		
		
		
		

		
		
		
		

		
		
		
		
	
	
	}
}
