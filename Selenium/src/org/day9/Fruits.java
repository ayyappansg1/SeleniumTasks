package org.day9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Fruits {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		
		WebElement box = driver.findElement(By.id("fruits"));
		Select select=new Select(box);
		List<WebElement> options = select.getOptions();
		System.out.println("Fruits");
		for (int i = 0; i < options.size(); i++) {
			if(i%2!=0) {
			WebElement ele = options.get(i);
			String adult1 = ele.getAttribute("value");
			System.out.println(adult1);
			select.selectByValue(adult1);
			}
		}
	}
	}


