package com.editable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Editable {
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Ganesh\\eclipse-workspace\\Selenium_Folder\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Edit.html");
		WebElement e = driver.findElement(By.id("email"));
		e.sendKeys("ganeshk");
		WebElement d = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		d.sendKeys("gasgdgdh");
		WebElement f = driver.findElement(By.name("username"));
		f.getAttribute("value");
		String text = f.getText();
		System.out.println(text);
		Thread.sleep(3000);
		WebElement g = driver.findElement(By.name("username"));
		g.clear();
		
		
		WebElement s = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
		boolean displayed = s.isDisplayed();
		System.out.println(displayed);
		
		
		
		
	}

}
