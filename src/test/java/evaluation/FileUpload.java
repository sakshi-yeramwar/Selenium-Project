package evaluation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.guru99.com/test/upload/");
		
		driver.manage().window().maximize();

		WebElement uploadButton = driver.findElement(By.id("uploadfile_0"));
		
		uploadButton.sendKeys("C:\\Users\\HP\\OneDrive\\Pictures\\Screenshot\\image1.png");
	}

}
