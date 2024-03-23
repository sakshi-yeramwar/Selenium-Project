package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		//to get the webpage, mention the URL
		driver.get(null);
		
		//to locate any element
		driver.findElement(null);
		//use different methods of By class in which
		
	}

}
