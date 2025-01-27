package com.base;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeDriver  {
	
 public static WebDriver driver;
 
 

 	public static void opendriver() {
		
		 System.setProperty("webdriver.chrome.driver", "D:\\Intellij Projects\\BDDTestAutomation_Demo_In\\BDDTestAutomation_Demo\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.google.com/");
	}
 


 
 public void quite() {
	 driver.quit();
 }
}
