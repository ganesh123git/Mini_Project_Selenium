package com.alert_pop;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_pop {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Ganesh\\eclipse-workspace\\Selenium_Folder\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		WebElement simple = driver.findElement(By.xpath("//button[text()='Alert Box']"));
		simple.click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(5000);
		alert.accept();
		
		WebElement confirm = driver.findElement(By.xpath("//button[text()='Confirm Box']"));
		confirm.click();
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();
//		alert2.dismiss();
		
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		
		Alert alert3 = driver.switchTo().alert();
		
		alert3.sendKeys("Alert handling text box");
		
		String text = driver.switchTo().alert().getText();
		System.out.println("Prompt text box :"  +text);
		alert3.accept();		
		
	}

}
