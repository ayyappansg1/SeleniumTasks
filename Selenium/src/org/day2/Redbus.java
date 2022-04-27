package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Redbus {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver drivername=new ChromeDriver();
		drivername.get("https://www.redbus.in/");
		
		WebElement first=drivername.findElement(By.id("src"));
		first.sendKeys("Chennai");
		
		WebElement second=drivername.findElement(By.id("dest"));
		second.sendKeys("Mannarkudi");
		
		
		
		//drivername.quit();
		
		
		
	}

}
