package org.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JAvaScriptFacebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email=driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		Thread.sleep(3000);
		WebElement click=driver.findElement(By.xpath("//button[@type='submit']"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','email@gmail.com')",email);
		js.executeScript("arguments[0].setAttribute('value','944595959')", pass);
		js.executeScript("arguments[0].click()", click);
		
	}

}
