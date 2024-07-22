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
import org.openqa.selenium.support.ui.Select;

public class Assignment_179_grotech_regiform {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		driver.manage().window().maximize();
		 
		FileInputStream f1 = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Selenium_project_launch\\Data_Driven_1\\login_1.xlsx");
		
		Workbook wb  = WorkbookFactory.create(f1);
		
	    String fname  = wb.getSheet("Assign_179_grotech_regForm").getRow(1).getCell(0).getStringCellValue();
	    WebElement fn = driver.findElement(By.id("firstName"));
	    fn.sendKeys(fname);
	    System.out.println(fname);
	    
	    
	    String lname =wb.getSheet("Assign_179_grotech_regForm").getRow(1).getCell(1).getStringCellValue();
	    WebElement lm = driver.findElement(By.id("lastName"));
	    lm.sendKeys(lname);
	    System.out.println(lname);
	    
	    String email = wb.getSheet("Assign_179_grotech_regForm").getRow(1).getCell(2).getStringCellValue();
	    WebElement em = driver.findElement(By.id("email"));
	    em.sendKeys(email);
	    System.out.println(email);
	    
	     
	    String phone = NumberToTextConverter.toText(wb.getSheet("Assign_179_grotech_regForm").getRow(1).getCell(3).getNumericCellValue());
	    WebElement phone1 = driver.findElement(By.id("phone"));
	    phone1.sendKeys(phone);
	    
	    System.out.println(phone);
	    
	    String gender = wb.getSheet("Assign_179_grotech_regForm").getRow(1).getCell(4).getStringCellValue();
	    WebElement gr = driver.findElement(By.id("gender"));
	    gr.sendKeys(gender);
	    System.out.println(gender);
	    
	    String state = wb.getSheet("Assign_179_grotech_regForm").getRow(1).getCell(5).getStringCellValue();
	    WebElement mh = driver.findElement(By.id("state"));
	    Select s1 = new Select(mh);
	    s1.selectByValue("maharashtra");
	    System.out.println(state);
	    
	    String adhar = NumberToTextConverter.toText(wb.getSheet("Assign_179_grotech_regForm").getRow(1).getCell(6).getNumericCellValue());
	    WebElement ad = driver.findElement(By.id("aadhaar"));
	    ad.sendKeys(adhar);
	    System.out.println(adhar);
	    
	    String pan = wb.getSheet("Assign_179_grotech_regForm").getRow(1).getCell(7).getStringCellValue();
	    WebElement pn = driver.findElement(By.id("pan"));
	    pn.sendKeys(pan);
	    System.out.println(pan);
	    
	    
	    WebElement check = driver.findElement(By.id("terms"));
	    check.click();
	    
	    WebElement submit= driver.findElement(By.name("Submit"));
	    submit.click();
	    
	}

}
