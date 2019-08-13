package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Capture_Screenshot extends BaseClass{

	public static void main(String[] args) throws IOException 
	{   driver.manage().window().maximize();
		//Creating an object of Date class
		Date d = new Date();

		//Printing the actual date
				String date1 = d.toString();
				System.out.println(date1);

		//replacing the colon present in the date timestamp format to "_" using replaceAll()
		//method of String class
				String date2 = date1.replaceAll(":", "_");
				System.out.println(date2);
				//Enter the url
				driver.get("https://www.naukri.com/nlogin/login");
				
driver.findElement(By.xpath("//*[@id=\"usernameField\"]")).sendKeys("dhatavkarshraddha@gmail.com");

				//Typecasting the driver object to TakesScreenshot interface type.
				TakesScreenshot ts = (TakesScreenshot)driver;

				//getting the source file using getScreenshotAs() method and storing in a file
				File source= ts.getScreenshotAs(OutputType.FILE);
                 FileUtils.copyFile(source, new File("./Screenshot/"+date2+"_ScreenshotLoginPage.png"));
         System.out.println("Screenshot is taken");


	}
	
}
