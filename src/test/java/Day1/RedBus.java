package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		// id css selector
		driver.findElement(By.cssSelector("#moe-osm-pusher"));
		driver.findElement(By.cssSelector("#cab_rental_vertical")).click();
		driver.findElement(By.cssSelector("#rail_tickets_vertical")).click();
		driver.findElement(By.cssSelector("#help_redcare")).click();
		driver.findElement(By.cssSelector("#search_button")).click();
		
		//class css selector
		driver.findElement(By.cssSelector(".redbus_header fixedHeader"));
		driver.findElement(By.cssSelector(".rb_vertical link active")).click();
		driver.findElement(By.cssSelector(".icon icon-user_profile_new icon_rb_secondary_item")).click();
		driver.findElement(By.cssSelector(".")).click();
		driver.findElement(By.cssSelector(".")).click();
		
		//attribute css selector
		driver.findElement(By.cssSelector(""));
		driver.findElement(By.cssSelector("")).click();
		driver.findElement(By.cssSelector("")).click();
		driver.findElement(By.cssSelector("")).click();
		driver.findElement(By.cssSelector("")).click();
	}

}
