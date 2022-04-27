package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement signup = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		signup.click();
		
		WebElement homemouseover = driver.findElement(By.xpath("(//img[@class='_396cs4  _3exPp9'])[6]"));
		Actions actions=new Actions(driver);
		actions.moveToElement(homemouseover).perform();
		
		WebElement bathlinen = driver.findElement(By.xpath("(//a[@class='_6WOcW9 _3YpNQe'])[6]"));
		bathlinen.click();
		Thread.sleep(3000);
		WebElement anyproduct = driver.findElement(By.xpath("//a[contains(text(),'VEL')]"));
		String printed = anyproduct.getText();
		System.out.println(printed);
	}

}
