package org.day10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement searchbox = driver.findElement(By.xpath("(//input[@name='keyword'])[1]"));
		searchbox.sendKeys("i phone 7"+Keys.ENTER);
		
		WebElement iphone = driver.findElement(By.xpath("(//p[@class='product-title'])[1]"));
		iphone.click();
				
		String prtwindow = driver.getWindowHandle();
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(prtwindow);
		System.out.println(allwindows);
		
		for (String each : allwindows) {
			if(!(each.equals(prtwindow)))
			{
				driver.switchTo().window(each);
			}
		}
		
		WebElement cart = driver.findElement(By.xpath("(//span[@class='intialtext'])[2]"));
		cart.click();
		WebElement rate = driver.findElement(By.xpath("(//span[@class='price'])[2]"));
		String finalrate = rate.getText();
		System.out.println(finalrate);
		
	}
	

}
