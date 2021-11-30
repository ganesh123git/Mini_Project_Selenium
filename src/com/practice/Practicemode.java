package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicemode {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ganesh\\eclipse-workspace\\Selenium_Folder\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	
		driver.manage().window().maximize();
		//driver.get("https://www.facebook.com/");
		//driver.get("https://www.google.co.in/");

		// enter a search term
		// click the wikipedia link
		
		
	//	WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
	//	text.sendKeys("mobiles"  +  Keys.ENTER);
	//	driver.quit();
	
		driver.get("http://www.leafground.com/pages/Link.html");
		//driver.findElement(By.linkText("Go to Home Page")).click();
		driver.findElement(By.partialLinkText("Home Page")).click();
		
		
		
		
	}
}
