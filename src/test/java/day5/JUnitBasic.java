package day5;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JUnitBasic {
	
	WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();	
	}
	
	@Test
	public void testcase() {
		driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[1]")).click();
	}
	
	@Test
	public void clickRadioButton() {
		List<WebElement> radio = driver.findElements(By.xpath("//input[@type = 'radio']"));
		for(WebElement r : radio){
			r.click();
		}
	}
	
	@Test
	public void selectCountry() {
		driver.findElement(By.id("autocomplete")).sendKeys("India");
	}
	
	@Test
	public void mouseHover() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement mouseHover = driver.findElement(By.id("mousehover"));
		js.executeScript("arguments[0].scrollIntoView()", mouseHover);
	}
	
	@Test
	public void screenshot() throws IOException {
		driver.findElement(By.id("checkBoxOption1")).click();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File file1 = ts.getScreenshotAs(OutputType.FILE);
		File file2 = new File("C:\\Users\\HP\\OneDrive\\Pictures\\Screenshot\\image2.png");
		FileUtils.copyFile(file1, file2);
	}
	
	@Test
	public void dropdown() {
		WebElement Dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select sel = new Select(Dropdown);
		sel.selectByIndex(0);
		sel.selectByIndex(1);
		sel.selectByIndex(2);
	}
	
	@After
	public void lastStep() {
		driver.close();
	}
}
