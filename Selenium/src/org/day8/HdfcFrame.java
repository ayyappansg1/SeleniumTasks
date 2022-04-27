package org.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcFrame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("login_page");
		WebElement login = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		
		login.sendKeys("ayyappansg1@gmail.com");
		Thread.sleep(3000);
		WebElement clicking = driver.findElement(By.xpath("//a[text()='CONTINUE']"));
		clicking.click();
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.id("fldPasswordDispId"));
		password.sendKeys("dasdadffaf");
		
		WebElement clicked = driver.findElement(By.xpath("//a[contains(text(),'LOGIN')]"));
		clicked.click();
	}

}
