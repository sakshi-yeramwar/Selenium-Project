package evaluation;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataDriven {
	
	WebDriver driver;

	@BeforeTest
	public void setup() {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/login");
		
		driver.manage().window().maximize();
	}
	
	@Test
	public void login() throws IOException {
		
		WebElement Username = driver.findElement(By.id("username"));
		
		WebElement password = driver.findElement(By.id("password"));
		
		FileInputStream fls = new FileInputStream("C:\\Users\\HP\\Documents\\workspace-spring-tool-suite-4-4.21.0.RELEASE\\MySeleniumProject\\src\\main\\resources\\TestData.xlsx");
		
		Workbook book = WorkbookFactory.create(fls);
		
		String valueUsername = book.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
		String valuePassword = book.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		
		Username.sendKeys(valueUsername);
		password.sendKeys(valuePassword);
		
		
	}
}
