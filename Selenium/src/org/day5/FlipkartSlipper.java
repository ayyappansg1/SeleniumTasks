package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartSlipper {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement cancel = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		cancel.click();
		Thread.sleep(3000);
		WebElement women = driver.findElement(By.xpath("(//img[@class='_396cs4  _3exPp9'])[4]"));
		Actions actions=new Actions(driver);
		actions.moveToElement(women).perform();
		
		
		WebElement womenfoot = driver.findElement(By.xpath("//a[text()='Women Footwear']"));
		actions.moveToElement(womenfoot).perform();
		
		WebElement womenflat = driver.findElement(By.xpath("//a[text()='Women Flats']"));
		womenflat.click();
		
		
	}

}
