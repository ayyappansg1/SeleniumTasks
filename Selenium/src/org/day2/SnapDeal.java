package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SnapDeal {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver drivername=new ChromeDriver();
		drivername.get("https://www.snapdeal.com/login");
		
		WebElement username=drivername.findElement(By.id("userName"));
		username.sendKeys("ayyappa@gmail.com");
		
		
		
		
		//drivername.quit();
		
		
		
	}

}
