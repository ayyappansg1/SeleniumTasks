package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mynthra {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		
		WebElement user = driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
		user.sendKeys("8989898989");
		WebElement login=driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
		login.click();
		
		
		
		
		
		
		
		
		
	}

}
