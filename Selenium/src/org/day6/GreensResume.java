package org.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensResume {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();

		WebElement resumeclick = driver.findElement(By.xpath("//h2[contains(text(),'Model ')]"));
		Actions actions=new Actions(driver);
		actions.click(resumeclick).perform();
		
		WebElement resume4 = driver.findElement(By.xpath("(//a[@title='Model Resume training in chennai'])[4]"));
		actions.contextClick(resume4).perform();
		Thread.sleep(3000);
		
		Robot robot=new Robot();
		
		for(int i=0;i<=3;i++) {
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		







	}

}
