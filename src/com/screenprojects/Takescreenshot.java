package com.screenprojects;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.io.FileHandler;

public class Takescreenshot {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\eclipse-workspace\\Selenium_Folder\\Driver\\chromedriver.exe");
	
	ChromeOptions ch = new ChromeOptions();
	ch.addArguments("incognito");
	
	WebDriver driver = new ChromeDriver(ch);
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("7200314774");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ganesh1601@");
	driver.findElement(By.xpath("//button[@value='1']")).click();
	
	// Takescreenshot
	
	
	Thread.sleep(10000);
	
//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	TakesScreenshot ts =(TakesScreenshot) driver; // Narrowing concept
	
	File source = ts.getScreenshotAs(OutputType.FILE);
	
	File destination =new File("C:\\Users\\Ganesh\\eclipse-workspace\\Selenium_Folder\\Screenshots\\snap1.png");  // object
	
//	File destination = new File("D:\\snap1.png");
//	FileHandler.copy(source, destination);
	
	FileUtils.copyFile(source, destination);
	
	
		
	}
	
}
