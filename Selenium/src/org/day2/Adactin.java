package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Adactin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver drivername=new ChromeDriver();
		drivername.get("http://adactinhotelapp.com/");
		
		WebElement username=drivername.findElement(By.id("username"));
		username.sendKeys("ayyappa@gmail.com");
		
		WebElement pass=drivername.findElement(By.id("password"));
		pass.sendKeys("9*442762626");
		
		
		
		
		//drivername.quit();
		
		
		
	}

}
