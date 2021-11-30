package com.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Program {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ganesh\\eclipse-workspace\\Selenium_Folder\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		WebElement Dresses = driver.findElement(By.xpath("(//a[text()='Dresses'])[2]"));
		Actions ac = new Actions(driver);
		ac.moveToElement(Dresses).build().perform();
		
		WebElement summerdresses = driver.findElement(By.xpath("(//a[text()='Summer Dresses'])[2]"));
	//	WebElement summerdresses = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[2]/ul/li[3]/a"));
		ac.click(summerdresses).build().perform();
		
			//--absolute-xpath--- //div[@id='block_top_menu']/ul/li/ul/li[2]/ul/li[3]/a
		//copy xpath-- //*[@id="block_top_menu"]/ul/li[1]/ul/li[2]/ul/li[3]/a
	}
	
}
