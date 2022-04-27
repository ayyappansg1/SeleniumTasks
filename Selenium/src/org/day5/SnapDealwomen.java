package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDealwomen {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
		WebElement women = driver.findElement(By.xpath("(//span[@class='catText'])[2]"));
		Actions actions=new Actions(driver);
		actions.moveToElement(women).perform();
		
		WebElement heels = driver.findElement(By.xpath("(//span[text()='Heels'])"));
		heels.click();
		
		
		
		
		
	}

}
