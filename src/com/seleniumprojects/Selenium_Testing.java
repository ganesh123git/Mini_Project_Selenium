package com.seleniumprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Testing {

 public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\eclipse-workspace\\Selenium_Folder\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	//driver.get("https://www.facebook.com/");

	driver.manage().window().maximize();

	//driver.navigate().to("https://www.youtube.com/");
	WebElement text = driver.findElement(By.xpath("(//span[contains(text(),'Brands ')])[2]"));
	
	String text2 = text.getText();
	System.out.println(text2);
	
	
	 
	 
	 
	 
	 
	 
	 
}
	
	
	
	
	
	
	
}
