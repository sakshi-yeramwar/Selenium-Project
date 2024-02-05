package day6;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataDrivenTesting {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/login");
		
		driver.manage().window().maximize();
	}
	
	@Test
	public void loginTest() throws EncryptedDocumentException, IOException {
		
		//locate Username element
		WebElement username = driver.findElement(By.id("username"));
		
		//locate password element
		WebElement password = driver.findElement(By.id("password"));
		
		//connecting the file with test script by creating an object of FileInputStream
		FileInputStream fls = new FileInputStream("C:\\Users\\HP\\Documents\\workspace-spring-tool-suite-4-4.21.0.RELEASE\\MySeleniumProject\\src\\main\\resources\\TestData.xlsx");
		
		//create a workbook
		Workbook book = WorkbookFactory.create(fls);
		
		//mention row and column for username
		String valueOfUsername = book.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
		//mention row and column of password
		String valueOfPassword = book.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		
		//sending value in username and password element
		username.sendKeys(valueOfUsername);
		password.sendKeys(valueOfPassword);
		
		book.close();
	}

}
