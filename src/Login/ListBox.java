package Login;

//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ListBox extends BaseClass {
	@Test
	public void SelectClass_DD() {
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement Day_DD = driver.findElement(By.id("day"));
		Select day = new Select(Day_DD);
		// select by Index
		day.selectByIndex(12);
		System.out.println("Day is selected by Index");
		WebElement Month_DD = driver.findElement(By.id("month"));

		Select Month = new Select(Month_DD);

		WebElement selected_value1 = Month.getFirstSelectedOption();
		System.out.println("After selection selected value is" + selected_value1.getText());

		// select by value
		Month.selectByValue("5");
		System.out.println("Month  is selected by Value");

		WebElement Year_DD = driver.findElement(By.id("year"));
		Select Year = new Select(Year_DD);
		// Select by visibleText
		Year.selectByVisibleText("2018");
		System.out.println("Year is selected by VisibleText");

	}
}
