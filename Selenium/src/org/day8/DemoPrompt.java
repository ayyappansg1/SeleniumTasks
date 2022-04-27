package org.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoPrompt {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		WebElement firstclick = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		firstclick.click();
		WebElement clickbtn = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		clickbtn.click();
		Alert alerts=driver.switchTo().alert();
		alerts.sendKeys("Ayyappan");
		alerts.accept();
		
		
		
		
		
	}

}
