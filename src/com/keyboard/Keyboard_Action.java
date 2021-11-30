package com.keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Action {
	
	public static void main(String[] args)  {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ganesh\\eclipse-workspace\\Selenium_Folder\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement mail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		
		Actions ac = new Actions(driver);
		ac.contextClick(mail).build().perform();
		
	//	ac.contextClick(mail).build().perform();
		
	//	Robot r = new Robot();
	
		
		
		
	}
}
