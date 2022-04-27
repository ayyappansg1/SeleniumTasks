package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("ayyappan2gmail.com");
		
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("959595959");
		
		driver.quit();
		
		
		
	}

}
