package Login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AutoSuggestionbox extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		//Enter Selenium in google search text box
   driver.findElement(By.name("q")).sendKeys("Selenium");
    Thread.sleep(2000);
    
   List<WebElement>allOptions = driver.findElements(By.id("searchform"));
  int size = allOptions.size();
  System.out.println("Number of values present in the dropdown is :" +size);
	
  String expectedValue="selenium interview questions";
	for (WebElement option : allOptions)
{
		String text = option.getText();
		System.out.println("   "+text);
//Click on Java Interview Questions
		Thread.sleep(3000);
if (text.equalsIgnoreCase(expectedValue)) 
{  System.out.println("--------");
			option.click();
          break;

}

	}
	}
	
}
