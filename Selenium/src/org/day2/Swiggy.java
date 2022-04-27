package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Swiggy {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver drivername=new ChromeDriver();
		drivername.get("https://www.swiggy.com/");
		
		WebElement location=drivername.findElement(By.id("location"));
		location.sendKeys("thuraipakkam"+Keys.ENTER);
		
		
		
		
		//drivername.quit();
		
		
		
	}

}
