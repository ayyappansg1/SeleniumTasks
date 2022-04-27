package org.day9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("ayya199995");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("bharath-k1983");
		WebElement loginbtn = driver.findElement(By.id("login"));
		loginbtn.click();
		Thread.sleep(3000);
		WebElement roomtype = driver.findElement(By.id("room_type"));
		Select select=new Select(roomtype);
		List<WebElement> options = select.getOptions();
		System.out.println("Roomtypes");
		for (int i = 0; i < options.size(); i++) {
			WebElement ele = options.get(i);
			String types = ele.getAttribute("value");
			System.out.println(types);
			}
		}
	}


