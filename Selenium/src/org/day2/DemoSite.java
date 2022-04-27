package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoSite {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver drivername=new ChromeDriver();
		drivername.get("http://demo.automationtesting.in/Register.html");
		
		WebElement firstname=drivername.findElement(By.className("form-control ng-pristine ng-invalid ng-invalid-required ng-touched"));
		firstname.sendKeys("Ayyappan");
		
		
		
		
		
		//drivername.quit();
		
		
		
	}

}
