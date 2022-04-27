package org.day4;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();


		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();
		
		WebElement search = driver.findElement(By.xpath("(//input[@class='_3704LK'])[1]"));
		search.sendKeys("i phone"+Keys.ENTER);
		Thread.sleep(3000);
		WebElement iphone = driver.findElement(By.xpath("(//div[contains(text(),'APPLE iP')])[1]"));
		iphone.click();
		
		
		//driver.quit();
		
		
		
		
	}

}
