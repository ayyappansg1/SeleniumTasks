package org.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensSeleniumTest {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();

		WebElement selenium = driver.findElement(By.xpath("(//h2[contains(text(),'Selenium Test')])[2]"));
		Actions actions=new Actions(driver);
		actions.click(selenium).perform();
		
		WebElement day6 = driver.findElement(By.xpath("(//a[@title='Test papers training in chennai'])[18]"));
		actions.contextClick(day6).perform();
		
		Robot robot=new Robot();
		
		for(int i=0;i<=5;i++) {
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		







	}

}
