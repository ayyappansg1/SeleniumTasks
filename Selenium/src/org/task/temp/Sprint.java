package org.task.temp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sprint {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.t-mobile.com/");
		driver.manage().window().maximize();
		
		WebElement dialog = driver.findElement(By.xpath("(//button[@aria-label='Close dialog'])[1]"));
		dialog.click();
		
		WebElement phones = driver.findElement(By.xpath("(//a[@class='unav-headerNav__header-link '])[2]"));
		Actions actions=new Actions(driver);
		actions.moveToElement(phones).perform();
		
		WebElement clickphone = driver.findElement(By.xpath("//a[@data-analytics-navigation-name='Phones & devices|5G phones']"));		
		clickphone.click();
		
		WebElement print = driver.findElement(By.xpath("(//a[@class='ng-star-inserted'])[20]"));
		String printed = print.getText();
		System.out.println(printed);
	}

}
