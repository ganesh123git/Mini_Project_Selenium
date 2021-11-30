package com.frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// org.openqa.selenium.interactions.Actions;

public class Iframes {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ganesh\\eclipse-workspace\\Selenium_Folder\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/frame.html");
		
		WebElement single = driver.findElement(By.xpath("//iframe[@src='default.html']"));
		driver.switchTo().frame(single);
		driver.findElement(By.id("Click")).click();
		
		String text1 = driver.findElement(By.id("Click")).getText();
		System.out.println(text1);
		
		driver.switchTo().defaultContent();
		WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='page.html']"));
		driver.switchTo().frame(outerframe);
		WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='nested.html']"));
		driver.switchTo().frame(innerframe);
		driver.findElement(By.id("Click1")).click();
	//	driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
//		List<WebElement> total = driver.findElements(By.tagName("iframe"));
//		int size = total.size();
//		System.out.println(size);
//		
			
	}
	
}	
		
	
//		frames:
//
//			driver.manage().window().maximize();
//				driver.get("http://www.leafground.com/pages/frame.html");
//				
//				WebElement single = driver.findElement(By.xpath("//iframe[@src='default.html']"));
//			//	WebElement single = driver.findElement(By.xpath("//iframe"));
//				driver.switchTo().frame(single);
//				driver.findElement(By.id("Click")).click();
//				driver.switchTo().defaultContent();
//			//	WebElement multi = driver.findElement(By.xpath("//iframe2"));
//			//	driver.switchTo().frame(multi);
//				WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='page.html']"));
//			//	WebElement outerframe = driver.findElement(By.xpath("//iframe[@id=\"wrapframe\"]/iframe"));
//				driver.switchTo().frame(outerframe);
//				WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='nested.html']"));
//			//	WebElement innerframe = driver.findElement(By.id("frame2"));
//				driver.switchTo().frame(innerframe);
//				driver.findElement(By.id("Click1")).click();
//				driver.switchTo().parentFrame();
//				driver.switchTo().defaultContent();
				
		