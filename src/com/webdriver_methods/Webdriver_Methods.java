package com.webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Methods {  

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ganesh\\eclipse-workspace\\Selenium_Folder\\Driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();  // Object creation
		
		driver.get("https://www.google.co.in/"); 
		// get--history store pannathu and DOM appear ah aaguravaraikum wait pannum
		
		//driver.navigate().to("https://www.youtube.com/");
		driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
		//	Dimension dimension = new Dimension(1366, 768)   //  ur laptop screen size
		//	driver.manage().window().setSize(dimension); // maximize panrathugu
			
			
			String title = driver.getTitle();
			//System.out.println(title);
			System.out.println("current title is :"  +title);
			
			String currentUrl = driver.getCurrentUrl();
		//	System.out.println(currentUrl);
			System.out.println("current url is :" +currentUrl);
			
			driver.navigate().to("https://www.youtube.com/");  
			//(navigate to)--history store pannum so back,forward polam
			//driver.findElement(By.name("q")).sendKeys("mobiles" +Keys.ENTER);
			
			driver.navigate().back();
			driver.navigate().forward();
			Thread.sleep(3000);
			
			driver.navigate().refresh();
			
			Thread.sleep(3000);   //  local wait
			driver.close();             //  driver view close aaagum
			
			//driver.quit();  // total close
			
			
							
	}
}
