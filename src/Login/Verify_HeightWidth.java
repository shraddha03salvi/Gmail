package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Verify_HeightWidth extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/nlogin/login");
		//find the username field 
  WebElement unTB = driver.findElement(By.id("usernameField"));
  
  //store the height of username 
    int username_height = unTB.getSize().getHeight();
//store the width of username 
		int username_width = unTB.getSize().getWidth();
		System.out.println("height of username is" +username_height);
		System.out.println("Width of username is " +username_width);
		Thread.sleep(1000);
        //driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		//Thread.sleep(1000);
        //find the password field
		WebElement pwdTB = driver.findElement(By.id("passwordField"));
		//store the height of password
		int password_height = pwdTB.getSize().getHeight();
		//store the width of password
		int password_width = pwdTB.getSize().getWidth();
		System.out.println("height of password is" +password_height);
		System.out.println("width of password is" +password_width);
		//check the height and width of username and password fields are same 
		if (username_height==password_height && username_width==password_width)
		{
  System.out.println("Username and password fields are aligned properly");
		}
		
		else{
    System.out.println("Username and password fields are NOT aligned");
		}
		
		}



	}


