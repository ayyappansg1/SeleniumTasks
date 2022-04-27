package org.day2;

import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcBank {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/");
		driver.manage().window().maximize();
		
		List<WebElement> findElementsList = driver.findElements(By.tagName("frame"));
		int size = findElementsList.size();
		System.out.println(size);
	
		driver.switchTo().frame(0);
		
		WebElement login=driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		login.sendKeys("ayyaooa");
		
		
		
		
		
		//drivername.quit();
		
		
		
	}

}
