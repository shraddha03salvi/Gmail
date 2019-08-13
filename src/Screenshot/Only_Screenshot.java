package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

public class Only_Screenshot extends BaseClass {

	public static void main(String[] args) throws IOException 
	{
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");

		TakesScreenshot ts = (TakesScreenshot) driver;

		File srcFile = ts.getScreenshotAs(OutputType.FILE);

		File destFile = new File("./Screenshot/Amazon.png");

		Files.copy(srcFile, destFile);

		driver.close();
		  System.out.println("Screenshot is taken");
		
	}

}
