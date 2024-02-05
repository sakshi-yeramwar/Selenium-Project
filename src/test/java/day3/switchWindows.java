package day3;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchWindows {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.automationtesting.in/Windows.html");

		driver.findElement(By.xpath("//a[@href='http://www.selenium.dev']")).click();
		
		String child = "https://www.selenium.dev/";
		
		//parent window handle
		driver.getWindowHandle();
		
		Set<String> allID = driver.getWindowHandles();
		
		for(String ID : allID) {
			
			driver.switchTo().window(ID);
			
			if(driver.getCurrentUrl().contains(child)) {
				
				break;
			}
		}
		
		driver.findElement(By.xpath("//span[text()='Documentation']")).click();
	}

}
