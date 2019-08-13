package Login;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

public class Sign_In extends BaseClass {
	public static void main(String[] args) throws InterruptedException, AWTException {

		driver.manage().window().maximize();
		driver.get("https://mail.google.com");
		System.out.println("Gmail Application get open successfully");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("shraddha12salvi@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		//driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("swapnil@3");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		System.out.println("User get login into Gmail");
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[text()='Compose']")).click();
		System.out.println("Compose mail sending");
		
		Thread.sleep(3000);
		driver.findElement(By.className("vO")).sendKeys("dhatavkarshraddha@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.className("aoT")).sendKeys("Hi sheetal its testing time");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Send']")).click();
		System.out.println("Mail get send successfully");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Sent']")).click();
		Thread.sleep(4000);
		System.out.println("Check mail into the Sent mail");
		
		driver.findElement(By.xpath("//*[text()='shraddha']")).click();
		Thread.sleep(3000);
		System.out.println("Sent mail get delete");
		
		driver.findElement(By.xpath("//*[@id=\":4\"]/div[3]/div[1]/div/div[2]/div[3]")).click();
		Thread.sleep(3000);
		System.out.println("Go to the Inbox");
		
		driver.findElement(By.xpath("//div[@class='TN bzz aHS-bnt']//div[@class='aio UKr6le']")).click();
		Thread.sleep(3000);
		System.out.println("Search for mail and Click on it");
		
		driver.findElement(By.xpath("//*[@id=\"aso_search_form_anchor\"]")).click();
		Thread.sleep(4000);
//driver.findElement(By.xpath("//*[@id=\"aso_search_form_anchor\"]")).sendKeys("BridgeLabz Solutions");
		System.out.println("Search functionality for particular mail");
//WebElement search = driver.findElement(By.className("a3I"));
		driver.findElement(By.xpath("//input[@placeholder='Search mail']")).sendKeys("Selenium Notes_Weekend batch_10 to 2 PM_BTM.docx");
//Create object of Robot class
		Robot r = new Robot();

// Press Enter
		r.keyPress(KeyEvent.VK_ENTER);
             Thread.sleep(2000);
// Release Enter
		r.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(2000);
		  driver.quit();

//search.sendKeys("BridgeLabz Solutions");
//Actions action = new Actions(driver);
//action.sendKeys(Keys.ENTER);
//action.perform();

//	Actions builder = new Actions(driver);
////
////	// find the tooltip xpath
//	WebElement Del_btn_tooltip = driver.findElement(By.id(""));
////
//////	// Mouse hover to that text message
//	Thread.sleep(3000);
//builder.moveToElement(Del_btn_tooltip).perform();
//	System.out.println("Click on delete");//*[@id=":4"]/div[3]/div[1]/div/div[2]/div[3]/div/div

	}

}
