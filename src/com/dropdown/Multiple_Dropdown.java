package com.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Ganesh\\eclipse-workspace\\Selenium_Folder\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement multidrop = driver.findElement(By.xpath("(//select)[6]"));

		Select s = new Select(multidrop);
		s.selectByIndex(2);
		s.selectByValue("3");
		s.selectByVisibleText("Loadrunner");
		Thread.sleep(4000);
		s.deselectByValue("3");
		s.selectByValue("2");
	//	s.deselectAll();
		System.out.println("---------------");
		
		List<WebElement> lw = s.getOptions();
		for (WebElement webElement : lw) {
			String text = webElement.getText();
			System.out.println(text);	
		}
		System.out.println("------------------");
		
		List<WebElement> asp = s.getAllSelectedOptions();
		for (WebElement webElement : asp) {	
			String text1 = webElement.getText();
			System.out.println(text1);	
		}
		System.out.println("---------------");
		
		WebElement fs = s.getFirstSelectedOption();
		System.out.println(fs.getText());
		System.out.println("---------------");
		
		boolean mt = s.isMultiple();
		System.out.println("Is multiple or not :"  +mt);

		
		
	}

}
