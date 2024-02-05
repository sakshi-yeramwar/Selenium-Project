package Day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleElements {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(null);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> radio = driver.findElements(By.xpath("//input[@type = 'radio']"));
		
		for(WebElement r : radio){
			
			r.click();
		}

	}

}
