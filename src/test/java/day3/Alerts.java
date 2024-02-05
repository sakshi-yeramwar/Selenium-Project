package day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("confirmButton")).click();
		
		Alert alert3 = driver.switchTo().alert();
		
		alert3.accept();
		
		driver.findElement(By.id("confirmButton")).click();
		
		Alert alertDismiss = driver.switchTo().alert();
		
		alertDismiss.dismiss();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement click4 = driver.findElement(By.id("promtButton"));
		
		js.executeScript("arguments[0].scrollIntoView()",click4);
		
		js.executeScript("document.getElementById('promtButton').click();");
		
		
		
	}

}
