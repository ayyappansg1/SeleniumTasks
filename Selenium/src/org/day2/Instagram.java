package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver drivername=new ChromeDriver();
		drivername.get("https://www.instagram.com/accounts/login/?hl=en) login page");
		Thread.sleep(5000);
		
		WebElement user=drivername.findElement(By.xpath("//input[@name='username']"));
		user.sendKeys("sangar");
		
		WebElement pass=drivername.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("9442764652");
		
		
		
		
		//drivername.quit();
		
		
		
	}

}
