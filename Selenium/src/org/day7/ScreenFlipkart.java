package org.day7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenFlipkart {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement clickable=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		clickable.click();
		
		WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
		search.sendKeys("i phone"+Keys.ENTER);
		Thread.sleep(4000);
					
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(screenshotAs);
		
		File fileloc=new File("E:\\screenshot loc\\FlipkartScreenshot.png");
		
		FileUtils.copyFile(screenshotAs, fileloc);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
