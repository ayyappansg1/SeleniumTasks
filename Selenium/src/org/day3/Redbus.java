package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		WebElement sign = driver.findElement(By.xpath("//div[@id='signin-block']"));
		sign.click();
		WebElement signup=driver.findElement(By.xpath("//li[@id='signInLink']"));
		signup.click();
		WebElement number=driver.findElement(By.xpath("//input[@id='mobileNoInp']"));
		number.sendKeys("8956565685");
		
		
		
		
		
		
		
		
	}

}
