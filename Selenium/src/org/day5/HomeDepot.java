package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeDepot {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		
		WebElement alldept = driver.findElement(By.xpath("(//a[@data-id='departmentsFlyout'])[1]"));
		Thread.sleep(3000);
		Actions actions=new Actions(driver);
		actions.moveToElement(alldept).perform();
		Thread.sleep(3000);
		
		WebElement heating = driver.findElement(By.xpath("(//a[@data-level='Heating & Cooling'])[1]"));
		actions.moveToElement(heating).perform();
		Thread.sleep(3000);
		
		WebElement ac = driver.findElement(By.xpath("//a[@title='Air Conditioners']"));
		actions.moveToElement(ac).perform();
		Thread.sleep(3000);
		WebElement portableac = driver.findElement(By.xpath("//a[@title='Portable Air Conditioners']"));
		portableac.click();
		
		
		
		
		
	}

}
