package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowserTest {

	public static void main(String[] args) {
		
		//Driver and it's Path
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
		//open browser
		WebDriver driver = new ChromeDriver();
		
		//load the URL inside browser
		driver.get("https://the-internet.herokuapp.com/login");
		
		//use locator, can store it in local variable
		WebElement username = driver.findElement(By.id("username"));
		
		username.click();
		
	}

}
