package MouseMovement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/droppable/");
		//Switch to frame if it is Present
		driver.switchTo().frame(0);
		Actions action =new Actions(driver);
		
		System.out.println("Performing Drad and Drop operation");
		// Here clickandhold method is for holding the object 
		//driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS); This is the Implicit wait for pageload
		action.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]"))).
		moveToElement(driver.findElement(By.xpath("//*[@id=\"droppable\"]")))
		.release().build().perform();
		System.out.println("Drag and Drop is perfectly done");
		Thread.sleep(2000);
		driver.close();
	}

}
