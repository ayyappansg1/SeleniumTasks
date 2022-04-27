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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Greenspython {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		
		WebElement course = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(course).perform();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		WebElement python = driver.findElement(By.xpath("(//a[@href='http://www.greenstechnologys.com/python-training.html'])[1]"));

		WebElement sangar = wait.until(ExpectedConditions.elementToBeClickable(python));
		sangar.click();
		
		WebElement explore = driver.findElement(By.xpath("(//button[text()='Explore Curriculum'])[1]"));
		actions.contextClick(explore).perform();
				
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
	}
	

}
