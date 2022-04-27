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
import org.openqa.selenium.interactions.Actions;

public class ScreenSnapDeal {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
		WebElement search=driver.findElement(By.id("inputValEnter"));
		search.sendKeys("Hp Laptop"+Keys.ENTER);
		Thread.sleep(3000);
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File screenshot=ts.getScreenshotAs(OutputType.FILE);
		File files=new File("E:\\screenshot loc\\snapdeal.png");
		
		FileUtils.copyFile(screenshot, files);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
