package Login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Webelement_List extends BaseClass{

	
	 @Test
		public void SelectClass_DD() {
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
			 WebElement Month_DD = driver.findElement(By.id("month"));
				
			 Select Month = new Select(Month_DD);
			List<WebElement> month_lsit =  Month.getOptions();
			//List is collection and also a dynamic array
			
			int total_Month = month_lsit.size();
			
			Assert.assertEquals(total_Month,13);
			System.out.println("Total Month Count is" +total_Month);
			//Enhance for loop for printing the all options
			for(WebElement ele:month_lsit ) 
			{
				String month_name = ele.getText();
				System.out.println("Months are======" +month_name);
			}
}
}