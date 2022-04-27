package org.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensRPA {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();

		WebElement course = driver.findElement(By.xpath("//div[@class='header-browse-greens']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(course).perform();
		
		WebElement rpa = driver.findElement(By.xpath("//span[text()='RPA (6)']"));
		actions.contextClick(rpa).perform();
		
		Robot robot=new Robot();
		
		for(int i=0;i<=9;i++) {
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		







	}

}
