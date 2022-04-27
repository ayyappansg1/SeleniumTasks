package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.xpath("//input[@name='q']"));
		username.sendKeys("ayayy@gmail");
		WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("sddadsdada");
		WebElement click=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		click.click();
		
		
		
		
		
		
	}

}
