package day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.ebay.com/ ");
		
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		
		WebElement electronics = driver.findElement(By.xpath("(//a[@_sp='p4375194.m1379.l3250'])[1]"));
		
		action.moveToElement(electronics).build().perform();
		
		WebElement motor = driver.findElement(By.xpath("(//a[@_sp='p4375194.m1380.l3250'])[1]"));
		
		action.moveToElement(motor).build().perform();	
		
		
	}

}
