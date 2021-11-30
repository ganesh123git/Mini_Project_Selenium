package com.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_project {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Ganesh\\eclipse-workspace\\Selenium_Folder\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  // upcasting
		
		driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
			WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
			email.sendKeys("ganesll2");
			//email.getAttribute("value");
			
			WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
			pass.sendKeys("2333er@1");
			//	pass.clear();
			
			WebElement text = driver.findElement(By.xpath("//h2[contains(text(),'Facebook ')]"));

			String text2 = text.getText();
			System.out.println("Full text is:" +text2);
	
			
	}

}
