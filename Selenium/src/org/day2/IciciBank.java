package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IciciBank {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\java files\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver drivername=new ChromeDriver();
		drivername.get("https://infinity.icicibank.com/corp/Login.jsp");
		
		WebElement dummy=drivername.findElement(By.id("DUMMY1"));
		dummy.click();
		
		WebElement user=drivername.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
		user.sendKeys("ayya1995");
		
		WebElement pass=drivername.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		pass.sendKeys("9442768555");
		
		
		drivername.quit();
		
		
		
	}

}
