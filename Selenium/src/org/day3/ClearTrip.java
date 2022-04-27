package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains\r\n");
		
		WebElement from = driver.findElement(By.xpath("//input[@title='From station']"));
		from.sendKeys("mannargudi");
		WebElement to=driver.findElement(By.xpath("//input[@title='To station']"));
		to.sendKeys("tambaram");
		WebElement number=driver.findElement(By.xpath("//button[@id='trainFormButton']"));
		number.click();
		
		
		
		
		
		
		
		
	}

}
