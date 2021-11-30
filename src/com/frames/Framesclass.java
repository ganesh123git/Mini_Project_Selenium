package com.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framesclass {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ganesh\\eclipse-workspace\\Selenium_Folder\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.switchTo().frame("singleframe");
		WebElement singleframe = driver.findElement(By.xpath("//input[@type='text'][1]"));
		singleframe.sendKeys("frame task");
		driver.switchTo().defaultContent(); // it will exit from frame
		
		WebElement multiframe = driver.findElement(By.xpath("(//a[contains(text(),'Iframe')])[2]"));
		multiframe.click();
		
		WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerframe); // webelement
		
		WebElement innerframe = driver.findElement(By.xpath("(//iframe[@src='SingleFrame.html'])[1]"));
		driver.switchTo().frame(innerframe);
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Multiframe");
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()='Video']")).click(); 
		// check if default content ku vanthrucha
		
		
		
		

	}

}
