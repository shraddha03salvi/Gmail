package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextClick_ActionClass extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		driver.manage().window().maximize();
		driver.get("https://mail.google.com");
		
		 //Get the title of the gmail page and print it on the console
	   	 String title = driver.getTitle();
	   	 System.out.println("the title of the page is :"+ title);
	   	 
	   	 //Get the URL of the gmail page and print it on the console
	   	 String currentUrl = driver.getCurrentUrl();
	   	 System.out.println("the URL of the page is :"+ currentUrl);
	   	 
	   	 //Get the source code  of the google page and print it on the console
	   	// String pageSource = driver.getPageSource();
	   	// System.out.println("the source code  of the page is :"+ pageSource);

	   	 //enter email id
		System.out.println("Gmail Application get open successfully");
		Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("shraddha12salvi@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("swapnil@3");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
		System.out.println("User get login into Gmail");
		Thread.sleep(6000);
		//driver.findElement(By.xpath("//*[@id=\":3a\"]")).click();
		//Thread.sleep(3000);
		String xp = "//*[text()='Sagar, How to get a high paying tech job?']";
		System.out.println("get the address of the mail item which you want to archive");
		Thread.sleep(3000);
				WebElement mail = driver.findElement(By.xpath(xp));
				
				//print the subject of the mail
				System.out.println("Text is " +(mail.getText()));
				//Creating an object of Actions class 
				Actions actions = new Actions(driver);
				System.out.println("-----");
		//using Actions class object and contextClick() method, right click on the mail item
				actions.contextClick(mail).perform();
				Thread.sleep(4000);
				System.out.println("-----");
				//click on Archive to archive the mail 

driver.findElement(By.id(":4")).click();
System.out.println("Mail get Archive");


	}

}
