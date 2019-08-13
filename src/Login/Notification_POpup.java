package Login;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Notification_POpup {
	@Test
	public  void test() throws InterruptedException {
		// Create object of HashMap Class
		 Map<String, Object> prefs = new HashMap<String, Object>();
		 // Set the notification setting it will override the default setting
		  prefs.put("profile.default_content_setting_values.notifications", 2); 
		  // Create object of ChromeOption class
		  ChromeOptions options = new ChromeOptions();
		  // Set the experimental option
		  options.setExperimentalOption("prefs", prefs);
		// pass the options object in Chrome driver
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			 WebDriver driver = new ChromeDriver(options);
			driver.get("https://www.naukri.com/nlogin/login");
			 driver.manage().window().maximize();
			Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id=\"usernameField\"]")).sendKeys("dhatavkarshraddha@gmail.com");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"passwordField\"]")).sendKeys("shraddhacom");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[5]/div/button")).click();		 

			//			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("dhatavkarshraddha@gmail.com");
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("shivganga1993");
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
	}

}
