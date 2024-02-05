package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParalleTesting {
	
	WebDriver driver;
	
	@Test
	public void ChromeTest() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("autocomplete")).sendKeys("India");
		List<WebElement> radio = driver.findElements(By.xpath("//input[@type = 'radio']"));
		for(WebElement r : radio){
			r.click();
		}
		
	}
	
	@Test
	public void FirefoxTest() {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("autocomplete")).sendKeys("India");
		List<WebElement> radio = driver.findElements(By.xpath("//input[@type = 'radio']"));
		for(WebElement r : radio){
			r.click();
		}
	}

}
