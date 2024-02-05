package day6;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGGroup {
	
	WebDriver driver;
	
	@BeforeTest(alwaysRun = true)
	public void Setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
	}
	
	@Test(groups = {"Smoke"})
	public void RadioButton() {
		
		List<WebElement> radio = driver.findElements(By.xpath("//input[@type = 'radio']"));
		
		for(WebElement r : radio){
			
			r.click();
		}
	}
	
	@Test(groups = {"regression"})
	public void scrolling() {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//for scrolling
		WebElement mouseHover = driver.findElement(By.id("mousehover"));
		
		js.executeScript("arguments[0].scrollIntoView()", mouseHover);
	}
	
	@Test(groups = {"regression"})
	public void Screenshot() throws IOException {
		
		driver.findElement(By.id("checkBoxOption1")).click();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File file1 = ts.getScreenshotAs(OutputType.FILE);
		
		File file2 = new File("C:\\Users\\HP\\OneDrive\\Pictures\\Screenshot\\image3.png");
		
		FileUtils.copyFile(file1, file2);
		
	}
	
	@Test(groups = {"Smoke"})
	public void sendValue() {
		
		driver.findElement(By.id("autocomplete")).sendKeys("India");
		
	}
	
	@AfterTest(alwaysRun = true)
	public void lastStep() {
		
		driver.close();
	}

}
