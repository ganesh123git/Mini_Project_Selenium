package com.javascriptscroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_task {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ganesh\\eclipse-workspace\\Selenium_Folder\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		
		WebElement snap = driver.findElement(By.xpath("//div[text()='Company']"));
		
		JavascriptExecutor  jr = (JavascriptExecutor) driver;
		
		jr.executeScript("arguments[0].scrollIntoView();", snap);
		
		Thread.sleep(3000);
		
		jr.executeScript("window.scrollBy(0,-1200)");
		
		Thread.sleep(3000);
		
	    jr.executeScript("window.scrollBy(0,2500)");
		
		
		
		
		
		
		
	}
	
}
