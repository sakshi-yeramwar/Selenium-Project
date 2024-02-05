package day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutorClick {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//for scrolling
		WebElement mouseHover = driver.findElement(By.id("mousehover"));
		
		js.executeScript("arguments[0].scrollIntoView()", mouseHover);
		
		//for clicking
		js.executeScript("document.getElementById('opentab').click();");
		
		//for sending key
		js.executeScript("document.getElementById('autocomplete').value = 'India';");

	}

}
