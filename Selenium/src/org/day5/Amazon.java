package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement prime = driver.findElement(By.xpath("//a[@id='nav-link-prime']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(prime).perform();
		Thread.sleep(3000);
		
		WebElement clicked = driver.findElement(By.xpath("//img[@id='multiasins-img-link']"));
		clicked.click();
		
				
	}

}
