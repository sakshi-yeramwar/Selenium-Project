package evaluation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover2 {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		//WebElement electronics = driver.findElement(By.xpath("(//a[@_sp='p4375194.m1379.l3250'])[1]"));
		
		//act.moveToElement(electronics).build().perform();
		
		WebElement motor = driver.findElement(By.xpath("(//a[@_sp='p4375194.m1380.l3250'])[1]"));
		
		act.moveToElement(motor).build().perform();
	}

}
