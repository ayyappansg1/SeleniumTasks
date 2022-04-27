package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		WebElement first = driver.findElement(By.xpath("//input[@name='firstName']"));
		first.sendKeys("Ayyappan");
		WebElement last=driver.findElement(By.xpath("//input[@name='lastName']"));
		last.sendKeys("Gunasekaran");
		WebElement user=driver.findElement(By.xpath("//input[@name='Username']"));
		user.sendKeys("ayyappsng2222223");
		
		WebElement pass=driver.findElement(By.xpath("//input[@name='Passwd']"));
		pass.sendKeys("8903276015");
		WebElement conf=driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
		conf.sendKeys("8903276015"+Keys.ENTER);
		
		
		
		
		
		
		
		
		
	}

}
