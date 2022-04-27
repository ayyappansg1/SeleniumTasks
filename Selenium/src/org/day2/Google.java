package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver drivername=new ChromeDriver();
		drivername.get("https://www.google.com/");
		
		WebElement search=drivername.findElement(By.name("q"));
		search.sendKeys("GreensTechnology");
		
		
		
		drivername.quit();
		
		
		
	}

}
