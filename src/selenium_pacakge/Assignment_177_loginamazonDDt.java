package selenium_pacakge;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_177_loginamazonDDt {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
    
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().minimize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	    FileInputStream f1 = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Selenium_project_launch\\Data_Driven_1\\login_1.xlsx");
	    
	    Workbook wb = WorkbookFactory.create(f1);
	    
	    String email = wb.getSheet("Asignment_177").getRow(1).getCell(0).getStringCellValue();

	    String password = wb.getSheet("Asignment_177").getRow(0).getCell(1).getStringCellValue();
	    
	    WebElement signin = driver.findElement(By.id("ap_email"));
	    signin.sendKeys(email);	
	    System.out.println("srjgkwd25@gmail.com");
	    
	    
	    WebElement continue_button = driver.findElement(By.id("continue"));
	    continue_button.click();
	    
	    
	    WebElement password1 = driver.findElement(By.id("ap_password"));
	    password1.sendKeys("password");
	    
	    WebElement signin_btn = driver.findElement(By.id("signInSubmit"));
	    
	    signin_btn.click();
	    

	    
	    

	}
}
