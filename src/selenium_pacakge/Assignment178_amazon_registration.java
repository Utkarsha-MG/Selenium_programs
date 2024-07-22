package selenium_pacakge;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment178_amazon_registration {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
       
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&prevRID=NK9K7C2Z7JVS3FHVV572&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		
		
		FileInputStream f1=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Selenium_project_launch\\Data_Driven_1\\login_1.xlsx");
		
		Workbook wb=WorkbookFactory.create(f1);
		String un=wb.getSheet("Assign_178-amazon registration").getRow(1).getCell(0).getStringCellValue();
		System.out.println(un);
		WebElement name = driver.findElement(By.id("ap_customer_name"));
	    name.sendKeys(un);

          Thread.sleep(2000);
	    
	    String mbn = NumberToTextConverter.toText(wb.getSheet("Assign_178-amazon registration").getRow(1).getCell(1).getNumericCellValue());
	    WebElement phoneno = driver.findElement(By.id("ap_phone_number"));
	    phoneno.sendKeys(mbn);
	    System.out.println(mbn);
	    
	    
	    String pass= wb.getSheet("Assign_178-amazon registration").getRow(1).getCell(2).getStringCellValue();
	    WebElement passw = driver.findElement(By.id("ap_password"));
	    passw.sendKeys(pass);
	    System.out.println(pass);
	    

	}

}
