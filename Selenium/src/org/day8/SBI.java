package org.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SBI {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		driver.manage().window().maximize();
		
		WebElement login = driver.findElement(By.xpath("(//a[@class='login_button'])[1]"));
		login.click();
		
		WebElement clicklogin = driver.findElement(By.xpath("//input[@type='submit']"));
		clicklogin.click();
		Alert alerts=driver.switchTo().alert();
		System.out.println(alerts.getText());
		alerts.accept();
		
		
		
		
		
	}

}
