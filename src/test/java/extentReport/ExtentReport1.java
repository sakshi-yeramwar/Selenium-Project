package extentReport;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport1 {
	
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	
	@BeforeClass
	public void reportSetup() {
		
		//create object of extent reports class
		report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReport1.html");
		
		//start test using variable extent report class
		test = report.startTest("RahulShettyAutomation Report");
	}
	
	@BeforeMethod(alwaysRun = true)
	public void Setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		test.log(LogStatus.PASS, "Chrome Browser has opened successfully.");
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		test.log(LogStatus.PASS, "URL is Valid");
	}
	
	@Test
	public void RadioButton() {
		
		List<WebElement> radio = driver.findElements(By.xpath("//input[@type = 'radio']"));
		
		for(WebElement r : radio){
			
			r.click();
		}
		
		test.log(LogStatus.PASS, "Clicked on every radio button successfully.");
	}
	
	@Test
	public void scrolling() {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//for scrolling
		WebElement mouseHover = driver.findElement(By.id("mousehover"));
		
		js.executeScript("arguments[0].scrollIntoView()", mouseHover);
		
		test.log(LogStatus.PASS, "Mouse hovered successfully.");
	}
	
	@Test
	public void sendValue() {
		
		driver.findElement(By.id("autocomplete")).sendKeys("India");
		
		test.log(LogStatus.PASS, "Inida was entered successfully in the text box.");
		
	}
	
	@AfterMethod(alwaysRun = true)
	public void lastStep() {
		
		driver.close();
	}
	
	@AfterClass
	public void last() {
		
		report.endTest(test);
		
		report.flush();
	}
}
