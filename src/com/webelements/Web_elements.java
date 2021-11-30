package com.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_elements {
	
	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ganesh\\eclipse-workspace\\Selenium_Folder\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  // upcasting
		
		//driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
			
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("ganeshgh");
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("gk12333");

	//	pass.clear();

		// boolean dis = email.isDisplayed();
		// System.out.println("Is Displayed :" +email); // concordination

		boolean dis = pass.isDisplayed();
		System.out.println("Is displayed :" + dis);

		boolean en = pass.isEnabled();
		System.out.println("Is enabled :" + en);

		boolean sel = pass.isSelected();
		System.out.println("Is selected :" + sel);

		driver.findElement(By.name("login")).click();
			
	}

}
