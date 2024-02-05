package evaluation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("checkBoxOption1")).click();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File file1 = ts.getScreenshotAs(OutputType.FILE);
		
		File file2 = new File("C:\\Users\\HP\\OneDrive\\Pictures\\Screenshot.img1.png");
		
		FileUtils.copyFile(file1, file2);

	}

}
