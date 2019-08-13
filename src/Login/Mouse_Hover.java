package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//*[text()='Companies']"));
		
		Actions act = new Actions(driver);
		
         act.moveToElement(ele).perform();
         Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text()='Browse All Companies']")).click();
	}

}
