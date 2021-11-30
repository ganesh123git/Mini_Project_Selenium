package com.mini_project;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Mini_Project {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Ganesh\\eclipse-workspace\\Selenium_Folder\\Driver\\chromedriver.exe");
		
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("incognito");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("http://automationpractice.com/index.php");
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[@class='login']")).click();
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("ganeshkumar9416@gmail.com");
		WebElement passwd = driver.findElement(By.id("passwd"));
		passwd.sendKeys("Ganesh@123");
		driver.findElement(By.xpath("//i[@class='icon-lock left']")).click();
		
		WebElement cl = driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]"));
		cl.click();
		JavascriptExecutor  js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800);", args);
		WebElement img = driver.findElement(By.xpath("//img[@itemprop='image']"));
		Thread.sleep(4000);
		img.click();
		WebElement outer = driver.findElement(By.xpath("(//iframe)[1]"));
		driver.switchTo().frame(outer);
		WebElement c = driver.findElement(By.xpath("(//span[text()='Add to cart'])[1]"));
		Thread.sleep(4000);
		c.click();
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		WebElement pr = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"));	
		pr.click();
		WebElement ds = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		ds.click();
		WebElement ff = driver.findElement(By.name("processAddress"));
		ff.click();
		WebElement bb = driver.findElement(By.name("cgv"));
		bb.click();
		WebElement vv = driver.findElement(By.name("processCarrier"));
		vv.click();
		//Thread.sleep(5000);
		WebElement xc = driver.findElement(By.xpath("//a[@title='Pay by check.']"));
		xc.click();
		WebElement nn = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		nn.click();
		js.executeScript("window.scrollBy(0,500);", args);
		TakesScreenshot ts = (TakesScreenshot) driver;	
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Ganesh\\eclipse-workspace\\Selenium_Folder\\Screenshots\\screen.png");
		FileUtils.copyFile(source, destination);
		
		
		
		
		
	}
	
}
