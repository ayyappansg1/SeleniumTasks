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

public class GreensSelenium {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement selenium = driver.findElement(By.xpath("(//h2[contains(text(),'Selenium ')])[3]"));
		selenium.click();
		
		WebElement window = driver.findElement(By.xpath("(//a[text()=' DAY 10 TASK'])[1]"));
		window.click();
				
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
		
		WebElement control = driver.findElement(By.xpath("//pre[contains(text(),'SELENIUM')]"));
		System.out.println(control.getText());
		
		
	}
	

}
