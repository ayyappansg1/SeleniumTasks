package org.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToolsqa {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/");
		driver.manage().window().maximize();
		
		WebElement dummyclose=driver.findElement(By.xpath("(//button[@class='modal__close'])[2]"));
		
		WebElement scrollupto=driver.findElement(By.xpath("//a[text()='Latest Articles']"));
		String scrollscript="arguments[0].scrollIntoView(true)";
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", dummyclose);
		js.executeScript(scrollscript, scrollupto);
		
		
		
		
		
		
		
		
		
		
		
	}

}
