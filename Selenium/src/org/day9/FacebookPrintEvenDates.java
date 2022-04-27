package org.day9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookPrintEvenDates {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	
		WebElement regist = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		regist.click();
		Thread.sleep(3000);
		WebElement datebox=driver.findElement(By.id("day"));
		Select select=new Select(datebox);
		List<WebElement> options = select.getOptions();
		System.out.println("Even Dates Are");
		for (int i = 0; i < options.size(); i++) {
			if(i%2!=0) {
			WebElement ele = options.get(i);
			String evendates = ele.getText();
			System.out.println(evendates);
			}
		}
	}
		
		
		
	


	}


