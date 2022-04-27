package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/restaurants");
		driver.manage().window().maximize();
		
		WebElement signup = driver.findElement(By.xpath("//a[@class='r2iyh']"));
		signup.click();
		WebElement phone=driver.findElement(By.xpath("//input[@id='mobile']"));
		phone.sendKeys("8998989898");
		WebElement name=driver.findElement(By.xpath("//input[@id='name']"));
		name.sendKeys("Ayyappan");
		
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("aubashbd@gmail.com");
		
		WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("8903276015");
		
		WebElement clicks=driver.findElement(By.xpath("//a[@class='a-ayg']"));
		clicks.click();
		
		
		
		
		
		
		
		
	}

}
