package org.day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
		WebElement first = driver.findElement(By.xpath("//div[@class='accountInner']"));
		first.click();
		WebElement register=driver.findElement(By.xpath("//span[@class='newUserRegister']"));
		register.click();
		Thread.sleep(3000);
		
		
		List<WebElement> findElements = driver.findElements(By.tagName("iframe"));
		System.out.println(findElements.size());
		
		driver.switchTo().frame("loginIframe");
		
		WebElement number=driver.findElement(By.id("userName"));
		number.sendKeys("8989898989");
		
		
		/*WebElement clickable=driver.findElement(By.xpath("//button[@id='checkUser']"));
		clickable.click();*/
		
		
		
		
		
		
		
		
		
	}

}
