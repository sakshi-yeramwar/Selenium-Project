package Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoqa.com/text-box");
		
	    WebElement name = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
	    name.sendKeys("Sakshi Yeramwar");
		
	    WebElement email = driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
	    email.sendKeys("sakshiyeramwar@gmail.com");
		
		WebElement address = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		address.sendKeys("Nagpur,Maharashtra");
		
		WebElement permanentAddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		permanentAddress.sendKeys("Nagpur,Maharashtra");
		
	}

}
