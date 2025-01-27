package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.OpenChromeDriver;

public class LoginPage extends OpenChromeDriver {
  
	
	public static void optionbrowser() {
		OpenChromeDriver.opendriver();
	}
	
	public static void method_enterUserName(String userName) {
		
	WebElement search = driver.findElement(By.xpath("//*[@title='Search']"));
	search.sendKeys(userName);
	}
	
	
	public static void method_enterPassword() {
		
	
	}
	
	public static void method_ClickOkButton() {
		

		
	}
	
	public static void method_VerifyPageTitle() {
		

		
	}
}


