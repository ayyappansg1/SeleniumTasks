package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shopclues {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://bazaar.shopclues.com/wholesale.html");
		driver.manage().window().maximize();
		
		WebElement sports = driver.findElement(By.xpath("//a[contains(text(),'Sports &')]"));
		Actions actions=new Actions(driver);
		actions.moveToElement(sports).perform();
		
		WebElement weight = driver.findElement(By.xpath("//a[contains(text(),'Weight Gainers')]"));
		weight.click();
		
	}

}
