package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartTv {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement cancel = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		cancel.click();
		Thread.sleep(3000);
		WebElement dummy = driver.findElement(By.xpath("//div[text()='Mobiles']"));
		dummy.click();
		
		Actions actions=new Actions(driver);
		Thread.sleep(3000);
		WebElement tv = driver.findElement(By.xpath("//span[text()='TVs & Appliances']"));
		actions.moveToElement(tv).perform();
		
		Thread.sleep(3000);
		WebElement mi = driver.findElement(By.xpath("//a[text()='Mi']"));
		mi.click();
		Thread.sleep(3000);
		WebElement firstproduct = driver.findElement(By.xpath("(//div[contains(text(),'Mi 4A')])[1]"));
		firstproduct.click();
	}

}
