package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("ayyappa@gmail.com");
		WebElement pas=driver.findElement(By.xpath("//input[@id='pass']"));
		pas.sendKeys("94949@gmail.com");
		WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
		login.click();
		
		
		
		
		
		
	}

}
