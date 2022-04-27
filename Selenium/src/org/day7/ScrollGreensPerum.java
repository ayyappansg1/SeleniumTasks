package org.day7;

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

public class ScrollGreensPerum {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		WebElement scrollupto=driver.findElement(By.xpath("(//h2[contains(text(),'Job ')])[1]"));
		String scrollscript="arguments[0].scrollIntoView(true)";
		String scrollscriptdown="arguments[0].scrollIntoView(false)";

		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript(scrollscript, scrollupto);
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File source=ts.getScreenshotAs(OutputType.FILE);

		System.out.println(source);
		
		File file=new File("E:\\Screenshot loc\\GreenScreenJoboperning.png");
		FileUtils.copyFile(source, file);
		
		WebElement scrollup = driver.findElement(By.xpath("//div[@class='header-browse-greens']"));
		js.executeScript(scrollscriptdown, scrollup);
		
		
		
		
		
		
	}

}
