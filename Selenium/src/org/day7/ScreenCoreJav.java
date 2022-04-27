package org.day7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenCoreJav {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		WebElement corejava = driver.findElement(By.xpath("(//h2[@class='mb-0'])[4]"));
		corejava.click();
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(screenshotAs);
		
		File fileloc=new File("E:\\screenshot loc\\CoreJavaScreenshot.png");
		
		FileUtils.copyFile(screenshotAs, fileloc);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
