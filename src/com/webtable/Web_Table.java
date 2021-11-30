package com.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {

public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Ganesh\\eclipse-workspace\\Selenium_Folder\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.leafground.com/pages/table.html");
	
	System.out.println("---------------All Datas----------------");
	
	List<WebElement> all_data = driver.findElements(By.xpath("//table/tbody/tr/td"));
	for (WebElement webElement : all_data) {
		String text = webElement.getText();
		System.out.println(text);
		
		
	}
	System.out.println("-----------Row Datas--------");
	List<WebElement> Row_datas = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
	for (WebElement webElement : Row_datas) {
		String text = webElement.getText();
		System.out.println(text);
		
	}
	System.out.println("-----------------Column datas------------");
	List<WebElement> column_datas = driver.findElements(By.xpath("//table/tbody/tr/td[5]"));
	for (WebElement webElement : column_datas) {
		String text = webElement.getText();
		System.out.println(text);
	}
	System.out.println("-------------Particular datas--------------");
	WebElement parti_data = driver.findElement(By.xpath("//table/tbody/tr[4]/td[5]"));
	String text = parti_data.getText();
	System.out.println(text);
	
	System.out.println("--------Titles only--------");
	
	List<WebElement> Title = driver.findElements(By.xpath("//table/tbody/tr/th"));
	for (WebElement webElement : Title) {
		String text2 = webElement.getText();
		System.out.println(text2);
	}
}	
	
}
