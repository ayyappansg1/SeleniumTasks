package org.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAuto2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement firstclick = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		firstclick.click();
		WebElement clickbtn = driver.findElement(By.xpath("(//button[contains(text(),'click ')])[2]"));
		clickbtn.click();
		Thread.sleep(3000);
		Alert alerts=driver.switchTo().alert();
		alerts.accept();
		
		
		
		
		
	}

}
