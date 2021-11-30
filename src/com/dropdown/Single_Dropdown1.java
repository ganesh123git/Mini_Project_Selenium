package com.dropdown;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Dropdown1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Ganesh\\eclipse-workspace\\Selenium_Folder\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://e-drivinglicence.com/");
		
		WebElement name = driver.findElement(By.name("your-name"));
		name.sendKeys("Sgk");
		WebElement email = driver.findElement(By.name("your-email"));
		email.sendKeys("gansh@123");
		WebElement city = driver.findElement(By.name("your-city"));
		city.sendKeys("chennai");
		WebElement add = driver.findElement(By.name("your-address"));
		add.sendKeys("mmda");
		WebElement mobile = driver.findElement(By.name("mobile"));
		mobile.sendKeys("232323232");
		
		Thread.sleep(5000);
		
		WebElement sel = driver.findElement(By.name("service-guidetype"));
		Select s = new Select(sel);
		s.selectByIndex(5);
		
		WebElement sel1 = driver.findElement(By.name("service-guidetype"));
	    Select s1 = new Select(sel1);
	   // s1.selectByVisibleText("Driving Licence Status");
	    s1.selectByVisibleText("Learner's Licence");
	    
	    
	    boolean multi = s.isMultiple();
	    System.out.println("Displayed :" +multi);
	    
	    
	    List<WebElement> op = s.getOptions();
	    for (WebElement webElement : op) {
	    	
	    	String text = webElement.getText();
	    	System.out.println(text);
	    	
		}
	    
	    System.out.println("--------");
	    
	    WebElement ff = s.getFirstSelectedOption();
	    
	    System.out.println(ff.getText());	    
    
	}
}   
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    