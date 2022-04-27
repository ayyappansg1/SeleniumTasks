package org.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Canara {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		driver.manage().window().maximize();
		
		WebElement login = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
		login.click();
		Alert alerts=driver.switchTo().alert();
		String text = alerts.getText();
		System.out.println(text);
		alerts.accept();
		
		
		
		
		
	}

}
