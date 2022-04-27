package org.day12;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JAvaScriptGreensScroll {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		WebElement porur=driver.findElement(By.xpath("//h2[contains(text(),'Framework ')]"));
		Thread.sleep(3000);
		String scriptforscrollup="arguments[0].scrollIntoView(true)";
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript(scriptforscrollup,porur);
		
		TakesScreenshot tk=(TakesScreenshot) driver;
		File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
		
		File files=new File("E:\\Screenshot loc\\frame.png");
		FileUtils.copyFile(screenshotAs, files);
		
	}

}
