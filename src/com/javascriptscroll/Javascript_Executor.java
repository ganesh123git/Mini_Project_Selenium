package com.javascriptscroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Javascript_Executor {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ganesh\\eclipse-workspace\\Selenium_Folder\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement amazon_logo = driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
		
		JavascriptExecutor jr = (JavascriptExecutor) driver;  // narrowing type
		
		jr.executeScript("arguments[0].scrollIntoView();" , amazon_logo );
		
		Thread.sleep(3000);
		
		jr.executeScript("window.scrollBy(0,-2000)"); // X, Y-axis negative(down)
		// GO DOWN OFTHE PAGE(SCROLLING UP)
		
		Thread.sleep(3000);
		
		jr.executeScript("window.scrollBy(0,1500)");  // X, Y-axis positive(up)
		// GO UP OF THE PAGE (SCROLLING DOWN)
		
		
		
		
		
	}

}
