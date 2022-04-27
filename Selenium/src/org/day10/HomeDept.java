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

public class HomeDept {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement searchbox = driver.findElement(By.id("headerSearch"));
		searchbox.sendKeys("celling fan"+Keys.ENTER);
		
		WebElement ceilingfan = driver.findElement(By.xpath("(//span[@class='product-pod__title__product'])[1]"));
		ceilingfan.click();
				
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
		
		WebElement remote = driver.findElement(By.xpath("//button[text()='Smart Hub Included']"));
		remote.click();
		
		
	}
	

}
